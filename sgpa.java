import java.util.Scanner;
class sgpa{
public static void main(String arg[]){
Scanner s = new Scanner(System.in);
int i,n=4;
double m1,m2,m3,m4,m5,sgpa,avg;
String name;
for(i=0;i<2;i++){
System.out.println("enter your name");
name = s.next();
System.out.println("enter physics marks");
m1 = s.nextDouble();
System.out.println("enter electrical marks");
m2 = s.nextDouble();
System.out.println("enter civil marks");
m3 = s.nextDouble();
System.out.println("enter evi marks");
m4 = s.nextDouble();
System.out.println("enter maths marks");
m5 = s.nextDouble();
avg = (m1+m2+m3+m4+m5)/5;
sgpa = avg/10;
System.out.println("name of student ");
System.out.println("Marks1 : " + " " + m1);
System.out.println("Marks2 : " + " " + m2);
System.out.println("Marks3 : " + " " + m3);
System.out.println("Marks4: " + " " + m4);
System.out.println("Marks5 : " + " " + m5);
System.out.println("the cgpa is"+sgpa);

}
}
}
