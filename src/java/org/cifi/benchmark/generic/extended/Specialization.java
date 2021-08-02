/* BSD 2-Clause License - see CiFi-Benchmark/LICENSE for details. */
package org.cifi.benchmark.generic.extended;

import org.cifi.properties.classes.DependentlyImmutableClass;
import org.cifi.properties.classes.TransitivelyImmutableClass;
import org.cifi.properties.fields.DependentlyImmutableField;
import org.cifi.properties.fields.TransitivelyImmutableField;

/**
 * This class represents the case when a generic class is extended and the generic type parameter concretized.
 */
public class Specialization<T> {

    @DependentlyImmutableClass(value = "The field type is generic", parameter = {"A"})
    class G<A>{
        @DependentlyImmutableField(value="Has only a generic type", parameter = "A")
        private final A a;
        public G(A a){
            this.a = a;
        }
    }

    @TransitivelyImmutableClass("Generic Parameter specified with transitively immutable types")
    class G2 extends G<FinalEmptyClass>{
        public G2(FinalEmptyClass finalEmptyClass){
            super(finalEmptyClass);
        }
    }

    @TransitivelyImmutableField("The field is assigned with a concretized transitively immutable object.")
    private final Object o = new G<>(new FinalEmptyClass());
}
