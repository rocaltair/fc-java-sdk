/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package com.aliyuncs.fc.model;

import com.google.gson.annotations.SerializedName;

public class VersionMetaData {

    @SerializedName("versionId")
    private Integer versionId;

    @SerializedName("description")
    private String description;

    @SerializedName("createdTime")
    private String createdTime;

    @SerializedName("lastModifiedTime")
    private String lastModifiedTime;

    public VersionMetaData(Integer versionId, String description, String createdTime,
        String lastModifiedTime) {
        this.versionId = versionId;
        this.description = description;
        this.createdTime = createdTime;
        this.lastModifiedTime = lastModifiedTime;
    }

    public Integer getVersionId() {
        return versionId;
    }

    public VersionMetaData setVersionId(Integer versionId) {
        this.versionId = versionId;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public VersionMetaData setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getCreatedTime() {
        return createdTime;
    }

    public VersionMetaData setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    public String getLastModifiedTime() {
        return lastModifiedTime;
    }

    public VersionMetaData setLastModifiedTime(String lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }
}
