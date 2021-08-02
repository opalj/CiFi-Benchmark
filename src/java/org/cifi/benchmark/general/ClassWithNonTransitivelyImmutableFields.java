/* BSD 2-Clause License - see CiFi-Benchmark/LICENSE for details. */
package org.cifi.benchmark.general;

import org.cifi.properties.classes.NonTransitivelyImmutableClass;
import org.cifi.properties.fields.NonTransitivelyImmutableField;
import org.cifi.properties.field_assignability.NonAssignableField;
import org.cifi.properties.types.NonTransitivelyImmutableType;

@NonTransitivelyImmutableType("Class is final and non transitively immutable")
@NonTransitivelyImmutableClass("Class has only non transitively immutable fields")
public final class ClassWithNonTransitivelyImmutableFields {

    @NonTransitivelyImmutableField("Final field with mutable type assigned in the constructor")
    @NonAssignableField("Declared final Field")
    private final ClassWithMutableFields nonTransitivelyImmutableFieldConstructorAssigned;

    @NonTransitivelyImmutableField("Final field with mutable type eager assigned")
    @NonAssignableField("Declared final Field")
    private final ClassWithMutableFields nonTransitivelyImmutableFieldEagerAssigned = new ClassWithMutableFields();

    @NonTransitivelyImmutableField("Field is assignable and has a non transitively immutable type")
    @NonAssignableField("Declared final Field")
    private final ClassWithNonTransitivelyImmutableFields instance =
            new ClassWithNonTransitivelyImmutableFields(new ClassWithMutableFields());

    public ClassWithNonTransitivelyImmutableFields(ClassWithMutableFields classWithMutableFields){
        this.nonTransitivelyImmutableFieldConstructorAssigned = classWithMutableFields;
    }
}
