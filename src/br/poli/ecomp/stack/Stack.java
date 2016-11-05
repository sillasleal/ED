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
package br.poli.ecomp.stack;

import java.util.EmptyStackException;
import br.poli.ecomp.node.NodeStack;

/**
 * Implementação de uma pilha dinâmica.
 *
 * @author Sillas S.Leal <sillas.s.leal@gmail.com>
 * @param <T>
 */
public class Stack<T> implements br.poli.ecomp.interfaces.Stack<T> {

    /**
     * Nó usado para armazenar os dados da pilha.
     */
    private NodeStack<T> node;
    /**
     * Variável que armazena o tamanho atual da pilha.
     */
    private int size;

    /**
     * Construtor.
     */
    public Stack() {
        this.size = 0;
    }

    @Override
    public void push(T elemento) {
        NodeStack aux = new NodeStack(elemento);
        aux.setRight(this.node);
        this.node = aux;
        this.size++;
    }

    @Override
    public T pop() throws EmptyStackException {
        if (this.isEmpty()) {
            throw new EmptyStackException();
        }
        T ret = this.node.getData();
        this.node = this.node.getRight();
        this.size--;
        /**/
        return ret;
    }

    @Override
    public T top() throws EmptyStackException {
        return this.node.getData();
    }

    @Override
    public boolean isEmpty() {
        return this.size == 0;
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public String toString() {
        String temp = "";
        NodeStack aux = this.node;
        while (aux != null) {
            temp += aux.getData().toString() + ", ";
            aux = aux.getRight();
        }
        if (temp.length() > 0) {
            temp = temp.substring(0, temp.length() - 2);
        }
        return temp;
    }

}
