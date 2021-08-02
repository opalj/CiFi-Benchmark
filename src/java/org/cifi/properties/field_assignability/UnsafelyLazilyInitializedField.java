/* BSD 2-Clause License - see CiFi-Benchmark/LICENSE for details. */
package org.cifi.properties.field_assignability;

/**
 * Annotation to state that the annotated field is unsafely lazily initialized
 */
public @interface UnsafelyLazilyInitializedField {

    /**
     * A short reasoning of this property.
     */
    String value();
}
