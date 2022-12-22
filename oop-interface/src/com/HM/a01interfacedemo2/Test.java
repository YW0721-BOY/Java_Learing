package com.HM.a01interfacedemo2;

public class Test {
    public static void main(String[] args) {
        BasketballCoach bc =new BasketballCoach();
        BasketballPlayers bp =new BasketballPlayers();

        bc.teach();
        bp.learn();

        TableTennisCoach tc =new TableTennisCoach();
        TableTennisPlayers tp =new TableTennisPlayers();
        tc.teach();
        tc.speakEnglish();
        tp.learn();
        tp.speakEnglish();
    }
}
