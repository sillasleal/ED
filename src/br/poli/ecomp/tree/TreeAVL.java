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
package br.poli.ecomp.tree;

import br.poli.ecomp.node.NodeComparableBi;

/**
 * Implementação de uma arvore AVL.
 *
 * @author Sillas S. Leal<sillas.s.leal@gmail.com>
 */
public class TreeAVL extends TreeBinary {

    @Override
    public void add(Comparable info) {
        super.add(info);
    }

    @Override
    public boolean remove(Comparable info) {
        return super.remove(info);
    }

    /**
     * Método que realiza uma rotação simples a esquerda.
     *
     * @param node
     */
    private void rotacaoEsquerda(NodeComparableBi node) {
        //le filho direita
    }

    /**
     * Método que realiza uma rotação simples a direita.
     *
     * @param node
     */
    private void rotacaoDireita(NodeComparableBi node) {

    }

    private void duplaEsquerda(NodeComparableBi node) {

    }

    private void duplaEsquerdaDireita(NodeComparableBi node) {

    }
}
