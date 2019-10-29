package de.uniheidelberg.equals;

public class EqualsExamples {
    public static void main(String[] args) {
        String s1 = new String("test");
        String s2 = new String("test");
        String s3 = new String(s1);
        String s4 = generateString();

        //--------- s1 und s2 vergleichen ----------
        System.out.println("--------- s1 und s2 vergleichen ----------");

        if(s1 == s2){
            printEqual(s1, s2);
        }else {
            printUnequal(s1, s2);
        }

        if(s1.equals(s2)){
            printEqual(s1, s2);
        }else {
            printUnequal(s1, s2);
        }

        //--------- s2 und s3 vergleichen ----------
        System.out.println("--------- s2 und s3 vergleichen ----------");

        if(s2 == s3){
            printEqual(s2, s3);
        }else {
            printUnequal(s2, s3);
        }

        if(s2.equals(s3)){
            printEqual(s2, s3);
        }else {
            printUnequal(s2, s3);
        }

        //--------- s1 und s3 vergleichen ----------
        System.out.println("--------- s1 und s3 vergleichen ----------");

        if(s1 == s3){
            printEqual(s1, s3);
        }else {
            printUnequal(s1, s3);
        }
        if(s1.equals(s3)){
            printEqual(s1, s3);
        }else {
            printUnequal(s1, s3);
        }

        //--------- s1 und s4 vergleichen ----------
        System.out.println("--------- s1 und s4 vergleichen ----------");

        if(s1 == s4){
            printEqual(s1, s4);
        }else {
            printUnequal(s1, s4);
        }
        if(s4.equals(s1)){
            printEqual(s1, s4);
        }else {
            printUnequal(s1, s4);
        }

    }

    private static String generateString() {
        return null;
    }

    public static void printEqual(String s1, String s2){
        System.out.println(String.format("%s == %s", s1, s2));
    }

    public static void printUnequal(String s1, String s2){
        System.out.println(String.format("%s != %s", s1, s2));
    }


}
