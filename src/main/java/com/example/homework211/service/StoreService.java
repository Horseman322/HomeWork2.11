package com.example.homework211.service;

import com.example.homework211.component.Basket;

import com.example.homework211.model.items;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
public class StoreService {

    private final Basket basket;
    private final Map<Integer, items> items;

    public StoreService(Basket basket) {
        this.basket = basket;
        this.items = Map.of(
                1,new items(1, "Книга", 60),
                1,new items(2, "Зажигалка", 10),
                1,new items(3, "Монитор", 5000)
        );
    }

    public void add(List<Integer> ids) {
        basket.add (
        ids.stream()
                .map(items::get)
                .filter(Objects::nonNull)
                .collect(Collectors.toList())
        );
    }

    public List<items> get() {
        return basket.get();
    }
}
