package academy.devjojo.maratonajava.javacore.Fmodificadorstatic.Dominio;

public class Anime {
    private String nome;
    private int[] episodios;

    {
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i+1;
        }
    }
    // 1 - Alocado espaço em memoria pro objeto
    // 2 - cada atributo de classe é criado e incializado com valores default ou o que for passada
    // 3 - bloco de incialização é executado
    // 4 - construtor é executado
    // bloco de incialização vai ser inicializado toda as vezes que vc criar uma estancia do objeto.
    // sintax usando CHAVES.
    // executado antes dos construtores
    // executado todas as vezes que vc cria um objeto
    public Anime(String nome){
        this.nome = nome;
    }

    public Anime() {

        System.out.println(episodios);
        for(int episodios: this.episodios){
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
