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

/**
 * Interface para a implementação de classes para calculo de expressões
 *
 * @author Sillas S. Leal<sillas.s.leal@gmail.com>
 */
public interface Expressao {

    /**
     * Método que realiza o calculo da expressão informada
     *
     * @param expressao A expressão a ser calculada
     * @return Retorna o valor fina da expressão
     * @throws java.lang.Exception
     */
    public int avaliar(String expressao) throws Exception;

    /**
     * Método que converte um tipo de expressão para outro
     *
     * @param expressao Objeto contendo a expressão a ser convertida
     * @return A expressão no seu novo formato
     * @throws Exception
     */
    public Expressao converter(Expressao expressao) throws Exception;
}
