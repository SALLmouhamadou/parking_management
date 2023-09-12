package com.parking_managment.service;

import com.parking_managment.entity.Card;
import com.parking_managment.repository.CardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CardServiceImpl implements CardService{
    @Autowired
    CardRepository cardRepository;
    @Override
    public Card addCard(Card card) {
        return cardRepository.save(card);
    }

    @Override
    public List<Card> getAllCards() {
        return (List<Card>) cardRepository.findAll();
    }
}
