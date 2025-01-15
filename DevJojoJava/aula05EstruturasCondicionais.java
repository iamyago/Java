package academy.devjojo.maratonajava.introducao;

public class aula05EstruturasCondicionais {
    public static void main(String[] args) {
        // resultado precisar retornar boolean true or false
        // so executa se o resultado for verdadeiro

        int idade = 15;
        boolean isAutorizadoComprarBebida = idade >= 18;
        if(isAutorizadoComprarBebida){
            System.out.println("Autorizado a comprar bebida");
        }else{
            System.out.println("Não Autorizado a comprar bebida");
        }
    }
}
