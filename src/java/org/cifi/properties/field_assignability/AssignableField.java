/* BSD 2-Clause License - see CiFi-Benchmark/LICENSE for details. */
package org.cifi.properties.field_assignability;

/**
 * Annotation to state that the annotated field is assignable
 *
 * @author Tobias Peter Roth
 */
public @interface AssignableField {

    /**
     * A short reasoning of this property.
     */
    String value()  default "N/A";
}
