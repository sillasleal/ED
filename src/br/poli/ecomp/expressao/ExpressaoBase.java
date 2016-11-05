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
 * Classe base para as expressões
 *
 * @author Sillas S. Leal<sillas.s.leal@gmail.com>
 */
abstract public class ExpressaoBase {

    /**
     * Lista de operadores permitidos para as operações
     */
    protected final char[] operadores = new char[]{'+', '-', '*', '/'};


    /**
     * Classe usada para realizar as operações com os dados da pilha de acordo
     * com o operador
     *
     * @param pilha A pilha contendo os valores usados para calculo
     * @param operador O operador de acordo com os operadores definidos
     * @throws Exception Lança uma exceção caso o operador não tenha sido
     * definido
     */
    protected void calcByStack(Stack pilha, char operador) throws Exception {
        int a, b, val = 0;
        a = (int) pilha.pop();
        b = (int) pilha.pop();
        switch (operador) {
            case '+':
                val = a + b;
                break;
            case '-':
                val = b - a;
                break;
            case '*':
                val = a * b;
                break;
            case '/':
                val = b / a;
                break;
            case '^':
                val = (int) Math.pow((double) a, (double) b);
                break;
            default:
                throw new Exception("O caracter '" + operador + "' da "
                        + "expressão é inválido!");
        }
        pilha.push(val);
    }
}
