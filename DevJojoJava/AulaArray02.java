package academy.devjojo.maratonajava.introducao;

public class AulaArray02 {
    public static void main(String[] args) {
        // um array sempre será um objeto com tipo primitivo ou não
        // new + tipo primitivo sem ser diretamente
        // padrão de inicialização - byte, short, int, long, float e double = 0
        // char '\u0000'
        // String = null
        // boolean = false
        String[] nomes = new String[4];
        nomes[0] = "Goku";
        nomes[1] = "Vegeta";
        nomes[2] = "Luffy";
        nomes[3] = "ginka";
        // tag .length muda o array sem precisar mduar o codigo, ou seja, não precisa ficar alterando a variavel.
        for (int i = 0; i < 4; i++) {
            System.out.println(nomes[i]);

        }
        nomes = new String[5];
        nomes[0] = "Joao";
        nomes[1] = "3";
        nomes[2] = "5";
        nomes[3] = "1";
        nomes[4] = "2";
        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }
        }
    }
