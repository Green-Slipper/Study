package com.study.someprogect.servises;

import com.study.someprogect.DTO.UserDTO;
import com.study.someprogect.entity.User;
import com.study.someprogect.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;


    public Long addUser(UserDTO dto) {
        User user = new User();
        user.setName(dto.getName());

        userRepository.save(user);
        return user.getId();
    }


    public User getUser(String id) {
        return userRepository.findById(Long.valueOf(id)).get();
    }


    public void deleteUser(String id) {
        userRepository.deleteById(Long.valueOf(id));
    }
}
