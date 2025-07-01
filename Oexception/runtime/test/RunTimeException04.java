package academy.devjojo.maratonajava.javacore.Oexception.runtime.test;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class RunTimeException04 {
    public static void main(String[] args) {
        try {
            throw new ArrayIndexOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("dentro do ArrayIndexOutOfBoundsException ");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("dentro do IndexOutOfBoundsException");
        } catch (IllegalArgumentException e) {
            System.out.println("dentro do IllegalArgumentException");
        } catch (ArithmeticException e) {
            System.out.println("dentro do IllegalArgumentException");
        } catch (RuntimeException e) {
            System.out.println("Dentro do RuntimeException ");
        }
        try {
            talvezLanceException();
        } catch (SQLException | FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    private static void talvezLanceException() throws SQLException, FileNotFoundException {

    }
}
