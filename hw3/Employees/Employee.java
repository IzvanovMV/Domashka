
public abstract class Employee {
    String name;
    String sname;
    int id;

    public Employee(String name, String sname, int id) 
    {
        this.name = name;
        this.sname = sname;
        this.id = id;
    }

    public abstract double calculateSalary();
    public String getName()
    {
        return this.name;
    }
}
