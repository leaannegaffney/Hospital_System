
public class HospitalSystem
{
    public static void main(String args [])
    {
        System.out.println("Hospital System");
        System.out.println();
        
        System.out.print("How many doctors are to be entered in the system? ");
        int num = EasyScanner.nextInt();
        System.out.println();
        
        Doctor doctors [] = new Doctor [num];
        
        for(int i = 0; i < doctors.length; i++)
        {
            System.out.println("Entering doctor: " + (i+1));
            
            System.out.print("Enter doctor name: ");
            String name = EasyScanner.nextString();
            
            System.out.print("Enter doctor pps number: ");
            String ppsNum = EasyScanner.nextString();
            
            System.out.print("Enter doctor id: ");
            String id = EasyScanner.nextString();
            
            System.out.print("Enter doctor salary: ");
            double salary = EasyScanner.nextDouble();
            
            doctors [i] = new Doctor(name, ppsNum, id, salary);
            System.out.println();
        }
        
        System.out.println("Doctors Details");
        System.out.println();
        
        displayDetails(doctors);
        
        for(int i = 0; i < doctors.length; i++)
        {
            System.out.print("Please enter id for doctor " + (i+1) + ":");
            doctors[i].setDoctorId(EasyScanner.nextString());
            System.out.println();
        }
        
        System.out.println("Doctors Details After ID Update");
        System.out.println();
        
        displayDetails(doctors);
        
        Doctor.setSalaryIncrease(1000);
        for(int i = 0; i < doctors.length; i++)
        {
            doctors[i].salaryIncrease();
        }
        
        System.out.println("Doctors Details After Salary Update");
        System.out.println();
        
        displayDetails(doctors);
        
    }
    
    private static void displayDetails(Doctor doctors [])
    {
        for(int i = 0; i < doctors.length; i++)
        {
            System.out.println("Doctor " + (i+1)+ " Details");
            System.out.println("Doctor name: " + doctors[i].getName());
            System.out.println("Doctor pps number: " + doctors[i].getPpsNumber());
            System.out.println("Doctor id: " + doctors[i].getDoctorId());
            System.out.println("Doctor salary: " + doctors[i].getSalary());
            System.out.println();
        }
    }
}
