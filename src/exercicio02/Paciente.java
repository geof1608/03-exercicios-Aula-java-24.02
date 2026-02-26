package exercicio02;

public class Paciente {

    //Atributos
    String nome;
    int idade;


    //calcular frequencia maxima
    public int frequenciaMaxima(){  return 220 - idade; }

    //calcular frequencia alvo
    public double [] frequenciaAlvo () {
        double[] alvo = new double[2];

        int fm = frequenciaMaxima(); //deixar o codigo mais leve

        alvo[0] = fm * 0.5;
        alvo[1] = fm * 0.85;
        return alvo;
        }


}
