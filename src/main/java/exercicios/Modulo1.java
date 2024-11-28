package exercicios;

public class Modulo1 {
    public static void main(String[] args) {

//  Crie um projeto Java no IntelliJ que deve conter uma classe chamada `Perfil`, com o metodo main, que ao executar deverá imprimir um cumprimento personalizado no console. Por exemplo, "Olá, [Seu Nome]!".
//  Modifique o programa para imprimir uma segunda mensagem de cumprimento personalizada. Por exemplo, "Tudo bem?".
        System.out.println("Olá Marina");
        System.out.println("Tudo bem?\n");

//  Crie uma classe chamada `Estudos` para imprimir anotações de estudos no console.
        System.out.println(""" 
                *** Anotações ***
                JVM -  A JVM é uma ferramenta muito importante no mundo Java, pois ela permite que uma aplicação possa ser executada em múltiplos sistemas operacionais distintos.

                JRE - JRE (Java Runtime Environment) - Ambiente de Execução do Java que fornece as bibliotecas padrões do Java.

                JDK - JDK (Java Development Kit) - Kit de Desenvolvimento Java responsável por compilar código-fonte.
                """);

//  Crie uma classe `Soma` em Java para imprimir no console o resultado da operação 10 + 5. Certifique-se de que o resultado seja exibido sem o uso de aspas, apresentando o valor "15" ao invés da expressão "10+5".
        System.out.println("RESULTADO = " + (10 + 5));

//  Crie uma classe `Subtracao` para imprimir o resultado de `10 - 5` no console.
        System.out.println("RESULTADO = " + (10 - 5));

    }
}