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
 * Nó binário, contendo além do dado a direita, o dado a esquerda também.
 *
 * @author Sillas S.Leal <sillas.s.leal@gmail.com>
 */
public class NodeBi extends NodeComparable {

    /**
     * O nó a esquerda
     */
    private NodeBi left;

    /**
     * Construtor
     *
     * @param data O novo valor a ser definido para o nó
     */
    public NodeBi(Comparable data) {
        super(data);
    }

    /**
     * Método que retorna o nó a esquerda
     *
     * @return Retorna o nó definido a esquerda deste.
     */
    public NodeBi getLeft() {
        return left;
    }

    /**
     * Método que define o nó a esquerda
     *
     * @param left O novo nó a esquerda
     * @return Método fluente. Retorna o próprio objeto.
     */
    public NodeBi setLeft(NodeBi left) {
        this.left = left;
        /**/
        return this;
    }

}
