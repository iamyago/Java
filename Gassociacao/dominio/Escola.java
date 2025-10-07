package academy.devjojo.maratonajava.javacore.Gassociacao.dominio;

public class Escola {
    private String nome;
    private professor[] professores;


    public Escola(String nome) {
        this.nome = nome;
    }

    public void imprime(){
        System.out.println(this.nome);
        if (professores == null){
            return;
        }
        for (professor professor : professores) {
            System.out.println(professor.getNome());
        }


    }

    public Escola(String nome, professor[] professores) {
        this.nome = nome;
        this.professores = professores;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public professor[] getProfessores() {
        return professores;
    }

    public void setProfessores(professor[] professores) {
        this.professores = professores;
    }
}
