package org.example.unicodejpaopgave.Repository;

import org.example.unicodejpaopgave.Model.Unicode;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UnicodeRepository extends JpaRepository<Unicode, Integer> {
    Optional<Unicode> findBySymbol(char symbol);
}
