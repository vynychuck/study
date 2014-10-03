package edu.vinni.study;

/**
 * Created with IntelliJ IDEA.
 * User: serghii
 * Date: 23.09.14
 * Time: 16:09
 * To change this template use File | Settings | File Templates.
 */
public class Goal1 {                  // це завдання 1.4 (перша лаба, четвертий таск)
    public static void main(String[] args) {
        if (args.length !=3){
            throw new IllegalArgumentException("More than 3 input sources");
        }
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        if (a >= b && b >=c) {
            a = a * 2;
            b = b * 2;
            c = c * 2;
        }
        else {
            a += b;
            b = a - b;
            a -= b;
        }
        System.out.println("Esli A >= B >= C to A = " + a + " B = " + b + " C = " + c);
    }
}
