package br.com.exemplo.api;

import br.com.exemplo.dto.PeopleDto;
import br.com.exemplo.servicos.PeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import javax.validation.Valid;

@RestController
@RequestMapping(value = "/api/people")
public class PeopleAPI {

    @Autowired
    private PeopleService service;

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public ResponseEntity<PeopleDto> save(@Valid @RequestBody PeopleDto object) {
        try {
            System.out.println(object.getEmail());
            return new ResponseEntity<PeopleDto>(this.service.savePeople(object), HttpStatus.CREATED);
        }catch (Exception e) {
            System.out.println(e);
            return ResponseEntity.status(500).build();
        }
    }
}
