package academy.devjojo.maratonajava.javacore.Oexception.exception.test;

import academy.devjojo.maratonajava.javacore.Oexception.exception.dominio.LoginInvalidoException;

import java.util.Scanner;

public class LoginInvalidoExceptionTest01 {
    public static void main(String[] args) {
        try {
            logar();
        } catch (LoginInvalidoException e) {
           e.printStackTrace();
        }
    }
    private static void logar() throws LoginInvalidoException {
        Scanner sc = new Scanner(System.in);
        String usernameDB = "Goku";
        String senhaDB = "SSj";
        System.out.println("Usuario: ");
        String usernameDigitado = sc.nextLine();
        System.out.println("Senha: ");
        String senhaDigitado = sc.nextLine();
        if (!usernameDB.equals(usernameDigitado) || !senhaDB.equals(senhaDigitado)){
            throw new LoginInvalidoException();
        }
        System.out.println("Usuario logado com sucesso");

    }
}
