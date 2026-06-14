/*
 * Copyright (c) 2026 beheshta24
 *
 * SPDX-License-Identifier: MIT
 */

package de.htw_berlin.fb4.ossd.beheshta;

import junit.framework.TestCase;

public class GreetingSentenceTest extends TestCase {

    public void testGet() {

        GreetingSentence sentence =
                new GreetingSentence();

        assertEquals(
                "Hallo zusammen!",
                sentence.get()
        );
    }
}
