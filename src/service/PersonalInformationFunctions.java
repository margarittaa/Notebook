package service;

public interface PersonalInformationFunctions {
    void editLogin(String newLogin);

    void editPassword(String newPassword);

    void editEmail(String newEmail);

    void editName(String newName);

    void editPhone(String newPhone);

    void save();
}
