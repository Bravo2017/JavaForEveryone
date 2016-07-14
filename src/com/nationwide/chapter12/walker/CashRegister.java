package com.nationwide.chapter12.walker;


/**
   A cash register totals up sales and computes change due.
*/
public class CashRegister
{
  private double purchase;
   private double payment;
  /**
      Constructs a cash register with no money in it.
   */
	
public CashRegister()
   {
      purchase = 0;
      payment = 0;
   }

   public void addItem(double amount)
  {
      double newTotal = purchase + amount;
     purchase = newTotal;
  }

   public void enterPayment(int currencyCount, Currency currencyType)
   {
      payment  = payment + currencyCount * currencyType.getValue();
   }

   public double giveChange()
   {
      double change = payment - purchase;
      purchase = 0;
      payment = 0;
      return change;
   }    
}


