/* BSD 2-Clause License - see CiFi-Benchmark/LICENSE for details. */
package org.cifi.benchmark.generic.simple;

import org.cifi.properties.classes.DependentlyImmutableClass;
import org.cifi.properties.field_assignability.NonAssignableField;
import org.cifi.properties.fields.DependentlyImmutableField;
import org.cifi.properties.types.MutableType;

@MutableType("Class is not final")
@DependentlyImmutableClass(value="Generic class whose immutability does not depend on all generic type parameters",
        parameter={"C", "B"})
public class MixedGeneric<A, B, C> {

    @DependentlyImmutableField(value = "final field with generic type", parameter = {"B"})
    @NonAssignableField("field is final")
    private final B b;

    @DependentlyImmutableField(value = "final field with generic type", parameter = {"C"})
    @NonAssignableField("field is final")
    private final C c;

    public MixedGeneric(A a, B b, C c){
        this.b = b;
        this.c = c;
    }
}
