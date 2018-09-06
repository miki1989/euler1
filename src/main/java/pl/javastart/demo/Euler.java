package pl.javastart.demo;

import org.springframework.stereotype.Component;

@Component
public class Euler {

    public static void main(String[] args) {

        int maxNumber = 1000;
        int result = 0;

        for (int i = 0; i < maxNumber; i++) {
            if (i % 3 == 0 || i % 5 == 0){
                result += i;
            }
        }
        System.out.println(result); // finding sum of multiples of 3 or 5 in limit of 1000;
    }

}
