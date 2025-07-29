package com.example.lap32;

public class TextNote extends Note {
    private String textContent;

    public TextNote(String title ,String context) {
        super(title, context);
    }

    public String getTextContent(){
        return textContent;
    }

    public void setTextContent(String content){
        if (!content.isEmpty()){
            this.textContent = content;
        }
    }

    @Override
    public void display() {
        System.out.println(title+":"+context+"("+createdDate+")");
    }


}
