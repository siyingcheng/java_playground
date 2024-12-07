package cn.simon.patters.behavioral.chainofresponsability;

public class AuthService {
    private Handler handler;

    public AuthService(Handler handler) {
        this.handler = handler;
    }

    public boolean login(String email, String password) {
        if (handler.handle(email, password)) {
            System.out.println("Authorization was successful.");
            // Do stuff for authorized user;
            return true;
        }
        return false;
    }
}
