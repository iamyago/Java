package academy.devjojo.maratonajava.javacore.Qstring.test;

public class StringPerfomanceTest {
    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();
        concatString(30_000);
        long fim = System.currentTimeMillis();
        System.out.println("tempo gasto para String" + (fim - inicio) + "ms");

        inicio = System.currentTimeMillis();
        concatStringBuilder(1_000_000);
        fim = System.currentTimeMillis();
        System.out.println("tempo gasto para StringBuilder" + (fim - inicio) + "ms");

        inicio = System.currentTimeMillis();
        concatStringBuffer(1_000_000);
        fim = System.currentTimeMillis();
        System.out.println("tempo gasto para StringBuffer" + (fim - inicio) + "ms");
    }

    private static void concatString(int tamanho) {
        String texto = "";
        for (int i = 0; i < tamanho; i++) {
            texto += i;
        }
    }
    private static void concatStringBuilder(int tamanho) {
        StringBuilder sb = new StringBuilder(tamanho);
        for (int i = 0; i < tamanho; i++) {
            sb.append(i);
        }
    }
    // Feito para ambiente multi - thread
    private static void concatStringBuffer(int tamanho) {
        StringBuffer sb = new StringBuffer(tamanho);
        for (int i = 0; i < tamanho; i++) {
            sb.append(i);
        }
    }
}
