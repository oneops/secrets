/*
 * Copyright (C) 2015 Square, Inc.
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

package com.oneops.proxy.keywhiz.model;

import com.google.auto.value.AutoValue;

/**
 * Value type containing a secret content and associated series.
 */
@AutoValue
public abstract class SecretSeriesAndContent {

    public static SecretSeriesAndContent of(SecretSeries series, SecretContent content) {
        return new AutoValue_SecretSeriesAndContent(series, content);
    }

    public abstract SecretSeries series();

    public abstract SecretContent content();
}
