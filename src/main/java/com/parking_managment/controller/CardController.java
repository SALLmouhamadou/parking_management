package com.parking_managment.controller;

import com.parking_managment.entity.Car;
import com.parking_managment.entity.Card;
import com.parking_managment.entity.Person;
import com.parking_managment.service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CardController {
    @Autowired
    CardService cardService;

    @PostMapping("/card/add")
    public String addCar(@RequestAttribute Card card, @RequestAttribute Person person, @RequestAttribute Car car){
        List<Car>  myCars = new ArrayList<Car>();
        myCars.add(car);
        person.setCars(myCars);
        card.setPerson(person);
        cardService.addCard(card);
        return "card";
    }
    @GetMapping("/card/save")
    public ModelAndView showAddCard(ModelAndView mav){
        mav.addObject("card", new Card());
        mav.setViewName("card");
        return mav;
    }
}
