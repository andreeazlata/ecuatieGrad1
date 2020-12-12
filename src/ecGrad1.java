public class ecGrad1 { //aX + b=0, unde a si b sunt reale
    private double a;
    private double b;

    public double getA() {  //returnare coeficient a
        return a;
    }

    public double getB() {
        return b;
    }

    public void setA(double a) {  //setare coef a
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public ecGrad1 (double a, double b) { //constructor de initializare
        this.a=a;
        this.b=b;


    }

public void rezolva1(){
        if(a!=0.0){
            if(b!=0.0) System.out.println("Solutia unica este "+ -b/a);
            else       System.out.println("Solutia este 0");
        }
        else
            if(b!=0.0) System.out.println("Ecuatia nu are solutii");
            else       System.out.println("Ecuatia are o infinitate de solutii");
}
}
