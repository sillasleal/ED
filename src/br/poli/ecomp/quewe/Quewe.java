/*
 * Copyright (C) 2016 Sillas S. Leal<sillas.s.leal@gmail.com>
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
package br.poli.ecomp.quewe;

import br.poli.ecomp.node.Node;

/**
 * Implementação da interface Quewe
 *
 * @author Sillas S. Leal<sillas.s.leal@gmail.com>
 */
public class Quewe implements br.poli.ecomp.interfaces.Quewe {

    /**
     * Inteiro que armazena o tamanho da fila
     */
    private int size;

    /**
     * Objeto referente ao início da fila
     */
    private Node head;

    /**
     * Objeto referente ao fim da fila
     */
    private Node end;

    /**
     *
     */
    public Quewe() {
        this.size = 0;
        this.head = this.end = null;
    }

    @Override
    public void enquewe(Object info) {
        Node novo = new Node(info);
        if (this.isEmpty()) {
            this.head = novo;
            this.end = novo;
        } else {
            this.end.setRight(novo);
            this.end = novo;
        }
        this.size++;
    }

    @Override
    public Object dequewe() throws Exception {
        Object ret = null;
        if (!this.isEmpty()) {
            ret = this.head.getData();
            this.head = this.head.getRight();
            if (this.head == null) {
                this.end = null;
            }
            this.size--;
        }
        return ret;
    }

    @Override
    public Object peek() throws Exception {
        return this.head.getData();
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        return this.size == 0;
    }

    @Override
    public boolean isFull() {
        //Retorna FALSE pois a fila é dinâmica
        return false;
    }

    @Override
    public String toString() {
        String ret = "";
        Node tmp = this.head;
        while (tmp != null) {
            ret += tmp.toString() + ", ";
            tmp = tmp.getRight();
        }

        return ret;
    }

    /**
     * Método que inverte a fila usando apenas filas
     *
     * @return Retorna a fila em ordem inversa
     * @throws Exception
     */
    public Quewe reverse() throws Exception {
        Quewe tmp = this;
        Quewe ret = new Quewe();
        int qt = 0;
        while (qt++ < this.size) {
            for (int i = 0; i < tmp.size() - 1; i++) {
                tmp.enquewe(tmp.dequewe());
            }
            ret.enquewe(tmp.peek());
        }
        return ret;
    }

}
