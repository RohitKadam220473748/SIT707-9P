//package web.service;
//
//public class MathQuestionService {
//
//	/**
//	 * Calculate Q1 result.
//	 * @param number1
//	 * @param number2
//	 * @return
//	 */
//	public static double q1Addition(String number1, String number2) {
//		double result = Double.valueOf(number1) + Double.valueOf(number2);
//		return result;
//	}
//	
//	/**
//	 * Calculate Q2 result.
//	 * @param number1
//	 * @param number2
//	 * @return
//	 */
//	public static double q2Subtraction(String number1, String number2) {
//		double result = Double.valueOf(number1) - Double.valueOf(number2);
//		return result;
//	}
//	
//	public static double q3Multiplication(String number1, String number2) {
//        double result = Double.valueOf(number1) * Double.valueOf(number2);
//        return result;
//    }
//	
//	
//}

package web.service;

public class MathQuestionService {

    /**
     * Calculate Q1 result.
     * 
     * @param number1 The first number.
     * @param number2 The second number.
     * @return The result of adding number1 and number2, or NaN if inputs are invalid.
     */
    public static double q1Addition(String number1, String number2) {
        // Check if any input is null or empty
        if (number1 == null || number2 == null || number1.isEmpty() || number2.isEmpty()) {
            return Double.NaN; // Invalid input, return NaN (Not a Number)
        }

        // Parse input strings to double and perform addition
        double result = Double.parseDouble(number1) + Double.parseDouble(number2);
        return result;
    }

    /**
     * Calculate Q2 result.
     * 
     * @param number1 The first number.
     * @param number2 The second number.
     * @return The result of subtracting number2 from number1, or NaN if inputs are invalid.
     */
    public static double q2Subtraction(String number1, String number2) {
        // Check if any input is null or empty
        if (number1 == null || number2 == null || number1.isEmpty() || number2.isEmpty()) {
            return Double.NaN; // Invalid input, return NaN (Not a Number)
        }

        // Parse input strings to double and perform subtraction
        double result = Double.parseDouble(number1) - Double.parseDouble(number2);
        return result;
    }

    /**
     * Calculate Q3 result.
     * 
     * @param number1 The first number.
     * @param number2 The second number.
     * @return The result of multiplying number1 and number2, or NaN if inputs are invalid.
     */
    public static double q3Multiplication(String number1, String number2) {
        // Check if any input is null or empty
        if (number1 == null || number2 == null || number1.isEmpty() || number2.isEmpty()) {
            return Double.NaN; // Invalid input, return NaN (Not a Number)
        }

        // Parse input strings to double and perform multiplication
        double result = Double.parseDouble(number1) * Double.parseDouble(number2);
        return result;
    }

}

