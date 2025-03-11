package academy.devjojo.maratonajava.javacore.Gassociacao.dominio;

public class jogador {
    private String nome;

    public void imprime() {
        System.out.println(this.nome);
    }

    public jogador(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
