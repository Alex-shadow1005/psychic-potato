import java.util.Random;
import java.util.Scanner;

public class jonfunMath {
    public static void main(String[] args) {
        int num;
        System.out.println("insæt nummer ");

        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();

        if (num %2 == 0){
            System.out.println("lige tal " + num);
        } else {
            System.out.println("ulige tal " + num);
        }

        if (num == 13){
            System.out.println("Lucky number " + num + "!");
        }




    }
        }

