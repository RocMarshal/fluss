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

package com.alibaba.fluss.server.entity;

import com.alibaba.fluss.metadata.TableBucket;
import com.alibaba.fluss.rpc.messages.NotifyRemoteLogOffsetsRequest;

/** The data for request {@link NotifyRemoteLogOffsetsRequest}. */
public class NotifyKvSnapshotOffsetData {
    private final TableBucket tableBucket;
    private final long minRetainOffset;
    private final int coordinatorEpoch;

    public NotifyKvSnapshotOffsetData(
            TableBucket tableBucket, long minRetainOffset, int coordinatorEpoch) {
        this.tableBucket = tableBucket;
        this.minRetainOffset = minRetainOffset;
        this.coordinatorEpoch = coordinatorEpoch;
    }

    public TableBucket getTableBucket() {
        return tableBucket;
    }

    public long getMinRetainOffset() {
        return minRetainOffset;
    }

    public int getCoordinatorEpoch() {
        return coordinatorEpoch;
    }

    @Override
    public String toString() {
        return "NotifyRemoteLogOffsetsData{"
                + "tableBucket="
                + tableBucket
                + ", minRetainOffset="
                + minRetainOffset
                + ", coordinatorEpoch="
                + coordinatorEpoch
                + '}';
    }
}
