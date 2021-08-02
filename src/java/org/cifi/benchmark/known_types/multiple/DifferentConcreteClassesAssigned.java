/* BSD 2-Clause License - see CiFi-Benchmark/LICENSE for details. */
package org.cifi.benchmark.known_types.multiple;

import org.cifi.properties.classes.TransitivelyImmutableClass;
import org.cifi.properties.field_assignability.NonAssignableField;
import org.cifi.properties.fields.TransitivelyImmutableField;
import org.cifi.properties.types.MutableType;

/**
 * This class represents the case in which only objects with well known transitively immutable class-types are assigned.
 */
@MutableType("class is not final")
@TransitivelyImmutableClass("class has only one transitively immutable field")
public class DifferentConcreteClassesAssigned {

    @TransitivelyImmutableField("only two different objects with well known transitively immutable class types are assigned.")
    @NonAssignableField("field is final")
    final SuperClass a;

    DifferentConcreteClassesAssigned(Boolean b, FinalEmptyClassExtendsSuperClass1 fec1, FinalEmptyClassExtendsSuperClass2 fec2){
        if(b)
            this.a = fec1;
        else
            this.a = fec2;
        }
}
