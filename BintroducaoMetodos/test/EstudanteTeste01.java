package academy.devjojo.maratonajava.javacore.BintroducaoMetodos.Java.BintroducaoMetodos.test;

<<<<<<< HEAD

=======
>>>>>>> ba65bdf2d03345464ac0ad846a4c185caba3b3f8
import academy.devjojo.maratonajava.javacore.BintroducaoMetodos.Java.BintroducaoMetodos.Dominio.Estudante;
import academy.devjojo.maratonajava.javacore.BintroducaoMetodos.Java.BintroducaoMetodos.Dominio.ImpressoraEstudante;

public class EstudanteTeste01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImpressoraEstudante impressora = new ImpressoraEstudante();

        estudante01.nome = "Goku";
        estudante01.idade = 21;
        estudante01.sexo = 'M';

        estudante02.nome = "Naruto";
        estudante02.idade = 22;
        estudante02.sexo = 'M';

        impressora.imprime(estudante01);
        impressora.imprime(estudante02);

    }
}
