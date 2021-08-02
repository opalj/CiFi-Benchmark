/* BSD 2-Clause License - see CiFi-Benchmark/LICENSE for details. */
package org.cifi.benchmark.general;

import org.cifi.properties.classes.NonTransitivelyImmutableClass;
import org.cifi.properties.field_assignability.NonAssignableField;
import org.cifi.properties.fields.NonTransitivelyImmutableField;
import org.cifi.properties.types.NonTransitivelyImmutableType;

@NonTransitivelyImmutableType("The class is non-transitively immutable and not extensible")
@NonTransitivelyImmutableClass("The class has only a non-transitively immutable field")
public final class FinalClassWithNonTransitivelyImmutableField {

    @NonTransitivelyImmutableField("field has a mutable type and the concrete assigned object can not be determined")
    @NonAssignableField("field is final")
    private final Object finalFieldWithMutableType;

    public FinalClassWithNonTransitivelyImmutableField(Object object){
        this.finalFieldWithMutableType = object;
    }
}
