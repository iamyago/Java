package academy.devjojo.maratonajava.javacore.Csobrecargametodos.Dominio;

public class Anime {
    private String tipo;
    private String nome;
    private int episodios;
    private String genero;

    // sobrecarga de metodos é vc tem o mesmo nome no metodo porem o tipo ou a quantidade dos parametros são diferentes
    public void init(String nome, String tipo, int episodios){
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
    }
    public void init(String nome, String tipo, int episodios, String genero){
        this.init(nome, tipo, episodios);
        this.genero = genero;
    }
    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println(this.episodios);
        System.out.println(this.genero);
    }

    public void setTipo(String tipo){
    }

    public String getTipo() {
        return tipo;
    }
    public void setEpisodios(int episodios){
        this.episodios = episodios;
    }

    public int getEpisodios() {
        return this.episodios;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
