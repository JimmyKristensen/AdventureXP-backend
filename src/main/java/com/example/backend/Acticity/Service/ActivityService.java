package com.example.backend.Acticity.Service;

import com.example.backend.Acticity.Model.Activity;
import com.example.backend.Reservation.Model.Reservation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

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

    public Optional<Activity> find(Long id){
        return repository.findById(id);
    }

    public Activity create(Activity activity){
        return repository.save(activity);
    }

    public Activity update(Long id, Activity activity){
        return repository.save(activity);
    }

    public Activity delete(long id){
        repository.deleteById(id);
        return null;
    }
}
