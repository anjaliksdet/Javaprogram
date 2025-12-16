package InheritanceExamples;

public class Ex_01_UnderstandInheritence extends Search{
    static void main() {
          Search Usecase= new Search();
        Usecase.opentheBrowser="Chrome";
        Usecase.url="www.chrome.com";
        Usecase.login();
        Usecase.buildnumber= 123;


    }
}

class ChromeBrowser{
    String opentheBrowser;
    String url;
    void bowswerName(){
        System.out.println("Browser opned is CHROME");
    }
}

class Search extends ChromeBrowser{
    int buildnumber;
    void login(){
        System.out.println("Url entered =" +url);
        System.out.println("Status of the browser="+ opentheBrowser);

    }


}