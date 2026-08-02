class Employee{
    private int empId;
    private String empName;
    private String department;
    private int salary;

    public int EmpId {
        get { return empId; }
        set{
            if(empId > 0)
                empId = value;
            else
                System.out.println("Invalid Employee..");
        }
    }

    public String EmpName{
        get { return empName; }
        set{ empName = valeue; }
    }

    public String Department{
        get { return department; }
        set{ department = valeue; }
    }

    public int Salary{
        get { return salary; }
        set{
            if(salary >= 0)
                salary = value;
            else
                System.out.println("Salary Cannot be negative..");
        }
    }
     
    public void Display(){
        System.out.println("Employee ID : "+EmpName);
        System.out.println("Employee Name : "+EmpName);
        System.out.println("Department : "+Department);
        System.out.println("Salary : "+Salary);
    }
}
class Exp5{
    public static void main(String args[]){
        Employee e1 = new Employee();
        e1.EmpId = 101;
        e1.EmpName = "Suraj";
        e1.Department = "CSE";
        e1.Salary = 35000;

        Employee e2 = new Employee();
        e2.EmpId = 102;
        e2.EmpName = "Shantanu";
        e2.Department = "CSE";
        e2.Salary = 45000;

        System.out.println("Employee Details : ");
        e1.Display();
        System.out.println();
        e2.Display();


    }
}