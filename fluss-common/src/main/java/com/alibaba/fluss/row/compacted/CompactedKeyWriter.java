/*
 * Copyright (c) 2024 Alibaba Group Holding Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.alibaba.fluss.row.compacted;

import com.alibaba.fluss.types.DataType;

/**
 * A wrapping of {@link CompactedRowWriter} used to encode key columns.
 *
 * <p>The encoding is the same as {@link CompactedRowWriter}, but is without header of null bits to
 * represent whether the field value is null or not since the key columns must be not null.
 */
public class CompactedKeyWriter extends CompactedRowWriter {

    public CompactedKeyWriter() {
        // in compacted key encoder, we don't need to set null bits as the key columns must be not
        // null, to use field count 0 to init to make the null bits 0
        super(0);
    }

    public static FieldWriter createFieldWriter(DataType fieldType) {
        return (writer, pos, value) -> {
            if (value == null) {
                throw new IllegalArgumentException(
                        String.format(
                                "Null value is not allowed for compacted key encoder in position %d with type %s.",
                                pos, fieldType));
            } else {
                CompactedRowWriter.createFieldWriter(fieldType).writeField(writer, pos, value);
            }
        };
    }
}
