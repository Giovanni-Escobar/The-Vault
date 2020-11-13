
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * This program calculates the user's BMI as a ratio of the user's height, in meters
 * divided by weight in kgs squared.
 * @version 11.12.2020
 * @author gescobar
 */
public class BMICalculator {
    /** Convert English to metric units, perform the BMI calculation.
     * NOTE: this method must properly handle bad data
     * @param inches height
     * @param pounds weight
     * @return the user's BMI, expressed in weight/height^2
     * */
    public static double computeBMI(int inches, int pounds) {
        //1 inch == 0.0254 meters
        //1 pound == 0.454 kg
        double meters = inches *.0254;
        double kgs = pounds * .454;
        if(meters <= 0 || kgs <= 0)
            return 0.0;

        return kgs/Math.pow(meters, 2);
    }

    /**
     * Main method for class BMICalculator
     * @param args command line arguments, if needed
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String textHeight;
        int intHeight, intWeight, qtPos, dblQtPos;
        DecimalFormat df = new DecimalFormat("0.00");
        while (true) {
            try {
                System.out.print("Enter your height in feet and inches (Ex 6'1\") or \"Q\" to quit: ");
                textHeight = s.nextLine();
                qtPos = textHeight.indexOf("'");
                dblQtPos = textHeight.indexOf("\"");
                if (qtPos != -1 && dblQtPos != -1) {
                    System.out.println("DEBUG: " + qtPos + " " + dblQtPos);
                    intHeight = Integer.parseInt(textHeight.substring(0, qtPos)) * 12 +
                            Integer.parseInt(textHeight.substring(qtPos + 1, dblQtPos));
                    System.out.println(intHeight);
                    System.out.println("Enter your weight in pounds: ");
                    intWeight = s.nextInt();
                    System.out.println("Your BMI, expressed as weight(kg)/height(m)^2: " +
                            df.format(computeBMI(intHeight, intWeight)) + " kg/m^2");
                    s.nextLine();
                } else {
                    if (textHeight.toUpperCase().equals("Q")) {
                        break;
                    }

                }
            }
            catch (Exception e) {
                System.out.println("Invalid Data, more details here: ");
                System.out.println(e);
                if (e instanceof java.util.InputMismatchException)
                    s.nextLine();
            }
        }
        System.out.println("*Program Finished*");
        s.close();
    }

}
