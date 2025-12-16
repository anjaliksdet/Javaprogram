package OopsConcepts;

public class Ex_01_CreationOfClassAndObjects {
    static void main(String[] args) {
        Student anj = new Student();
        anj.age=31;
        anj.name ="Anjali Yashodhar ";
        anj.rollNo= "sit";
        anj.display();


    }
}

    class  Student {
         String name ;
         int age;
         String rollNo;

         void display(){
            System.out.println("Name -->"+ name+ "\nAge-->"+ age + "\nROLL NUMBER---> "+ rollNo);
        }


}
