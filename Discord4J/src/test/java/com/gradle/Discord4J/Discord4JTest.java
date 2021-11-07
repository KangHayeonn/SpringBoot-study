package com.gradle.Discord4J;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Discord4JTest {
    private Assertions Assert;

    @Test
    public void FizzBuzzNormalNumbers() {

        Discord4J fb = new Discord4J();
        Assert.assertEquals("1", fb.convert(1));
        Assert.assertEquals("2", fb.convert(2));
    }

    @Test
    public void FizzBuzzThreeNumbers() {

        Discord4J fb = new Discord4J();
        Assert.assertEquals("Fizz", fb.convert(3));
    }

    @Test
    public void FizzBuzzFiveNumbers() {

        Discord4J fb = new Discord4J();
        Assert.assertEquals("Buzz", fb.convert(5));
    }

    @Test
    public void FizzBuzzThreeAndFiveNumbers() {

        Discord4J fb = new Discord4J();
        Assert.assertEquals("Buzz", fb.convert(5));
    }
}