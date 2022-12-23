
public class Fixed extends Employee {

    double slr;
    public Fixed(String name, String sname, int id, double slr) 
    {
        super(name, sname, id);
        this.slr = slr;
    }

    public double calculateSalary() 
    {
        return this.slr;
    }
}
