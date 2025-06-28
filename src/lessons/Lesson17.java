package lessons;
//10.05.2025
//Continue and break
public class Lesson17 {

	public static void main(String[] args) {
		//10,15,20,25,30,35,40,45,50,55
		int i=10;
		while(i<=55) {
			System.out.print(i +" ");
			i+=5;
		}
		
		//100, 90, 80, 70, 60,50, 40, 30,20
		System.out.println();
		int x=100;
		while(x>=20){
			System.out.print(x+" ");
			x-=10;
			
			
		}
		//1.0,   1.1,    1.2,   1.3.   1.4.    .... 2.0 
		System.out.println();
		double l = 1.0;
		while(l<=2.1) {
			System.out.print(String.format("%.1f", l)+" ");
			l+=0.1;
			
			
		}
		

	}

}
