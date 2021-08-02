/* BSD 2-Clause License - see CiFi-Benchmark/LICENSE for details. */
package org.cifi.benchmark.assignability;

import java.util.HashMap;
import java.util.List;
import java.util.LinkedList;
import java.util.HashSet;
import java.util.Set;

import org.cifi.benchmark.general.ClassWithMutableFields;
import org.cifi.properties.fields.NonTransitivelyImmutableField;
import org.cifi.properties.fields.TransitivelyImmutableField;
import org.cifi.properties.field_assignability.EffectivelyNonAssignableField;

/**
 * This class encompasses different cases of effectively non assignable fields.
 */
public class EffectivelyNonAssignable {

    @NonTransitivelyImmutableField("The field is non assignable and has a mutable type")
    @EffectivelyNonAssignableField("The field is only assigned once")
    private ClassWithMutableFields classWithMutableFields = new ClassWithMutableFields();

    public void callNopOfClassWithMutableFields(){
        this.classWithMutableFields.nop();
    }

    @TransitivelyImmutableField("The field has a primitive type and is effectively non assignable")
    @EffectivelyNonAssignableField("The field is not written after initialization")
    private int simpleInitializedFieldWithPrimitiveType = 5;

    @TransitivelyImmutableField("The field is effectively non assignable and has a transitively immutable type")
    @EffectivelyNonAssignableField("The field is not written after initialization")
    private Integer effectivelyNonAssignableIntegerField = 5;

    @TransitivelyImmutableField("The field has a primitive type and is effectively non assignable")
    @EffectivelyNonAssignableField("The field is not written after initialization")
    private double effectivelyNonAssignableDoubleField = 5d;

    @TransitivelyImmutableField("The field has a primitive type and is effectively non assignable")
    @EffectivelyNonAssignableField("The field is not written after initialization")
    private Double effectivelyNonAssignableObjectDoubleField = 5d;

    @TransitivelyImmutableField("The field has a primitive type and is effectively non assignable")
    @EffectivelyNonAssignableField("The field is not written after initialization")
    private float effectivelyNonAssignableFloatField = 5;

    @TransitivelyImmutableField("The field has a primitive type and is effectively non assignable")
    @EffectivelyNonAssignableField("The field is not written after initialization")
    private Float effectivelyNonAssignableFloatObjectField = 5f;

    @TransitivelyImmutableField("The field has a primitive type and is effectively non assignable")
    @EffectivelyNonAssignableField("The field is not written after initialization")
    private Byte effectivelyNonAssignableByteObjectField = 5;

    @TransitivelyImmutableField("The field has a primitive type and is effectively non assignable")
    @EffectivelyNonAssignableField("The field is not written after initialization")
    private byte effectivelyNonAssignableByteField = 5;

    @TransitivelyImmutableField("The field value has a primitive type and is effectively non assignable")
    @EffectivelyNonAssignableField("The field is not written after initialization")
    private char simpleChar = 'a';

    @TransitivelyImmutableField("The field value has a primitive type and is effectively non assignable")
    @EffectivelyNonAssignableField("The field is not written after initialization")
    private long effectivelyNonAssignableLongField = 5;

    @TransitivelyImmutableField("The field is effectively non assignable and has a primitive type")
    @EffectivelyNonAssignableField("The field is not written after initialization")
    private Long simpleLong = 5l;

    @TransitivelyImmutableField("The concrete assigned object is known to be deep immutable")
    @EffectivelyNonAssignableField("The field is not written after initialization")
    private String effectivelyNonAssignableString = "abc";

    @NonTransitivelyImmutableField("The field has a mutable type.")
    @EffectivelyNonAssignableField("The field is not written after initialization")
    private List<Object> effectivelyNonAssignableLinkedList = new LinkedList<Object>();

    @TransitivelyImmutableField("The field is effectively non assignable and the concrete assigned " +
            "object is known to be transitively immutable")
    @EffectivelyNonAssignableField("The field is not written after initialization")
    private Object effectivelyNonAssignableObject = new Object();

    @NonTransitivelyImmutableField("The field is effectively non-assignable and has not a transitively immutable type")
    @EffectivelyNonAssignableField("The field is not written after initialization")
    private Set<Object> effectivelyNonAssignableSet = new HashSet<Object>();

    @NonTransitivelyImmutableField("The field is effectively non-assignable and has not a transitively immutable type")
    @EffectivelyNonAssignableField("The field is not written after initialization")
    private HashMap<Object, Object> effectivelyNonAssignableHashMap = new HashMap<Object, Object>();
}
