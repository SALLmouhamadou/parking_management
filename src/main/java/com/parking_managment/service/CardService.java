package com.parking_managment.service;

import com.parking_managment.entity.Card;

import java.util.List;

public interface CardService {
    public Card addCard(Card card);
    public List<Card> getAllCards();
}
