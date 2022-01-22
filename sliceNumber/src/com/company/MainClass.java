package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) throws Exception {
        //usuario ingresa un numero
        try {
            System.out.println("Enter a number between 1 and 999,999");
            Scanner keyboard = new Scanner(System.in);
            int enteredNumber = keyboard.nextInt();
            //We startup the array.
            ArrayList<Integer> sliced = new ArrayList<Integer>();


            if (enteredNumber > 0 && enteredNumber <= 999999) {
                System.out.println("Good number");
                //now that we admitted the number
                //we want to slice it,
                while (enteredNumber > 0) {
                    int lastNumber = enteredNumber % 10;
                    // We suposely have the array that we will push this last number into... created.
                    //Now we actually do. ArrayList name >> sliced

                    sliced.add(lastNumber);
                    System.out.println("This is the number we just added to sliced array list: " + lastNumber);
                    //Now that the number is inside the array, we want to remove it with the method stated in obsidian
                    enteredNumber = enteredNumber / 10;
                    //now if the number was 12345, it became 1234.5, and was saved as 1234
                    //Loop starts again, and will go until it becomes 0, and while loop stops.
                }
                //The numbers were pushed, in reverse. So index 0, is for 5, and and index 4 is for 1
                System.out.println(sliced);
                //now we get the length
                int arrayLength = sliced.size();
                //and can do a switch

                switch (arrayLength){
                    case 1:
                        //The number could be 5, entonces como queremos
                        // las decenas, los millares, y cientos de miles
                        //Tiramos un mensajito que no hay eso.
                        System.out.println("There aren't tens, nor thousands nor hundreds of thousands either");
                        break;
                    case 2:
                        //Here we already have at least 30, so it will be inverted, [0, 3],
                        // and we Want to Print 3, that is in index 1.
                        System.out.println("Decenas = " + sliced.get(1));
                        break;
                    case 3:
                        //In this case we do the same as above, since we don't care about hundreds
                        System.out.println("Decenas = " + sliced.get(1));
                        break;
                    case 4:
                        //We want to also print what's in thousands. Eg. 1234 > [4,3,2,1] >
                        System.out.println("Decenas = " + sliced.get(1));
                        System.out.println("Unidades de Miles = " + sliced.get(3));
                    case 5:
                       //12345, We don't care about tens of thousands. We print the above
                        System.out.println("Decenas = " + sliced.get(1));
                        System.out.println("Unidades de Miles = " + sliced.get(3));
                        break;
                    case 6:
                        //we care about hundreds of thousands 123456 >> [6,5,4,3,2,1]
                        System.out.println("Decenas = " + sliced.get(1));
                        System.out.println("Unidades de Miles = " + sliced.get(3));
                        System.out.println("Unidades de Cientos de Miles = " + sliced.get(5));
                        break;
                }

            } else {
                System.out.println("Number out of constraint");
            }
        }
        catch(Exception e){
            System.out.println("Number out of constraint or not a number");
        }

    }
}