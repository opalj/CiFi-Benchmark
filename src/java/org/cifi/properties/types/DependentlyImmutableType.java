/* BSD 2-Clause License - see CiFi-Benchmark/LICENSE for details. */
package org.cifi.properties.types;

/**
 * Annotation to state that the annotated type dependent immutable.
 *
 * @author Tobias Peter Roth
 */
public @interface DependentlyImmutableType {

    /**
     * A short reasoning of this property.
     */
    String value();

    String[] parameter() default {""};
}
