import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner leitor = new Scanner (System.in);
    //Variavel
    double numero = 0.0;
    double resultado= 0.0;
    //Entrada de Dados
    System.out.println("Digite o Número que Deseja :");
    numero = leitor.nextDouble();
    //Processamento
    resultado = numero *1/3;
    //Saida
    System.out.println("Resultado :"+ resultado);
  }
}