/* BSD 2-Clause License - see CiFi-Benchmark/LICENSE for details. */
package org.cifi.benchmark.general;

import org.cifi.properties.classes.TransitivelyImmutableClass;
import org.cifi.properties.types.TransitivelyImmutableType;

/**
 * This class represents the trivial case of a transitively immutable class with a transitively immutable type.
 */
@TransitivelyImmutableType("class is final and as a result transitively immutable")
@TransitivelyImmutableClass("Class has no fields and, thus, it is transitively immutable")
public final class FinalClassWithNoFields {}
