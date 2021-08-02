/* BSD 2-Clause License - see CiFi-Benchmark/LICENSE for details. */
package org.cifi.benchmark.generic.extended;

import org.cifi.properties.classes.TransitivelyImmutableClass;
import org.cifi.properties.types.MutableType;

@MutableType("Class is not final")
@TransitivelyImmutableClass("Class with no fields")
public class EmptyClass {}
