package Encapsulation;

public class Ex_01_Login {
    static void main() {
        Login buildlogin = new Login("Admin", "Anjali123");
        buildlogin.user = "Anjali";
        System.out.println("user" + buildlogin.user);


        Encaplogin buildlogin2 = new Encaplogin("Admin", "pwd123");
        buildlogin2.setUser("HelloAdmin");
        System.out.println("user name is" + buildlogin2.getUser());

//        boolean isAdmin = false;
        buildlogin2.setPassowrd("pwd342", true);
//        System.out.println("password is "+buildlogin2.getPassowrd());

    }
}

class Login {
    String user;
    String passowrd;


    Login(String user, String Passowrd) {
        this.user = user;
        this.passowrd = Passowrd;
        System.out.println("user" + this.user);
    }

}

// this class is for Encapsulations ,used the word private

class Encaplogin {
    private String user;
    private String passowrd;


    public String getPassowrd() {
        return passowrd;
    }

    public void setPassowrd(String passowrd, boolean isAdmin) {
        if (isAdmin) {
            this.passowrd = passowrd;
            System.out.println("password set: " + this.passowrd);

        } else {
            System.out.println("password change not allowed");
        }


    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    Encaplogin(String user1, String pass) {
        this.user = user1;
        this.passowrd = pass;
    }

}

