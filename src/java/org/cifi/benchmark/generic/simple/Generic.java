/* BSD 2-Clause License - see CiFi-Benchmark/LICENSE for details. */
package org.cifi.benchmark.generic.simple;

import org.cifi.properties.classes.DependentlyImmutableClass;
import org.cifi.properties.field_assignability.NonAssignableField;
import org.cifi.properties.types.DependentlyImmutableType;
import org.cifi.properties.fields.DependentlyImmutableField;

/**
 * Generic class with a generic field.
 */
@DependentlyImmutableType(value = "class is dependently immutable and final", parameter = {"T"})
@DependentlyImmutableClass(value = "class has a dependently immutable field", parameter = {"T"})
public final class Generic<T> {

    @DependentlyImmutableField(value = "field has a generic type parameter", parameter= {"T"} )
    @NonAssignableField("field is final")
    private final T t;

    public Generic(T t){this.t = t;}
}
