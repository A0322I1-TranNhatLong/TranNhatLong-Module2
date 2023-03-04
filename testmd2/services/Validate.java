package testmd2.services;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validate {
    public static boolean validateEmail(String data){
        String regex= "[\\w]+@[\\w]+\\.com";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(data);
        return matcher.matches();
    }
    public static boolean validateSodienthoai(String data){
        String regex= "[\\d]{10,11}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(data);
        return matcher.matches();
    }
}
