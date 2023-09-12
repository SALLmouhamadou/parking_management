package com.parking_managment.restController;

import com.parking_managment.entity.Car;
import com.parking_managment.entity.Card;
import com.parking_managment.entity.Person;
import com.parking_managment.service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CardRestController {
    @Autowired
    CardService cardService;

    @PostMapping("/api/add/card")
    public String addCar(@RequestBody Card card, @RequestBody Person person, @RequestBody Car car){
        List<Car>  myCars = new ArrayList<Car>();
        myCars.add(car);
        person.setCars(myCars);
        card.setPerson(person);
        cardService.addCard(card);
        return "Votre carte de parking à bien été enregistrer";
    }

}
