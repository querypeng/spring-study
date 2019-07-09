package com.pengfeng.property;


public class HelloWorldService {

    private String text;

    private String lovely;

    public void helloWorld(){
        System.out.println(text +" "+ lovely);
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public String getLovely() {
        return lovely;
    }

    public void setLovely(String lovely) {
        this.lovely = lovely;
    }
}
