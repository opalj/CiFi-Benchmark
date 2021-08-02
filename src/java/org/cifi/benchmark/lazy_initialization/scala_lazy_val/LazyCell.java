/* BSD 2-Clause License - see CiFi-Benchmark/LICENSE for details. */
package org.cifi.benchmark.lazy_initialization.scala_lazy_val;

import org.cifi.properties.fields.TransitivelyImmutableField;
import org.cifi.properties.types.MutableType;
import org.cifi.properties.classes.TransitivelyImmutableClass;
import org.cifi.properties.field_assignability.LazilyInitializedField;

/**
*  This class represents the implementation of Scala lazy val from Scala 2.12.
*  https://docs.scala-lang.org/sips/improved-lazy-val-initialization.html
*
*/
@MutableType("non final class")
@TransitivelyImmutableClass("Class has only transitive immutable fields.")
public class LazyCell {

@TransitivelyImmutableField("Lazy initialized field with primitive type")
@LazilyInitializedField("The field is only set once in a synchronized way.")
private volatile boolean bitmap_0 = false;

@TransitivelyImmutableField("Lazy initialized field with primitive type")
@LazilyInitializedField("The field is only set once in a synchronized way.")
Integer value_0;

private Integer value_lzycompute() {
    synchronized (this){
        if(value_0==0) {
            value_0 = 42;
            bitmap_0 = true;
        }
    }
    return value_0;
}
public Integer getValue(){
    return bitmap_0 ? value_0 : value_lzycompute();
}
}
