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

package com.alibaba.fluss.utils.function;

import java.util.function.Supplier;

/** Similar to {@link java.util.function.Supplier} but can throw {@link Exception}. */
@FunctionalInterface
public interface CheckedSupplier<R> extends SupplierWithException<R, Exception> {

    static <R> Supplier<R> unchecked(CheckedSupplier<R> checkedSupplier) {
        return () -> {
            try {
                return checkedSupplier.get();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        };
    }
}
