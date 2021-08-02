/* BSD 2-Clause License - see CiFi-Benchmark/LICENSE for details. */
package org.cifi.benchmark.generic.extended;

import org.cifi.properties.fields.NonTransitivelyImmutableField;
import org.cifi.properties.fields.TransitivelyImmutableField;
import org.cifi.benchmark.general.ClassWithMutableFields;
import org.cifi.benchmark.general.FinalClassWithNoFields;
import org.cifi.benchmark.generic.simple.Generic;
import org.cifi.properties.field_assignability.NonAssignableField;
import org.cifi.properties.fields.DependentlyImmutableField;
import org.cifi.properties.field_assignability.EffectivelyNonAssignableField;

/**
 * Class represents different cases of nested genericity.
 */
public class NestedGenericFields<T> {

    @TransitivelyImmutableField("The generic types are nested transitively immutable")
    @NonAssignableField("field is final")
    private final Generic<Generic<FinalClassWithNoFields>> nestedTransitivelyImmutable =
            new Generic<>(new Generic<>(new FinalClassWithNoFields()));

    @DependentlyImmutableField(value = "The immutability of the field depends on the generic type parameter T",
            parameter = {"T"})
    @EffectivelyNonAssignableField("field is final")
    private Generic<Generic<T>> nestedMutable;

    @DependentlyImmutableField(value = "The immutability of the field depends on the generic type parameter T",
            parameter={"T"})
    @NonAssignableField("field is final")
    private final Generic<Generic<T>> nestedDependent;

    @NonTransitivelyImmutableField("Only transitively immutable type parameters")
    @NonAssignableField("field is final")
    private final Generic<Generic<ClassWithMutableFields>> nestedNonTransitive =
            new Generic<>(new Generic<>(new ClassWithMutableFields()));

    public void setNestedMutable(Generic<Generic<T>> nestedMutable){
        this.nestedMutable = nestedMutable;
    }

    public NestedGenericFields(T t){
        this.nestedDependent = new Generic<>(new Generic<>(t));
    }
}
