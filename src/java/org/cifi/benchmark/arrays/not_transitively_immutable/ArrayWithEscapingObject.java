/* BSD 2-Clause License - see CiFi-Benchmark/LICENSE for details. */
package org.cifi.benchmark.arrays.not_transitively_immutable;

import org.cifi.properties.field_assignability.AssignableField;
import org.cifi.properties.fields.MutableField;
import org.cifi.properties.fields.NonTransitivelyImmutableField;
import org.cifi.properties.types.MutableType;
import org.cifi.properties.classes.MutableClass;
import org.cifi.properties.field_assignability.NonAssignableField;

/**
 * Encompasses cases of arrays with escaping objects.
 */
@MutableType("Class has mutable fields  has a mutable state")
@MutableClass("It has a mutable state")
public class ArrayWithEscapingObject {

    @MutableField("Field is assignable")
    @AssignableField("Field is public")
    public Object publicObject = new Object();

    @NonTransitivelyImmutableField("Field is initialized with an non-transitively immutable field")
    @NonAssignableField("Field is final")
    private final Object[] arrayWithOneEscapingObject;

    public ArrayWithEscapingObject() {
        arrayWithOneEscapingObject = new Object[]{publicObject};
    }

    @NonTransitivelyImmutableField("One object of the array can escape via a getter method")
    @NonAssignableField("Field is final")
    private final Object[] arrayAccessedByGetterMethod = new Object[]{new Object(), new Object()};

    public Object getSecondElement(){
        return arrayAccessedByGetterMethod[1];
    }
}
