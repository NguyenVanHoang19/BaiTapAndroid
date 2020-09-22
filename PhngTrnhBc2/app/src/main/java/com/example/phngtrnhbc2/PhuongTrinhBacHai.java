package com.example.phngtrnhbc2;

public class PhuongTrinhBacHai {
    private double a;
    private double b;
    private double c;

    public PhuongTrinhBacHai(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
    public String nghiem(){
        // ax2 + bx + c =0
        double delta = b*b - 4*a*c;
        if(a == 0){
            if(b == 0){
                return "Phương trình vô nghiệm";
            }
            else{
                return "Phương trình có 1 nghiệm: " + (-c/b);
            }
        }
        if(delta >  0){
            return "Phuơng trình có 2 nghiệm phân biệt là: " +"x1 = "+(b+Math.sqrt(delta))/(2*a)+ "x2= "+(-b+Math.sqrt(delta))/(2*a);
        }
        else if(delta  == 0){
            return "Phương trình có nghiệm kép là" +"x1=x2: " +(-b/(2*a));
        }
        else {
            return "Phương trình vô nghiệm";
        }
    }
}
