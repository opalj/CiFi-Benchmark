/* BSD 2-Clause License - see CiFi-Benchmark/LICENSE for details. */
package org.cifi.benchmark.general;

import org.cifi.properties.fields.TransitivelyImmutableField;
import org.cifi.properties.classes.TransitivelyImmutableClass;
import org.cifi.properties.field_assignability.NonAssignableField;
import org.cifi.properties.types.TransitivelyImmutableType;

@TransitivelyImmutableType("Class is transitively immutable and final and as a result not extensible")
@TransitivelyImmutableClass("Class has only transitively immutable fields")
public final class ClassWithTransitivelyImmutableFields {

    @TransitivelyImmutableField("Field is non assignable and has a transitively immutable type")
    @NonAssignableField("Field is final")
    private final FinalClassWithNoFields transitivelyImmutableFieldWithGetter = new FinalClassWithNoFields();

    public FinalClassWithNoFields getTransitivelyImmutableFieldWithGetter() {
        return transitivelyImmutableFieldWithGetter;
    }

    @TransitivelyImmutableField("Field is non assignable and has a transitively immutable type")
    @NonAssignableField("Field is final")
    private final FinalClassWithNoFields eagerAssignedFinalTransitivelyImmutableField =
            new FinalClassWithNoFields();

    @TransitivelyImmutableField("Field is non assignable and has a transitively immutable type")
    @NonAssignableField("Field is final")
    private final FinalClassWithNoFields inConstructorAssignedTransitivelyImmutableField;

    @TransitivelyImmutableField("Field is non assignable and has a transitively immutable type")
    @NonAssignableField("Field is final")
    private final static String transitivelyImmutableFieldWithStringType = "string";

    public ClassWithTransitivelyImmutableFields(FinalClassWithNoFields finalClassWithNoFields) {
        this.inConstructorAssignedTransitivelyImmutableField = finalClassWithNoFields;
    }
}
