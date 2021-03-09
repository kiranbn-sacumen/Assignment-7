package com.company.springregisterlogin;
import com.hellokoding.auth.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public class UserRepository extends JpaRepository<User, Long> {
    public static void main(String[] args) {
        User findByUsername(String username);

    }
}
