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
public class Contador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Robo robo0 = new Robo("Robo 00");
        Robo robo1 = new Robo("Robo 01");
        Robo robo2 = new Robo("Robo 02");
        Robo robo3 = new Robo("Robo 03");
        Robo robo4 = new Robo("Robo 04");
        Robo robo5 = new Robo("Robo 05");
        Robo robo6 = new Robo("Robo 06");
        Robo robo7 = new Robo("Robo 07");
        Robo robo8 = new Robo("Robo 08");
        Robo robo9 = new Robo("Robo 09");
        
        robo0.trabalhar();
        robo1.trabalhar();
        robo2.trabalhar();
        
        System.out.println("Número de trabalhos realizados pelos robôs: " + Robo.getCount());
        
        robo0.trabalhar();
        robo3.trabalhar();
        robo4.trabalhar();
        robo5.trabalhar();
        robo6.trabalhar();
        robo7.trabalhar();
        
        System.out.println("Número de trabalhos realizados pelos robôs: " + Robo.getCount());
        
    }
    
}
