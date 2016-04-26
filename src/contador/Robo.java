/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contador;

/**
 *
 * @author quinho
 */
public class Robo {
    
    private static int count;
    private String nome;
    
    public Robo (String nome) {
        this.nome = nome;
    }
    
    public void trabalhar() {
        System.out.println("Eu, " + getNome() + " realizei um trabalho!");
        count++;
    }

    public static int getCount() {
        return count;
    }

    public String getNome() {
        return nome;
    }
    
}
