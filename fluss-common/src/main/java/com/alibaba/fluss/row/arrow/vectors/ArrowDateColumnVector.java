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
import com.alibaba.fluss.row.columnar.IntColumnVector;
import com.alibaba.fluss.shaded.arrow.org.apache.arrow.vector.DateDayVector;
import com.alibaba.fluss.utils.Preconditions;

/** Arrow column vector for Date. */
@Internal
public class ArrowDateColumnVector implements IntColumnVector {

    /** Container which is used to store the sequence of date values of a column to read. */
    private final DateDayVector dateDayVector;

    public ArrowDateColumnVector(DateDayVector dateDayVector) {
        this.dateDayVector = Preconditions.checkNotNull(dateDayVector);
    }

    @Override
    public int getInt(int i) {
        return dateDayVector.get(i);
    }

    @Override
    public boolean isNullAt(int i) {
        return dateDayVector.isNull(i);
    }
}
