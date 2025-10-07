package academy.devjojo.maratonajava.javacore.Gassociacao.dominio;


public class jogador {
    private String nome;
    private Time time;

    public jogador(String nome) {
        this.nome = nome;
    }


    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public String getNome() {

        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
        }

    public void imprime() {
        System.out.println(this.nome);
        if (nome != null){
            System.out.println(time.getNome());
        }
    }
}