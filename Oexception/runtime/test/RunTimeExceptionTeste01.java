package academy.devjojo.maratonajava.javacore.Oexception.runtime.test;

public class RunTimeExceptionTeste01 {
    // checked e unchcked
    // checked(checadas) sao filha da classe exception diretamente, se nao tratada vai ser lançada em tempo de compilação (não compila o codigo)
    Object object = null;

    // As exceções checked são usadas em situações em que o desenvolvedor pode prever que uma exceção pode ocorrer e quer garantir que ela seja tratada. Por exemplo, se você está lendo um arquivo em um programa, é possível que ocorra uma exceção de IO (entrada e saída) caso o arquivo não exista. Nesse caso, é importante tratar a exceção para que o programa não pare de funcionar.
    //
    //Já as exceções unchecked são usadas em situações em que o desenvolvedor não pode prever que uma exceção pode ocorrer. Por exemplo, se você tentar dividir um número por zero, ocorrerá uma exceção de ArithmeticException. Essa exceção é unchecked porque o desenvolvedor não pode prever que o usuário vai digitar zero como divisor.
}
