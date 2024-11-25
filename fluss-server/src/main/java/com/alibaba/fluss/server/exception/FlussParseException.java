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

package com.alibaba.fluss.server.exception;

import com.alibaba.fluss.exception.FlussException;

/** Exception which indicates that the parsing of command line arguments failed. */
public class FlussParseException extends FlussException {

    private static final long serialVersionUID = 5164983338744708430L;

    public FlussParseException(String message, Throwable cause) {
        super(message, cause);
    }
}
