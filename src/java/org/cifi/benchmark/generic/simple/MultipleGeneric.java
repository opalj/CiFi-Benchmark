/* BSD 2-Clause License - see CiFi-Benchmark/LICENSE for details. */
package org.cifi.benchmark.generic.simple;

import org.cifi.properties.classes.DependentlyImmutableClass;
import org.cifi.properties.field_assignability.NonAssignableField;
import org.cifi.properties.types.DependentlyImmutableType;
import org.cifi.properties.fields.DependentlyImmutableField;

/**
 * Class with multiple final fields with generic types.
 */
@DependentlyImmutableType(value = "class is dependently immutable and final", parameter = {"A", "B", "C"})
@DependentlyImmutableClass(value = "class has only dependent immutable fields", parameter = {"A", "B", "C"})
public final class MultipleGeneric<A,B,C> {

    @DependentlyImmutableField(value = "field has the generic type parameter A", parameter = {"A"})
    @NonAssignableField("field is final")
    private final A a;

    @DependentlyImmutableField(value = "field has the generic type parameter B", parameter = {"B"})
    @NonAssignableField("field is final")
    private final B b;

    @DependentlyImmutableField(value = "field has the generic type parameter C", parameter = {"C"})
    @NonAssignableField("field is final")
    private final C c;

    public MultipleGeneric(A a, B b, C c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
}
