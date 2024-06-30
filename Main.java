import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        //1.print

        //print


        System.out.println("Hello world!");

        //2. variables    name  age

        //3. Data type  int,  byte , float , boolean

        //4. <Data type> <variable name> =  <value> ;

        String name = "Majd";
        int age = 30;
        boolean power = false;

        //5. Scanner

        Scanner s = new Scanner(System.in);
//
//        System.out.println("please enter your full name");
//        String fullName=s.nextLine();
//


        // 5. String Methods
        String company = "Twauiq Academy";
//        System.out.println(company.length());
//        System.out.println(company.equals("twauiq Academy"));
//        System.out.println(company.toUpperCase());
//        System.out.println(company.toLowerCase());
//        System.out.println(company.charAt(2));


        // operations :

        // Arthimatic +  -   *  /   %

//        int number1= 10;
//        int number2=20;
//
//        int sum=number1+number2;
//
//        System.out.println(sum);


        // comprions  > < >= <= !=   ==


//        System.out.println(number1>number2);

        // logic  && || !


//        System.out.println((number1>number2)&&(number2>number1));


        // conditional stetment :   if  if-else   if else-if  switch

//        String role;
//         System.out.println("please enter your role");
//        role=s.nextLine();
//
//        if(role.equals("Admin")){
//            System.out.println("Hello Admin");}
//        else System.out.println("hello");


//        System.out.println("please enter your grade");
//        int grade=s.nextInt();
//
//        if(grade<=100 && grade>=90){
//            System.out.println("your score is A");
//        } else if (grade>=80&& grade<=89) {
//            System.out.println("your score is B");
//
//        }else if(grade>=70&& grade<=79){
//            System.out.println("your score is C");
//        } else if (grade>=60 && grade<=69) {
//            System.out.println("your score is D");
//        } else {
//            System.out.println("your score is F");
//        }

//        System.out.println("please enter 1 to inquire your balance");
//        System.out.println("please enter 2 to inquire your user name");
//        System.out.println("please enter 3 to calling customer service");
//
//
//        int number=s.nextInt();
//
//        switch (number){
//            case 1: System.out.println("your balance is 10000");
//            break;
//            case 2: System.out.println("your user name is majdNaser");
//            break;
//            case 3:System.out.println("calling customer service now !!");
//            break;
//            default:System.out.println("please enter number from 1 or 2 or 3");
//        }


        // loops : for   while   do while               for each


//        for (int i = 1; i <= 100; i++) {
//            System.out.println(i);
//        }

//        for (int i =100; i >= 0 ; i--) {
//            System.out.println(i);
//        }

//        int i=0;
//        while (i<=100){
//            System.out.println(i);
//            i++;
//
//        }

//        int number=0;
//        int sum=0;
//        number=s.nextInt();
//
//        while (number!=-1){
//            System.out.println("please enter your number");
//            number=s.nextInt();
//            if(number==-1){
//                break;
//            }
//            sum=sum+number;
//        }
//
//        System.out.println("sum ="+ sum);


//        int num=101;
//        do{
//            System.out.println(num);
//        }while (num<100);
//


        // break   continue


//        for (int i = 0; i < 100; i++) {
//
//            if(i%2==1){
//                continue;
//            }
//            System.out.println(i);
//
//        }


        // nested loop

//        System.out.println("please enter length");
//        int length=s.nextInt();
//        System.out.println("please enter width");
//        int width=s.nextInt();
//
//        for (int i = 1; i < length; i++) {
//
//            for (int j = 0; j < width; j++) {
//
//                System.out.print("#");
//
//            }
//            System.out.println("");
//
//        }

        // Arrays : Array

//        int[] numbers=new int[5];
//        numbers[0]=4;
//        numbers[1]=7;
//
//        System.out.println(numbers);
//
//
//        String[]names={"majd","maha","sara"};
//
//        System.out.println(Arrays.toString(names));
//
//        for (int i = 0; i < names.length; i++) {
//            System.out.println(names[i]);
//
//        }
//
//        int[] num={10,59,4765,98};
//
//        Arrays.sort(num);
//        System.out.println(Arrays.toString(num));
//
//
//        // for each
//
//        for (int n: num
//             ) {
//            System.out.println(n);
//
//        }

        //array 2D

        int[][] n = { {1, 3, 2}, {3, 4, 5}, {4, 5, 6} };

        int[][] nu=new int [2][3];

        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n[i].length; j++) {
                System.out.println(n[i][j]);
            }

        }

        // array list

//        ArrayList students= new ArrayList();
//
//        students.add("sameer");
//        students.add(3);
//
//
//        System.out.println(students);
//
//        System.out.println("please enter your first number");
//        int num1=s.nextInt();
//        System.out.println("please enter your second number" );
//        int num2=s.nextInt();
//        System.out.println("please enter your third number");
//        int num3=s.nextInt();
//
//        int a= average(num1,num2,num3);
//        System.out.println(a);
//
//        int smallest= smallest(num1,num2,num3);
//
//        System.out.println("the smallest"+ smallest);
//    }
//
//    public static int average(int num1, int num2, int num3){
//        int a=(num1+num2+num3)/3;
//        return a;
//
//    }
//
//    public static int smallest(int num1,int num2, int num3){
//        return Math.min(Math.min(num1,num3),num2);
//    }
//
//


    }


}