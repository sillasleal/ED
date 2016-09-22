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
package br.poli.ecomp.stack;

import java.util.EmptyStackException;

/**
 * Implementação de uma pilha dinâmica
 *
 * @author Pr.Byron Leite
 * @param <T>
 */
public class PilhaDinamica<T> implements Pilha<T> {

    /**
     * Nó responsável por armazenar os dados da pilha
     */
    private Node<T> topo;

    /**
     * Inteiro que armazena o tamanho atual da pilha
     */
    private int qtd = 0;

    @Override
    public void push(T elemento) {
        Node<T> novo = new Node<>(elemento);
        novo.setNext(topo);
        topo = novo;
        qtd++;
    }

    @Override
    public T pop() throws EmptyStackException {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        T r = topo.getInfo();
        topo = topo.getNext();
        qtd--;
        return r;
    }

    @Override
    public T top() throws EmptyStackException {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return topo.getInfo();
    }

    @Override
    public boolean isEmpty() {
        return topo == null;
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public int size() {
        return qtd;
    }

    @Override
    public String toString() {
        String s = "Topo ";
        for (Node aux = topo; aux != null; aux = aux.getNext()) {
            s = s + " -> " + aux.getInfo();
        }
        return s;
    }
}
