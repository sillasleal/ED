package br.poli.ecomp.list;

import java.util.Scanner;

public class TestaLista {

    public static void main(String[] args) {
        Lista<Integer> lista = new ListaArray<Integer>();
        Scanner s = new Scanner(System.in);
        int opcao = 0;
        do {
            System.out.println("1) Inserir");
            System.out.println("2) Remover");
            System.out.println("3) Existe");
            System.out.println("4) IndexOf");
            System.out.println("5) Imprimir");
            opcao = s.nextInt();
            switch (opcao) {
                case 1:
                    inserir(lista, s);
                    break;
                case 2:
                    remover(lista, s);
                    break;
                case 3:
                    existe(lista, s);
                    break;
                case 4:
                    indexof(lista, s);
                    break;
                case 5:
                    imprimir(lista, s);
                    break;
            }
        } while (opcao != 0);
    }

    private static void imprimir(Lista<Integer> lista, Scanner s) {
        System.out.println(lista);
    }

    private static void indexof(Lista<Integer> lista, Scanner s) {
        // TODO Auto-generated method stub

    }

    private static void existe(Lista<Integer> lista, Scanner s) {
        System.out.print("Informe o valor para consultar: ");
        int valor = s.nextInt();
        if (lista.existe(new Integer(valor)) == true) {
            System.out.println("Elemento encontrado com sucesso!");
        } else {
            System.out.println("Elemento nao encontrado!");
        }
    }

    private static void remover(Lista<Integer> lista, Scanner s) {
        System.out.print("Informe o valor para remover: ");
        int valor = s.nextInt();
        if (lista.remover(new Integer(valor)) == true) {
            System.out.println("Elemento removido com sucesso!");
        } else {
            System.out.println("Elemento nao encontrado!");
        }
    }

    private static void inserir(Lista<Integer> lista, Scanner s) {
        System.out.print("Informe o valor para inserir: ");
        int valor = s.nextInt();
        lista.inserir(new Integer(valor));
    }

}
