package ver1;
import java.util.*;
public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello from Eclipse");
		System.out.println("Hello from GitHub");
	}
	
	public static void heyNow() {
		String Msg = "Hey Now!";
		System.out.println(Msg);
	}
	
	public static void whatFor() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str = sc.nextLine();
		System.out.println(str + ", what for?");
	}


}
