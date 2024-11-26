import java.util.Scanner;

public class Modulo3 {
    public static void main(String[] args) {

//  1. Crie um programa que solicite ao usuário digitar um número. Se o número for positivo, exiba "Número positivo", caso contrário, exiba "Número negativo".
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero, sendo ele negativo ou positivo: ");
        int numero = scanner.nextInt();

        if (numero > 0){
            System.out.println("Número positivo");
        }else{
            System.out.println("Número negativo");
        }

//  2. Peça ao usuário para inserir dois números inteiros. Compare os números e imprima uma mensagem indicando se são iguais, diferentes, o primeiro é maior ou o segundo é maior.
        System.out.println("Insira dois numeros inteiros");

        System.out.println("Numero 1: ");
        int num1 = scanner.nextInt();

        System.out.println("Numero 2: ");
        int num2 = scanner.nextInt();

        if (num1 > num2){
            System.out.println("O numero " + num1 + " é maior que o numero " + num2);
        }else{
            System.out.println("O numero " + num2 + " é maior que o numero " + num1);
        }

//  3. Crie um menu que oferece duas opções ao usuário: "1. Calcular área do quadrado" e "2. Calcular área do círculo". Solicite a escolha do usuário e realize o cálculo da área com base na opção selecionada.
        System.out.println("""
        Escolha uma opção: 
        1 - Calcular área do quadrado
        2 - Calcular área do círculo
        """);

        int opcao = scanner.nextInt();

        switch (opcao){
            case 1:
                int ladoQuadrado = 2;
                double areaQuadrado = (ladoQuadrado * ladoQuadrado);
                System.out.println("Área do quadrado: " + areaQuadrado);
                break;

            case 2:
                int raioCirculo = 16;
                double areaCirculo = (3.14 * (raioCirculo * raioCirculo));
                System.out.println("Área do circulo: " + areaCirculo);
                break;
        }

//  4. Crie um programa que solicite ao usuário um número e exiba a tabuada desse número de 1 a 10.
        System.out.println("Digite o numero da tabuada que deseja: ");
        int tabuada = scanner.nextInt();

        for (int i =0; i <= 10; i++){
            int resultado = tabuada * i;
            System.out.println(" " + tabuada + " X " + i + " = " + resultado);
        }

//  5. Crie um programa que solicite ao usuário a entrada de um número inteiro. Verifique se o número é par ou ímpar e exiba uma mensagem correspondente.
        System.out.println("Digite um numero: ");
        int numeroIP = scanner.nextInt();

        if (numeroIP % 2 == 0){
            System.out.println(numeroIP + " O numero é par");
        }else{
            System.out.println(numeroIP + " O numero é impar");
        }

//  6. Crie um programa que solicite ao usuário um número e calcule o fatorial desse número.
        System.out.println("Digite um numero: ");
        int numFatorial = scanner.nextInt();
        int resul = 0;

        for (int i = 1; i <= numFatorial; i++) {
            resul *= i; // Multiplica resul por i em vez de somar
        }

        // Imprimindo o resultado
        System.out.println("Fatorial de " + numFatorial + " é " + resul);

    }
}
