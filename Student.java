/**
 * Write a description of class Student here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Student
{
    private String name;
    public Address address;
    
    /**
     * Constructor for objects of class Student
     */
    public Student()
    {
        this.name = "unknown";
        this.address = new Address();
    }

    public void setName(String n)
    {
        this.name = n;
    }
    
    public void setAddress(Address a)
    {
        this.address = a;
    }
    
    public String getName()
    {
        return name;
    }
    
    public Address getAddress()
    {
        return address;
    }
}
