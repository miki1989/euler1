package pl.javastart.demo;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;


public class EulerTest {

    private Euler euler;

    @Before
    public void init(){
        euler = new Euler();
    }

    @Test
    public void return8from6(){
        //given
        int check = 6;

        //when
        int result = euler.calculation(6);
        //then
        Assert.assertThat(result, CoreMatchers.is(8)); // checking if the value is correct
    }

    @Test
    public void return14from9(){
        //given
        int check = 9;

        //when
        int result = euler.calculation(9);

        //then
        Assert.assertThat(result, CoreMatchers.is(14));
    }

    @Test
    public void return45from15(){
        //given
        int check = 15;

        //when
        int result = euler.calculation(15);

        //then
        Assert.assertThat(result, CoreMatchers.is(45));
    }
}
