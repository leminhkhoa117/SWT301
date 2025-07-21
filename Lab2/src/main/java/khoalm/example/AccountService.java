package khoalm.example;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

public class AccountService {

    private static final Pattern EMAIL_PATTERN =
            Pattern.compile("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$");

    private Map<String, String> registeredUsers = new HashMap<>();

    public boolean registerAccount(String username, String password, String email) {
        if (username == null || username.isEmpty()) {
            return false;
        }
        if (password == null || password.length() <= 6) {
            return false;
        }
        if (!isValidEmail(email)) {
            return false;
        }
        return true;
    }

    public boolean isValidEmail(String email) {
        if (email == null || email.isEmpty()) {
            return false;
        }
        return EMAIL_PATTERN.matcher(email).matches();
    }
    public boolean login(String username, String password) {
        if (username == null || username.isEmpty() || password == null) {
            return false;
        }
        String storedPassword = registeredUsers.get(username);
        return password.equals(storedPassword);
    }
}
