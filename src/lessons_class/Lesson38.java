package lessons_class;
import java.util.ArrayList;
import java.util.Scanner;

import java_class.ComputerGame;
import java_enum.Console;
//08.06.2025

public class Lesson38 {

	public static void main(String[] args) {
			ComputerGame game1 = new ComputerGame("The Legend of Zelda: Tears of a Kingdom", 68.99, Console.NintendoSwitch2, false);
			ComputerGame game2 = new ComputerGame("Demons Souls Remastered", 50, Console.Playstation5, false);
			ComputerGame game3 = new ComputerGame("Roblox", 0, Console.PC, true);
			ComputerGame game4 = new ComputerGame("Forza 6", 50, Console.XboxSeriesX, false);
			ComputerGame game5 = new ComputerGame("Cyberpunk 2077", 68, Console.PC, false);
			ComputerGame game6 = new ComputerGame("Gravity Rush", 24, Console.PsVita, false);
			
			
			ArrayList<ComputerGame> gameList = new ArrayList<ComputerGame>();
			gameList.add(game1);
			gameList.add(game2);
			gameList.add(game3);
			gameList.add(game4);
			gameList.add(game5);
			gameList.add(game6);
			
			
			//Print all game description
			for(ComputerGame oneGame:gameList) {
				oneGame.printInformationAboutGame();
			}
			
			//Print game names, that you can play on PC
			System.out.print("Games that you can play on your PC ");
			for(ComputerGame oneGame: gameList) {
				if(oneGame.gameConsole == Console.PC) {
					System.out.print(oneGame.gameName +" ");
				}
				
			}
			
			
			//Get all game price
			double allGamePrice = 0;
			for(ComputerGame oneGame:gameList) {
				allGamePrice += oneGame.gamePrice;
				
				
			}
			System.out.println("\n All game price is" + allGamePrice);
			
			
			//Enter your money to check which games you can buy
			Scanner sk1 = new Scanner(System.in);
			System.out.println("Enter your money>");
			double userMoney = sk1.nextDouble();
			System.out.println("You can buy>");
			for(ComputerGame oneGame: gameList) {
				if(oneGame.buyGame(userMoney)) {
					System.out.println(oneGame.gameName);
					
				}
			}
			
			
	}

}
