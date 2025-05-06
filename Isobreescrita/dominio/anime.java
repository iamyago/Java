package academy.devjojo.maratonajava.javacore.Isobreescrita.dominio;

public class anime extends Object {
    // tostring é um metodo da classe objeto que pode ser sobrescrito, por causa da regra da herança.
    private String nome;
    
    public anime(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
