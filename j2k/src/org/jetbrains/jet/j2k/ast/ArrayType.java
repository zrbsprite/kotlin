/*
 * Copyright 2010-2012 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jetbrains.jet.j2k.ast;

import org.jetbrains.annotations.NotNull;

/**
 * @author ignatov
 */
public class ArrayType extends Type {
    private final Type myType;

    public ArrayType(Type type) {
        myType = type;
    }

    public Type getInnerType() {
        return myType;
    }

    @NotNull
    @Override
    public Kind getKind() {
        return Kind.ARRAY_TYPE;
    }

    @NotNull
    @Override
    public String toKotlin() {
        if (PRIMITIVE_TYPES.contains(myType.toKotlin().toLowerCase())) {
            return myType.toKotlin() + "Array" + isNullableStr(); // returns IntArray, BooleanArray, etc.
        }
        return "Array" + "<" + myType.toKotlin() + ">" + isNullableStr();
    }
}
