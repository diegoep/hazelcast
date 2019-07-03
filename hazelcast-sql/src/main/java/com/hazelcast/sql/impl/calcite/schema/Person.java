/*
 * Copyright (c) 2008-2019, Hazelcast, Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.hazelcast.sql.impl.calcite.schema;

import java.io.Serializable;

public class Person implements Serializable {

    private static final long serialVersionUID = -6246062753552398281L;

    public final int __key;
    public final String name;
    public final int age;
    public final double height;
    public final boolean active;

    public Person(int key) {
        this.__key = key;
        this.name = "Person " + key;
        this.age = key;
        this.height = 100.5 + key;
        this.active = key % 2 == 0;
    }

}
