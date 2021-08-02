/* BSD 2-Clause License - see CiFi-Benchmark/LICENSE for details. */
package org.cifi.benchmark.arrays.not_transitively_immutable;

import org.cifi.properties.classes.NonTransitivelyImmutableClass;
import org.cifi.properties.fields.NonTransitivelyImmutableField;
import org.cifi.properties.types.NonTransitivelyImmutableType;
import org.cifi.properties.field_assignability.NonAssignableField;

/**
 * This classes encompasses array-typed fields that are all assigned in the constructor.
 */
@NonTransitivelyImmutableType("Class is non-transitively immutable and final")
@NonTransitivelyImmutableClass("Class has only transitively immutable fields")
public final class PrivateFinalArraysEscapeViaConstructor {

    @NonTransitivelyImmutableField("Array has a primitive type but is assigned in the constructor and, thus, escapes")
    @NonAssignableField("Array is final")
    private final char[] charArray;

    @NonTransitivelyImmutableField("Array has a primitive type but is assigned in the constructor and, thus, escapes")
    @NonAssignableField("Array is final")
    private final byte[] byteArray;

    @NonTransitivelyImmutableField("Array has a primitive type but is assigned in the constructor and, thus, escapes")
    @NonAssignableField("Array is final")
    private final int[] intArray;

    @NonTransitivelyImmutableField("Array has a primitive type but is assigned in the constructor and, thus, escapes")
    @NonAssignableField("Array is final")
    private final long[] longArray;

    @NonTransitivelyImmutableField("Array has a primitive type but is assigned in the constructor and, thus, escapes")
    @NonAssignableField("Array is final")
    private final Object[] objectArray;

    public PrivateFinalArraysEscapeViaConstructor(char[] charArray, byte[] byteArray, int[] intArray,
                                                  long[] longArray, Object[] objectArray) {
        this.charArray = charArray;
        this.byteArray = byteArray;
        this.intArray = intArray;
        this.longArray = longArray;
        this.objectArray = objectArray;
    }
}
