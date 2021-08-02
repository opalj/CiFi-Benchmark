/* BSD 2-Clause License - see CiFi-Benchmark/LICENSE for details. */
package org.cifi.benchmark.general;

import org.cifi.properties.types.MutableType;
import org.cifi.properties.classes.TransitivelyImmutableClass;

/**
 * This class represents the trivial case of a transitively immutable class with a mutable type.
 */
@MutableType("Class is not final and thus extensible")
@TransitivelyImmutableClass("Class has no fields and, thus, no state")
public class ClassWithNoFields {
}
