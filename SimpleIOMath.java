import java.util.Scanner;
/**
 * SimpleIOMath is a simple class that takes input/output from
 * the user and stores that information
 * with this information it repeats it back and does math with the numerical information
 * @version 09/24/2020
 * @author gescobar
 */
public class SimpleIOMath
{
    private String name;
    private int age;
    private int favNumber;




    /**
     * Asks the user for info
     */


    public void promptUser(){
        System.out.println("* Sit yourself down, take a seat *\n" +
                "* All you gotta do is repeat after me *");

        Scanner s = new Scanner(System.in);

        System.out.println("Question 1: What is your name? ");
        name = s.nextLine();

        System.out.println("Question 2: How old are you? ");
        age = s.nextInt();

        System.out.println("Question 3: What is your favorite number? ");
        favNumber = s.nextInt();

    }

    /**
     * Prints the user's info
     */
    public void printInfo(){
        System.out.println("I'm gonna teach you how to sing it out\n" +
                "Come on, come on, come on\n" +
                "Let me tell you what it's all about\n" +
                "Reading, writing, arithmetic\n" +
                "Are the branches of the learning tree");
        System.out.println("Your name is: "+ name);
        System.out.println("Your age is: "+ age);
        int newAge = age+1;
        System.out.println("At your next birthday, you will turn "+ newAge);
        System.out.println("The first prime factor of "+age+" is: "+ smallestPrimeFactor(age));
        System.out.println("Your favorite number is: "+ favNumber);
        System.out.println("Your favorite number squared is: "+ favNumber*favNumber);
        System.out.println("* end of program *");


    }

    /**
     * Returns the first Prime factor of age
     * @param age n
     * @return n
     */
    private int smallestPrimeFactor(int age){
        int[] primes = {2,3,5,7,11,13,17,19,23,29,31,27,41,43,47,53,59,61};
        for(int factor : primes){
            if (age % factor==0)
                return factor;

        }
        return age;
    }






    /**
     * Main method for class SimpleIOMAth
     * @param arg command lines arguments, if needed
     */
    public static void main(String[]arg)
    {
        SimpleIOMath obj=new SimpleIOMath();
        obj.promptUser();
        obj.printInfo();
    }
}
