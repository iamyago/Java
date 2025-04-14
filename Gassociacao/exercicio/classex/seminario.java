package academy.devjojo.maratonajava.javacore.Gassociacao.exercicio.classex;

public class seminario {
    private String titulo;
    private aluno[] alunos;
    private local local;

   public seminario (String titulo, local local){
       this.titulo = titulo;
       this.local = local;
   }

    public aluno[] getAlunos() {
        return alunos;
    }

    public local getLocal() {
        return local;
    }

    public void setLocal(local local) {
        this.local = local;
    }

    public seminario(String titulo, aluno[] alunos, local local) {
        this.titulo = titulo;
        this.alunos = alunos;
        this.local = local;
    }

    public void setAlunos(aluno[] alunos) {
        this.alunos = alunos;
    }

    public seminario(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
