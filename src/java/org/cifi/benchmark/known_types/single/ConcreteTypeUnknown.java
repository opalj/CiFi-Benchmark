/* BSD 2-Clause License - see CiFi-Benchmark/LICENSE for details. */
package org.cifi.benchmark.known_types.single;

import org.cifi.properties.classes.NonTransitivelyImmutableClass;
import org.cifi.properties.field_assignability.NonAssignableField;
import org.cifi.properties.fields.NonTransitivelyImmutableField;
import org.cifi.properties.types.NonTransitivelyImmutableType;

/**
 * This class represents the counter-example in which the type of the object assigned to a field is not known
 */
@NonTransitivelyImmutableType("class is non transitively immutable and final")
@NonTransitivelyImmutableClass("class has only one non-transitively immutable field")
final class ConcreteTypeUnknown {

    @NonTransitivelyImmutableField("field has a mutable type")
    @NonAssignableField("field is final")
    private final Object object;

    public ConcreteTypeUnknown(Object object) {
        this.object = object;
    }
}
