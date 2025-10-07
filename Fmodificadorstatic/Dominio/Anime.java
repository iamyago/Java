package academy.devjojo.maratonajava.javacore.Fmodificadorstatic.Dominio;

public class Anime {
    private String nome;
    private static int[] episodios;

    static {
        System.out.println("bloco de incialização");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i+1;
        }
    }

    // 0 - bloco de inicialização é executado quando a JVM carregar a classe
    // 1 - Alocado espaço em memoria pro objeto
    // 2 - cada atributo de classe é criado e incializado com valores default ou o que for passada
    // 3 - bloco de incialização é executado
    // 4 - construtor é executado
    // bloco de incialização vai ser inicializado toda as vezes que vc criar uma estancia do objeto.
    // sintax usando CHAVES.
    // executado antes dos construtores
    // executado todas as vezes que vc cria um objeto
    // bloco de inicialização estatico é executado apenas uma vez quando a classe é carregada pelo JVM, isso acontece antes do espaço ser alocado em memoria
    // executado apenas uma vez
    // não pode acessar atributos de instancia de um metodo estatico.


    public Anime(String nome){
        this.nome = nome;
    }

    public Anime() {

        System.out.println(episodios);
        for(int episodios: Anime.episodios){
            System.out.println(episodios + "");
        }
        System.out.println();
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }
}
