package org.javamethods;

public class ReverseaString {
    public static String reverse(String s){
        StringBuilder rev = new StringBuilder();
        for(int i = s.length()-1; i>=0;i--){
            rev.append(s.charAt(i));
        }
        return rev.toString();
    }

    public static void main(String[] args) {
        System.out.println("The reversed string is "+reverse("UnitedKingdom"));
    }
}
