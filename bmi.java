package BMI;

public class bmi {
    double bmi;
    
    void setBMI(double bb, double tb)
    {
        bmi=bb/(tb*tb);
    }
    
    double getBmi()
    {
        if (bmi < 18)
        {
            System.out.println("Underweight");
        }
        
        else if (bmi > 18 && bmi <=24)
        {
            System.out.println("Normal");
        }
        
        else if (bmi > 24 && bmi <=29)
        {
            System.out.println("Overweight");
        }
        
        else if (bmi > 29)
        {
            System.out.println("Obesitas");
        }
    return bmi;
    }
}
