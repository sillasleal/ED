package br.poli.ecomp.list;

public class ListaLigada<T extends Comparable> implements Lista<T> {

    private Node<T> inicio;

    public void inserir(T elem) {
        Node<T> nova = new Node<T>(elem);
        if (inicio == null) {
            inicio = nova;
        } else if (inicio.getInfo().compareTo(elem) > 0) {
            nova.setNext(inicio);
            inicio = nova;
        } else {
            Node<T> aux = inicio;
            while (aux.getNext() != null) {
                if (aux.getNext().getInfo().compareTo(elem) > 0) {
                    break;
                } else {
                    aux = aux.getNext();
                }
            }
            nova.setNext(aux.getNext());
            aux.setNext(nova);
        }
    }

    public boolean remover(T elem) {
        boolean r = false;
        if (inicio == null) {
            // nada a fazer
        } else if (inicio.getInfo().compareTo(elem) == 0) {
            inicio = inicio.getNext();
            r = true;
        } else {
            Node<T> aux = inicio;
            while (aux.getNext() != null) {
                if (aux.getNext().getInfo().compareTo(elem) >= 0) {
                    break;
                } else {
                    aux = aux.getNext();
                }
            }
            if (aux.getNext() == null) {
                // nada a fazer
            } else if (aux.getNext().getInfo().compareTo(elem) == 0) {
                aux.setNext(aux.getNext().getNext());
                r = true;
            }
        }
        return r;
    }

    public boolean existe(T elem) {
        // TODO Auto-generated method stub
        return false;
    }

    public T indexOf(int k) {
        // TODO Auto-generated method stub
        return null;
    }

    public String toString() {
        String s = "";
        for (Node aux = inicio; aux != null; aux = aux.getNext()) {
            s = s + " -> " + aux.getInfo();
        }
        return s;
    }

}
