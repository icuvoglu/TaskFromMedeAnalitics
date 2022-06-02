package com.ua.learning.project.implementation.submit_registration;

import com.ua.learning.project.implementation.BaseTest;
import com.ua.learning.project.model.Page;
import com.ua.learning.project.model.entity.RegistrationForm;
import com.ua.learning.project.model.menu.AbcMenu;
import com.ua.learning.project.model.menu.CDIMenu;
import com.ua.learning.project.model.menu.MainMenu;
import com.ua.learning.project.model.pages.LoginPage;
import org.testng.annotations.Test;

public class SubmitRegistrationTest extends BaseTest{

    @Test
    public void loginSystem(){
        LoginPage loginPage = new LoginPage("https://www.google.com.ua/");
        loginPage.openWindow();

    }

    @Test
    public void checkThatAllMenuSelected(){
        Page page = new AbcMenu();
        page.selectMenu();
        page=new CDIMenu();
        page.selectMenu();
        page=new MainMenu();
        page.selectMenu();
    }

    @Test
    public void checkThatOnlyAbcmenuCalled(){
        Page page = new AbcMenu();
        page.selectMenu();
    }

    @Test
    public void printRegistrationForm(){
        RegistrationForm register = new RegistrationForm();
        register.setFirstName("Ibrahim");
        register.setLastName("Cuvoglu");
        register.setBirthday("13/07/1986");
        register.setAge(36);

        System.out.println(register.toString());
    }

    @Test
    public void printHashCode(){
        RegistrationForm register = new RegistrationForm("Petrov");
        register.hashCode();
    }
}
