package com.paspeur.hello.build;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Bug 3 of 4 — a value from the environment.
 * This reads an environment variable the author had set in their shell. It is
 * not committed anywhere, so a clean clone (and CI) sees null.
 * Fix: make the build provide this value itself, committed — so it no longer
 * depends on whatever happens to be set in one person's shell.
 */
class EnvVarTest {

    @Test
    void usesConfiguredMode() {
        assertEquals("fast", System.getenv("GATOR_MODE"));
    }
}
