package org.cronograna.estudos.java.dia0711.ifElsse;

public class IfElse {
    public static void main(String[] args) {

        Integer senha = 123;
        String usuario = "Matheus";

        if (usuario.equals("Matheus") &&  senha.equals(123)) {
            System.out.printf("Bem vindo ao sistema!");
        } else {
            System.out.printf("Credenciais invalida!");
        }

        //boa pratica : quando tiver mais de 2 if em uma função, criar funções privadas 

    }
}
