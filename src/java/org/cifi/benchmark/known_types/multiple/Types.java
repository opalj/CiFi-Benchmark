/* BSD 2-Clause License - see CiFi-Benchmark/LICENSE for details. */
package org.cifi.benchmark.known_types.multiple;

import org.cifi.properties.classes.TransitivelyImmutableClass;
import org.cifi.properties.types.MutableType;
import org.cifi.properties.types.TransitivelyImmutableType;

@MutableType("class is not final")
@TransitivelyImmutableClass("class is empty")
class SuperClass {
}

@TransitivelyImmutableType("class is final and transitive immutable")
@TransitivelyImmutableClass("class is empty")
final class FinalEmptyClassExtendsSuperClass2 extends SuperClass {
}

@TransitivelyImmutableType("class is final and transitive immutable")
@TransitivelyImmutableClass("class is empty")
final class FinalEmptyClassExtendsSuperClass1 extends SuperClass {
}

@MutableType("class is not final")
@TransitivelyImmutableClass("class is empty")
class EmptyClassExtendsSuperClass1 extends SuperClass {
}

@MutableType("class is not final")
@TransitivelyImmutableClass("class is empty")
class EmptyClassExtendsSuperClass2 extends SuperClass {}
