import java.util.Scanner;

public class Calculadora{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        int num1 = entrada.nextInt();
        System.out.print("Digite outro valor: ");
        int num2 = entrada.nextInt();
        println();

        int opcao = 0;

        do{
            System.out.println("--- ESCOLHA A OPERAÇÃO ---");
            System.out.println("1. Adição");
            System.out.println("2. Subtração");
            System.out.println("3. Multiplicação");
            System.out.println("4. Divisão");
            System.out.println("5. Sair");
            System.out.print("Digite sua opção: ");
            opcao = entrada.nextInt();

            switch(opcao){
                case 1:
                    System.out.println("Resultado: " + Somar(num1, num2));
                    break;

                case 5:
                    System.out.println("Programa finalizado!");
                    break;
            }

        } while (opcao != 5);

    }

    public static int Somar(int num1, int num2){
        int soma;
        soma = num1 + num2;
        return soma;
    }

} 