/* BSD 2-Clause License - see CiFi-Benchmark/LICENSE for details. */
package org.cifi.benchmark.generic.simple;

import org.cifi.properties.classes.MutableClass;
import org.cifi.properties.field_assignability.AssignableField;
import org.cifi.properties.fields.MutableField;
import org.cifi.properties.types.MutableType;

/**
 * Generic class with only a mutable field.
 */
@MutableType("class is mutable")
@MutableClass("class has a mutable field")
class GenericCounterExampleMutable<T> {

    @MutableField("field is assignable")
    @AssignableField("field is public and as a result assignable")
    public int n = 5;
}
