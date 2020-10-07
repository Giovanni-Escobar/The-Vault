
/**
 * RomanToDecimal is a class with a specific series
 * of string arguments of Roman characters that converts them
 * into integer values
 * @version 10/06/2020
 * @author gescobar
 */

public class RomanToDecimal {
    /**
     * This method converts args into integers.
     * @param roman
     * @return
     */
    public static int romanToDecimal(String roman){
        int sum = 0;
        String letter;
        for(int i =0; i< roman.length(); i++){
            letter = roman.substring(i, i+1);
            if(letter.equals("I"))
                sum += 1;
            else if(letter.equals("V"))
                sum +=5;
            else if (letter.equals("X"))
                sum +=10;
            else if (letter.equals("L"))
                sum +=50;
            else if (letter.equals("C"))
                sum += 100;
            else if (letter.equals("D"))
                sum += 500;
            else if (letter.equals("M"))
                sum += 1000;
            else
                return -1;

            }
        if (roman.indexOf("IV") != -1 || roman.indexOf("IX") != -1)
            sum -=2;
        else if (roman.indexOf("XL") != -1 || roman.indexOf("XC") != -1)
            sum -=20;
        else if (roman.indexOf("CD") != -1 || roman.indexOf("CM") != -1)
            sum -=200;

        return sum;
        }

    /**
     * This is the main where it prints out the inputs of args and its output
     * @param args
     */
    public static void main (String[] args) {

        for (String roman : args) {

            int decimal = romanToDecimal(roman.toUpperCase());
            if (decimal == -1)
                System.out.println("Input: " + roman.toUpperCase() + " ==> Output: Invalid");
            else
                System.out.println("Input: " + roman.toUpperCase() + " ==> Output: " + decimal);

        }
        System.out.println("*End of Program*");
    }
}