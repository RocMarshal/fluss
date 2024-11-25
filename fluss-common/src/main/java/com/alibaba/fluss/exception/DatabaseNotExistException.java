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

package com.alibaba.fluss.exception;

import com.alibaba.fluss.annotation.PublicEvolving;

/**
 * Exception for trying to operate on a database that doesn't exist.
 *
 * @since 0.1
 */
@PublicEvolving
public class DatabaseNotExistException extends ApiException {
    public DatabaseNotExistException(String message, Throwable cause) {
        super(message, cause);
    }

    public DatabaseNotExistException(String message) {
        this(message, null);
    }
}
