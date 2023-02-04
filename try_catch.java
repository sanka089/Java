import java.util.Scanner;
class Main{
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    try{
       int b = 42/a;
       int c[] = {1};
        c[43] = {44};
    }
    catch(ArithmeticException e){
    System.out.prinltn("The exception is "+e);
    }
    catch(ArrayIndexOutOfBounds e){
    System.out.prinltn("The exception is "+e);
    }
    System.out.prinlnt("The value of a is "+a);
        
}
}
