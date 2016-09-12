package calc;

public class Calculadora {
    
    public Double subtraction(Double firstNumber, Double secondNumber){
        Double result;
        
        result = firstNumber - secondNumber;
        
        return result;
    }

    public double multiplica(double numero1, double numero2){
	  return numero1*numero2;
  	} 
  	
    public  Double soma(Double A, Double B){
        return A+B;
    }
  
    public double divide(double numero1, double numero2) {
    	double resultado = 0.0;
    	resultado = numero1 / numero2;
    	return resultado;
    }
}
