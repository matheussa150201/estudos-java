package org.cronograna.estudos.java.dia1411.modificadoresAcessos;

public class ModificadoresAcesso {

    //são acessíveis de qualquer lugar
    public void metodoCalcularValores() {
        // código aqui
    }

    //são acessíveis dentro da própria classe
    private void pagamentoPix() {
        // código aqui
    }

    //são acessíveis dentro do mesmo pacote e por subclasses, mesmo que estejam em pacotes diferentes.
    protected void consultaExtrato() {
        // código aqui
    }
}
