package edu.vinni.study;

/**
 * Created by serghii on 30.09.14.
 */
public class Task5Lab1 {
    public static void main(String args[]) {
        double x = Double.parseDouble(args[0]), y = Double.parseDouble(args[1]);
        int a = 0,b = 0, r = Integer.parseInt(args[2]);
        double radius, temp;
        if (x != 0 && y != 0) {
            temp = (x * x) + (y * y);
        temp = r * Math.sqrt(2) / 2;
            radius = r * Math.sqrt(2);
        System.out.println("Точка з кординатами х, у є точкою перетину діагоналей квадрата зі стороною r, якщо наступне рівняння справджується " + (temp = radius / 2));
        }
    }
}
