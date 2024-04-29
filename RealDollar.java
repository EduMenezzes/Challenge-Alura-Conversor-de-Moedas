public class RealDollar {

    private double taxaDeConversao =  0.1938;

    public double getRealDollar(double valorInserido) {

        return (valorInserido * taxaDeConversao);

    }
}
