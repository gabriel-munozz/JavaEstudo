import java.util.Scanner;

public class Calculadora{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        int num1 = entrada.nextInt();
        System.out.print("Digite outro valor: ");
        int num2 = entrada.nextInt();
        System.out.println();
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
                    System.out.println("Resultado: " + somar(num1, num2)+"\n");
                    break;
                
                case 2:
                    System.out.println("Resultado: " + subtracao(num1, num2)+"\n");
                    break;

                case 3: 
                    System.out.println("Resultado: " + multiplicacao(num1, num2)+"\n");
                    break;

                case 4: 
                    if (num2 == 0){
                        System.out.println("Não é possível dividir um número por 0\n");
                    } else{
                        System.out.println("Resultado: " + divisao(num1, num2)+"\n");
                    }
                    break;

                case 5:
                    System.out.println("Programa finalizado!");
                    break;
            }

        } while (opcao != 5);

    }

    public static int somar(int num1, int num2){
        return num1 + num2;
    }

    public static int subtracao(int num1, int num2){
        return num1 - num2;
    }

    public static int multiplicacao(int num1, int num2){;
        return num1 * num2;        
    }

    public static int divisao(int num1, int num2){
        return num1 / num2;
    }

} 