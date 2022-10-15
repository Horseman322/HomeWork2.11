package com.example.homework211.component;


import com.example.homework211.model.Item;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Component
@SessionScope
public class Basket {

    private final List<Item> Items;

    public Basket() {
        this.Items = new ArrayList<>();
    }

    public void add(List<Item> Items){
        this.Items.addAll(Items);
    }
    public List<Item> get(){
        return Collections.unmodifiableList(Items);
    }
}
