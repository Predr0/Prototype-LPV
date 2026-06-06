package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PrototypeTest {

    @Test
    void deveClonarObjetoComMesmosAtributosMasReferenciasDiferentes() {
        ConfiguracaoEqualizador original = new ConfiguracaoEqualizador(12, 6, "Rock");
        ConfiguracaoEqualizador clone = (ConfiguracaoEqualizador) original.clonar();

        assertNotSame(original, clone);
        assertEquals(original.getGrave(), clone.getGrave());
        assertEquals(original.getAgudo(), clone.getAgudo());
        assertEquals(original.getNomePerfil(), clone.getNomePerfil());
    }

    @Test
    void deveModificarOCloneSemAlterarOObjetoOriginal() {
        ConfiguracaoEqualizador original = new ConfiguracaoEqualizador(12, 6, "Rock");
        ConfiguracaoEqualizador clone = (ConfiguracaoEqualizador) original.clonar();

        clone.setGrave(3);
        clone.setNomePerfil("Rock Antigo");

        assertNotEquals(original.getGrave(), clone.getGrave());
        assertNotEquals(original.getNomePerfil(), clone.getNomePerfil());
        assertEquals(12, original.getGrave());
        assertEquals("Rock", original.getNomePerfil());
    }
}