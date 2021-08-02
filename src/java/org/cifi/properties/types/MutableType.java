/* BSD 2-Clause License - see OPAL/LICENSE for details. */
package org.cifi.properties.types;

/**
 * Annotation to state that the annotated type is mutable.
 *
 * @author Tobias Roth
 */
public @interface MutableType {

    /**
     * A short reasoning of this property.
     */
    String value();
}
