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

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.google.common.collect.ImmutableList;

/**
 * Response to a listing of existing secrets
 */
public class SecretsResponse {
    /**
     * Listing of secrets with related information but without secret content.
     */
    public final ImmutableList<SanitizedSecret> secrets;

    public SecretsResponse(ImmutableList<SanitizedSecret> secrets) {
        this.secrets = secrets;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(secrets);
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof SecretsResponse) {
            SecretsResponse that = (SecretsResponse) o;
            if (Objects.equal(this.secrets, that.secrets)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("secrets", secrets)
                .toString();
    }
}
