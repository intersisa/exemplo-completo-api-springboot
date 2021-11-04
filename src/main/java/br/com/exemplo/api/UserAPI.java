package br.com.exemplo.api;

import br.com.exemplo.dto.UserDTO;
import br.com.exemplo.servicos.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping(value = "/api/user")
public class UserAPI {

    @Autowired
    private UserService service;

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public ResponseEntity<UserDTO> save(@RequestBody UserDTO object) {
        try {
            return new ResponseEntity<UserDTO>(this.service.saveUser(object), HttpStatus.CREATED);
        }catch (Exception e) {
            System.out.println(e);
            return ResponseEntity.status(500).build();
        }
    }
}
