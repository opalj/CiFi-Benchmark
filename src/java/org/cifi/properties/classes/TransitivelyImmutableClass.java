/* BSD 2-Clause License - see CiFi-Benchmark/LICENSE for details. */
package org.cifi.properties.classes;

/**
 * Annotation to state that the annotated class is transitively immutable
 *
 * @author Tobias Roth
 */
public @interface TransitivelyImmutableClass {

    /**
     * A short reasoning of this property.
     */
    String value();
}
