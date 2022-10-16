package com.example.homework211.component;


import com.example.homework211.model.items;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Component
@SessionScope
public class Basket {

    private final List<items> items;

    public Basket() {
        this.items = new ArrayList<>();
    }

    public void add(List<com.example.homework211.model.items> items){
        this.items.addAll(items);
    }
    public List<items> get(){
        return Collections.unmodifiableList(items);
    }
}
