package com.example.phngtrnhbc2;

public class PhuongTrinhBacNhat {
    private double a;
    private double b;

    public PhuongTrinhBacNhat(double a, double b) {
        this.a = a;
        this.b = b;
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

    public String nghiem() {
    String st = "";
    if (a == 0) {
        if (b == 0) {
            st += "Phương trình vô số nghiệm!";
        } else
            st += "Phương trình vô nghiệm!";
    } else {
        st += "Phương trình có nghiệm là: " + (-b*1.0 / a);
    }
    return st;
}
}