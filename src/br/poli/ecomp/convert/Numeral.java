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
package br.poli.ecomp.convert;

/**
 * Classe responsável por realizar as conversões de base
 *
 * @author Sillas S. Leal<sillas.s.leal@gmail.com>
 * @link <https://github.com/sillasleal/ED>
 */
public class Numeral {

    /**
     * Método que converte o número informado para um valor na nova base.
     *
     * @param numero O número a ser convertido
     * @param base A base do número inserido
     * @param novaBase A nova base do número
     * @return Retorna o número em sua nova base
     */
    public String converter(String numero, int base, int novaBase) {
        String novoNumero, temp;
        temp = numero;
        /* REALIZANDO AS OPERAÇÕES */
        if (base != 10) {
            // Apenas realiza esta opração se a base do número for diferente de 10
            temp = para10(numero, base);
        }
        novoNumero = temp;
        if (novaBase != 10) {
            //Apenas realiza este trecho se a nova base for diferente de 10
            novoNumero = de10(temp, novaBase);
        }

        return novoNumero;
    }

    /**
     * Método que converte o número informado para a base 10
     *
     * @param numero O número a ser convertido
     * @param base A base do número a ser convertido
     * @return Retorna o número já convertido para a base 10
     */
    private String para10(String numero, int base) {
        String sub;
        StringBuffer stf = new StringBuffer();
        int novo = 0;
        int count = 0;
        int num;
        int result;
        for (int i = numero.length(); i > 0; i--) {
            sub = numero.substring(i - 1, i);
            if (base == 16) {
                //Caso a base informada seja 16, trata os caracteres especiais
                num = hexaCaracter(sub.charAt(0));
            } else {
                //Para os casos gerais
                num = Integer.parseInt(sub);
            }
            result = (int) Math.pow(base, count++) * num;
            novo += result;
        }
        return Integer.toString(novo);
    }

    /**
     * Método que converte um número que esta na base 10 para a nova base
     *
     * @param numero O número a ser convertido
     * @param novaBase A nova base do número informado
     * @return Retorna o número já convertido para a nova base
     */
    private String de10(String numero, int novaBase) {
        String novo = "";
        int valor = Integer.parseInt(numero);
        int resto = 1;
        while (resto > 0 || valor > 0) {
            resto = (valor % novaBase);
            valor = valor / novaBase;
            if (novaBase == 16) {
                novo = caractereHexa(resto) + novo;
            } else {
                novo = Integer.toString(resto) + novo;
            }
            if (valor == 0) {
                break;
            }
        }

        return novo;
    }

    /**
     * Método que realiza a tradução de valores para caracteres hexadecimal
     *
     * @param valor
     * @return
     */
    private String caractereHexa(int valor) {
        if (valor > 9) {
            return Character.toString((char) (valor + 55));
        } else if (valor == 0) {
            return "0";
        } else {
            return Integer.toString(valor);
        }
    }

    /**
     * Método que converte um caracter hexadecimal em número
     *
     * @param valor O valor a ser convertido
     * @return Retorna o inteiro referente ao caracter
     */
    private int hexaCaracter(char valor) {
        int novo;
        if (Character.isLetter(valor)) {
            novo = ((int) valor) - 55;
        } else {
            novo = ((int) valor) - 48;
        }

        return novo;
    }
}
