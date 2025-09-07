package org.example.unicodejpaopgave.config;

import org.example.unicodejpaopgave.Repository.UnicodeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class InitData implements CommandLineRunner {

    @Autowired
    private UnicodeRepository unicodeRepository;

    @Override
    public void run(String... args) throws Exception {

    }
}
