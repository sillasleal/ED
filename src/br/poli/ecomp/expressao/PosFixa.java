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

import br.poli.ecomp.stack.Stack;

/**
 *
 * @author Sillas S. Leal<sillas.s.leal@gmail.com>
 */
public class PosFixa extends ExpressaoBase implements Expressao {

    @SuppressWarnings("UnusedAssignment")
    @Override
    public int avaliar(String expressao) throws Exception {
        if (expressao.length() == 0) {
            throw new Exception("A expressão informada esta vazia");
        }
        // Convertendo a expressão para array de caracteres
        // OBS.: Não foi usado split pois há casos de variação de 
        // distâncias entre caracteres.
        // * Foi usado o caractere de espaço para separar pois isso permite 
        // expressões com números maiores que unidades
        Stack pilha = new Stack();
        char[] chars = expressao.trim().toCharArray();
        char c;
        String num = "";
        int val = 0;
        // for (char c : chars) {
        for (int i = 0; i < chars.length; i++) {
            c = chars[i];
            // Montando os caracteres. Dessa forma é possível utilizar valores maiores que 9
            if (Character.isDigit(c)) {
                num += c;
            }
            // Empilhando os valores. O valores são empilhados sempre que um 
            // espaço ou operador são encontrados, ou caso tenha chagdo ao fim da string.
            if ((Character.isSpaceChar(c)
                    || new String(this.operadores).indexOf(c) > -1
                    || (i + 1) == chars.length)
                    && num.length() > 0) {
                val = Integer.parseInt(num);
                pilha.push(val);
                num = "";
            }
            if (new String(this.operadores).indexOf(c) > -1) {
                this.calcByStack(pilha, c);
                num = "";
            }
        }

        // Recuperando o resultado da operação do topoda pilha,
        // em caso de expressão mal formatada, um erro é retornado
        val = (int) pilha.pop();
        if (!pilha.isEmpty()) {
            throw new Exception("A expressão esta mal formatada");
        }

        return val;
    }

    @Override
    public Expressao converter(Expressao expressao) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
