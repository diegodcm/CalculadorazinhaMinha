package treinamentodeandroid.cpd.org.calculadorazinhaminha;
/* Classe Calculadora */
public class Calculadora {

    /* Método para fazer cálculo */
    public double fazerCalculo(double num1, double num2, TipoDeConta tipoDeConta){
        switch (tipoDeConta){
            case SOMA:
                return (num1 + num2);
            case SUBTRACAO:
                return (num1 - num2);
            case MULTIPLICACAO:
                return (num1 * num2);
            case DIVISAO:
                return (num1 / num2);
        }
        return 0.0;
    }
}
