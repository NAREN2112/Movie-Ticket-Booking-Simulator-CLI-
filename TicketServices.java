package ticket;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.Scanner;

public class TicketServices {
    public boolean authentication(String uname,String password){
        User ob = new User();
        String name = ob.getUserName();
        String pass = ob.getPassword();
        if(name.equals(uname) && pass.equals(password)){
            return true;
        }
        else{
            return false;
        }
    }
    public static void showSeat(){
        System.out.println("===================================================================================================");
        System.out.println("g - [1] [2] [3] [4] [5] [6] [7 [8] [9] [10]");
        System.out.println("f - [1] [2] [3] [4] [5] [6] [7 [8] [9] [10]");
        System.out.println("e - [1] [2] [3] [4] [5] [6] [7 [8] [9] [10]");
        System.out.println("d - [1] [2] [3] [4] [5] [6] [7 [8] [9] [10]");
        System.out.println("c - [1] [2] [3] [4] [5] [6] [7 [8] [9] [10]");
        System.out.println("b - [1] [2] [3] [4] [5] [6] [7 [8] [9] [10]");
        System.out.println("a - [1] [2] [3] [4] [5] [6] [7 [8] [9] [10]");
        confirmTicket();
        System.out.println("===================================================================================================");
    }
    public static void showTime(){
        System.out.println("===================================================================================================");
        System.out.println("-----1. 11.00 IST-----2. 14.00 IST-----3. 18.00 IST-----");
        System.out.println("===================================================================================================");
    }
    public static void showDate(int m){
        System.out.println("===================================================================================================");
        Scanner sc = new Scanner(System.in);
        switch (m){
            case 1:
                System.out.println("--------------05-08-2022-------------");
                showTime();
                System.out.print("Enter the Time option:");
                int s = sc.nextInt();
                showSeat();
                break;
            case 2:
                System.out.println("--------------06-08-2022-------------");
                showTime();
                System.out.print("Enter the Time option:");
                int s1 = sc.nextInt();
                showSeat();
                break;
            case 3:
                System.out.println("--------------07-08-2022-------------");
                showTime();
                System.out.print("Enter the Time option:");
                int s2 = sc.nextInt();
                showSeat();
                break;
        }
    }
    public static double pay(int s){
        double d = (double)s*160;
        double gst = d/100*25;
        return d+gst;
    }

    public static void Check(int s1,double a,String p,String s2){
        TicketServices ob = new TicketServices();
        if(p.equals("Yes")) {
            Booking b1 = new Booking(s1,a,p,s2);
            System.out.println(b1);
            System.out.println("Ticket Booked Successfully......");
            ob.option();
        }
        else{
            System.out.println("Booking failed.......");
            ob.option();
        }
    }
    public static String seatAllocate(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the seat No:");
        String s2 = sc.nextLine();
        return s2;
    }
    public static void confirmTicket(){
        TicketServices ob = new TicketServices();
        Scanner sc = new Scanner(System.in);
        System.out.println("-------------------------Confirm Ticket------------------------------------------------------------");
        System.out.print("Enter the no of seat:");
        int s1 = sc.nextInt();
        String s2 = seatAllocate();
        double a = pay(s1);
        System.out.println("Amount Payable : "+a);
        System.out.println("Confirm Yes/No");
        String k = sc.next();

        Check(s1,a,k,s2);



    }
    public void bookTicket(){
        Scanner sc = new Scanner(System.in);
        System.out.println("=====================================DATE========================================================");
        System.out.println("1. 05-08-2022");
        System.out.println("2. 06-08-2022");
        System.out.println("3. 07-08-2022");
        System.out.println("===================================================================================================");
        System.out.print("Enter the option:");
        int n = sc.nextInt();
        showDate(n);

    }
    public void option(){
        String arr[] = {"1. Book Ticket","2. Movie list","3. Support","4. Forget Password","5. Exit"};
        for (String e: arr) {
            System.out.println(e);
        }
        System.out.println("===================================================================================================");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the option:");
        int op = sc.nextInt();
        switch (op){
            case 1:
                bookTicket();
                break;
            case 2:
                movieList();
                break;
            case 3:
                support();
                break;
            case 4:
                forgetPass();
                break;
            case 5:
                break;
            default:
                System.out.println("Enter Valid Option");
                bookTicket();
        }
    }

    public static void forgetPass() {
        System.out.println("===================================================================================================");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter New Password:");
        String nPass = sc.nextLine();
        User ob = new User();
        ob.setPassword(nPass);
        System.out.println("Password Reset Successfull....");
        System.out.println("===================================================================================================");
        TicketServices ob1 = new TicketServices();
        ob1.option();


    }

    public static void support() {
        System.out.println("===================================================================================================");
        System.out.println("Contact - +0433-423-243");
        System.out.println("Mail    - ticketApp@123.com");
        TicketServices ob = new TicketServices();
        ob.option();
        System.out.println("===================================================================================================");

    }

    public static void movieList() {
        System.out.println("===================================================================================================");
        ArrayList<String>mList = new ArrayList<>();
        mList.add("Vikram");
        mList.add("Ponniyin Selvan");
        mList.add("KGF");
        for (String s:mList) {
            System.out.println(s);
        }
        System.out.println("===================================================================================================");
        TicketServices ob = new TicketServices();
        ob.option();

    }
}
