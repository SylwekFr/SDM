package elearning.zpo.lab5;

public class AccountFactory{
    public AccountFactory() {}

    SavingsAccount createSavingsAccount(String id, String name, String surname)
    {
        return new SavingsAccount(id, name, surname);
    }

    CheckingAccount createCheckingAccount(String id, String name, String surname)
    {
        return new CheckingAccount(id, name, surname);
    }
}