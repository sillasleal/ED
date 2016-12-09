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

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;

/**
 * Implementação básica de uma estrutura de dados Grafo
 *
 * @author Sillas S. Leal<sillas.s.leal@gmail.com>
 * @param <T>
 */
public class Grafo<T extends Comparable<T>> implements IGrafo<T> {

    /**
     * A tabela contem o mapeamento de um Vértice para uma Lista de vértices
     * adjacentes
     */
    private Hashtable<Vertice<T>, List<Vertice<T>>> tabela;

    /**
     *
     */
    public Grafo() {
        tabela = new Hashtable<>();
    }

    public int numVertices() {
        return tabela.size();
    }

    public int numArestas() {
        int total = 0;
        for (Enumeration<Vertice<T>> iterator = tabela.keys(); iterator.hasMoreElements();) {
            Vertice<T> vertice = iterator.nextElement();
            List<Vertice<T>> listaAdjacentes = tabela.get(vertice);
            if (listaAdjacentes != null) {
                total += listaAdjacentes.size();
            }
        }
        return total;
    }

    public int grauNegativo(Vertice v) {
        List<Vertice<T>> listaAdjacentes = tabela.get(v);
        if (listaAdjacentes != null) {
            return listaAdjacentes.size();
        } else {
            return 0;
        }
    }

    @Override
    public int grauPositivo(Vertice v) {
        int total = 0;
        for (Enumeration<Vertice<T>> iterator = tabela.keys(); iterator.hasMoreElements();) {
            Vertice<T> vertice = iterator.nextElement();
            List<Vertice<T>> listaAdjacentes = tabela.get(vertice);
            if (listaAdjacentes != null && listaAdjacentes.contains(v)) {
                total++;
            }
        }
        return total;
    }

    @Override
    public Iterator<Vertice> verticesAdjacentes(Vertice v) {
        List<Vertice<T>> listaAdjacentes = tabela.get(v);
        if (listaAdjacentes != null) {
            return (Iterator<Vertice>) (Iterable<Vertice>) listaAdjacentes.iterator();
        } else {
            return null;
        }
    }

    @Override
    public Iterator<Vertice> verticesIncidentes(Vertice v) {
        List<Vertice> listaIncidentes = new ArrayList<>();
        for (Enumeration<Vertice<T>> iterator = tabela.keys(); iterator.hasMoreElements();) {
            Vertice<T> vertice = iterator.nextElement();
            List<Vertice<T>> listaAdjacentes = tabela.get(vertice);
            if (listaAdjacentes != null && listaAdjacentes.contains(v)) {
                listaIncidentes.add(vertice);
            }
        }
        return listaIncidentes.iterator();
    }

    @Override
    public boolean saoAdjacentes(Vertice origem, Vertice destino) {
        boolean r = false;
        for (Iterator<Vertice> iterator = verticesAdjacentes(origem); iterator.hasNext();) {
            Vertice<T> q = iterator.next();
            if (destino.equals(q)) {
                r = true;
                break;
            }
        }
        return r;
    }

    @Override
    public void insereVertice(Vertice v) {
        if (tabela.contains(v) == false) {
            tabela.put(v, new ArrayList<>());
        }
    }

    @Override
    public void insereAresta(Vertice origem, Vertice destino) {
        insereVertice(origem);
        insereVertice(destino);
        tabela.get(origem).add(destino);
    }

    @Override
    public Iterator<Vertice> vertices() {
        return (Iterator<Vertice>) this.tabela;
    }

    @Override
    public void removeVertice(Vertice v) {
        this.tabela.remove(v);
    }

    @Override
    public void removeAresta(Vertice origem, Vertice destino) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
