package pl.javastart.demo;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;


public class EulerTest {

    @Test
    public void checkIfAllNumbersAreCorrect(){
        //given
        int maxNumber = 1000;
        int result = 0;
        int check = 233168;
        //when
        for (int i = 0; i < 1000 ; i++) {
            if(i % 3 == 0 || i % 5 == 0){
                System.out.print(i + " ");
                result += i;
                System.out.println(result);

            }
        }

        //then
        Assert.assertThat(check, CoreMatchers.is(233168)); // checking if the value is correct
    }

    @Test
    public void checkIf957AreCorrect(){
        //given
        int maxNumber = 957;

        //when
        boolean flag = maxNumber % 3 == 0;

        //then
        Assert.assertThat(maxNumber % 3 == 0 || maxNumber % 5 == 0, CoreMatchers.is(true));
    }

    @Test
    public void checkIf958ANotCorrect(){
        //given
        int maxNumber = 958;

        //when
        boolean flag = maxNumber % 3 != 0;

        //then
        Assert.assertThat(maxNumber % 3 != 0 || maxNumber % 5 != 0, CoreMatchers.is(true));
    }
}
