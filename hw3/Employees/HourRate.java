
public class HourRate extends Employee {
    double perHour;

    public HourRate(String name, String sname, int id, double perHour) 
    {
        super(name, sname, id);
        this.perHour = perHour;
    }

    public double calculateSlr() 
    {
        return 166.4 * this.perHour;
    }

}
