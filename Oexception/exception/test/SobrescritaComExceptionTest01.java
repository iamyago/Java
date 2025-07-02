package academy.devjojo.maratonajava.javacore.Oexception.exception.test;

import academy.devjojo.maratonajava.javacore.Oexception.exception.dominio.Funcionario;
import academy.devjojo.maratonajava.javacore.Oexception.exception.dominio.LoginInvalidoException;
import academy.devjojo.maratonajava.javacore.Oexception.exception.dominio.Pessoa;

public class SobrescritaComExceptionTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();

        try {
            funcionario.salvar();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        }
    }
}
