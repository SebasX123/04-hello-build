package com.paspeur.hello.build;

import org.junit.jupiter.api.Test;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;
import static org.junit.jupiter.api.Assertions.assertEquals;

class HomePathTest {

    @Test
    void readsTheSecret() throws Exception {
        URI resource = getClass().getResource("/secret.txt").toURI();
        Path secret = Path.of(resource);
        assertEquals("swordfish", Files.readString(secret).strip());
    }
}