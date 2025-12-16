package InheritanceExamples;

public class Ex_01_SingleHeritence extends  cars{
    static void main() {
        

    }

}

class  Vechile {
String wheel;
String brand;
}

class cars extends Vechile{
    String model;

void Display(){
    System.out.println("wheel used"+ wheel);
    System.out.println("Brand"+ brand);
}

        }
