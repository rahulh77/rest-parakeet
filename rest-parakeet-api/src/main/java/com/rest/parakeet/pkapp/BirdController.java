package com.rest.parakeet.pkapp;
import com.rest.parakeet.pkapp.models.Bird;
import com.rest.parakeet.pkapp.repositories.BirdRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


import java.util.List;

@RestController
@RequestMapping("/api/bird")
public class BirdController {
    @Autowired
    private BirdRepository repository;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List getAllBirds(){
        return repository.findAll();
    }

    @RequestMapping(value="/{id}", method = RequestMethod.GET)
    public Bird getBirdById(@PathVariable("id") ObjectId id){
        Bird bird = repository.findBy_id(id);
        return bird;
    }

    @PostMapping(consumes = "application/json", produces = "application/json")
    public Bird createBird(@RequestBody Bird bird){
        bird.set_id(ObjectId.get());
        Bird newbird = repository.insert(bird);
        return newbird;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public  Bird modifyBirdById(@PathVariable("id") ObjectId _id, @Valid @RequestBody Bird bird){
        bird.set_id(_id);
        Bird updatedBird = repository.save(bird);
        return updatedBird;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteBird(@PathVariable("id") ObjectId _id){
        Bird birdToBeDeleted = repository.findBy_id(_id);
        repository.delete(birdToBeDeleted);
    }

}
