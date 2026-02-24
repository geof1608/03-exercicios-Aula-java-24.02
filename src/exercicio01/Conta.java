package exercicio01;


public class Conta {

    // atributos ou variaei de instancia
    String correntista;
    int numero;
    double saldo;



    //SEMPRE DEIXAR O MÉTODO O MAIS GENERICO POSSIVEL



    // método para depositar um valor na conta
    public void depositar( double valor ){
        saldo = saldo + valor;
    }

    //método para sacar um valor da conta
    public void sacar( double valor){
        saldo = saldo - valor;
    }





}
