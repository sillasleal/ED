/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.poli.ecomp.expressao;

import br.poli.ecomp.interfaces.Expressao;
import br.poli.ecomp.node.NodeComparableBi;
import br.poli.ecomp.stack.Stack;
import br.poli.ecomp.tree.TreeBinary;
import java.util.Scanner;

/**
 * Classe reponsavel por modelar uma arvore de expressoes
 *
 * @author sillas
 */
public class TreeExpression extends TreeBinary implements Expressao {

    /**
     * Metodo auxiliar, usado para calcular o valor da expressao inserida na
     * arvore.
     *
     * @param node
     */
    private int calcular(NodeComparableBi node) {
        int val = 0;
        if (node != null) {
            int a = this.calcular(node.getLeft());
            int b = this.calcular((NodeComparableBi) node.getRight());

            String operador = (String) node.getData();

            if (!new String(OPERADORES).contains(operador)) {
                val = Integer.parseInt(operador);
            } else {
                switch (operador.charAt(0)) {
                    case '+':
                        val = a + b;
                        break;
                    case '-':
                        val = a - b;
                        break;
                    case '*':
                        val = a * b;
                        break;
                    case '/':
                        val = a / b;
                        break;
                    default:
                        break;
                }
            }

        }
        return val;
    }

    /**
     * Metodo que realiza o calculo da expressao.
     *
     * @param expressao A expressao a ser calculada
     * @return O resultado da exprssao
     * @throws java.lang.Exception
     */
    @Override
    public int avaliar(String expressao) throws Exception {
        Stack parenteses = new Stack();
        Stack operadores = new Stack();
        Stack arvores = new Stack();

        String letra;
        String equacao = "";

        char[] caracteres = expressao.toCharArray();

        for (char caractere : caracteres) {
            letra = Character.toString(caractere);
            if (caractere == '(') {
                //Empilha os parentese. Apenas para validar a equaçao
                parenteses.push(caractere);
                //
                equacao += letra;
            } else if (caractere == ')') {
                //Desempilha um parentese e monta uma arvore
                parenteses.pop();
                //Montando uma arvore com os dados das pilhas
                NodeComparableBi tmp = (NodeComparableBi) operadores.pop();
                tmp.setRight((NodeComparableBi) arvores.pop());
                tmp.setLeft((NodeComparableBi) arvores.pop());
                //
                equacao += letra;
                arvores.push(tmp);
            } else if (new String(OPERADORES).indexOf(caractere) > -1) {
                //Monta uma arvore de operador(No)
                operadores.push(new NodeComparableBi(letra));
                //
                equacao += letra;
            } else if (Character.isLetterOrDigit(caractere)) {
                //Monta uma arvore de caracter(Folhas)
                if (Character.isLetter(caractere)) {
                    System.out.println("Informe o valor de " + caractere);
                    Scanner input = new Scanner(System.in);
                    int novo = input.nextInt();
                    arvores.push(new NodeComparableBi(Integer.toString(novo)));
                    //
                    equacao += Integer.toString(novo);
                } else {
                    arvores.push(new NodeComparableBi(letra));
                    //
                    equacao += letra;
                }
            }
        }
        //Verificand se ainda existem itens nas pilhas
        if (!operadores.isEmpty() && !arvores.isEmpty()) {
            this.root = (NodeComparableBi) operadores.pop();
            this.root.setRight((NodeComparableBi) arvores.pop());
            this.root.setLeft((NodeComparableBi) arvores.pop());
        } else if (!arvores.isEmpty()) {
            this.root = (NodeComparableBi) arvores.pop();
        }
        //Verificando erros de modelagem da expressao
        if (!operadores.isEmpty() || !arvores.isEmpty() || !parenteses.isEmpty()) {
            throw new Exception("A expressao esta mal escrita");
        }

        //
        System.out.println("Arvore montada: " + this.toString());
        System.out.println("Expressao completa: " + equacao);
        //
        return this.calcular(this.root);
    }

    @Override
    public Expressao converter(Expressao expressao) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
