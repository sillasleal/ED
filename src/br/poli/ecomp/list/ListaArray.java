package br.poli.ecomp.list;

public class ListaArray<T extends Comparable> implements Lista<T> {

    private T[] dados;
    private int quantidade;

    public ListaArray() {
        dados = (T[]) new Comparable[10];
    }

    public void inserir(T elem) {
        if (quantidade >= dados.length) {
            // amplia a quantidade de memoria disponivel
            T[] dadosCopia = (T[]) new Comparable[quantidade * 2];
            for (int i = 0; i < dados.length; i++) {
                dadosCopia[i] = dados[i];
            }
            dados = dadosCopia;
        }
        int i = quantidade - 1;
        while (i >= 0) {
            if (dados[i].compareTo(elem) < 0) {
                break;
            } else {
                dados[i + 1] = dados[i];
                i--;
            }
        }
        dados[i + 1] = elem;
        quantidade++;
    }

    public boolean remover(T elem) {
        // TODO Auto-generated method stub
        return false;
    }

    public boolean existe(T elem) {
        boolean r = false;
        int left = 0, right = quantidade - 1;
        while (left <= right) {
            int meio = (left + right) / 2;
            int flag = dados[meio].compareTo(elem);
            if (flag == 0) {
                r = true;
                break;
            } else if (flag > 0) {
                right = meio - 1;
            } else {
                left = meio + 1;
            }
        }
        return r;
    }

    public T indexOf(int k) {
        // TODO Auto-generated method stub
        return null;
    }

    public String toString() {
        String s = "";
        for (int i = 0; i < quantidade; i++) {
            s = s + " -> " + dados[i];
        }
        return s;
    }
}
