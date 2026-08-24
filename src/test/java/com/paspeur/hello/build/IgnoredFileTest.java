package com.paspeur.hello.build;

import org.junit.jupiter.api.Test;
import java.nio.file.Files;
import java.nio.file.Path;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Bug 2 of 4 — a file that isn't committed.
 * This reads data/greeting.txt. On the author's machine that file is present,
 * so the test passes — but .gitignore keeps the whole data/ folder OUT of the
 * repository, so a clean clone doesn't have it.
 * Fix: make the file part of what's committed (reconsider .gitignore, and put
 * the file where the repo will carry it).
 */
class IgnoredFileTest {

    @Test
    void readsLocalData() throws Exception {
        assertEquals("hi from data", Files.readString(Path.of("data/greeting.txt")).strip());
    }
}
