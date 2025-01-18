package academy.devjojo.maratonajava.introducao;

public class Aula06EstruturasDeRepetição {
    public static void main(String[] args) {
        // while, do while, for
        // while retorna boolean
        int count = 0;
        while (count < 10) {
            System.out.println(count);
            count += 5;
        }
        do {
            System.out.println("Dentro do do-while");
        } while (count > 10);
        for (int i=0; i < 10; i++) {
            System.out.println("For" + i);
        }
    }
}
