/* BSD 2-Clause License - see CiFi-Benchmark/LICENSE for details. */
package org.cifi.benchmark.generic.extended;

import org.cifi.properties.classes.TransitivelyImmutableClass;
import org.cifi.properties.types.TransitivelyImmutableType;

@TransitivelyImmutableType("Class is final, has no fields and extends a transitively immutable class")
    @TransitivelyImmutableClass("empty")
    public final class FinalEmptyClass extends EmptyClass {}