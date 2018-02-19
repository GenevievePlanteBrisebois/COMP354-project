//-------------------------------------------------------
//For Comp 354 Section PP - Winter 2018
//Iteration 1: Sabrina Rieck, 40032864
//Description: A visual testing of the Budgetting class
//--------------------------------------------------------
package src;

public class BudgettingDriver {

	public static void main(String[] args) {
		
		//Testing default constructor
		System.out.println("Using the DEFAULT constructor, with initialized budget of 1000$\n\n");
		
		Budgetting object1 = new Budgetting();
		object1.setAvailableFunds(1000);
		System.out.println(object1);
		
		//Testing parameterized constructor
		System.out.println("Using the PARAMETERIZED contructor:");
		Budgetting object2 = new Budgetting(2500, 30, 10, 10, 5, 5, 4, 7, 10, 10, 10);
		System.out.println(object2);
		
		//Testing Print to file
		object1.writeToFile();
		
		//Testing read full object from file
		System.out.println("Output should be identical to the first output");
		Budgetting object3 = new Budgetting();
		object3.readBudgetingFromFile(Constants.BUDGETING_FILE);
		System.out.println(object3);

	}

}
