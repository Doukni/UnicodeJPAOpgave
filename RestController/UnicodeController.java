package org.example.unicodejpaopgave.RestController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UnicodeController {

    @GetMapping("/unicode/{i}")
    public String unicodeToChar(@PathVariable int i) {
        char c = (char)i;
        return "unicode=" + i + " char=" + c;
    }

    @GetMapping("/CharToUnicode/{k}")
    public String charToUnicode(@PathVariable char k) {
        int c = (int) k;
        return "unicode=" + c + " char=" + k;
    }
}
