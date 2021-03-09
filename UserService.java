package com.company.springregisterlogin;
import com.company.springregisterlogin.User;

public interface UserService {
    public static void main(String[] args) {
        void save(User user);

        User findByUsername(String username);

    }
}
