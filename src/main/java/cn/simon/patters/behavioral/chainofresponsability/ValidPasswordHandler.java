package cn.simon.patters.behavioral.chainofresponsability;

public class ValidPasswordHandler extends Handler {
    private Database database;

    public ValidPasswordHandler(Database database) {
        this.database = database;
    }

    @Override
    public boolean handle(String username, String password) {
        if (!database.isValidPassword(username, password)) {
            System.out.println("Invalid password for user " + username);
            return false;
        }
        return handleNext(username, password);
    }
}
