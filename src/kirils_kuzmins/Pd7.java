package kirils_kuzmins;

public class Pd7 {
//Kirils Kuzmins
	//27.05.2025
	public static void main(String[] args) {

		
	//task4
		int [][] num = {{5,12,65},
						{33,89,1},
						{6,4,56}};
		
	//task5
		int count=0;
		for(int i=0;i<num.length;i++) {
			//for(int t=0;t<num[i].length;t++) {
				//count++;
			//}
			count+=num[i].length;
		}
		
		System.out.println("Array cout - "+count);
		
	//task6
		System.out.println("num 4 - "+num[2][1]);

	//task7
		System.out.println("num 56 - "+num[2][2]);
		
	//task8
		System.out.println("num 12 - "+num[0][1]);
		
	//task9	
		
		for(int k=0;k<num.length;k++) {
			System.out.println(num[2][k]+" ");
			
		}
			
	//task10-11
		int count2=0;
		int sum=0;
		for(int l=0;l<num.length;l++) {
			for(int k=0;k<num[l].length;k++) {
			//	System.out.print(num[l][k]+" ");
			sum+=num[l][k];	
		//	System.out.println("Summa ir - "+sum);
			count2++;
			}
			
		}
		double avg=sum/count;
		System.out.println("Summa ir - "+sum);
		System.out.println("avg ir - "+avg);
		
	//task12
		
		String [] [] clothes= {{"hat","suit","shose"},
								{"t-shirt","jeans","pijama"}	
		};
		
	//task13
		int num1=0;
		for(int i=0;i<clothes.length;i++) {
			for(int t=0;t<clothes[i].length;t++) {
				num1++;
				System.out.println(num1+" "+clothes[i][t]);
			}
		}
		
	//task14
		
		for (int i=0;i<clothes.length;i++) {
            for (int j =0;j<clothes[i].length;j++) {
                if (clothes[i][j].equals("suit")) {
                    clothes[i][j] ="jacket";
                }
            }
        }
		//clothes[0][1] = "jacket";
		
		
	//task15
		Boolean isJeansFound=false;
		String check=("jeans");
		for(int i=0;i<clothes.length;i++) {
			for(int t=0;t<clothes[i].length;t++) {
				if(check.equals(clothes[i][t])) {
					//System.out.println("Jeans are found");
					isJeansFound = true;
				}
					
			}
		}
		
		
	}

}
