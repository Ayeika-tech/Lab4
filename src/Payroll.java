/**
   The Payroll class stores data about an employee's pay
   for the Payroll Class programming challenge.
*/

public class Payroll
{
   private String name;          // Employee name
   private int idNumber;         // ID number
   private double payRate;       // Hourly pay rate
   private double hoursWorked;   // Number of hours worked

   /**
      The constructor initializes an object with the
      employee's name and ID number.
      @param n The employee's name.
      @param i The employee's ID number.
   */

   public Payroll(String n, int i) throws InvalidNameException
   {
      setName(n);
      idNumber = i;
   }

   /**
      The setName sets the employee's name.
      @param n The employee's name.
   */

   public void setName(String n) throws InvalidNameException
   {
      if(isValidEmpName(n))
         name = n;
      else 
         throw new InvalidNameException();
   }

   /**
      The setIdNumber sets the employee's ID number.
      @param i The employee's ID number.
   */
   
   public void setIdNumber(int i)
   {
      idNumber = i;
   }

   /**
      The setPayRate sets the employee's pay rate.
      @param p The employee's pay rate.
   */
   
   public void setPayRate(double p)
   {
      payRate = p;
   }

   /**
      The setHoursWorked sets the number of hours worked.
      @param h The number of hours worked.
   */

   public void setHoursWorked(double h)
   {
      hoursWorked = h;
   }

   /**
      The getName returns the employee's name.
      @return The employee's name.
   */

   public String getName()
   {
      return name;
   }

   /**
      The getIdNumber returns the employee's ID number.
      @return The employee's ID number.
   */
   
   public int getIdNumber()
   {
      return idNumber;
   }

   /**
      The getPayRate returns the employee's pay rate.
      @return The employee's pay rate.
   */

   public double getPayRate()
   {
      return payRate;
   }

   /**
      The getHoursWorked returns the hours worked by the
      employee.
      @return The hours worked.
   */


   public double getHoursWorked()
   {
      return hoursWorked;
   }

   /**
      The getGrossPay returns the employee's gross pay.
      @return The employee's gross pay.
   */

   public double getGrossPay()
   {
      return hoursWorked * payRate;
   }

private boolean isValidEmpName(String e)
   {
      boolean status = true;
      
      if (e.isBlank() )
         status = false;
      
      return status;
   }
}