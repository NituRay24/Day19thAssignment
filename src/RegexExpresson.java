import java.util.*;
import java.io.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class RegexExpresson {
    public void checkStringUsingRegex(String givString) {


        Pattern pattern = Pattern.compile("[x]{2}[y]{1}[z]{1}");// we search for this
        Matcher macher = pattern.matcher("xxyxz");// we search in this
        boolean ifMatches = macher.find();
        if (ifMatches) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }
    }
    public void checkIntegerUsingRegex(Integer givInteger) {
        Pattern pattern = Pattern.compile("[x]{2}[y]{1}[z]{1}");// we search for this
        Matcher macher = pattern.matcher("1233467555");// we search in this
        boolean ifMatches = macher.find();
        if (ifMatches) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }

    }
    public void checkStringEmailRegex(String givString) {

        Pattern pattern = Pattern.compile("[a]{2}[b]{1}[c]{1}[@]");// we search for this
        Matcher macher = pattern.matcher("abc@467");// we search in this
        boolean ifMatches = macher.find();
        if (ifMatches) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }



    }




    public static void main(String[] args) {
        RegexExpresson chk = new RegexExpresson();
        chk.checkStringUsingRegex("hams");
        chk.checkIntegerUsingRegex(235156755);
        chk.checkStringEmailRegex("ran@47874");

    }
}


