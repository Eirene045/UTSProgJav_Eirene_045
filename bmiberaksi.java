package BMI;

public class bmiberaksi {
    public static void main(String[]args)
    {
        bmi bmiKu = new bmi();
        
        bmiKu.setBMI(69, 1.55);
        System.out.println("BMI Saya : " + Math.round(bmiKu.getBmi()));
        System.out.println();
        
        bmi bmiDia = new bmi();
        
        bmiDia.setBMI(55, 1.55);
        System.out.println("BMI Dia : " + Math.round(bmiDia.getBmi()));
        System.out.println();
    }
}
