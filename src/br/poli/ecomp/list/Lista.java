package br.poli.ecomp.list;

public interface Lista<T extends Comparable> {

    public void inserir(T elem);

    public boolean remover(T elem);

    public boolean existe(T elem);

    public T indexOf(int k);

    public String toString(); // redudante, pois vem de Object
}
