package com.example.backend.Acticity.Service;

import com.example.backend.Acticity.Model.Activity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

/**
 * Nicolas, Ikke Færdigt
 */
@Service
public class ActivityService {

    private final CrudRepository<Activity, Long> repository;

    public ActivityService(CrudRepository<Activity,Long> repository){
        this.repository = repository;
    }

    public Iterable<Activity> findAll(){
        return repository.findAll();
    }
}
