package org.example.unicodejpaopgave.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Unicode {

    @Id
    @GeneratedValue
    private char symbol;
    private int unicode;
    private String description;


    public char getSymbol() {
        return symbol;
    }

    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }


    public int getUnicode() {
        return unicode;
    }

    public void setUnicode(int unicode) {
        this.unicode = unicode;
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
