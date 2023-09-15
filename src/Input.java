import java.util.Scanner;
public class Input {

        //(c) A+ Computer Science
//www.apluscompsci.com
//NAME - Xaria Atienza
//DATE - 09/15/2023
//PURPOSE - Input Practice




            public static void main (String[] args)
            {
                Scanner keyboard = new Scanner(System.in);

                int intOne, intTwo;
                byte byteOne, byteTwo;
                short shortOne, shortTwo;
                //add more variables of at least 2 different types


                System.out.print("Enter an integer :: ");
                intOne = keyboard.nextInt();


                System.out.print("Enter an integer :: ");
                intTwo = keyboard.nextInt();

                System.out.print("Enter an byte :: ");
                byteOne = keyboard.nextByte();
                System.out.print("Enter an byte :: ");
                byteTwo = keyboard.nextByte();

                System.out.print("Enter an short :: ");
                shortOne = keyboard.nextShort();
                System.out.print("Enter an short :: ");
                shortTwo = keyboard.nextShort();


                //add in input for all variables


                System.out.println();
                System.out.println("integer one = " + intOne );
                System.out.println("integer two = " + intTwo );
                System.out.println("byte one = " + byteOne );
                System.out.println("byte two = " + byteTwo );
                System.out.println("short one = " + shortOne );
                System.out.println("short two = " + shortTwo );

                //add output for all variables


            }
        }
