package org.chain3j.abi.datatypes.generated;

import java.util.List;
import org.chain3j.abi.datatypes.StaticArray;
import org.chain3j.abi.datatypes.Type;

/**
 * Auto generated code.
 * <p><strong>Do not modifiy!</strong>
 * <p>Please use org.chain3j.codegen.AbiTypesGenerator in the 
 * <a href="https://github.com/chain3j/chain3j/tree/master/codegen">codegen module</a> to update.
 */
public class StaticArray6<T extends Type> extends StaticArray<T> {
    public StaticArray6(List<T> values) {
        super(6, values);
    }

    @SafeVarargs
    public StaticArray6(T... values) {
        super(6, values);
    }
}
