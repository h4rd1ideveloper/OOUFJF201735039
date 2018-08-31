/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogobozo;

import java.util.Scanner;

/**
 *
 * @author ice
 */
public class JogoBozo {
    Dado game = new Dado();
    public int numJogadores;
    public int jogador[];
    
    public JogoBozo() {
        System.out.println(game.rolar());
        System.out.println("Bem vindo\n\n\n");
        System.out.println("Quantos jogadores participaram?\n\n\n");
        Scanner ler = new Scanner(System.in);
        int NumJogadores = ler.nextInt();
        numJogadores = NumJogadores;
        jogador = new int[numJogadores];
        System.out.println(numJogadores);
    }
    
    public boolean fimDoGame(){
        for(short i = 0;  i<jogador.length ;i++){
            
        }
    } 
    public void jogar(){
        int rodadas = 1;
        while(rodadas <=10&!fimDoGame) {
            
        }
    }
    public void face(){
        System.out.println(game.geraFace());
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JogoBozo game = new JogoBozo();
        game.face();
    }
    
}
