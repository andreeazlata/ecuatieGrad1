import java.util.Scanner;
public class ClientEcGrad1 {
public static double citReal(String sir){
    System.out.print(sir);
    try{
        Scanner s = new Scanner(System.in);
        double d = s.nextDouble(); //analizeaza si converteste in nr real
        return d;
    }
    catch (Exception exp){
        System.out.println("Ai gresit, da numar");
        return citReal(sir);
    }
}
    public static long citLong(String sir){
        System.out.print(sir);
        try{
            Scanner s = new Scanner(System.in);
            long L = s.nextLong(); //analizeaza si converteste in nr real
            return L;
        }
        catch (Exception exp){
            System.out.println("Ai gresit, da numar INTREG");
            return citLong(sir);
        }
    }
    public static void afisare1(ecGrad1 e){
        if(e.getA()!=0){
            if(e.getA()!=1.0) System.out.print(e.getA()+"*X");
            else System.out.print("X");
        }
        else
            System.out.print("0 *X");
        if(e.getB()<0) System.out.print(e.getB()+"=0");
        else System.out.print("+"+e.getB()+"=0");


    }
public static int afisMeniu(){
    System.out.println("\n1.Introducere coeficient lui X");
    System.out.println("2.Introducere termen liber b");
    System.out.println("3.Rezolvare ecuatie");
    System.out.println("0.Terminare program");
    return (int) citLong("Ce optiune alegi:");
}
    public static void main(String[] args) {
    double a=0.0;
    double b=0.0;
    ecGrad1 ecuatie = new ecGrad1(a,b);
    int option = afisMeniu();
    while (option!=0){
        switch (option){
            case 1: a=citReal("a=");
            ecuatie.setA(a);
                break;
            case 2: b=citReal("b=");
            ecuatie.setB(b);
                break;
            case 3:afisare1(ecuatie);
            ecuatie.rezolva1();
                break;
            default:
                System.out.print("Atentie, da optiune valida");
        }
        option = afisMeniu();
    }
    System.out.print("Program terminat");

    }
}