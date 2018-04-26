
/**
 * Write a description of class Address here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Address
{
    private String street;
    private String number;
    private String city;
    private String postCode;
    
    public Address()
    {
        
    }
    
    public Address(String s, String n, String c, String pc)
    {
        street = s;
        number = n;
        city = c;
        postCode = pc;
    }
}
