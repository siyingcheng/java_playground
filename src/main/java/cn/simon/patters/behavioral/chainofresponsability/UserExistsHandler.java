package cn.simon.patters.behavioral.chainofresponsability;

public class UserExistsHandler extends Handler {
    private Database database;

    public UserExistsHandler(Database database) {
        this.database = database;
    }

    @Override
    public boolean handle(String username, String password) {
        if (!database.isValidUser(username)) {
            System.out.println("User does not exist");
            return false;
        }
        return handleNext(username, password);
    }
}
