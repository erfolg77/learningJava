package lessons;

public class Lesson21 {

	//For loop
	//16.05.2025
	public static void main(String[] args) {
		//100 -1000 
		for(int i=100; i<=1000;i+=100) {
			System.out.print(i+ " ");
		}
		System.out.println();
		//1.)  500, 490, 480, 470, 460 ... 400
		//2.) -10, -8, -6, -4, .... 4
		//3.) 15, 20, 25, 30, 35,40, 45
		
		
		/// 10,11,12,14,15,17,18,20
		// 13, 16, 19
		for(int i=10; i<=20;i++) {
			
			if(i==13 || i== 16 || i==19) continue;
			System.out.print(i +" ");
		}
		

	}

}
