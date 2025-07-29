package com.example.lap32;

import java.util.Date;

public abstract class Note {
    //Arttribute
    protected String title;
    protected String context;
    protected Date createdDate;

    //constructor
    public Note(String title, String context){
        this.title = title;
        this.context = context;
        this.createdDate = new Date();
    }
    //Method
    //get/setter fot title
    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title = title;

    }

    //getter/setter for createdDate

    //abstract method
    public abstract void display();

    public void getSummary(){
        System.out.println(title+":"+context+"("+createdDate+")");

    }

}
