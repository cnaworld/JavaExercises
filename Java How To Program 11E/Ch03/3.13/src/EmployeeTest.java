public class EmployeeTest {
    public static void main (String[] args)
    {
        Employee employee1 = new Employee("Sina","vafaei",3222);
        Employee employee2 = new Employee("arta" , "solhi" , 5555);
        System.out.printf("%s %s your monthlysalari is : %.2f%n" , employee1.getFirstName() , employee1.getLastName() , employee1.getMonthlySalary());
        System.out.printf("%s %s your monthlysalari is : %.2f" , employee2.getFirstName() , employee2.getLastName() , employee2.getMonthlySalary());

        employee1.setMonthlySalary(employee1.getMonthlySalary() * 1.10 )  ;
        employee2.setMonthlySalary(employee2.getMonthlySalary() * 1.10 )  ;

        System.out.println("\nYearly salaries with a 10% raise");

        System.out.printf("%s %s your monthlysalari is : %.2f%n" , employee1.getFirstName() , employee1.getLastName() , employee1.getMonthlySalary());
        System.out.printf("%s %s your monthlysalari is : %.2f" , employee2.getFirstName() , employee2.getLastName() , employee2.getMonthlySalary());






    }


}
