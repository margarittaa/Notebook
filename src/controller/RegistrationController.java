package controller;

import model.account.AccountData;

public class RegistrationController {

    public void registrationPage(){

    }

    public void registrationPage(AccountData accountData){
        this.checkForUniqueness(accountData.getLogin());
    }

    private boolean checkForUniqueness(String login){
        System.out.println("Проверка уникальности");
        return true;
    }
}
