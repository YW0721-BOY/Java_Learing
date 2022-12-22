package com.HM.a01interfacedemo2;

public class TableTennisCoach extends Coach implements Language {
    @Override
    public void teach() {
        System.out.println("教乒乓球");
    }

    @Override
    public void speakEnglish() {
        System.out.println("说英语");
    }
}
