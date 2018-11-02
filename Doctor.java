

public class Doctor
{
    private String name;
    private String ppsNumber;
    private String doctorId;
    private double salary;
    private static double salaryIncrease;
    
    public Doctor(String nameIn, String ppsNumberIn, String doctorIdIn, double salaryIn)
    {
        name = nameIn;
        ppsNumber = ppsNumberIn;
        doctorId = doctorIdIn;
        salary = salaryIn;
    }
    
    public void setName(String nameIn)
    {
        name = nameIn;
    }
    
    public String getName()
    {
        return name;
    }
    
    public void setPpsNumber(String ppsNumberIn)
    {
        ppsNumber = ppsNumberIn;
    }
    
    public String getPpsNumber()
    {
        return ppsNumber;
    }
    
    public void setDoctorId(String doctorIdIn)
    {
        doctorId = doctorIdIn;
    }
    
    public String getDoctorId()
    {
        return doctorId;
    }
    
    public void setSalary(double salaryIn)
    {
        salary = salaryIn;
    }
    
    public double getSalary()
    {
        return salary;
    }
    
    public static void setSalaryIncrease(double salaryIncreaseIn)
    {
        salaryIncrease = salaryIncreaseIn;
    }
    
    public static double getSalaryIncrease()
    {
        return salaryIncrease;
    }
    
    public void salaryIncrease()
    {
        salary = salary + getSalaryIncrease();
    }
}
