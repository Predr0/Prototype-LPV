package org.example;

public class ConfiguracaoEqualizador implements Prototipo {
    private int grave;
    private int agudo;
    private String nomePerfil;

    public ConfiguracaoEqualizador(int grave, int agudo, String nomePerfil) {
        this.grave = grave;
        this.agudo = agudo;
        this.nomePerfil = nomePerfil;
    }

    public ConfiguracaoEqualizador(ConfiguracaoEqualizador prototipo) {
        if (prototipo != null) {
            this.grave = prototipo.grave;
            this.agudo = prototipo.agudo;
            this.nomePerfil = prototipo.nomePerfil;
        }
    }

    @Override
    public Prototipo clonar() {
        return new ConfiguracaoEqualizador(this);
    }

    public int getGrave() { return grave; }
    public void setGrave(int grave) { this.grave = grave; }
    public int getAgudo() { return agudo; }
    public void setAgudo(int agudo) { this.agudo = agudo; }
    public String getNomePerfil() { return nomePerfil; }
    public void setNomePerfil(String nomePerfil) { this.nomePerfil = nomePerfil; }
}