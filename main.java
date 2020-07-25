import java.util.Scanner;

class Main{
   public static double num1,num2;
   public static char  op;
   public static void getUserInput()
   {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter first number:");
       num1=sc.nextInt();
       System.out.println("enter second number:");
       num2=sc.nextInt();
       System.out.println("Enter operator:");
       op=sc.next().charAt(0);

   }
   public static void main(String[] args) {
       getUserInput();
           if (op == '+') {
               Operator result = new Cal_Sum();
               System.out.println(result.calculate(num1,num2));

           } else if (op == '-') {
               Operator result = new Cal_Sub();
               System.out.println(result.calculate(num1,num2));

           } else if (op =='*') {
               Operator result = new Cal_Mul();
               System.out.println(result.calculate(num1,num2));

           } else if (op == '/') {
               Operator result = new Cal_Div();
               System.out.println(result.calculate(num1,num2));
           }
           else{
               System.out.println("You must choose a valid operator");
      }
   }
}
