package OopsConcepts;

public class Ex_05_ParameterizesConstructor {
    static void main() {
      Bikesz bike1= new Bikesz(1233,"Harley-Davidson","1,868 cc","12kmpl");
        System.out.println(bike1.bikeName);
        Bikesz bike2= new Bikesz(234,"anjalicompany","YAMMAHA","12kmpl");
        System.out.println(bike2.bikeName);
    }
}


class Bikesz{
    int bikeModel;
    String bikeName;
    String bikeCompany;
    String bikeCc;
    String bikeColor;
    String mileage;

    Bikesz(int bikeModel_1,String bikeCompany,String bikeName,String mileage){
        this.bikeModel=bikeModel_1   ;
        this.bikeCompany=bikeCompany;
        this.bikeName=bikeName;
        this.mileage=mileage;




    }
}

