/* BSD 2-Clause License - see CiFi-Benchmark/LICENSE for details. */
package org.cifi.properties.classes;

/**
 * Annotation to state that the annotated class is non-transitively immutable
 *
 * @author Tobias Roth
 */
public @interface NonTransitivelyImmutableClass {

    /**
     * A short reasoning of this property.
     */
    String value();
}
