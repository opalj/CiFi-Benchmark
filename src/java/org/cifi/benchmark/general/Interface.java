/* BSD 2-Clause License - see CiFi-Benchmark/LICENSE for details. */
package org.cifi.benchmark.general;

import org.cifi.properties.types.MutableType;
import org.cifi.properties.classes.TransitivelyImmutableClass;

@MutableType("The interface is extensible and, thus, has  a mutable type")
@TransitivelyImmutableClass("Since an interface has no state, it is deeply immutable.")
public interface Interface {

    void run();

    void stop();

    void reset();
}
