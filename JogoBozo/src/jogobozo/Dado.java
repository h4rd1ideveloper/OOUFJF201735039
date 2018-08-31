/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogobozo;

import java.util.Random;

/**
 *
 * @author ice
 */
public class Dado  {
    /**Construtor que recebe o número de lado dos dados
     * @param lados número de faces dos dados
     * */
    public Dado(int lados) {
        this.lados = lados;
    }

    /**Construtor default que seta o número de faces como 6*/
    public Dado() {
        this.lados = 6;
    }

    int lados;
    public int ultimoLancamento;

    private static Random resultado = new Random();

    /**Rola o dado, usando um rand até o valor mais alto (número de faces).
     * @return o valor do dado lançado*/
    public int rolar() {
        ultimoLancamento = (resultado.nextInt(this.lados) + 1);
        return this.ultimoLancamento;
    }

    /**Retorna o valor da face virada para cima da última jogada
     * @return o valor do dado lançado na última rodada*/
    public int getLado() {
        return ultimoLancamento;
    }

    /**Sobrescreve o método toString() da java.lang.Object, alterando sua função para representar um dado
     * em estilo ASCII art.
     *@return String Face
     */
    
    public String geraFace() {
        switch (ultimoLancamento) {
            case 1:
                return "+-----+\n" +
                        "|     |\n" +
                        "|  *  |\n" +
                        "|     |\n" +
                        "+-----+\n";
            case 2:
                return "+-----+\n" +
                        "|*    |\n" +
                        "|     |\n" +
                        "|    *|\n" +
                        "+-----+\n";
            case 3:
                return "+-----+\n" +
                        "|*    |\n" +
                        "|  *  |\n" +
                        "|    *|\n" +
                        "+-----+\n";
            case 4:
                return "+-----+\n" +
                        "|*   *|\n" +
                        "|     |\n" +
                        "|*   *|\n" +
                        "+-----+\n";
            case 5:
                return "+-----+\n" +
                        "|*   *|\n" +
                        "|  *  |\n" +
                        "|*   *|\n" +
                        "+-----+\n";
            case 6:
                return "+-----+\n" +
                        "|*   *|\n" +
                        "|*   *|\n" +
                        "|*   *|\n" +
                        "+-----+\n";
        }
        return null;
    }
}