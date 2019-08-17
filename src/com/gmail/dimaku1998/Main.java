/*4) Треугольник существует только тогда, когда сумма любых двух его
        сторон больше третьей. Дано: a, b, c – стороны предполагаемого
        треугольника. Напишите программу которая укажет существует такой
        треугольник или нет*/
package com.gmail.dimaku1998;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side x = ");
        double x = sc.nextDouble();
        System.out.print("Enter side y = ");
        double y = sc.nextDouble();
        System.out.print("Enter side z = ");
        double z = sc.nextDouble();
        String result = x + y > z && x + z > y && y + z > x ? "Yes" : "No";
        System.out.print("Is there a triangle? Result = " + result);
    }
}
