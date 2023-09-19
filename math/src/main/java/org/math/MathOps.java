package org.math;

import org.math.operations.Add;
import org.math.operations.Divide;
import org.math.operations.Multiply;
import org.math.operations.Subtract;

public class MathOps {
    /**
     * Adds two doubles together
     * @param addend1 a double to be added
     * @param addend2 a double to be added
     * @return the result as a double
     */
    public static double add(double addend1, double addend2) {
        return Add.add(addend1, addend2);
    }

    /**
     * Adds two integers together
     * @param addend1 an integer to be added
     * @param addend2 an integer to be added
     * @return the result as a double
     */
    public static double add(int addend1, int addend2) {
        return Add.add(addend1, addend2);
    }

    /**
     * Adds two longs together
     * @param addend1 a long to be added
     * @param addend2 a long to be added
     * @return the result as a double
     */
    public static double add(long addend1, long addend2) {
        return Add.add(addend1, addend2);
    }

    /**
     * Adds two numbers provided as Strings together
     * @param addend1 a number represented as a String to be added
     * @param addend2 a number represented as a String to be added
     * @return the result as a double
     */
    public static double add(String addend1, String addend2) {
        return Add.add(Double.parseDouble(addend1), Double.parseDouble(addend2));
    }

    /**
     * Adds two binary numbers provided as bytes together
     * @param addend1 a byte to be added
     * @param addend2 a byte to be added
     * @return the result as a double
     */
    public static double add(byte addend1, byte addend2) {
        return Add.add(addend1, addend2);
    }

    /**
     * Adds two hexadecimal values
     * @param addend1 a hexadecimal value to be added
     * @param addend2 a hexadecimal value to be added
     * @return the result as a double
     */
    public static double addHex(String addend1, String addend2){
        return Add.add(Integer.parseInt(addend1,16),Integer.parseInt(addend2, 16));
    }

    /**
     * Adds two octal values
     * @param addend1 an octal value to be added
     * @param addend2 an octal value to be added
     * @return the result as a double
     */
    public static double addOct(String addend1, String addend2){
        return Add.add(Integer.parseInt(addend1, 8), Integer.parseInt(addend2,8));
    }

    /**
     * Subtracts one double from another
     * @param minuend the double that will be subtracted from
     * @param subtrahend the double that will be subtracted
     * @return the result as a double
     */
    public static double subtract(double minuend, double subtrahend){
        return Subtract.subtract(minuend, subtrahend);
    }

    /**
     * Subtracts one integer from another
     * @param minuend the integer that will be subtracted from
     * @param subtrahend the integer that will be subtracted
     * @return the result as a double
     */
    public static double subtract(int minuend, int subtrahend){
        return Subtract.subtract(minuend, subtrahend);
    }

    /**
     * Subtracts one long from another
     * @param minuend the long that will be subtracted from
     * @param subtrahend the long that will be subtracted
     * @return the result as a double
     */
    public static double subtract(long minuend, long subtrahend){
        return Subtract.subtract(minuend, subtrahend);
    }

    /**
     * Subtracts one number represented as a String from another
     * @param minuend the number that will be subtracted from represented as a String
     * @param subtrahend the number that will be subtracted from represented as a String
     * @return the result as a double
     */
    public static double subtract(String minuend, String subtrahend){
        return Subtract.subtract(Double.parseDouble(minuend), Double.parseDouble(subtrahend));
    }

    /**
     * Subtracts one binary number from another
     * @param minuend the binary number that will be subtracted from
     * @param subtrahend the binary number that will be subtracted
     * @return the result as a double
     */
    public static double subtract(byte minuend, byte subtrahend){
        return Subtract.subtract(minuend, subtrahend);
    }

    /**
     * Subtracts one hexadecimal value from another
     * @param minuend the hexadecimal value that will be subtracted from
     * @param subtrahend the hexadecimal value that will be subtracted
     * @return the result as a double
     */
    public static double subtractHex(String minuend, String subtrahend){
        return Subtract.subtract(Integer.parseInt(minuend,16), Integer.parseInt(subtrahend, 16));
    }
    /**
     * Subtracts one octal value from another
     * @param minuend the octal value that will be subtracted from
     * @param subtrahend the octal value that will be subtracted
     * @return the result as a double
     */
    public static double subtractOct(String minuend, String subtrahend){
        System.out.println(("Minuend: " + Integer.parseInt(minuend, 8) + " - Subtrahend: " + Integer.parseInt(subtrahend,8)));
        return Subtract.subtract(Integer.parseInt(minuend,8), Integer.parseInt(subtrahend, 8));
    }

