package com.example.lap32;

import java.util.List;

public class CheckListNote extends Note {

    private List<String> items;

    public CheckListNote(String title, String context, List<String> items) {
        super(title, context);
        this.items = items;
    }


    @Override
    public void display() {
        System.out.println(title+":("+createdDate+")");
        System.out.println(items);
    }
}

