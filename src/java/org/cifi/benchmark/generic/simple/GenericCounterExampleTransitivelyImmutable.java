/* BSD 2-Clause License - see CiFi-Benchmark/LICENSE for details. */
package org.cifi.benchmark.generic.simple;

import org.cifi.properties.fields.TransitivelyImmutableField;
import org.cifi.properties.classes.TransitivelyImmutableClass;
import org.cifi.properties.field_assignability.NonAssignableField;

/**
 * Generic class with only a transitively immutable field.
 */
@TransitivelyImmutableClass("class has only a transitively immutable field")
class GenericCounterExampleTransitivelyImmutable<T> {

    @TransitivelyImmutableField("field is non assignable and has a primitive type")
    @NonAssignableField("field is final")
    private final int n = 5;
}
