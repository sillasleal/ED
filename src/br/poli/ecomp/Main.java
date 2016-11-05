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
package br.poli.ecomp;

import br.poli.ecomp.convert.NumeralRun;
import br.poli.ecomp.expressao.ExpressaoRun;
import br.poli.ecomp.stack.Stack;
import br.poli.ecomp.tree.TreeBinary;
import java.util.Scanner;

/**
 * Classe inicial da aplicação
 *
 * @author Sillas S. Leal<sillas.s.leal@gmail.com>
 */
public class Main {

    public static void main(String[] args) {
        Stack st = new Stack();
        System.out.println(st.size());
        for (int i = 50; i > 0; i--) {
            st.push(i);
        }
        System.out.println(st.size());
        System.out.println(st);
        for (int i = 0; i < 20; i++) {
            System.out.println(st.pop());
            System.out.println(st.size());
        }
    }

    /**
     * Método inicial da aplicação
     *
     * @param args Os argumentos da linha de comando
     */
//    public static void main(String[] args) {
//        System.out.println("Selecione o que você quer testar.\n");
//        System.out.println("1 = Conversão de bsae");
//        System.out.println("2 = Calcular expressão");
//        System.out.println("3 = Testar Arvores");
//        System.out.println("Outro = Sair\n");
//        //Lendo a opção a ser executada
//        int opcao = new Scanner(System.in).nextInt();
//        // Chamadno o método adequado
//        switch (opcao) {
//            case 1:
//                NumeralRun.run();
//                break;
//            case 2:
//                ExpressaoRun.run();
//                break;
//            default:
//                System.exit(0);
//        }
//    }
}
