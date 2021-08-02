/* BSD 2-Clause License - see CiFi-Benchmark/LICENSE for details. */
package org.cifi.benchmark.assignability;

import org.cifi.properties.field_assignability.AssignableField;
import org.cifi.properties.field_assignability.EffectivelyNonAssignableField;

class InitializationInConstructorAssignable {

    @AssignableField("The field is written everytime it is passed to the constructor of another instance.")
    private InitializationInConstructorAssignable child;
    public InitializationInConstructorAssignable(InitializationInConstructorAssignable parent) {
        parent.child = this;
        }
    }

class InitializationInConstructorNonAssignable {

    @EffectivelyNonAssignableField("The class is only assigned once in its own constructor.")
    private InitializationInConstructorNonAssignable parent;
    public InitializationInConstructorNonAssignable(InitializationInConstructorNonAssignable parent) {
        this.parent = parent.parent;
    }
}
