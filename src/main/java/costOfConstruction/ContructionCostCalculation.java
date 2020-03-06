package costOfConstruction;
//import java.io.*;
import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class ContructionCostCalculation {
	public static void main(String[] args) throws Exception {
		final Logger log = LogManager.getLogger();
//		log.error("Hello world");
		ConstructionCost cost = new ConstructionCost();
//		System.out.printf("%s", "Enter area of contruction \n");
		log.error("Enter area of contruction \n");
		Scanner scan = new Scanner(System.in);
		double area;
		area = scan.nextDouble();
		if( area < 0 ) {
			scan.close();
			throw new Exception("Negative area doesn't exists");
		} else {
			cost.setConstructionArea(area);
		}
		log.error("choose your standard of material contruction \n");
		log.error("1. Standard Material"
				+ "\n2. Above Standard Material"
				+ "\n3. High Standard Material"
				+ "\n4. High Standard Material with fully automated home\n...");
		int choice = scan.nextInt();
		if( choice < 0 && choice > 4) {
			scan.close();
			throw new Exception("Not applicable");
		} else {
			cost.setStandardOfMaterial(choice-1);
		}
		log.error("\nHere is your cost of construction Rs."+cost.getContructionCost()+"/--");
		log.error("\nThank you");
		scan.close();
	}

}
