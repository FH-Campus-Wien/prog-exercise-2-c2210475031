package at.ac.fhcampuswien;

import java.util.Scanner;

public class App {

    //todo Task 1
    public void largestNumber(){
        float number=-1,bigNumber=-1;

        Scanner input = new Scanner(System.in);
        int i=0;

        do {
            i++;
            System.out.print("Number "+i+": ");
            number = input.nextFloat();
            if (bigNumber<number) bigNumber=number;
        }
        while(number>0);
        if ((number<0)&&(i==1)) System.out.println("No number entered.");
        else
        {
            System.out.print("The largest number is ");
            System.out.printf("%.2f",bigNumber);
            System.out.println();
        }


        // input your solution here
    }

    //todo Task 2
    public void stairs(){
        Scanner input = new Scanner(System.in);
        int numberOut=0;
        System.out.print("n: ");
        int number = input.nextInt();

        for (int row=0;row<=number;row++)
        {
            for (int collum=0;collum<row;collum++)
            {
                numberOut++;
                System.out.print(numberOut+" ");
            }
            if (row!=0) System.out.println();
        }
        if (number<=0)System.out.println("Invalid number!");
        // input your solution here
    }

    //todo Task 3
    public void printPyramid(){
        int numOfBlanks=5;
        int numOfStars=1;

        for (int row=0;row<6;row++)
        {
            for (int i=0;i<numOfBlanks;i++) System.out.print(' ');
            for (int i=0;i<numOfStars;i++) System.out.print('*');
            System.out.println();
            numOfBlanks--;
            numOfStars+=2;
        }

        // input your solution here
    }

    //todo Task 4
    public void printRhombus(){
        // input your solution here
    }

    //todo Task 5
    public void marks(){

        int mark,negative=0,sum=0;
        Scanner input = new Scanner(System.in);
        int i=1;
        do
        {

            System.out.print("Mark "+i+": ");
            mark= input.nextInt();
            if (mark==0) break;
            if (mark==5)negative++;
            if (mark>0&&mark<6)sum+=mark;
            else{
                System.out.println("Invalid mark!");
                i--;
            }
            i++;
        }while (mark!=0);
        i--;
        float average= (float)sum/(float)i;
        if (i==0)average=0;
        System.out.print("Average: ");
        System.out.printf("%.2f",average);
        System.out.println();
        System.out.println("Negative marks: "+negative);


        // input your solution here
    }

    //todo Task 6
    public void happyNumbers(){
        int num1, out=0;

        Scanner scan =  new Scanner(System.in);
        System.out.print("n: ");
        num1 = scan.nextInt();

        do
        {


            do {
                out += ((num1 % 10) * (num1 % 10));
                num1 = num1/10;
            }while (num1 > 0);

            num1 = out;
            if (out==4){
                System.out.println("Sad number!");
                break;
            }
            if (out==1){
                System.out.println("Happy number!");
                break;
            }
            out=0;
        }while(true);

        // input your solution here
    }

    public static void main(String[] args){
        App exercise2 = new App();

        System.out.println("Task 1: Largest Number");
        exercise2.largestNumber();

        System.out.println("\nTask 2: Stairs");
        exercise2.stairs();

        System.out.println("\nTask 3: Pyramide");
        exercise2.printPyramid();

        System.out.println("\nTask 4: Raute");
        exercise2.printRhombus();

        System.out.println("\nTask 5: Notendurchschnitt");
        exercise2.marks();

        System.out.println("\nTask 6: Fröhliche Zahlen");
        exercise2.happyNumbers();
    }
}