//-------------------------------------------------------
//For Comp 354 Section PP - Winter 2018
//Iteration 1: William Prioriello
//Description: Test for the CashSpending class
// --------------------------------------------------------
package src;




import org.junit.Test;
import src.CashSpending;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class CashSpendingTest{
    CashSpending.ExpenditureType typeOfExpenditureGroceries =  CashSpending.ExpenditureType.GROCERIES;
    CashSpending.ExpenditureType typeOfExpenditureRent =  CashSpending.ExpenditureType.RENT;
    CashSpending.ExpenditureType typeOfExpenditureTaxes =  CashSpending.ExpenditureType.TAXES;

    Double dollarsSpentOnGroceriesApple = 23.12;
    Double dollarsSpentOnGroceriesBanana = 1.1;
    Double dollarsSpentOnRent = 1223.12;
    Double dollarsSpentOnTaxes = 223.12;


    @Test
    public void addExpenseTest(){
        CashSpending spending = new CashSpending();
        spending.addExpense(typeOfExpenditureGroceries, dollarsSpentOnGroceriesApple);
        spending.addExpense(typeOfExpenditureGroceries, dollarsSpentOnGroceriesBanana);

        spending.addExpense(typeOfExpenditureRent, dollarsSpentOnRent);

        assertEquals(spending.getExpensesOfType(CashSpending.ExpenditureType.GROCERIES).get(0), dollarsSpentOnGroceriesApple);
        assertEquals(spending.getExpensesOfType(CashSpending.ExpenditureType.GROCERIES).get(1), dollarsSpentOnGroceriesBanana);

        assertEquals(spending.getExpensesOfType(CashSpending.ExpenditureType.RENT).get(0), dollarsSpentOnRent);

    }
    @Test
    public void getExpensesOfTypeTest(){
        CashSpending spending = new CashSpending();
        spending.addExpense(typeOfExpenditureGroceries, dollarsSpentOnGroceriesApple);
        spending.addExpense(typeOfExpenditureGroceries, dollarsSpentOnGroceriesBanana);

        spending.addExpense(typeOfExpenditureRent, dollarsSpentOnRent);
        spending.addExpense(typeOfExpenditureTaxes, dollarsSpentOnTaxes);
        spending.addExpense(typeOfExpenditureTaxes, dollarsSpentOnTaxes + 1);
        spending.addExpense(typeOfExpenditureTaxes, dollarsSpentOnTaxes + 2);


        assertEquals(spending.getExpensesOfType(CashSpending.ExpenditureType.GROCERIES).get(0), dollarsSpentOnGroceriesApple);
        assertEquals(spending.getExpensesOfType(CashSpending.ExpenditureType.GROCERIES).get(1), dollarsSpentOnGroceriesBanana);
        assertEquals(spending.getExpensesOfType(CashSpending.ExpenditureType.RENT).get(0), dollarsSpentOnRent);
        assertEquals(spending.getExpensesOfType(CashSpending.ExpenditureType.TAXES).get(2), new Double(dollarsSpentOnTaxes + 2.0));


    }


/*    /// TESTS FOR Expenses class
    //TODO Iteration 2
    @Test
    void expensesConstructorAssignsFieldProperly(){
        CashSpending.ExpenditureType typeOfExpenditure =  CashSpending.ExpenditureType.GROCERIES;
        ArrayList<Double> listOfGroceryCharges = new ArrayList<>(10);


        //CashSpending.Expenses expensesObj = new CashSpending.Expenses(typeOfExpenditure, listOfGroceryCharges);

        CashSpending spending = new CashSpending();

      //  assertEquals();

    } */









    @Test
    public void basic_test(){
        assertEquals(1,1);
    }


}