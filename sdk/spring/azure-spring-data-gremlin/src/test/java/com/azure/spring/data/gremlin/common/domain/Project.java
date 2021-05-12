// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.spring.data.gremlin.common.domain;

import com.azure.spring.data.gremlin.annotation.Vertex;
import com.azure.spring.data.gremlin.common.TestConstants;

@Vertex(label = TestConstants.VERTEX_PROJECT_LABEL)
public class Project {

    private String id;

    private String name;

    private String uri;

    public Project() {
    }

    public Project(String id, String name, String uri) {
        this.id = id;
        this.name = name;
        this.uri = uri;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }
}
