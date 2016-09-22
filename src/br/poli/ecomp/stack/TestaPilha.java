package br.poli.ecomp.stack;

import java.util.Scanner;

public class TestaPilha {

    public static void main(String[] args) {
        Pilha<Integer> pilha = new PilhaDinamica<Integer>();
        Scanner s = new Scanner(System.in);
        int opcao = 0;
        do {
            System.out.println("1) Inserir");
            System.out.println("2) Remover");
            System.out.println("3) Consultar");
            System.out.println("4) Tamanho");
            System.out.println("5) Imprimir");
            opcao = s.nextInt();
            switch (opcao) {
                case 1:
                    inserir(pilha, s);
                    break;
                case 2:
                    remover(pilha, s);
                    break;
                case 3:
                    consultar(pilha, s);
                    break;
                case 4:
                    tamanho(pilha, s);
                    break;
                case 5:
                    imprimir(pilha, s);
                    break;
            }
        } while (opcao != 0);
    }

    private static void imprimir(Pilha<Integer> pilha, Scanner s) {
        System.out.println(pilha);
    }

    private static void consultar(Pilha<Integer> pilha, Scanner s) {
        System.out.println("Topo: " + pilha.top());
    }

    private static void tamanho(Pilha<Integer> pilha, Scanner s) {
        System.out.println("Tamanho da pilha: " + pilha.size());
    }

    private static void remover(Pilha<Integer> pilha, Scanner s) {
        Integer t = pilha.pop();
        if (t != null) {
            System.out.println("Elemento removido: " + t);
        } else {
            System.out.println("Pilha vazia!");
        }
    }

    private static void inserir(Pilha<Integer> pilha, Scanner s) {
        System.out.print("Informe o valor para inserir: ");
        int valor = s.nextInt();
        pilha.push(new Integer(valor));
    }
}
