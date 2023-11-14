package org.cronograna.estudos.java;

public class For {

    public static void main(String[] args) {

//        for (int x = 0; x < y; x++) {
//        }

//        for (inicialização da variável; checagem de condição; incremento/decremento do valor da variável) {
//            comando a ser executado/declaração
//        }

        String[] nomes = {"matheus", "lucas", "carlos junior", "ezequiel", "Gabriel"};

        for (Integer i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }

        Integer[] numeros2 = {11, 22, 33, 44, 55};

        Integer indice = 0;
        for (Integer numeros : numeros2) {
            numeros ++;
        }
    }
}


