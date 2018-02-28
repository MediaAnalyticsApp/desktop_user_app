package com.company;

public class Main {

    public static void main(String[] args) {
//        StartScreen startScreen = new StartScreen(600,600,"Интерфейс пользователя");
//        startScreen.setVisible(true);
        System.out.println(JsonExample.getJSON("http://54.64.85.75:3000/api/v1/sites.json"));
    }
}
