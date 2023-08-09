import java.util.Scanner;
public class Circle extends Shape{
	float rad;
    Scanner scan=new Scanner(System.in);
    public void takeInput(){
       System.out.print("Enter the radius of Circle");
         rad=scan.nextInt();
    }
    public void computeA(){  
         area=3.14f*(rad*rad);
    } 
}
