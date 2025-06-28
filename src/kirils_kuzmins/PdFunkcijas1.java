package kirils_kuzmins;


public class PdFunkcijas1 {
//Kirils Kuzmins 18.05.2025
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MetodsPD.sayHelloToWorker("Janis", "Ozols");
      
		MetodsPD.multiplyNum(5, 3);
        MetodsPD.writeNumberRange(1, 5);
       
        MetodsPD.printTransportList();
        MetodsPD.checkIfContainsCar();
       
        MetodsPD.printStartsWithB();
        MetodsPD.findLongestTransport();
       
        MetodsPD.printWeights();
        MetodsPD.averageWeight();
        MetodsPD.maxWeight();
        MetodsPD.minWeight();
        MetodsPD.subtractNumbers();
       
        double z = MetodsPD.mathTask(2, 16);
        System.out.println("Rezultats z = " + z);
        System.out.println("OS: " + MetodsPD.myOSName());
        
        MetodsPD.time();
		
		
		
		
		
	}

}
