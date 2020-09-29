import java.util.*;
import java.util.regex.*;

public class UserRegistration
{
    public void validFirstName(String fname)
    {
        String regex="^[A-Z]{1}[a-zA-z]{2,}";
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher=pattern.matcher(fname);

        if(matcher.find())
            System.out.println(fname+" is valid");
        else
            System.out.println(fname+" is not valid");
    }

    public static void main(String[] args)
    {
        UserRegistration urobj=new UserRegistration();
        
        //First name
        urobj.validFirstName("Abc");
        urobj.validFirstName("abc");
        urobj.validFirstName("Ab");
        urobj.validFirstName("Abcd");
        urobj.validFirstName("Ab1");
    }
}