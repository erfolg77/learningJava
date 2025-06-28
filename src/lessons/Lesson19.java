package lessons;

public class Lesson19 {
	//16.05.2025
	//Continue

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("All classes in Midle school:");
		int x =1;
		while(x<=12) {
			System.out.println(x+" Clase");
			x++;
		}
		
		//Continue
		//1, 2, 3,  5,   6,  7,  9 , 10
		// 4, 8 - not included 
		
		int i=0;
		while(i<=9) {
			i++;
			if( i== 4 || i==8) continue;
			
			
			
			System.out.print(i +" ");
			
		}
		
		
		
	}

}
