package exercicio01;

import java.sql.SQLOutput;
import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        Random rd = new Random();
        Conta conta = new Conta();
        DecimalFormat df = new DecimalFormat("#,## 0.00");
        double valor;

        System.out.print("Nome do correntista --> ");
        conta.correntista = entrada.next();
        conta.numero = rd.nextInt(1000, 9999);



        System.out.println("Seu saldo: R$ "+ df.format( conta.saldo));

        System.out.println("Quanto deseja depositar? ");
        valor = entrada.nextDouble();
        conta.depositar(valor);

        System.out.println("Quanto deseja sacar? ");
        valor = entrada.nextDouble();
        conta.sacar(valor);

        System.out.println("Seu saldo: R$ "+ df.format (conta.saldo));


    }

}
