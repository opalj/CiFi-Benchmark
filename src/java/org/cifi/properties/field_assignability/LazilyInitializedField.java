/* BSD 2-Clause License - see CiFi-Benchmark/LICENSE for details. */
package org.cifi.properties.field_assignability;

/**
 * Annotation to state that the annotated field reference is lazily initialized
 *
 * @author Tobias Roth
 */
public @interface LazilyInitializedField {

    /**
     * A short reasoning of this property.
     */
    String value();
}
