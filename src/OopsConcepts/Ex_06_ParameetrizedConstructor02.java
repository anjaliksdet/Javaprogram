package OopsConcepts;

public class Ex_06_ParameetrizedConstructor02 {
    static void main() {
        Phones iphone = new Phones("iphone16", "2000");
        Phones samsung = new Phones("ultra 24", "2014");
        iphone.Display();
        samsung.Display();
        iphone.ModelName();
        System.out.println("the model name is " + iphone.ModelName()) ;
    }
}

class Phones {
    String modelName;
    String launchYear;


    //PARAMETERS AND THIS REFRENCE NAME SHOULD MATCH

    Phones(String modelName_1, String launchYear_1) {
        this.modelName = modelName_1;
        this.launchYear = launchYear_1;

    }

    void Display() {
        System.out.println("The model name is" + this.modelName + "\nThe Launch Year is " + this.launchYear);

    }

    String ModelName() {
        return this.modelName;
    }

}
