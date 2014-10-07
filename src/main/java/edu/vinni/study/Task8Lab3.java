package edu.vinni.study;

/**
 * Created by serghii on 07.10.14.
 */
public class Task8Lab3 {
    public static int getProduct(Integer[] list){
        int i = 0;
        int product = 1;
        while (i != list.length) {
            if(list[i] % 3 == 0){
                product *= list[i];
            }
            i++;
        }
        return product;
    }
}
