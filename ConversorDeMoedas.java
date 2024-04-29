import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class ConversorDeMoedas{
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        int opcao = 0;
        double valorInserido = 0;
        double valorConvertido = 0;
        String mensagemFinal = "";
        NumberFormat valorFormatado = new DecimalFormat("#0.00");

        String menu = """
               |======================|
               | 1 - Real -> Dollar   |
               | 2 - Dollar -> Real   |
               |----------------------|
               | 3 - Real -> Euro     |
               | 4 - Euro -> Real     |
               |----------------------|
               | 5 - Real -> Libra    |
               | 6 - Libra -> Real    |
               |----------------------|
               | 7 - Real -> Peso Arg.|
               | 8 - Peso Arg. -> Real|
               |----------------------|
               | 9 - Real -> Kwanza   |
               | 10 - Kwanza -> Real  |
               |----------------------|
               | 11 - Real -> Iene    |
               | 12 - Iene -> Real    |
               |======================|
               """;

        System.out.println("Por favor, escolha uma opção para converter: \n" + menu);
        valorInserido = leitor.nextInt();

        switch (opcao){

            case 1 : {
                System.out.println("opção 1: " + valorInserido);
                RealDollar valorRealDollar = new RealDollar();
                valorConvertido = valorRealDollar.getRealDollar(valorInserido);
                mensagemFinal ="valor convertido US$" + valorFormatado.format(valorConvertido);
            }


        }

    }
}
