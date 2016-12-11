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
package br.poli.ecomp.node;

/**
 * Node básico da biblioteca
 * @author Sillas S.Leal <sillas.s.leal@gmail.com>
 * @param <T>
 */
public class Node<T> {

    /**
     * Objeto contendo o dado a ser armazenado no nó.
     */
    protected T data;

    /**
     * O objeto seguinte
     */
    protected Node right;

    /**
     * Construtor
     */
    public Node() {
        this.data = null;
    }

    /**
     * Construtor
     *
     * @param data Inicializa o objeto com o dado informado
     */
    public Node(T data) {
        this.data = data;
    }

    /**
     * Método que retorna o dado armazenado no nó
     *
     * @return Retorna a informação no nó.
     */
    public T getData() {
        return data;
    }

    /**
     * Método que define o valor a ser armazenado no nó
     *
     * @param data O novo dado a ser armazenado
     * @return Método fluente. Retorna uma instância do próprio objeto
     */
    public Node setData(T data) {
        this.data = data;
        /**/
        return this;
    }

    /**
     * Método que retorna o nó definido a direita
     *
     * @return Retorna Node definido como item a direita
     */
    public Node getRight() {
        return right;
    }

    /**
     * Método que define o nó a direita
     *
     * @param right O novo nó a direita
     * @return Método fluente. Retorna uma instância do próprio objeto.
     */
    public Node setRight(Node right) {
        this.right = right;
        /**/
        return this;
    }

    @Override
    public String toString() {
        return this.data.toString();
    }
}
