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
package br.poli.ecomp.interfaces;

/**
 * Interface base para a implementação de filas
 *
 * @author Sillas S. Leal<sillas.s.leal@gmail.com>
 */
public interface Quewe {

    /**
     * Método que insere um novo valor no fim da fila
     *
     * @param info Objeto contendo a informação a ser inserida
     */
    public void enquewe(Object info);

    /**
     * Método que remove um objeto do início da fila
     *
     * @return Retorna o objeto removido
     * @throws Exception
     */
    public Object dequewe() throws Exception;

    /**
     * Método que retorna o objeto que esta no início da fila
     *
     * @return Retorna o objeto do início
     * @throws Exception
     */
    public Object peek() throws Exception;

    /**
     * Método que retorna o tamanho atual da fila
     *
     * @return Retorna o tamanho ou número de elementos ainda na fila
     */
    public int size();

    /**
     * Método que informa se a fila esta vazia
     *
     * @return Retorna TRUE caso a fila esteja cheia ou FALSE caso não esteja.
     */
    public boolean isEmpty();

    /**
     * Método que informa se a fila esta cheia
     *
     * @return Retorna TRUE caso a fila esteja cheia ou FALSE caso não esteja.
     */
    public boolean isFull();
}
