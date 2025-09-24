import java.util.Random;
import java.util.Scanner;

public class HW2 {
    public static void DisplayArray(int[]array ){
        boolean doneDisplay = false;
        int index = 0;
        while(!doneDisplay){
            System.out.print(array[index] + " ");
            index++;
            if(index > array.length-1){
                doneDisplay = true;
            }
        }
    }
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Enter the Array size: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        boolean doneRandom = false; //Boolean flag used in initialize array with random integers
        boolean done = false; // Boolean flag used in main menu
        int index = 0; //represents the elements in array

        while (!doneRandom){
            array[index] = random.nextInt(101);
            index++;
            if(index > array.length-1){
                doneRandom = true;
            }
        }
        while (!done){
            System.out.print("\nMenu: " + 
                            "\n1- Maximum value of the Array" + 
                            "\n2- Minimum value of the Array" +
                            "\n3- Average and Diferrences between average and elements" +
                            "\n4- Sum of the elements" +
                            "\n5- Display the array" +
                            "\n6- Exit. " +
                            "\nChoice the action: ");
                        
            int choice = scanner.nextInt();

            if (choice == 1){
                int max = MetotsKagan.MaxOfArray(array);
                System.out.print("Maximum value is : " + max);
            }
            else if (choice == 2){
                int min = MetotsKagan.MinOfArray(array);
                System.out.print("Minimum value is : " + min);
            }
            else if (choice == 3){
                MetotsKagan.DifferFromAvarageOfArray(array);
            }
            else if (choice == 4){
                System.out.print(SumOfElements.ElementsSum(array));
            }
            else if (choice == 5){
                DisplayArray(array);
            }
            else {
                System.out.println("Exitting from the system.");
                done = true; 
            }
        }
        scanner.close();
    }
}