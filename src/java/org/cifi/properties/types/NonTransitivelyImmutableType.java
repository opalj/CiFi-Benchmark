/* BSD 2-Clause License - see CiFi-Benchmark/LICENSE for details. */
package org.cifi.properties.types;

/**
 * Annotation to state that the annotated type shallow immutable.
 */
public @interface NonTransitivelyImmutableType {

    /**
     * A short reasoning of this property.
     */
    String value();
}
