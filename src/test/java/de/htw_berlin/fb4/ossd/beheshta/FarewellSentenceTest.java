/*
 * Copyright (c) 2026 beheshta24
 *
 * SPDX-License-Identifier: MIT
 */

package de.htw_berlin.fb4.ossd.beheshta;

import junit.framework.TestCase;

public class FarewellSentenceTest extends TestCase {

    public void testGet() {

        FarewellSentence sentence =
                new FarewellSentence();

        assertEquals(
                "Bis zum nächsten Mal!",
                sentence.get()
        );
    }
}
