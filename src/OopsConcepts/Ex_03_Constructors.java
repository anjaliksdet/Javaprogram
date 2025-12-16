package OopsConcepts;

public class Ex_03_Constructors {
    static void main() {
        HouseDetails S1= new HouseDetails();
        System.out.println(S1.houseNumber);
        System.out.println(S1.address);
        System.out.println(S1.number);

    }
}

class HouseDetails
{

    int number ;
    String address;
    String houseNumber;

    HouseDetails(){
        number = 7263816;
        address ="JP NAGAR";
        houseNumber="T-03,";

    }
}






