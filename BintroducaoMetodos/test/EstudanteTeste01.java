package BintroducaoMetodos.test;

import BintroducaoMetodos.Dominio.Estudante;
import BintroducaoMetodos.Dominio.ImpressoraEstudante;

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
