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

import java.awt.SplashScreen;
import java.util.Scanner;

/**
 *
 * @author Sillas S. Leal<sillas.s.leal@gmail.com>
 */
public class NumeralRun {

    /**
     * As bases padrão da aplicação
     */
    private static final int[] bases = {2, 8, 10, 16};

    /**
     * Método inicial da aplicação
     *
     */
    public static void run() {
        //Fechando o splachscreen
        pausa();        
        //Iniciando a execução
        Scanner scan = new Scanner(System.in);
        int opcao, base, novaBase;
        String numero, result;
        String menuOpcoes = menu();
        int max = (bases.length * bases.length) - bases.length + 1;
        do {
            System.out.println(menuOpcoes);
            System.out.println(max + " - Conversao entre bases não padronizadas");
            System.out.println((max + 1) + " - Sair\n");
            System.out.println("Escolha uma das opções acima\n");
            opcao = scan.nextInt();
            if (opcao > max) {
                System.out.println("Terminando a aplicação");
                System.exit(0);
            }
            System.out.println("Informe o número a ser convertido:");
            numero = scan.next();
            if (opcao < max) {
                converterDefault(opcao, numero);
            } else {
                System.out.println("Informe a base do número");
                base = scan.nextInt();
                System.out.println("Informe a nova base do número");
                novaBase = scan.nextInt();
                result = converter(numero, base, novaBase);
                System.out.println("Resultado: " + result + "\n");
                pausa();
            }
        } while (true);
    }

    /**
     * Método que gera um menu padrão para a aplicação
     */
    private static String menu() {
        String menu = "Sistema de conversão de base\n";
        int opcao = 1;
        for (int base : bases) {
            for (int base2 : bases) {
                if (base != base2) {
                    menu += menuItens(opcao++, base, base2);
                }
            }
        }

        return menu;
    }

    /**
     * Método que gera uma linha do menu
     *
     * @param opcao A opção a ser selecionada
     * @param de A base de origem
     * @param para A base final da opção
     */
    private static String menuItens(int opcao, int de, int para) {
        return espacoEsquerda(opcao)
                + " - Converter da base " + espacoEsquerda(de)
                + " para a base "
                + espacoEsquerda(para) + ":\n";
    }

    /**
     * Método que adiciona um espaço em branco a esquerda do item
     *
     * @param item
     * @return
     */
    private static String espacoEsquerda(int item) {
        String nItem = Integer.toString(item);
        return nItem.length() > 1 ? nItem : " " + nItem;
    }

    /**
     * Método que realiza a conversão tendo como opção as bases comuns
     *
     * @param opcao A opção selecionada
     * @param numero O número recebido a ser convertido
     */
    private static void converterDefault(int opcao, String numero) {
        int inputSelect = 1;
        String result;
        for (int base : bases) {
            for (int novaBase : bases) {
                if (base != novaBase) {
                    if (inputSelect == opcao) {
                        result = converter(numero, base, novaBase);
                        System.out.println("Resultado: " + result + "\n");
                        pausa();
                        return;
                    }
                    inputSelect++;
                }
            }
        }

    }

    /**
     * Método que realiza a conversão do número entre as bases e retorna o
     * resultado
     *
     * @param numero O número a ser convertido
     * @param base A base do número
     * @param novaBase A nova base
     * @return O número resultante da conversão
     */
    private static String converter(String numero, int base, int novaBase) {
        Numeral num = new Numeral();
        System.out.println("Convertendo o número " + numero
                + " da base " + base + " para a base " + novaBase);
        return num.converter(numero, base, novaBase);
    }

    /**
     * Método que realiza uma pequena pausa na execução do código
     */
    private static void pausa() {
        try {
            //Realizando uma pequena pausa para permitir a 
            //visualização do resultado antes da rolagem do terminal
            Thread.sleep(2000);
        } catch (Exception exp) {
            System.out.println(exp.getMessage());
        }
    }
}
