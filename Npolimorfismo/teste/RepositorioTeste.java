package academy.devjojo.maratonajava.javacore.Npolimorfismo.teste;

import academy.devjojo.maratonajava.javacore.Npolimorfismo.repositorio.Repositorio;
import academy.devjojo.maratonajava.javacore.Npolimorfismo.servico.RepositorioBancoDeDados;

public class RepositorioTeste {
    public static void main(String[] args) {
        Repositorio repositorio = new RepositorioBancoDeDados();
        repositorio.salvar();
    }
}
