/* BSD 2-Clause License - see CiFi-Benchmark/LICENSE for details. */
package org.cifi.benchmark.assignability;

import org.cifi.properties.classes.MutableClass;
import org.cifi.properties.field_assignability.AssignableField;
import org.cifi.properties.fields.MutableField;
import org.cifi.properties.fields.NonTransitivelyImmutableField;
import org.cifi.properties.types.MutableType;
import org.cifi.properties.field_assignability.EffectivelyNonAssignableField;

/**
 * This class encompasses possibilities in combination with field reads of the static analyzer.
 */
@MutableType("Class is not final and has mutable field")
@MutableClass("Class has a mutable field")
public class Singleton {

    @MutableField("Field is assignable")
    @AssignableField("Field is written by static initializer after the field becomes (indirectly) readable")
    private String name;

    private Singleton() {
        this.name = "";
    }

    // STATIC FUNCTIONALITY
    
    @NonTransitivelyImmutableField("The field is effectively non assignable but has a non transitively immutable type.")
    @EffectivelyNonAssignableField("The field is only set in the static initializer")
    private static Singleton theInstance;

    static {
        theInstance = new Singleton();
        theInstance.name = "The Singleton Instance";
    }
    public static Singleton getInstance() {
        return theInstance;
    }
}
