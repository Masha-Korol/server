package com.example.server;

import org.springframework.stereotype.Service;

@Service
public class SomeService {

    public Model method(){
        return new Model(1, "masha");
    }
}
