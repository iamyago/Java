package academy.devjojo.maratonajava.javacore.Gassociacao.exercicio.testexercicio;

import academy.devjojo.maratonajava.javacore.Gassociacao.exercicio.classex.aluno;
import academy.devjojo.maratonajava.javacore.Gassociacao.exercicio.classex.local;
import academy.devjojo.maratonajava.javacore.Gassociacao.exercicio.classex.professor;
import academy.devjojo.maratonajava.javacore.Gassociacao.exercicio.classex.seminario;

public class Teste {
    public static void main(String[] args) {
        local local = new local("Parque Albano");
        aluno alunos = new aluno("Yago Erik",  18);
        professor professor = new professor("Savyo");
        aluno[] alunosSeminario = {alunos};
        seminario seminario = new seminario("WW2", alunosSeminario, local);
        seminario[] seminariosDisponivel = {seminario};
        professor.setSeminario(seminariosDisponivel);

        professor.imprime();

    }
}
