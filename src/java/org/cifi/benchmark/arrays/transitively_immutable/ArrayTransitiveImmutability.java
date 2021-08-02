/* BSD 2-Clause License - see CiFi-Benchmark/LICENSE for details. */
package org.cifi.benchmark.arrays.transitively_immutable;

import org.cifi.properties.fields.TransitivelyImmutableField;
import org.cifi.properties.classes.TransitivelyImmutableClass;
import org.cifi.properties.field_assignability.NonAssignableField;
import org.cifi.properties.field_assignability.EffectivelyNonAssignableField;
import org.cifi.properties.types.TransitivelyImmutableType;

/**
 * This class encompasses different array-typed transitively immutable fields.
 */
@TransitivelyImmutableType("Class is final")
@TransitivelyImmutableClass("Class has only transitively immutable fields")
public final class ArrayTransitiveImmutability {

    @TransitivelyImmutableField("The elements of the array can not escape")
    @NonAssignableField("Field is final")
    private final Integer[] eagerAssignedIntegerArray = new Integer[]{1, 2, 3};

    @TransitivelyImmutableField("The elements of the array are never set")
    @NonAssignableField("The field is only assigned once")
    private static final Integer[] staticTransitivelyImmutableArray = new Integer[5];

    @TransitivelyImmutableField("The elements of the array can not escape")
    @NonAssignableField("Field is initialized in the constructor")
    private final Integer[] transitivelyImmutableArrayAssignedInTheConstructor;

    public ArrayTransitiveImmutability() {
        transitivelyImmutableArrayAssignedInTheConstructor = new Integer[]{5, 6, 7, 8};
    }

    @TransitivelyImmutableField("The elements of the array can not escape")
    @EffectivelyNonAssignableField("The array is not initialized.")
    private Object[] notInitializedArray;

    @TransitivelyImmutableField("The field is not assignable and only assigned with transitively immutable objects.")
    @EffectivelyNonAssignableField("The field is effectively only assigned once.")
    private Object[] clonedArray = new Object[]{new Object(), new Object()};

    public Object[] getClonedArray(){ return  clonedArray.clone(); }
}
