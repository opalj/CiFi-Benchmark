/* BSD 2-Clause License - see CiFi-Benchmark/LICENSE for details. */
package org.cifi.benchmark.general;

import org.cifi.properties.field_assignability.AssignableField;
import org.cifi.properties.fields.MutableField;
import org.cifi.properties.fields.TransitivelyImmutableField;
import org.cifi.properties.types.MutableType;
import org.cifi.properties.classes.MutableClass;
import org.cifi.properties.field_assignability.EffectivelyNonAssignableField;

/**
 * This testclass checks that different modifiers like transient, volatile or static
 * does not have an impact of the assignability and immutability of a given field.
 *
 * @author Tobias Roth
 *
 */
@MutableType("Class is mutable")
@MutableClass("The class has mutable fields")
public class DifferentModifier {

    @MutableField("The field is assignable")
    @AssignableField("The field is public")
    public int assignableInt = 5;

    @TransitivelyImmutableField("The field is effectively non-assignable and has a primitive type")
    @EffectivelyNonAssignableField("The field is private and effectively assigned only once")
    private int effectivelyNonAssignableInt = 3;

    @MutableField("The field is assignable")
    @AssignableField("The field is public")
    public transient int assignableTransientInt = 5;

    @TransitivelyImmutableField("The field is effectively non-assignable and has a primitive type")
    @EffectivelyNonAssignableField("The field is private and effectively assigned only once")
    private transient int effectivelyNonAssignableTransientInt = 5;
    
    @MutableField("The field is assignable")
    @AssignableField("The field is public")
    public volatile int assignableVolatileInt = 5;

    @TransitivelyImmutableField("The field is effectively non-assignable and has a primitive type")
    @EffectivelyNonAssignableField("The field is private and effectively assigned only once")
    private volatile int effectivelyNonAssignableVolatileInt = 5;

    @MutableField("The field is assignable")
    @AssignableField("The field is public")
    public volatile long assignableVolatileLong;

    @TransitivelyImmutableField("The field is effectively non-assignable and has a primitive type")
    @EffectivelyNonAssignableField("The field is private and effectively assigned only once")
    private volatile long immutableVolatileLong = 0L;

    DifferentModifier(long l){
        this.assignableVolatileLong = l;
    }

      static final class InnerClass {

          @MutableField("The field is assignable")
          @AssignableField("The field is public")
          public static int assignableInnerStaticInt = 1;

          @TransitivelyImmutableField("The field is effectively non-assignable and has a primitive type")
          @EffectivelyNonAssignableField("The field is private and effectively assigned only once")
          private static int effectivelyNonAssignableInnerStaticInt = 1;

          @MutableField("The field is assignable")
          @AssignableField("The field is public")
          public int assignableInnerInt = 5;

          @TransitivelyImmutableField("The field is effectively non-assignable and has a primitive type")
          @EffectivelyNonAssignableField("The field is private and effectively assigned only once")
          private int effectivelyNonAssignableInnerInt = 5;

          @MutableField("The field is assignable")
          @AssignableField("The field is public")
          public transient int assignableInnerTransientInt = 5;

          @TransitivelyImmutableField("The field is effectively non-assignable and has a primitive type")
          @EffectivelyNonAssignableField("The field is private and effectively assigned only once")
          private transient int effectivelyNonAssignableInnerTransientInt = 5;

          @MutableField("The field is assignable")
          @AssignableField("The field is public")
          public volatile int assignableInnerVolatileInt = 5;

          @TransitivelyImmutableField("The field is effectively non-assignable and has a primitive type")
          @EffectivelyNonAssignableField("The field is private and effectively assigned only once")
          private volatile int effectivelyNonAssignableInnerVolatileInt = 5;

          @MutableField("The field is assignable")
          @AssignableField("The field is public")
          public volatile transient int mutableInnerVolatileTransientInt = 5;

          @TransitivelyImmutableField("The field is effectively non-assignable and has a primitive type")
          @EffectivelyNonAssignableField("The field is private and effectively assigned only once")
          private volatile transient int immutableInnerVolatileTransientInt = 5;
    }
}
