package ss4_lop_va_doi_tuong_trong_java.bai_tap;

import java.util.Scanner;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;
    private double delta;
    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.delta = this.b * this.b - 4 * this.a * this.c;
    }
    public double getA() {
        return a;
    }
    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }
    public double getDelta() {
        return delta;
    }
    public double getNghiem1() {
        return (-this.b + Math.sqrt(delta)) / 2 / this.a;
    }
    public double getNghiem2() {
        return (-this.b - Math.sqrt(delta)) / 2 / this.a;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số a : ");
        double a = scanner.nextDouble();
        System.out.print("Nhập số b : ");
        double b = scanner.nextDouble();
        System.out.print("Nhập số c : ");
        double c = scanner.nextDouble();
        QuadraticEquation n = new QuadraticEquation(a, b, c);
        double delta = n.getDelta();
        if (delta > 0) {
            System.out.println("Phương trình có 2 nghiệm : ");
            System.out.printf("x1 = %.2f, x2 = %.2f", n.getNghiem1(), n.getNghiem2());
        } else if (delta == 0) {
            System.out.printf("x=" + n.getNghiem1());
        } else {
            System.out.println("Phương trình vô nghiệm !");
        }
    }
}
