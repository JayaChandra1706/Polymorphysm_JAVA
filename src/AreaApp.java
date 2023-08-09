import java.util.Scanner;
public class AreaApp {
	 public static void main(String[] args) {
	        Scanner scan=new Scanner(System.in);
	        Circle c=new Circle();
	        Square s=new Square();
	        AcceptShape ac=new AcceptShape();
	       while(true){
	        System.out.println("Enter 1 to Find Area of CIRCLE");
	        System.out.println("Enter 2 to Find Area of SQUARE");
	        System.out.println("Enter 3 to Exit");
	        System.out.print("Enetr your choice:");
	        int choice=scan.nextInt();
	        switch(choice){
	            case 1:
	               ac.acceptShaperef(c);
	               break;
	            case 2:
	               ac.acceptShaperef(s);
	               break;
	            case 3:
	               System.exit(0);
	            default:
	            System.out.println("Wrong choice Enter correct Choice");
	        }
	       }
	    }
}
