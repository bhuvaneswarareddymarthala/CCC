package work;
import java.util.Scanner;
public class TestDriver {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int width, height;
		cglgame g = new cglgame(); //calling cglgame
		System.out.println("Enter Width and Height");
		
		g.setWidth(width=sc.nextInt());
		g.setHeight(height=sc.nextInt());
		
		System.out.println("Height"+height+"width"+width);
		

	}

}
