package exercicio02;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        Paciente paciente = new Paciente();
        double[] alvo;

        System.out.println("Nome do paciente: ");
        paciente.nome = entrada.nextLine();

        System.out.print("Idade --->> ");
        paciente.idade = entrada.nextInt();
        alvo= paciente.frequenciaAlvo();

        System.out.println("Paciente: "+ paciente.nome);
        System.out.println("Frequencia maxima: "+ paciente.frequenciaMaxima());
        System.out.println("Intervalo de frequencia Alvo: ["+ alvo[0]+ " - "+alvo[1]+"]");






    }

}
