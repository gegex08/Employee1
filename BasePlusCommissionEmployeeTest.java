public class BasePlusCommissionEmployeeTest
{
   public static void main( String[] args ) 
   {
      // instantiate BasePlusCommissionEmployee object
      BasePlusCommissionEmployee employee = 
         new BasePlusCommissionEmployee( 
         "Bob", "Lewis", "333-33-3333", 5000, .04, 300 );
      BasePlusCommissionEmployee employee1 = 
         new BasePlusCommissionEmployee( 
         "Geneiva", "Ocampo", "713-111-0129", 5000, .10, 300 );
      
      // get base-salaried commission employee data
      System.out.println( 
         "Employee information obtained by get methods: \n" );
      System.out.printf( "%s %s\n", "First name is",
         employee.getFirstName() );
      System.out.printf( "%s %s\n", "Last name is", 
         employee.getLastName() );
      System.out.printf( "%s %s\n", "Social security number is", 
         employee.getSocialSecurityNumber() );
      System.out.printf( "%s %.2f\n", "Gross sales is", 
         employee.getGrossSales() );
      System.out.printf( "%s %.2f\n", "Commission rate is",
         employee.getCommissionRate() );
      System.out.printf( "%s %.2f\n", "Base salary is",
         employee.getBaseSalary() );
      
      // get base-salaried commission employee data
      System.out.println( 
         " New Employee1 information obtained by get methods: \n" );
      System.out.printf( "%s %s\n", "First name is",
         employee1.getFirstName() );
      System.out.printf( "%s %s\n", "Last name is", 
         employee1.getLastName() );
      System.out.printf( "%s %s\n", "Social security number is", 
         employee1.getSocialSecurityNumber() );
      System.out.printf( "%s %.2f\n", "Gross sales is", 
         employee1.getGrossSales() );
      System.out.printf( "%s %.2f\n", "Commission rate is",
         employee1.getCommissionRate() );
      System.out.printf( "%s %.2f\n", "Base salary is",
         employee1.getBaseSalary() );

      employee.setBaseSalary( 1000 ); // set base salary
      employee1.setBaseSalary(2000);
      
      System.out.printf( "\n%s:\n\n%s\n", 
         "Updated employee information obtained by toString", 
         employee.toString() );
      System.out.printf( "\n%s:\n\n%s\n", 
         "Updated employee1 information obtained by toString", 
         employee1.toString() );
   } // end main
} // end class BasePlusCommissionEmployeeTest