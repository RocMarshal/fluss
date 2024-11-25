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
 * The client has attempted to perform an operation on an invalid table. For example the table name
 * is too long, contains invalid characters etc. This exception is not retriable because the
 * operation won't suddenly become valid.
 *
 * @see TableNotExistException
 * @see InvalidDatabaseException
 * @since 0.1
 */
@PublicEvolving
public class InvalidTableException extends ApiException {
    public InvalidTableException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidTableException(String message) {
        super(message);
    }

    public InvalidTableException(Throwable cause) {
        super(cause);
    }
}
