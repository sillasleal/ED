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
package br.poli.ecomp.grafos;

/**
 * Implementação de um vértice
 *
 * @author Sillas S. Leal<sillas.s.leal@gmail.com>
 * @param <T>
 */
public class Vertice<T extends Comparable<T>> {

    /**
     * Propriedade contendo a informação a ser salva no vertice.
     */
    private T info;

    /**
     * Construtor
     *
     * @param v Inicializa o objeto com o valor informado.
     */
    public Vertice(T v) {
        info = v;
    }

    /**
     * Método que retorna a informação armazenada no vértice.
     *
     * @return A informação salva
     */
    public T getInfo() {
        return info;
    }

    /**
     * Método que permite alterar a informação definida no vértice.
     *
     * @param info A nova informação do vértice.
     */
    public void setInfo(T info) {
        this.info = info;
    }

    @Override
    public int hashCode() {
        return info.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        boolean r = false;
        if (o instanceof Vertice) {
            r = info.compareTo(((Vertice<T>) o).getInfo()) == 0;
        }

        return r;
    }
}
