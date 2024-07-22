import java.util.Scanner;

public class WhileLoop {
    Scanner input = new Scanner(System.in);
    public static void main(String args[]){

        Scanner input = new Scanner(System.in);
        int digit = 0;
        while (true){
            System.out.println("Enter a digit: ");
            digit = input.nextInt();
            if(digit >= 1000 && digit <= 1_000_000)
                break;
            System.out.println("Enter digit from 1000 - 1_000_000");
        }
        System.out.println("SUCCESSFUL");


        System.out.println("Enter the number you want to begin with: ");
        int firstNum = input.nextInt();


        System.out.println("Enter the number you want to end with: ");
        int lastNum = input.nextInt();

        System.out.println("Enter table number: ");
        int tableNum = input.nextInt();

        while(firstNum <= lastNum){
            System.out.println(firstNum + "*" + tableNum + "=" + (firstNum * tableNum));
            firstNum++;
        }



    }

}
