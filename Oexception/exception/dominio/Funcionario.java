package academy.devjojo.maratonajava.javacore.Oexception.exception.dominio;

import java.io.FileNotFoundException;

public class Funcionario extends Pessoa{
    public void salvar() throws LoginInvalidoException, RuntimeException {
        System.out.println("Salvando Funcionario");
    }
}
