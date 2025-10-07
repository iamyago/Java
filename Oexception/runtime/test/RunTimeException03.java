package academy.devjojo.maratonajava.javacore.Oexception.runtime.test;

public class RunTimeException03 {
    public static void main(String[] args) {
        extracted();
    }

    private static String extracted() {
        try {
            System.out.println("Abrindo arquivo");
            System.out.println("Escrevendo dados no arquivo");
            return "conexao aberta";
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            System.out.println("Fechando o recurso");
        }
        return null;
    }
}
