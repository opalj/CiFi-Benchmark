/* BSD 2-Clause License - see CiFi-Benchmark/LICENSE for details. */
package org.cifi.benchmark.arrays.not_transitively_immutable;

import org.cifi.properties.field_assignability.AssignableField;
import org.cifi.properties.fields.MutableField;
import org.cifi.properties.fields.NonTransitivelyImmutableField;
import org.cifi.properties.types.MutableType;
import org.cifi.properties.classes.MutableClass;
import org.cifi.properties.field_assignability.NonAssignableField;
import org.cifi.properties.field_assignability.EffectivelyNonAssignableField;

/**
 * This class encompasses fields with different types of arrays.
 */
@MutableType("The class is mutable")
@MutableClass("The class has mutable fields")
public class ArraysWithDifferentTypes<T> {

    @NonTransitivelyImmutableField("The elements of the array are manipulated after initialization.")
    @NonAssignableField("The field is final")
    private final Object[] finalArrayWithSetterForOneElement =
            new Object[]{new Object(), new Object()};

    public void setB() {
        finalArrayWithSetterForOneElement[2] = new Object();
    }

    @MutableField("Array is assignable.")
    @AssignableField("The array is initialized always when the InitC function is called")
    private Object[] assignableArray;

    public void setC() {
        assignableArray = new Object[]{new Object(), new Object()};
    }

    @NonTransitivelyImmutableField("The elements of the array can escape.")
    @EffectivelyNonAssignableField("The array is eager initialized.")
    private Object[] arrayThatCanEscapeViaGetter = new Object[]{new Object(), new Object()};

    public Object[] getArrayThatCanEscapeViaGetter() {
        return arrayThatCanEscapeViaGetter;
    }

    @NonTransitivelyImmutableField("The array escapes via the constructor")
    @EffectivelyNonAssignableField("The field is initialized in the constructor")
    private String[] privateStringArrayEscapingViaConstructor;

    @NonTransitivelyImmutableField("The array escapes via the constructor")
    @EffectivelyNonAssignableField("The field is initialized in the constructor")
    private int[] privateIntArrayEscapingViaConstructor;

    @NonTransitivelyImmutableField("The array escapes via the constructor")
    @EffectivelyNonAssignableField("The field is initialized in the constructor")
    private Object[] privateObjectArrayEscapingViaConstructor;

    @NonTransitivelyImmutableField("The array escapes via the constructor")
    @EffectivelyNonAssignableField("The field is initialized in the constructor")
    private T[] privateTArrayEscapingViaConstructor;

    ArraysWithDifferentTypes(String[] stringArray, int[] intArray, Object[] objectArr, T[] tArray) {
        this.privateStringArrayEscapingViaConstructor = stringArray;
        this.privateIntArrayEscapingViaConstructor = intArray;
        this.privateObjectArrayEscapingViaConstructor = objectArr;
        this.privateTArrayEscapingViaConstructor = tArray;
    }
}
