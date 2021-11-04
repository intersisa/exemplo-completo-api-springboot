package br.com.exemplo.servicos;

import br.com.exemplo.dto.UserDTO;
import br.com.exemplo.entidades.User;
import br.com.exemplo.repositorios.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public UserDTO saveUser(UserDTO object) {
        User user = this.userRepository.save(new User(object.getId(), object.getName(), object.getEmail(), new BCryptPasswordEncoder().encode(object.getPassword())));
        return new UserDTO(user.getId(), user.getName(), user.getEmail(), user.getPassword());
    }
}
