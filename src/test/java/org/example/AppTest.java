package org.example;

import org.junit.Assert;
import org.junit.Test;

public class AppTest {

    @Test
    public void shouldWorkOnDevelopmentModeAndJar() throws Exception {
        String result = new App().load("/root-resource.txt");
        Assert.assertEquals("i am root resource\n", result);
    }

    @Test
    public void shouldWorkOnDevelopmentModeAndFailInJar() throws Exception {
        String result = new App().load("../another-classpath-resource.txt");
        Assert.assertEquals("i am another classpath resource", result);
    }

    @Test
    public void shouldWorkAlways() throws Exception {
        String result = new App().load("classpath-resource.txt");
        Assert.assertEquals("i am a resource somewhere in classpath", result);
    }
}
