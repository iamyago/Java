package academy.devjojo.maratonajava.introducao;

public class Aula06ExercicioEstruturaDeRepetição {
    public static void main(String[] args) {
        // Dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado
        // condição valorParcela >= 1000
        double valorTotal = 40000;

        for (int parcela = 1; parcela <= valorTotal; parcela++) {
            double valorParcela = valorTotal / parcela;
            if (valorParcela < 1000) {
                break;
            }
            System.out.println("Parcela " + parcela + " R$ " + valorParcela);
        }
    }
}

