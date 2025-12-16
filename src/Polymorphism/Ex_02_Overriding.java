package Polymorphism;

public class Ex_02_Overriding {
    static void main() {
        TestCase1 tc1= new TestCase1();
        tc1.Browser();
        TestCase2 tc2= new TestCase2();
        tc2.Browser();

    }
}

class OpenBrowser{
    void Browser(){
        System.out.println("Open browser in 2 min");
    }

}

class TestCase1 extends OpenBrowser{
    void Static1(){
        Browser();

    }
}

class TestCase2 extends OpenBrowser{
    @Override
    void Browser(){
        System.out.println("open in 1 min");
    }

}
