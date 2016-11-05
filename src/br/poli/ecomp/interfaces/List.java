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
package br.poli.ecomp.interfaces;

/**
 * Interface para as listas usadas nos projetos
 *
 * @author Sillas S.Leal <sillas.s.leal@gmail.com>
 * @param <T>
 */
public interface List<T extends Comparable> {

    /**
     * Método que insere um novo elemento na lista
     *
     * @param elem O novo elemento a ser inserido
     * @return Retorna TRUE em caso de sucesso ou FALSE em caso de erro.
     */
    public boolean add(T elem);

    /**
     * Método que remove um item da lista
     *
     * @param elem O elemento a ser removido
     * @return Retorna TRUE em caso de sucesso ou FALSE em caso de erro.
     */
    public boolean remove(T elem);

    /**
     * Método que verifica se o elemento informado existe na lista
     *
     * @param elem O elemento buscado
     * @return Retorna TRUE caso o elemento exista ou FALSE caso não exista.
     */
    public boolean exists(T elem);

    /**
     * Método que retorna o elemento na posição informada
     * @param k A posição referente ao elemento
     * @return Retorna o elemento da posição informada uma lança uma exceção caso o elemento não exista
     * @throws NullPointerException
     */
    public T indexOf(int k) throws NullPointerException;

}
