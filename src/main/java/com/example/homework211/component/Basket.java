package com.example.homework211.component;


import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Component
@SessionScope
public class Basket {

    private final List<com.example.homework211.model.Items> Items;

    public Basket() {
        this.Items = new ArrayList<>();
    }

    public void add(List<com.example.homework211.model.Items> Items){
        this.Items.addAll(Items);
    }
    public List<com.example.homework211.model.Items> get(){
        return Collections.unmodifiableList(Items);
    }
}
