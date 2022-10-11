/*
 * AC1 - Linguagem de Programacao - ADS
 * Exemplo escrito por Robson Martins
 */
package br.facens;

import javax.swing.JOptionPane;

public class Pokemon {
    
    private String nome;
    private String tipo;
    private int vida;

    public Pokemon() {}
    
    public Pokemon(String nome, String tipo){
        this.nome = nome;
        this.tipo = tipo;
        switch (this.tipo) {
            case "agua" : this.vida = 195; break;
            case "fogo" : this.vida = 180; break;
            case "terra": this.vida = 220; break;
            case "ar"   : this.vida = 225; break;
            default     : this.vida = 200; break;
        }
    }
    
    public String getNome() {
        return nome;
    }
    
    public String getTipo() {
        return tipo;
    }
    
    public int getVida() {
        return vida;
    }
    
    public void imprimir(){
        JOptionPane.showMessageDialog(null, "Nome: \"" + getNome() + 
                "\", Tipo: \"" + getTipo() + "\", Vida: " + getVida(),
                "Pokemón", JOptionPane.INFORMATION_MESSAGE);
    }
}
