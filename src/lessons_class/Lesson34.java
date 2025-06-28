package lessons_class;
import java_class.Rectangle;

public class Lesson34 {
	//29.05.2025.
	//Ractangle class objects

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rect1 = new Rectangle(42,50);
		Rectangle rect2 = new Rectangle(70,70);
		Rectangle rect3 = new Rectangle(100, 20);
		
		
		System.out.println("Rect1 P =" +rect1.getP());
		System.out.println("Rect1 S=" + rect1.getS());
		
		
		//randomRectange/ width(1-100). height(1-100) S-? P -? 
		int randomWidth =(int)( Math.random() *100) +1;
		int randomHeight =(int)( Math.random() *100) +1;
		
		Rectangle randomRectangle = new Rectangle(randomWidth, randomHeight);
		System.out.println("Random rectangle S=" + randomRectangle.getS());
		System.out.println("Random rectangle P=" + randomRectangle.getP());
		//randomRectangle.DEGREE = 120;
	}	

}
