/* BSD 2-Clause License - see CiFi-Benchmark/LICENSE for details. */
package org.cifi.benchmark.assignability;

import org.cifi.properties.classes.TransitivelyImmutableClass;
import org.cifi.properties.field_assignability.NonAssignableField;
import org.cifi.properties.fields.TransitivelyImmutableField;
import org.cifi.properties.types.MutableType;

/**
 * Class encompasses two cases of assigning non assignable fields.
 */
@MutableType("Class is not final.")
@TransitivelyImmutableClass("Class has only a transitively immutable field.")
public class DifferentAssignmentPossibilitiesOfNonAssignableField {

    @TransitivelyImmutableField("Field is non assignable and has a transitively immutable type.")
    @NonAssignableField("Field is final")
    private final Object object;

    public DifferentAssignmentPossibilitiesOfNonAssignableField(int n) {
        this.object = new Integer(n);
    }

    public DifferentAssignmentPossibilitiesOfNonAssignableField() {
        this.object = new Object();
    }

    public Object getObject(){
        return this.object;
    }
}