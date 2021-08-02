/* BSD 2-Clause License - see CiFi-Benchmark/LICENSE for details. */
package org.cifi.benchmark.known_types.multiple;

import org.cifi.properties.classes.NonTransitivelyImmutableClass;
import org.cifi.properties.fields.NonTransitivelyImmutableField;
import org.cifi.properties.fields.TransitivelyImmutableField;
import org.cifi.properties.types.MutableType;
import org.cifi.properties.classes.MutableClass;
import org.cifi.properties.classes.TransitivelyImmutableClass;
import org.cifi.properties.field_assignability.NonAssignableField;

/**
 * This class represents the test case in which only two transitively immutable
 * well known objects are assigned to a field.
 */
@MutableType("class is not final")
@NonTransitivelyImmutableClass("class has a non transitively immutable field but no mutable one")
public class DifferentObjectsAssigned {

    @TransitivelyImmutableField("Field only refers to transitively immutable objects")
    @NonAssignableField("field is final")
    final SuperClass a;

    @NonTransitivelyImmutableField("The field is non-assignable and has not a transitively immutable value")
    @NonAssignableField("field is final")
    final SuperClass nonTransitivelyImmmutableField;

    public DifferentObjectsAssigned(boolean b1){

       if(b1) {
            this.a = new E1(); //new EmptyClassExtendsA1();
            this.nonTransitivelyImmmutableField = new E1();
        }
        else {
            this.a = new E2();// new EmptyClassExtendsA2();
            this.nonTransitivelyImmmutableField = new M();
        }
    }
}

@TransitivelyImmutableClass("The class has only a transitively immutable field")
class E1 extends SuperClass {
    private int n = 8;
}

@TransitivelyImmutableClass("The class has only a transitively immutable field")
class E2 extends SuperClass {
    private int n = 10;
}

@MutableClass("The class has only a mutable field")
class M extends SuperClass {
    public int n = 10;
}
