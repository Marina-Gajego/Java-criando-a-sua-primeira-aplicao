import java.text.DecimalFormat;

public class Modulo2 {
    public static void main(String[] args) {

//  Crie um programa que realize a média de duas notas decimais e exiba o resultado.
        int nota1 = 7;
        int nota2 = 4;

        double media = (nota1 + nota2)/2;
        System.out.println("A media é: " + media);

//  Declare uma variável do tipo double e uma variável do tipo int. Faça o casting da variável double para int e imprima o resultado.
        double x = 9.99;
        int y = (int) x;

        System.out.println("O valor de double é: " + x);
        System.out.println("O valor convertido para int é: " + y);

//  Declare uma variável do tipo char (letra) e uma variável do tipo String (palavra). Atribua valores a essas variáveis e concatene-as em uma mensagem.
        char letra = 'G';
        String nome = "Marina";

        System.out.println("A variavel string é " + nome + " e a variavel char é " + letra);

//  Declare uma variável do tipo double `precoProduto` e uma variável do tipo int (quantidade). Calcule o valor total multiplicando o preço do produto pela quantidade e apresente o resultado em uma mensagem.
        double precoProduro = 45.80;
        int quantidade = 7;

        double valorTotal = (precoProduro * quantidade);

        DecimalFormat formato = new DecimalFormat("#.00");
        String valorTotalFormatado = formato.format(valorTotal);

        System.out.println("Valor final: " + valorTotalFormatado);

//  Declare uma variável do tipo double `valorEmDolares`. Atribua um valor em dólares a essa variável. Considere que o valor de 1 dólar é equivalente a 4.94 reais. Realize a conversão do valor em dólares para reais e imprima o resultado formatado.
        double valorEmDolares = 450;
        double valorDolarBrasil = 4.94;

        double conversao = (valorEmDolares * valorDolarBrasil);

        System.out.println("Convertendo " + valorEmDolares + " para reais fica " + conversao);

//  Declare uma variável do tipo double `precoOriginal`. Atribua um valor em reais a essa variável, representando o preço original de um produto. Em seguida, declare uma variável do tipo double `percentualDesconto` e atribua um valor percentual de desconto ao produto (por exemplo, 10 para 10%). Calcule o valor do desconto em reais, aplique-o ao preço original e imprima o novo preço com desconto.
        double precoOriginal = 320;
        double percentualDesconto = 0.15;

        double valorFinal = precoOriginal - (precoOriginal * percentualDesconto);
        System.out.println("Valor final com desconto: " + valorFinal);

    }
}
