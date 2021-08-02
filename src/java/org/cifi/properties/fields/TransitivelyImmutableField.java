/* BSD 2-Clause License - see CiFi-Benchmark/LICENSE for details. */
package org.cifi.properties.fields;

/**
 * Annotation to state that the annotated field is transitively immutable.
 */
public @interface TransitivelyImmutableField {

    /**
     * A short reasoning of this property.
     */
    String value();
}
