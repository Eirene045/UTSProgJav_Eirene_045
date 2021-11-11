package eirene_045_uts;

import java.util.Scanner;
public class Eirene_045_UTS {

    public static void main(String[] args) {
        ModuleUtama();
}
    public static void ModuleUtama(){
        Scanner s = new Scanner(System.in);
        System.out.println("\n[pilihan]");
        System.out.println("1. penjumlahan");
        System.out.println("2. pengurangan");
        System.out.println("3. perkalian");
        System.out.println("4. pembagian");
        System.out.print("Masukan Pilihan Anda : ");
        int choise = s.nextInt();
        switch(choise){
            case 1: ModuleTambah();break;
            case 2: ModuleKurang();break;
            case 3: ModuleKali();break;
            case 4: ModuleBagi();break;
        }
    }

    public static void ModuleTambah(){
        Scanner s = new Scanner(System.in);
        System.out.println("\n[Penjumlahan]");
        System.out.print("Masukan Nilai Pertama :");
        Double num1 = s.nextDouble();
        System.out.print("Masukan Nilai Kedua :");
        Double num2 = s.nextDouble ();
        System.out.println("Maka Nilai Dari " + String.valueOf(num1) + "+" + String.valueOf(num2) + "adalah" + (num1 + num2));

        ModuleUtama();
    }

    public static void ModuleKurang(){
        Scanner s = new Scanner(System.in);
        System.out.println("\n[Pengurangan]");
        System.out.print("Masukan Nilai Pertama :");
        Double num1 = s.nextDouble();
        System.out.print("Masukan Nilai Kedua :");
        Double num2 = s.nextDouble ();
        System.out.println("Maka Nilai Dari " + String.valueOf(num1) + "-" + String.valueOf(num2) + "adalah" + (num1 - num2));
   
        ModuleUtama();
    }

    public static void ModuleKali(){
        Scanner s = new Scanner(System.in);
        System.out.println("\n[Perkalian]");
        System.out.print("Masukan Nilai Pertama :");
        Double num1 = s.nextDouble();
        System.out.print("Masukan Nilai Kedua :");
        Double num2 = s.nextDouble ();
        System.out.println("Maka Nilai Dari " + String.valueOf(num1) + "*" + String.valueOf(num2) + "adalah" + (num1 * num2));

        ModuleUtama();
    }

    public static void ModuleBagi(){
        Scanner s = new Scanner(System.in);
        System.out.println("\n[Pembagian]");
        System.out.print("Masukan Nilai Pertama :");
        Double num1 = s.nextDouble();
        System.out.print("Masukan Nilai Kedua :");
        Double num2 = s.nextDouble ();
        System.out.println("Maka Nilai Dari " + String.valueOf(num1) + "/" + String.valueOf(num2) + "adalah" + (num1 / num2));
       
        ModuleUtama();
    }
}
