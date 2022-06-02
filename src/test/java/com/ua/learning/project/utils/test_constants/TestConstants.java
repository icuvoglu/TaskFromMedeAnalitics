package com.ua.learning.project.utils.test_constants;

import com.ua.learning.project.implementation.BaseTest;
import com.ua.learning.project.model.entity.RegistrationForm;
import org.testng.annotations.Test;

public class TestConstants extends BaseTest {
    @Test
    public void printRegistrationForm() {
        RegistrationForm register = new RegistrationForm("Ibrahim", "Cuvoglu", "13/07/1986", 36);

        System.out.println(register.toString());
    }
}
