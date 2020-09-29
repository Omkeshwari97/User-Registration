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
        urobj.validName("ABCD");
        urobj.validName("123");
        urobj.validName("A1d");
        urobj.validName("Ab1c3");
        urobj.validName("Abd1");
    }
}