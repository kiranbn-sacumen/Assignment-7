package com.company.springregisterlogin;
import com.company.springregisterlogin.User;
import com.company.springregisterlogin.RoleRepository;
import com.company.springregisterlogin.UserRepository;
public class UserServiceImpl implements UserService {
    public static void main(String[] args) {
        @Autowired
        private UserRepository userRepository;
        @Autowired
        private RoleRepository roleRepository;
        @Autowired
        private BCryptPasswordEncoder bCryptPasswordEncoder;

        @Override
        public void save(User user) {
            user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
            user.setRoles(new HashSet<>(roleRepository.findAll()));
            userRepository.save(user);
        }

        @Override
        public User findByUsername(String username) {
            return userRepository.findByUsername(username);
        }

    }
}
