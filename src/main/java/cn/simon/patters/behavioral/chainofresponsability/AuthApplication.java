package cn.simon.patters.behavioral.chainofresponsability;

public class AuthApplication {
    public static void main(String[] args) {
        Database database = new Database();
        Handler handler = new UserExistsHandler(database)
                .setNextHandler(new ValidPasswordHandler(database))
                .setNextHandler(new RoleCheckHandler());
        AuthService service = new AuthService(handler);
//        service.login("admin_username", "admin_password");
        service.login("user_username", "user_password");
    }
}
