package com.example.backend.TimeTableSlot.Service;

import com.example.backend.Reservation.Model.Reservation;
import com.example.backend.Reservation.Service.ReservationService;
import com.example.backend.TimeTableSlot.Model.TimeTableSlot;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Optional;

/**
 * Nicolas, Ikke Færdig
 */
@Service
public class TimeTableSlotService {

    private final CrudRepository<TimeTableSlot, Long> repository;
    private final ReservationService reservationService; //1310 2022 hans: added this service for datevalidation purposes


    public TimeTableSlotService(CrudRepository<TimeTableSlot, Long> repository, ReservationService reservationService){
        this.repository = repository;
        this.reservationService = reservationService; //1310 2022 hans: i added res-sevice beacuse the date validation needs the list of all of our reservations
        //in the Create timetableslot endpoint
    }

    public Iterable<TimeTableSlot> findAll(){
        return repository.findAll();
    }

    public Optional<TimeTableSlot> find(Long id){
        return repository.findById(id);
    }

//samuel
    public TimeTableSlot create(TimeTableSlot timeTableSlot){
        System.out.println("start of TTS create");
        //ReservationValidator validator = new ReservationValidator();
        //String convertedDate = validator.convertFromStrToDate(timeTableSlot.getDateOfTimeTableSlot()).toString();
        //timeTableSlot.setDateOfTimeTableSlot(convertedDate);
        reservationTimeSlotValidationForAvailability(timeTableSlot);

        return repository.save(timeTableSlot);
    }

    public TimeTableSlot update(Long id, TimeTableSlot timeTableSlot){
        return repository.save(timeTableSlot);
    }

    public TimeTableSlot delete(long id){
        repository.deleteById(id);
        return null;
    }

    //1310 2022 hans: THIS class (reservationTimeSlot...) is supposed to take the new TTS and compare it to existing reservations,
    //so we can validate that it doesnt conflict with existing reservations. right now it just sorts a list of the
    //reservations with the same day as the TTS you give it. it SHOULD compare the time of the new TTS to the time of
    // the old reservations, so they dont conflict.

    public boolean reservationTimeSlotValidationForAvailability(TimeTableSlot tts){
        System.out.println("start of rservations");
        //1310 2022 hans: jeg skal bruge hele listen over vores reservationer
        Iterable<Reservation> listOfAllReservationsForValidation = reservationService.findAll();
        System.out.println("this is the list:  " + listOfAllReservationsForValidation);
        String dateOfCurrentTimeTableSlot = tts.getDateOfTimeTableSlot().substring(0,10);
        System.out.println("this is the line 61 of this:  " + dateOfCurrentTimeTableSlot);//1310 2022 hans: get the date of the current
        //reservation, so we can prune the list of all reservations, since we only need to compare the reservations
        //of the CURRENT day, for validation purposes. calls substring to only get the yyyy-mm/dd
        ArrayList<Reservation> prunedListOfReservationsByDate = new ArrayList<>();
        for (Reservation i : listOfAllReservationsForValidation){
            System.out.println("in FOR: "+ i.getTimeTableSlot().getDateOfTimeTableSlot());
            if (i.getTimeTableSlot().getDateOfTimeTableSlot().substring(0,10).equals(dateOfCurrentTimeTableSlot)){
                prunedListOfReservationsByDate.add(i);
                System.out.println("this is the:  " + i);
            }
            System.out.println("this is the pruned list:  " + prunedListOfReservationsByDate);
        }
        tts.getActivity().getTotalTimeOfActivity();
        return true;
    }

}
