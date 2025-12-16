package OopsConcepts;

public class Ex_02_ClassExamples {
    static void main() {
        Employee details= new Employee();
        details.firstName="Anjali";
        details.employeeId= 234;
        details.income= "20lpa";
        details.designation= "SDET";
        details.intro();

        Employee skilled= new Employee();
        skilled.firstName="Yash";
        skilled.designation="SDET";
        skilled.employeeId=235;
        skilled.income="20lpa";
        skilled.intro();
    }
}

class Employee{
    String firstName;
    int employeeId;
    String designation;
    String income;
    void intro(){
        System.out.println("Employee name =" + firstName + "\nEmployeeid="+ employeeId +"\n"+"Designation= "+ designation+"\nSalary=" +income );
    }
}
