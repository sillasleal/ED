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
 * Interface Pilha
 *
 * @author Pr.Byron Leite
 * @param <T>
 */
public interface Pilha<T> {

    /**
     * Método que adiciona um elemento ao topo da pilha
     *
     * @param elemento O elemento a ser adicionado ao topo da pilha
     */
    public void push(T elemento);

    /**
     * Método que remove um elemento do topo da pilha e o retorna
     *
     * @return Retorna o elemento do topo
     * @throws EmptyStackException
     */
    public T pop() throws EmptyStackException;

    /**
     * Método que retorna o elemento do topo sem retorna-lo
     *
     * @return Retorna o elemento do topo
     * @throws EmptyStackException
     */
    public T top() throws EmptyStackException;

    /**
     * Informa se a pilha esta vazia ou não
     *
     * @return
     */
    public boolean isEmpty();

    /**
     * Informa se a pilha esta cheia ou não
     *
     * @return
     */
    public boolean isFull();

    /**
     * Método que retorna a quantidade de elementos da pilha
     *
     * @return
     */
    public int size();
}
