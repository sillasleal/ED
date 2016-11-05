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
package br.poli.ecomp.tree;

import br.poli.ecomp.interfaces.List;
import br.poli.ecomp.interfaces.Tree;
import br.poli.ecomp.node.NodeBi;

/**
 * Implementação de uma arvore binária
 *
 * @author Sillas S.Leal <sillas.s.leal@gmail.com>
 */
public class TreeBinary implements Tree<Comparable> {

    /**
     * Raiz da arvore
     */
    private NodeBi root;

    /**
     * String auxiliar para o método toString
     */
    private String strAux;

    /**
     * Lista auxiliar para o método de percurso
     */
    private List listAux;

    /**
     * Construtor
     */
    public TreeBinary() {
        this.strAux = "";
        this.listAux = new br.poli.ecomp.list.List();
    }

    @Override
    public void add(Comparable info) {
        NodeBi novo = new NodeBi(info);
        if (this.root == null) {
            //A raiz ainda é nula(vazia), define info como o valor da raiz.
            this.root = novo;
        } else {
            int test;
            NodeBi temp = this.root;
            while (temp != null) {
                //Teste para verificar para qual lado caminhar
                test = temp.getData().compareTo(info);
                if (test == 0) {
                    //O valor informado já existe na arvore, ou seja, o teste retorna 0, não faz nada.
                    break;
                } else if (test > 0) {
                    //O valor informado é menor que o de temp, ou seja, o teste retorna -1, desce para aesquerda
                    if (temp.getLeft() == null) {
                        //Não há nada a esquerda, define o valor e para o loop
                        temp.setLeft(novo);
                        break;
                    } else {
                        //Desce para a esquerda
                        temp = temp.getLeft();
                    }
                } else {
                    //O valor informado é maior que temp, ou seja, o teste retorna 1,desce para a direita
                    if (temp.getRight() == null) {
                        //Não há nada a direita, define o valor e para o loop
                        temp.setRight(novo);
                        break;
                    } else {
                        //Desce para a direita
                        temp = (NodeBi) temp.getRight();
                    }
                }
            }
        }
    }

    @Override
    public boolean contains(Comparable info) {
        boolean ret = false;
        int test;
        NodeBi temp = this.root;
        while (temp != null) {
            test = temp.getData().compareTo(info);
            if (test == 0) {
                ret = true;
                break;
            } else if (test > 0) {
                temp = temp.getLeft();
            } else {
                temp = (NodeBi) temp.getRight();
            }
        }
        return ret;
    }

    @Override
    public boolean remove(Comparable info) {
        NodeBi aux = this.root, pai = aux;
        int test;
        while (aux != null) {
            test = aux.getData().compareTo(info);
            if (test == 0) {
                if (aux.getLeft() != null && aux.getRight() != null) {
                    return this.removeNode(aux);
                } else if (aux.getLeft() == null) {
                    if (pai.getLeft() == aux) {
                        pai.setLeft((NodeBi) aux.getRight());
                    } else {
                        pai.setRight(aux.getRight());
                    }
                    return true;
                } else {
                    if (pai.getRight() == aux) {
                        pai.setLeft(aux.getLeft());
                    } else {
                        pai.setRight(aux.getLeft());
                    }
                    return true;
                }
            } else if (test > 0) {
                pai = aux;
                aux = aux.getLeft();
            } else {
                pai = aux;
                aux = (NodeBi) aux.getRight();
            }

        }

        return false;
    }

    /**
     * Método auxiliar usado para remover nós com dois filhos
     *
     * @param node O nó a ser removido
     * @return Retorna TRUE em caso de sucesso ou FALSE em caso de erro.
     */
    private boolean removeNode(NodeBi node) {
        NodeBi aux = (NodeBi) node.getRight();
        NodeBi pai = aux;
        //Buscando o nó mais a esquerda de node
        while (aux.getLeft() != null) {
            pai = aux;
            aux = aux.getLeft();
        }
        //Substituindo os valores
        if (aux == pai) {
            node.setRight(aux.getRight());
        } else {
            pai.setLeft((NodeBi) aux.getRight());
        }
        return true;
    }

    @Override
    public List iterator() {
        return this.iterator(0);
    }

    @Override
    public List iterator(int modo) {
        this.listAux = new br.poli.ecomp.list.List();
        switch (modo) {
            case -1:
                this.preOrder(this.root);
                break;
            case 1:
                this.postOrder(this.root);
                break;
            default:
                this.inOrder(this.root);
                break;
        }
        return this.listAux;
    }

    @Override
    public String toString() {
        this.strAux = "";
        this.inOrder(this.root);
        if (this.strAux.length() > 0) {
            this.strAux = this.strAux.substring(0, this.strAux.length() - 2);
        }
        return this.strAux;
    }

    /**
     * Método que realiza o percurso pré-ordem na arvore
     *
     * @param node O nó inicial do percurso
     */
    private void preOrder(NodeBi node) {
        if (node != null) {
            this.strAux += node.getData().toString() + ", ";
            this.listAux.add(node.getData());
            this.preOrder(node.getLeft());
            this.preOrder((NodeBi) node.getRight());
        }
    }

    /**
     * Método que realiza o percurso em ordem pela arvore
     *
     * @param node O nó inicial do percurso
     */
    private void inOrder(NodeBi node) {
        if (node != null) {
            this.inOrder(node.getLeft());
            this.strAux += node.getData().toString() + ", ";
            this.listAux.add(node.getData());
            this.inOrder((NodeBi) node.getRight());
        }
    }

    /**
     * Método que realiza o percurso pós-ordem na arvore
     *
     * @param node O nó inicial do percurso.
     */
    private void postOrder(NodeBi node) {
        if (node != null) {
            this.postOrder(node.getLeft());
            this.postOrder((NodeBi) node.getRight());
            this.strAux += node.getData().toString() + ", ";
            this.listAux.add(node.getData());
        }
    }

}
