import java.util.Scanner;
public class Square extends Shape{
	 int len;
	    Scanner scan=new Scanner(System.in);
	    public void takeInput(){
	        System.out.print("Enter the length of Square");
	        len=scan.nextInt();
	    }
	    public void computeA(){
	        area=len*len;
	    }
}
