package OopsConcepts;

public class eX_04_ConstructorPractise {
    static void main() {
        Bikes harleyDavidson1 = new Bikes();
        System.out.println(harleyDavidson1.bikeName);
        System.out.println(harleyDavidson1.bikeColor);
        System.out.println(harleyDavidson1.mileage);
        System.out.println(harleyDavidson1.bikeCompany);
        System.out.println(harleyDavidson1.bikeCc);
    }
}

class Bikes{
    int bikeModel;
    String bikeName;
    String bikeCompany;
    String bikeCc;
    String bikeColor;
    String mileage;

    Bikes(){
        bikeName="Harley-Davidson Fat Boy";
        bikeCompany="Harley-Davidson";
        bikeColor="Gray and Blue Burst";
        bikeCc="1,868 cc";
        mileage="18kmpl";


    }
}