    /**
     * Divides one double by another
     * @param dividend the double being divided
     * @param divisor the double to divide by
     * @return the result as a double
     */
    public static double divide (double dividend, double divisor){
        return Divide.divide(dividend, divisor);
    }

    /**
     * Divides one int by another
     * @param dividend the int being divided
     * @param divisor the int to divide by
     * @return the result as a double
     */
    public static double divide (int dividend, int divisor){
        return Divide.divide(dividend, divisor);
    }

    /**
     * Divides one long by another
     * @param dividend the long being divided
     * @param divisor the long to divide by
     * @return the result as a double
     */
    public static double divide(long dividend, long divisor){
        return Divide.divide(dividend, divisor);
    }

    /**
     * Divides one number by another represented as Strings
     * @param dividend the number being divided represented as a String
     * @param divisor the number to divide by represented as a String
     * @return the result as a double
     */
    public static double divide (String dividend, String divisor){
        return Divide.divide(Double.parseDouble(dividend), Double.parseDouble(divisor));
    }

    /**
     * Divides one binary number by another
     * @param dividend the binary number being divided
     * @param divisor the binary number to divide by
     * @return the result as a double
     */
    public static double divide (byte dividend, byte divisor){
        return Divide.divide(dividend, divisor);
    }

    /**
     * Divides one hexadecimal value by another
     * @param dividend the hexadecimal value being divided
     * @param divisor the hexadecimal value to divide by
     * @return the result as a double
     */
    public static double divideHex(String dividend, String divisor){
        return Divide.divide(Integer.parseInt(dividend,16), Integer.parseInt(divisor, 16));
    }

    /**
     * Divides one octal value by another
     * @param dividend the octal value being divided
     * @param divisor the octal value to divide by
     * @return the result as a double
     */
    public static double divideOct(String dividend, String divisor){
        return Divide.divide(Integer.parseInt(dividend, 8), Integer.parseInt(divisor, 8));
    }

    /**
     * Multiplies two doubles
     * @param multiplicand one of the doubles being multiplied
     * @param multiplier one of the doubles being multiplied
     * @return the result as a double
     */
    public static double multiply(double multiplicand, double multiplier){
        return Multiply.multiply(multiplicand, multiplier);
    }
    /**
     * Multiplies two integers
     * @param multiplicand one of the integers being multiplied
     * @param multiplier one of the integers being multiplied
     * @return the result as a double
     */
    public static double multiply(int multiplicand, int multiplier){
        return Multiply.multiply(multiplicand, multiplier);
    }
    /**
     * Multiplies two longs
     * @param multiplicand one of the longs being multiplied
     * @param multiplier one of the longs being multiplied
     * @return the result as a double
     */
    public static double multiply(long multiplicand, long multiplier){
        return Multiply.multiply(multiplicand, multiplier);
    }
    /**
     * Multiplies two numbers represented as Strings
     * @param multiplicand one of the numbers being multiplied
     * @param multiplier one of the numbers being multiplied
     * @return the result as a double
     */
    public static double multiply(String multiplicand, String multiplier){
        return Multiply.multiply(Double.parseDouble(multiplicand), Double.parseDouble(multiplier));
    }

    /**
     * Multiplies two binary numbers
     * @param multiplicand one of the binary numbers being multiplied
     * @param multiplier one of the binary numbers being multiplied
     * @return the result as a double
     */
    public static double multiply(byte multiplicand, byte multiplier){
        return Multiply.multiply(multiplicand, multiplier);
    }

    /**
     * Multiplies two hexadecimal values
     * @param multiplicand one of the hexadecimal values being multiplied
     * @param multiplier on of the hexadecimal values being multiplied
     * @return the result as a double
     */
    public static double multiplyHex(String multiplicand, String multiplier){
        return Multiply.multiply(Integer.parseInt(multiplicand,16), Integer.parseInt(multiplier,16));
    }

    /**
     * Multiplies two octal values
     * @param multiplicand one of the octal values being multiplied
     * @param multiplier one of the octal values being multiplied
     * @return the result as a double
     */
    public static double multiplyOct(String multiplicand, String multiplier){
        return Multiply.multiply(Integer.parseInt(multiplicand, 8), Integer.parseInt(multiplier,8));
    }
}
