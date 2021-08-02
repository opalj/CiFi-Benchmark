/* BSD 2-Clause License - see CiFi-Benchmark/LICENSE for details. *//* BSD 2-Clause License - see OPAL/LICENSE for details. */
package org.cifi.properties.classes;

/**
 * Annotation to state that the annotated class is mutable
 *
 * @author Tobias Roth
 */
public @interface MutableClass {

    /**
     * A short reasoning of this property.
     */
    String value();
}
