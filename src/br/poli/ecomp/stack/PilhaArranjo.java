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
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Implementação da estrutura pilha usando arranjo
 *
 * @author Sillas S. Leal<sillas.s.leal@gmail.com>
 * @param <E>
 */
public class PilhaArranjo<E> implements Pilha<E> {

    /**
     * Array de elementos a serem armazenados
     */
    private E[] lista;
    /**
     * Tamanho máximo da pilha
     */
    private int max;

    /**
     * Topo da pilha, também indica o tamanho atual
     */
    private int topo;

    /**
     * Construtor
     * @param max O tamanho máximo da pilha 
     */
    public PilhaArranjo(int max) {
        this.max = max;
        this.lista = (E[]) new Object[max];
    }

    @Override
    public void push(E elemento) {
        if (isFull()) {
            try {
                throw new Exception("A pilha já esta cheia");
            } catch (Exception ex) {
                Logger.getLogger(PilhaArranjo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        this.lista[++this.topo] = elemento;
    }

    @Override
    public E pop() throws EmptyStackException {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        E e = lista[this.topo--];

        return e;
    }

    @Override
    public E top() throws EmptyStackException {
        if (isEmpty()) {
            throw new EmptyStackException();
        }

        return lista[this.topo];
    }

    @Override
    public boolean isEmpty() {
        return this.topo < 0;
    }

    @Override
    public boolean isFull() {
        return this.topo == this.max;
    }

    @Override
    public int size() {
        return this.topo + 1;
    }

}
