package org.apache.maven.model;

/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Tests {@code Parent}.
 *
 * @author Benjamin Bentmann
 */
public class ParentTest
{

    @Test
    public void testHashCodeNullSafe()
    {
        new Parent().hashCode();
    }

    @Test
    public void testEqualsNullSafe()
    {
        assertNotEquals( null, new Parent() );

        new Parent().equals( new Parent() );
    }

    @Test
    public void testEqualsIdentity()
    {
        Parent thing = new Parent();
        assertEquals( thing, thing );
    }

    @Test
    public void testToStringNullSafe()
    {
        assertNotNull( new Parent().toString() );
    }

}
