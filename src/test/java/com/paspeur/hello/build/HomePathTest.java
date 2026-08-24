package com.paspeur.hello.build;

import org.junit.jupiter.api.Test;
import java.nio.file.Files;
import java.nio.file.Path;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Bug 1 of 4 — an absolute path.
 * This reads a file from the ORIGINAL AUTHOR's home directory. It exists on
 * their computer and nowhere else, so a clean clone cannot find it.
 * Fix: make the repository carry what this test needs (a committed resource),
 * and read it from the classpath instead of an absolute path.
 */
class HomePathTest {

    @Test
    void readsTheSecret() throws Exception {
        Path secret = Path.of(System.getProperty("user.home"), ".gator", "secret.txt");
        assertEquals("swordfish", Files.readString(secret).strip());
    }
}
