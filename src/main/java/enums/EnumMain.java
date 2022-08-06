package enums;

import java.util.Scanner;

public class EnumMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your network");
        String net = sc.nextLine().toUpperCase();
        switch (net){
            case "GLO":
                System.out.println("Glo subscription is active " +Networks.GLO);
                break;
            case "MTN":
                System.out.println("Mtn is a yellow color "+Networks.MTN);
                break;
            case "AIRTEL":
                System.out.println("Airtel is red "+Networks.AIRTEL);
                break;
            default:
                System.out.println("NIL");
                break;
        }

        Networks [] allNetworks = Networks.values();
        Networks networks;
        networks = Networks.valueOf("MTN");
        System.out.println(">>>>>"+networks);
        for(Networks n:allNetworks){
            System.out.println(n);
        }

        System.out.println(Package.Basic.getPrice());
        int ordinal = Package.Basic.ordinal();
        System.out.println(ordinal);

    }



}
