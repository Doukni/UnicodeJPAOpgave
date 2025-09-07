package org.example.unicodejpaopgave.config;

import org.example.unicodejpaopgave.Model.Unicode;
import org.example.unicodejpaopgave.Repository.UnicodeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

@Component
public class InitData implements CommandLineRunner {

    @Autowired
    private UnicodeRepository unicodeRepository;

    @Override
    public void run(String... args) throws Exception {
        Set<Character> chars = new HashSet<Character>();
        for (int i = 0; i < 111; i++) {
            chars.add((char)i);
        }

        for (Character c : chars) {
            if (unicodeRepository.findBySymbol(c).isEmpty()) {
                int unicode = (int) c;
                Unicode u = new Unicode(c, unicode, "Auto-generate");
                unicodeRepository.save(u);
            }
        }
    }
}
