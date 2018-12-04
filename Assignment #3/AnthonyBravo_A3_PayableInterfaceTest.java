// Anthony Bravo
// Cs 221 - Software Design
// Project #3

public class AnthonyBravo_A3_PayableInterfaceTest {

    public static void main(String[] args) {
        //Creating payable objects array
        Payable[] payableObjects = new Payable[6];

        //Filling array with: 2 Invoices
        payableObjects[0] = new Invoice( "01234", "seat", 2, 375.00  );
        payableObjects[1] = new Invoice( "56789", "tire", 4, 79.95);

        //Filling array with: 4 Employees
        payableObjects[2] = new SalariedEmployee( "John", "Smith", "111-11-1111", 800.00);
        payableObjects[3] = new HourlyEmployee("Karen", "Price", "222-22-2222", 16.75, 40);
        payableObjects[4]=new CommissionEmployee("Sue", "Jones", "333-33-3333", 10000, .06 );
        payableObjects[5]=new BasePlusCommissionEmployee("Bob", "Lewis", "444-44-4444", 5000, .04, 300 );

        System.out.println();
        //Iterate through the array
        for(Payable payableObj: payableObjects) {

            if(payableObj instanceof BasePlusCommissionEmployee) {
                //Increase base salary by 10%
                BasePlusCommissionEmployee employee = (BasePlusCommissionEmployee) payableObj;
                double newSalary = 1.10 * employee.getBaseSalary();
                employee.setBaseSalary(newSalary);
                //Outputting information
                System.out.printf("%s \n", employee.toString());
                System.out.printf("Payment due $%,.2f \n\n\n",employee.getPaymentAmount());
            }
            else {
                System.out.printf("%s \n", payableObj.toString());
                System.out.printf("Payment due $%,.2f \n\n\n",payableObj.getPaymentAmount());
            }
        }
    }

}
