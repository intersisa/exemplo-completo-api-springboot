package br.com.exemplo.servicos;

import br.com.exemplo.dto.PeopleDto;
import br.com.exemplo.entidades.People;
import br.com.exemplo.repositorios.PeopleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PeopleService {

    @Autowired
    private PeopleRepository peopleRepository;

    public PeopleDto savePeople(PeopleDto object) {
        People people = this.peopleRepository.save(new People(null, object.getName(), object.getEmail(), object.getPassword()));
        return new PeopleDto(people.getName(), people.getEmail(), people.getPassword());
    }
}
