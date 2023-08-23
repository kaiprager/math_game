package math_game;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Test your mathematical skills!");
		System.out.println();

		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		MathFormulars formula = new MathFormulars();
		
		
		// Addition
		
		int add1 = random.nextInt(100);
		int add2 = random.nextInt(100);
		
		System.out.println(add1 + " + " + add2 + " = ");
		int addResult = scanner.nextInt();
		
		int pointsAdd = 0;
		
		if(add1 + add2 == addResult) {
			pointsAdd = 5;
			System.out.println("You're answer is correct. You get 5 points.");
		} else {
			pointsAdd = 0;
			System.out.println("Unfortunately, your answer is not correct. You don't get any points.");
			System.out.println("The correct answer is: " + (add1 + add2));
		}
		
		System.out.println();
		
		
		// Subtraction
		
		int sub1 = random.nextInt(100);
		int sub2 = random.nextInt(100);
		int subResult = 0;
		int pointsSub = 0;
		
		if(sub1 > sub2) {
			System.out.println(sub1 + " - " + sub2 + " = ");
			int subScan1 = scanner.nextInt();
			subResult = subScan1;
			
			if(sub1 - sub2 == subResult) {
				pointsSub = 5; 
				System.out.println("You're answer is correct. You get 5 points.");
			} else {
				pointsSub = 0;
				System.out.println("Unfortunately, your answer is not correct. You don't get any points.");
				System.out.println("The correct answer is: " + (sub1 - sub2));
			}
			
		} else {
			System.out.println(sub2 + " - " + sub1 + " = ");
			int subScan2 = scanner.nextInt();
			subResult = subScan2;
			
			if(sub2 - sub1 == subResult) {
				pointsSub = 5; 
				System.out.println("You're answer is correct. You get 5 points.");
			} else {
				pointsSub = 0;
				System.out.println("Unfortunately, your answer is not correct. You don't get any points.");
				System.out.println("The correct answer is: " + (sub2 - sub1));
				
			}
			
		}
		
		System.out.println();
		
		
		// Multiplication 
		
		int multi1 = random.nextInt(11);
		int multi2 = random.nextInt(11);
		
		System.out.println(multi1 + " * " + multi2 + " = ");
		int multiResult = scanner.nextInt();
		
		int pointsMulti = 0;
		
		if(multi1 * multi2 == multiResult) {
			pointsMulti = 5; 
			System.out.println("You're answer is correct. You get 5 points.");
		} else {
			pointsMulti = 0;
			System.out.println("Unfortunately, your answer is not correct. You don't get any points.");
			System.out.println("The correct answer is: " + (multi1 * multi2));
		}
		
		System.out.println();
		
		
		// Division
		
		int div1 = random.nextInt(11);
		int div2 = random.nextInt(11);
		double divResult = 0;
		int pointsDiv = 0;
		
		
		if(div1 > div2) {
			System.out.println(div1 + " / " + div2 + " = ");
			double divA = div1;
			double divB = div2;
			double endResult1 = divA / divB;
			double divScan1 = scanner.nextDouble();
			divResult = divScan1;
			
			if(endResult1 == divResult) {
				pointsDiv = 5; 
				System.out.println("You're answer is correct. You get 5 points.");
			} else {
				pointsDiv = 0;
				System.out.println("Unfortunately, your answer is not correct. You don't get any points.");
				System.out.println("The correct answer is: " + endResult1);
			}
			
		} else {
			System.out.println(div2 + " / " + div1 + " = ");
			double divC = div2;
			double divD = div1;
			double endResult2 = divC / divD;
			double divScan2 = scanner.nextDouble();
			divResult = divScan2;
			
			if(endResult2 == divResult) {
				pointsDiv = 5; 
				System.out.println("You're answer is correct. You get 5 points.");
			} else {
				pointsDiv = 0;
				System.out.println("Unfortunately, your answer is not correct. You don't get any points.");
				System.out.println("The correct answer is: " + endResult2);
			}
			
		}
		
		System.out.println();
		
		
		// Finding the highest number
		
		int h1 = random.nextInt(100000);
		int h2 = random.nextInt(100000);
		int h3 = random.nextInt(100000);
		int h4 = random.nextInt(100000);
		int h5 = random.nextInt(100000);
		int h6 = random.nextInt(100000);
		
		int[] highest = {h1, h2, h3, h4, h5, h6};
		
		System.out.println("Which one is the highest number?");
		
		for(int highestNumber : highest) {
			System.out.println(highestNumber);
		}
		
		int highResult = formula.highestNum(highest);
		int pointsHighest = 0;
		
		int highInput = scanner.nextInt();
		
		if(highInput == highResult) {
			pointsHighest = 5; 
			System.out.println("Your answer is correct. You get 5 points.");
		} else {
			pointsHighest = 0;
			System.out.println("Unfortunately, your answer is not correct. You don't get any points");
			System.out.println("The correct answer is: " + highResult);
		}
		
		System.out.println();
		
		
		// Finding the lowest number
		
		int l1 = random.nextInt(100000);
		int l2 = random.nextInt(100000);
		int l3 = random.nextInt(100000);
		int l4 = random.nextInt(100000);
		int l5 = random.nextInt(100000);
		int l6 = random.nextInt(100000);
		
		int[] lowest = {l1, l2, l3, l4, l5, l6};
		
		System.out.println("Which one is the lowest number?");
		
		for(int lowestNumber : lowest) {
			System.out.println(lowestNumber);
		}
		
		int lowResult = formula.lowestNum(lowest);
		int pointsLowest = 0;
		
		int lowInput = scanner.nextInt();
		
		if(lowInput == lowResult) {
			pointsLowest = 5; 
			System.out.println("Your answer is correct. You get 5 points.");
		} else {
			pointsLowest = 0;
			System.out.println("Unfortunately, your answer is not correct. You don't get any points");
			System.out.println("The correct answer is: " + lowResult);
		}
		
		System.out.println();
		
		
		// Percentage 
		
		int percent = random.nextInt(101);
		int amount = random.nextInt(1001);
		
		System.out.println(percent + "% of " + amount + " = ");
		double percentInput = scanner.nextDouble();
		
		int percentPoints = 0;
		
		double percentD = amount / 100;
		double percentResult = percentD * percent;
		
		String percentOutput = percentInput == percentResult ?  
				"Your answer is correct. You get 5 points" : 
				"Unfortunately your answer is not correct. You don't get any points." + "\n" + 
				"The correct answer is: " + percentResult;
		
		if(percentInput == percentResult) {
			percentPoints = 5; 
		} else {
			percentPoints = 0;
		}
		
		System.out.println(percentOutput);
		System.out.println();
		System.out.println();
		System.out.println();
		
		
		// Results
		
		int points = pointsAdd + pointsSub + pointsMulti + pointsDiv + pointsHighest + pointsLowest + percentPoints;
		System.out.println("Thanks for completing the test!");
		System.out.println("You have reached " + points + " Points.");
		
		if(points == 35) {
			System.out.println("Congratulations! You have reached the highest score!");
		} else if(points <= 30) {
			System.out.println("Almost perfect!");
		} else if(points <= 15) {
			System.out.println("Not bad!");
		} else if(points <=5) {
			System.out.println("You need to practice more!");
		} else {
			System.out.println("Unfortunately, you couldn't get any answers right. )-:");
		}
		
		scanner.close();
			
	}

}
