package ticket;

import java.util.Scanner;

public class Main {

    public static void WelcomePage() {
        Scanner sc = new Scanner(System.in);
        System.out.println("--------------------------------------Welcome to the App-------------------------------------------");
        System.out.println("1.Login");
        System.out.println("===================================================================================================");
        System.out.print("Enter your option:");
        int s = sc.nextInt();
        login();

    }
    public static void login(){
        System.out.println("--------------------------------------Login Page---------------------------------------------------");
        Scanner sc = new Scanner(System.in);
        String uName,password;
        System.out.print("Username : ");
        uName = sc.nextLine();
        System.out.print("Password : ");
        password = sc.nextLine();
        TicketServices ob1 = new TicketServices();
        if(ob1.authentication(uName,password)){
            User ob = new User(uName,password);
            System.out.println("Login Successfull");
            System.out.println("===================================================================================================");
            ob1.option();
        }else{
            System.out.println("Invalid login info");
            System.out.println("===================================================================================================");
            System.out.println("Try again");
            login();
        }
        System.out.println("===================================================================================================");


    }
    public static void main(String[] args) {

        System.out.println("--------------------------------------Ticket Booking-----------------------------------------------");
        System.out.println("===================================================================================================");
        WelcomePage();

    }

}

