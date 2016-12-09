package br.poli.ecomp.grafos;

import java.util.Iterator;

public interface IGrafo<T extends Comparable> {

    /**
     * Método que retorna o número de vértices no grafo
     *
     * @return Retorna o número atual de vértices
     */
    public int numVertices();

    /**
     * Método que retorna o número de arestas no grafo.
     *
     * @return Retorna o número atual de arestas.
     */
    public int numArestas();

    /**
     * Retorna o grau negativo do vértice informado
     *
     * @param v O vértice a ser verificado.
     * @return Retorna um inteiro correspondente ao número negativo de vértices
     * ou 0 caso o vértice seja nulo.
     */
    public int grauNegativo(Vertice v);

    /**
     * Método que retorna o grau positivo do vértice informado.
     *
     * @param v O vértice a ser verificado.
     * @return Retorna o valor do grau positivo do vértice informado.
     */
    public int grauPositivo(Vertice v);

    public Iterator<Vertice> vertices();

    /**
     * Método que retorna os vértices adjacentes do vértice informado.
     *
     * @param v O vértice a ser consultado
     * @return Retorna um Iterator dos vértices relacionados ao vértice
     * informado. Retorna NULL caso o vértice não esteja na tabela de
     * adjacências.
     */
    public Iterator<Vertice> verticesAdjacentes(Vertice v);

    /**
     * Devolve os vértices nos quais há arestas no grafo em que v é destino
     *
     * @param v O vértice destino usado nesta consulta.
     * @return Os vértices nos quais há arestas no grafo em que v é destino
     */
    public Iterator<Vertice> verticesIncidentes(Vertice v);

    /**
     * Método que verifica se os dois métodos são adjacentes.
     *
     * @param origem O vértice de origem.
     * @param destino O vértice de destino.
     * @return Retorna TRUE caso sejam e FALSE caso não sejam adjacentes.
     */
    public boolean saoAdjacentes(Vertice origem, Vertice destino);

    /**
     * Método que insere um novo vértice no grafo.
     *
     * @param v O novo vértice a ser inserido.
     */
    public void insereVertice(Vertice v);

    /**
     * Método que insere uma aresta no grafo.
     *
     * @param origem O vértice de origem da aresta.
     * @param destino O vértice de destino da aresta.
     */
    public void insereAresta(Vertice origem, Vertice destino);

    void removeVertice(Vertice v);

    void removeAresta(Vertice origem, Vertice destino);
}
