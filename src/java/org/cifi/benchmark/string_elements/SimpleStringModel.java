/* BSD 2-Clause License - see CiFi-Benchmark/LICENSE for details. */
package org.cifi.benchmark.string_elements;

import org.cifi.properties.field_assignability.NonAssignableField;
import org.cifi.properties.fields.TransitivelyImmutableField;
import org.cifi.properties.types.TransitivelyImmutableType;
import org.cifi.properties.classes.TransitivelyImmutableClass;
import org.cifi.properties.field_assignability.LazilyInitializedField;

/**
 * This class represents a simple model of the class java.util.String.
 * It encompasses cases of a shared array and a lazy initialized field storing a hash value.
 */
@TransitivelyImmutableType("Class is final")
@TransitivelyImmutableClass("Class has only transitively immutable fields")
public final class SimpleStringModel {

    @TransitivelyImmutableField("The array values are not mutated anymore after the assignment ")
    @NonAssignableField("Field is final")
    private final char value[];

    public char[] getValue(){
        return value.clone();
    }

    @TransitivelyImmutableField("Lazy initialized field with primitive type")
    @LazilyInitializedField("Field is lazily initialized")
    private int hash; // Default value 0

    public SimpleStringModel(SimpleStringModel original) {
        this.value = original.value;
    }

    public SimpleStringModel(char[] value){
        this.value = value.clone();
    }

    public int hashCode() {
        int h = 0;
        if (hash == 0) {
            char val[] = value;
            for (int i = 0; i < value.length; i++) {
                h = 31 * h + val[i];
            }
            hash = h;
        }
        return hash;
    }
}
