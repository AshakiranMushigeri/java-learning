package org.javamethods;

public class Palindrome {

    public static boolean isPalindrome(int n){
        int original = n;
        int rev = 0;

        while(n>0){
            rev = rev*10 + n%10;
            n = n/10;
        }
        return original == rev;
    }

    public static void main(String[] args) {
        System.out.println("The given number is it a Palindrome? "+isPalindrome(34567));
    }
}
