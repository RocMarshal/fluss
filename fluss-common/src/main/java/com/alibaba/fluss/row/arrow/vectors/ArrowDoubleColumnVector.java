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

package com.alibaba.fluss.row.arrow.vectors;

import com.alibaba.fluss.annotation.Internal;
import com.alibaba.fluss.row.columnar.DoubleColumnVector;
import com.alibaba.fluss.shaded.arrow.org.apache.arrow.vector.Float8Vector;
import com.alibaba.fluss.utils.Preconditions;

/** Arrow column vector for Double. */
@Internal
public class ArrowDoubleColumnVector implements DoubleColumnVector {

    /** Container which is used to store the sequence of double values of a column to read. */
    private final Float8Vector doubleVector;

    public ArrowDoubleColumnVector(Float8Vector doubleVector) {
        this.doubleVector = Preconditions.checkNotNull(doubleVector);
    }

    @Override
    public double getDouble(int i) {
        return doubleVector.get(i);
    }

    @Override
    public boolean isNullAt(int i) {
        return doubleVector.isNull(i);
    }
}
