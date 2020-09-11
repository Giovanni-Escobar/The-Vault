/**
 * HolyGrail.java is the first lab I will write it is a simple
 * UI program that talks to the user.
 * 09/15/2020
 * @author gescobar
 */

import java.util.*;

public class HolyGrail {

    public static void main(String[]args){

        System.out.println("* A chat with the bridge keeper *\n"+"Who would cross the Bridge of Death must answer me "
                +"these questions three, ere the other side he see.");

        Scanner sc= new Scanner(System.in);

        System.out.print("Question 1: What is your name? ");
        String user_name= sc.nextLine();

        System.out.print("Question 2: What is your quest? ");
        String user_quest= sc.nextLine();

        System.out.print("Question 3: What is your favorite color? ");
        String user_color= sc.nextLine();

        System.out.print("King Arthur says,"+"\"You have to know these things when you're a king, you know.\""+"\n");

        System.out.print("Your name is: "+user_name +"\n"+"Your quest is: "+user_quest+"\n"
                +"Your favorite color is: "+user_color+"\n"+"* end of program *");
    }
}
