/*
 * Copyright (C) 2016 sillas
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package br.poli.ecomp.expressao;

import java.util.Scanner;

/**
 * Classe de testes de expressões
 *
 * @author Sillas S. Leal<sillas.s.leal@gmail.com>
 */
public class ExpressaoRun {

    /**
     * Método que permite testar a classe de expressão
     */
    public static void run() {
        PosFixa calc = new PosFixa();
        Scanner scan = new Scanner(System.in);
        System.out.println("Calculadora de expressões pos-fixa.\n");
        String expressao = " ";
        while (expressao.length() > 0) {
            try {
                System.out.println("Informe a expressão a ser calculada");
                System.out.println("Ou informe 'q' para sair");
                expressao = scan.nextLine();
                if (expressao.length() == 0
                        || (expressao.length() > 0
                        && Character.isLetter(expressao.toCharArray()[0]))) {
                    System.out.println("Programa terminado");
                    System.exit(0);
                }
                System.out.println("Resultado: " + calc.avaliar(expressao));
                System.out.println("\n");
            } catch (Exception exp) {
                System.out.println("Ocorreu um erro: Veja abaixo o erro");
                System.out.println(exp.getMessage() + "\n");
            }
        }
    }
}
