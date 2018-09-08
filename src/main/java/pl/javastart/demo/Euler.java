package pl.javastart.demo;

import org.springframework.stereotype.Component;

@Component
public class Euler {

    public int calculation(int maxNumber) {

        int result = 0;

        for (int i = 0; i < maxNumber; i++) {
            if (i % 3 == 0 || i % 5 == 0){
                result += i;
            }
        }

        return result; // finding sum of multiples of 3 or 5 in limit of 1000;
    }

}
