/* BSD 2-Clause License - see CiFi-Benchmark/LICENSE for details. */
package org.cifi.properties.field_assignability;

/**
 * Annotation to state that the annotated field is effectively non assignable
 *
 * @author Tobias Peter Roth
 */
public @interface EffectivelyNonAssignableField {

    /**
     * A short reasoning of this property.
     */
    String value();
}
