/* BSD 2-Clause License - see CiFi-Benchmark/LICENSE for details. */
package org.cifi.benchmark.generic.extended;

import org.cifi.benchmark.general.ClassWithMutableFields;
import org.cifi.properties.classes.NonTransitivelyImmutableClass;
import org.cifi.properties.field_assignability.NonAssignableField;
import org.cifi.properties.fields.NonTransitivelyImmutableField;
import org.cifi.properties.fields.TransitivelyImmutableField;
import org.cifi.properties.types.MutableType;
import org.cifi.properties.types.TransitivelyImmutableType;
import org.cifi.benchmark.generic.simple.Generic;
import org.cifi.properties.classes.TransitivelyImmutableClass;

/**
 * This class encompasses different cases of use site variance.
 */
@MutableType("class is not final")
@NonTransitivelyImmutableClass("Class has a non transitively immutable field")
class UseSiteVariance<T extends ClassWithMutableFields> {

    @NonTransitivelyImmutableField("The field type T extends a mutable type")
    @NonAssignableField("field is final")
    private final T t;

    @NonTransitivelyImmutableField("? has super type object")
    @NonAssignableField("field is final")
    private final Generic<? super EmptyClass> nonTransitivelyImmutableField;

    @TransitivelyImmutableField("Type ? can only be FinalEmptyClass and, thus, transitively immutable")
    @NonAssignableField("field is final")
    private final Generic<? extends FinalEmptyClass> transitivelyImmutableField;

    public UseSiteVariance(Generic<? super EmptyClass> nonTransitivelyImmutableField,
                           Generic<? extends FinalEmptyClass> transitivelyImmutableField, T t){
        this.t = t;
        this.nonTransitivelyImmutableField = nonTransitivelyImmutableField;
        this.transitivelyImmutableField = transitivelyImmutableField;
    }


    
}
