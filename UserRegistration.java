import java.util.*;
import java.util.regex.*;

public class UserRegistration
{
    public void validName(String name)
    {
        String regex="^[A-Z]{1}[a-zA-z]{2,}";
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher=pattern.matcher(name);

        if(matcher.find())
            System.out.println(name+" is valid");
        else
            System.out.println(name+" is not valid");
    }

    public void validemail(String email)
    {
        String regex="^[a-z0-9_-]+[.|+]?[a-z0-9_-]+[@][a-z0-9]{1,}[.][a-z]{2,}[.]{0,1}[a-z]*$";
        //String regex="^[+a-z0-9_-]+[.]{0,1}[a-z0-9_-]+[@][a-z0-9]{1,}[.][a-z]{2,}[.]{0,1}[a-z]*";
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher=pattern.matcher(email);

        if(matcher.find())
            System.out.println(email+" is valid");
        else
            System.out.println(email+" is not valid");
    }

    public void validmobile(String mobile)
    {
        String regex="[0-9]{2}[ ][789][0-9]{9}";
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher=pattern.matcher(mobile);

        if(matcher.find())
            System.out.println(mobile+" is valid");
        else
            System.out.println(mobile+" is not valid");
    }

    public void validpassword(String password)
    {
        String regex="^(?=.*[A-Z])(?=.*[0-9])[A-Za-z0-9@$!%*?&]{8,}$";
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher=pattern.matcher(password);

        if(matcher.find())
            System.out.println(password+" is valid");
        else
            System.out.println(password+" is not valid");
    }

    public static void main(String[] args)
    {
        UserRegistration urobj=new UserRegistration();
        
        //First name
        /*urobj.validName("Abc");
        urobj.validName("abc");
        urobj.validName("Ab");
        urobj.validName("Abcd");
        urobj.validName("Ab1");*/

        //Last name
        /*urobj.validName("ABCD");
        urobj.validName("123");
        urobj.validName("A1d");
        urobj.validName("Ab1c3");
        urobj.validName("Abd1");*/

        //Email
        /*urobj.validemail("abc.xyz@bl.co.in");
        urobj.validemail("abc@bl.co");
        urobj.validemail("abc@yahoo.com");
        urobj.validemail("abc-100@yahoo.com");
        urobj.validemail("abc.100@yahoo.com");
        urobj.validemail("abc111@abc.com");
        urobj.validemail("abc-100@abc.net");
        urobj.validemail("abc.100@abc.com.au");
        urobj.validemail("abc@1.com");
        urobj.validemail("abc@gmail.com.com");
        urobj.validemail("abc+100@gmail.com");
        //Inavlid email
        urobj.validemail("abc");
        urobj.validemail("abc@.com.my");
        urobj.validemail("abc123@gmail.a");
        urobj.validemail("abc123@.com");
        urobj.validemail("abc123@.com.com");
        urobj.validemail(".abc@abc.com");
        urobj.validemail("abc()*@gmail.com");
        urobj.validemail("abc@%*.com");
        urobj.validemail("abc..2002@gmail.com");
        urobj.validemail("abc.@gmail.com");
        urobj.validemail("abc@abc@gmail.com");
        urobj.validemail("abc@gmail.com.1a");
        urobj.validemail("abc@gmail.com.aa.au");*/

        //Mobile
        /*urobj.validmobile("91 9876543211");
        urobj.validmobile("919876543211");
        urobj.validmobile("91 98765 43211");
        urobj.validmobile("91 9876543210");
        urobj.validmobile("9876543210");
        urobj.validmobile("91 1987654321");
        urobj.validmobile("91 9234567890");*/

        //Password
        //minimum 8 characters 
        urobj.validpassword("abcd1234");
        urobj.validpassword("abcd@123");
        urobj.validpassword("1234567");
        urobj.validpassword("12345678");
        //one upper case
        urobj.validpassword("aBcd1234");
        urobj.validpassword("abcd@123T");
        //one numeric
        urobj.validpassword("abcdEFGHo");
        urobj.validpassword("adc@WERtp_");
        
    }
}