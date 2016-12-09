/*
 * Copyright (C) 2016 Sillas S.Leal <sillas.s.leal@gmail.com>
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
package br.poli.ecomp.interfaces;

/**
 * Interface base para as classes que implementam arvores
 *
 * @author Sillas S.Leal <sillas.s.leal@gmail.com>
 * @param <T>
 */
public interface Tree<T extends Comparable> {

    public static final int MODO_PRE_ORDEM = -1;
    public static final int MODO_ORDEM = 0;
    public static final int MODO_POS_ORDEM = 1;

    /**
     * Método que insere um novo valor na arvore
     *
     * @param info O novo valor a ser inserido
     */
    public void add(T info);

    /**
     * Método que verifica se o valor informado existe na arvore
     *
     * @param info O valor buscado
     * @return Retorna TRUE caso o valor tenha sido encontrado ou FALSE caso não
     * tenha sido
     */
    public boolean contains(T info);

    /**
     * Método que remove o valor informado da arvore
     *
     * @param info O valor a ser removido da arvore
     * @return Retorna TRUE em caso de sucesso ou FALSE em caso de erro
     */
    public boolean remove(T info);

    /**
     * Método que retorna uma lista obtida pelo percurso em ordem da arvore
     *
     * @return Retorna uma lista contendo os elementos da arvore
     */
    public List iterator();

    /**
     * Método que percorre a arvore. Retorna o resultado do percurso em forma de
     * lista
     *
     * @param modo Define o modo do percurso.(-1)=pré-ordem | (0)=em ordem |
     * (1)=pós-ordem
     * @return Retorna uma lista contendo os elementos na ordem informada
     */
    public List iterator(int modo);

}
