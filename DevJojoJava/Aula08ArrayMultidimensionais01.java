package academy.devjojo.maratonajava.introducao;

public class Aula08ArrayMultidimensionais01 {
    public static void main(String[] args) {
         // 1,2,3,4,5
         // 31,28,31,30 dias
         // quando vc tem arrays multidmensionais a base (primeira parte) vc precisa definir o tamanho.
        // no meu entendimento, arrays multidimensioanais é a mesma logica e seguimento de uma matriz, seja 2x2 ou etc.
        int[][] dias = new int[3][3];
        dias[0][0] = 31;
        dias[0][1] = 28;
        dias[0][2] = 31;

        dias[1][0] = 31;
        dias[1][1] = 28;
        dias[1][2] = 31;

        for (int i = 0; i < dias.length; i++) {
            for (int j = 0; j < dias[i].length; j++){
                System.out.println(dias[i][j]);
            }
        } 
    }
}
