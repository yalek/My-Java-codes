/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package employeepolymorphismabstract;

/**
 *
 * @author USER
 */
public class EmployeePolymorphismAbstract {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        salariedEmployee sEmployee = new salariedEmployee("John", "Smith", "111-11-1111", 800.00);
        HourlyEmployee hourlyEmployee = new HourlyEmployee("Karen", "Price", "222-22-2222", 16.75, 40);
        CommissionEmployee commissionEmployee = new CommissionEmployee("Sue", "Jones", "333-33-3333", 10000, .06);
        BasePlusCommissionEmployee bpCommissionEmployee = new BasePlusCommissionEmployee("Bob", "Lewis", "444-44-4444", 5000, .04, 300);
        PieceWorker pieceEmployee = new PieceWorker("Kevin","Oyale","223-45-4545",50.00,50);
        
        System.out.println("Employees processed individually:\n");
        
        System.out.printf("%s %s %.2f\n\n",sEmployee,"Earned; ",sEmployee.earning());
        System.out.printf("%s %s %.2f\n\n",hourlyEmployee,"Earned; ",hourlyEmployee.earning());
        System.out.printf("%s %s %.2f\n\n",commissionEmployee,"Earned; ",commissionEmployee.earning());
        System.out.printf("%s %s %.2f\n\n",bpCommissionEmployee,"Earned; ",bpCommissionEmployee.earning());
        System.out.printf("%s %s %.2f\n\n", pieceEmployee,"Earned",pieceEmployee.earning() );
        
        Employee [] employees = new Employee[5];
        
        employees[0] = sEmployee;
        employees[1]= hourlyEmployee;
        employees[2]= commissionEmployee;
        employees[3]= bpCommissionEmployee;
        employees[4]= pieceEmployee;
        
        System.out.println("Employees processed polymorphically:\n");
        
        for(Employee currentEmployee: employees){
                System.out.println(currentEmployee );
            if(currentEmployee instanceof BasePlusCommissionEmployee){
                BasePlusCommissionEmployee employee = (BasePlusCommissionEmployee ) currentEmployee;
                    employee.setBaseSalary(1.10*employee.getBaseSalary());
                        System.out.printf("New base salary with 10%% increase is: $%,.2f\n", employee.getBaseSalary());
            }
            System.out.printf("Earned $%,.2f\n",currentEmployee.earning());
        
        }
        
        for(int j=0; j<employees.length;j++){
            System.out.printf("Employee %d is a %s\n", j,
                    employees[j].getClass().getName());
        
        }
            
    }
    
}
