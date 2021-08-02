/* BSD 2-Clause License - see CiFi-Benchmark/LICENSE for details. */
package org.cifi.benchmark.lazy_initialization.arrays;

import org.cifi.properties.types.MutableType;
import org.cifi.properties.classes.MutableClass;
import org.cifi.properties.field_assignability.UnsafelyLazilyInitializedField;
import org.cifi.properties.field_assignability.LazilyInitializedField;

/**
 * This classes checks lazy initialization of arrays to the reference.
 * The definition of lazy initialization only considers the lazy initialization of the arrays and not of its elements.
 */
@MutableType("Class is mutable")
@MutableClass("Class has a mutable field")
public class LazyInitializedArrays {

    @UnsafelyLazilyInitializedField("The array is unsafely lazily initialized.")
    private int[] simpleLazyInitialized;

    public int[] getSimpleLazyInitialized() {
        if (simpleLazyInitialized == null) {
            simpleLazyInitialized = new int[]{1, 2, 3};
        }
        simpleLazyInitialized[1]  = 5;
        return simpleLazyInitialized;
    }

    @LazilyInitializedField("The array is synchronized lazily initialized.")
    private int[] simpleSynchronizedLazyInitialized;

    public synchronized int[] getSynchronizedLazyInitialized() {
        if (simpleSynchronizedLazyInitialized == null) {
            simpleSynchronizedLazyInitialized = new int[]{1, 2, 3};
        }
        simpleSynchronizedLazyInitialized[1]  = 5;
        return simpleSynchronizedLazyInitialized;
    }

    @LazilyInitializedField("The array is synchronized lazily initialized.")
    private int[] complexSynchronizedLazyInitialized;

    public synchronized int[] getComplexSynchronizedLazyInitialized() {
        int[] tmp;
        if (complexSynchronizedLazyInitialized == null) {
            tmp = new int[3];
            for (int i = 0; i < 3; i++)
                tmp[i] = i;
            this.complexSynchronizedLazyInitialized = tmp;
        }
        return this.complexSynchronizedLazyInitialized;
    }
}
