/* BSD 2-Clause License - see CiFi-Benchmark/LICENSE for details. */
package org.cifi.properties.types;

/**
 * Annotation to state that the annotated type transitively immutable.
 * */
public @interface TransitivelyImmutableType {

    /**
     * A short reasoning of this property.
     */
    String value();
}
