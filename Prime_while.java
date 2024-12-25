package javaprograms;

import java.util.Scanner;

public class Prime_while {

    public static void main(String[] args) {
        Scanner ic = new Scanner(System.in);
        System.out.println("Enter the limit");
        int limit = ic.nextInt();
        
        Prime_while o1 = new Prime_while();
        o1.Prime(limit);
        
        ic.close();
    }

    public void Prime(int limit) {
        int i = 2; 
        while (i <= limit) {
            if (isPrime(i)) {
                System.out.println(i);
            }
            i++;
        }
    }

    public boolean isPrime(int num) {
        if (num < 2) return false;
        for (int j = 2; j <= Math.sqrt(num); j++) {
            if (num % j == 0) return false;
        }
        return true;
    }
}
