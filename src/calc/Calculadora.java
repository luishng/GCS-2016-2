package calc;

public class Calculadora {
  private double numero1;
  private double numero2;
  private double resultado;

  public  Double soma(Double A, Double B){
        return A+B;
   }
  public double divide(double numero1, double numero2) {
    resultado = numero1 / numero2;
    return resultado;
  }
}
