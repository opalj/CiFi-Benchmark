/* BSD 2-Clause License - see CiFi-Benchmark/LICENSE for details. */
package org.cifi.benchmark.assignability;

import org.cifi.properties.fields.TransitivelyImmutableField;
import org.cifi.properties.types.MutableType;
import org.cifi.properties.classes.TransitivelyImmutableClass;
import org.cifi.properties.field_assignability.EffectivelyNonAssignableField;

/**
 * Class encompasses two possible cases of assigning the effectively non assignable field o.
 */
@MutableType("Class is not final")
@TransitivelyImmutableClass("Class has only a transitively immutable field")
public class DifferentAssignmentPossibilitiesOfEffectivelyNonAssignableField {

    @TransitivelyImmutableField("Field is effectively non assignable and has a transitively immutable type")
    @EffectivelyNonAssignableField("Field is only once assigned in the constructor via new created object or parameter")
    private Object object;

    public DifferentAssignmentPossibilitiesOfEffectivelyNonAssignableField() {
        this.object = new Object();
    }

    public DifferentAssignmentPossibilitiesOfEffectivelyNonAssignableField(int n) {
        this.object = new Integer(n);
    }

    public Object getObject(){
        return this.object;
    }
}
