package web.service;

public class MathQuestionService {

    
    public static double q1Addition(String number1, String number2) {
      
        if (number1 == null || number2 == null || number1.isEmpty() || number2.isEmpty()) {
            return Double.NaN; 
        }

        
        double result = Double.parseDouble(number1) + Double.parseDouble(number2);
        return result;
    }

   
    public static double q2Subtraction(String number1, String number2) {
        if (number1 == null || number2 == null || number1.isEmpty() || number2.isEmpty()) {
            return Double.NaN; 
        }

       
        double result = Double.parseDouble(number1) - Double.parseDouble(number2);
        return result;
    }

   
    public static double q3Multiplication(String number1, String number2) {
        
        if (number1 == null || number2 == null || number1.isEmpty() || number2.isEmpty()) {
            return Double.NaN; // Invalid input, return NaN (Not a Number)
        }

        
        double result = Double.parseDouble(number1) * Double.parseDouble(number2);
        return result;
    }

}

