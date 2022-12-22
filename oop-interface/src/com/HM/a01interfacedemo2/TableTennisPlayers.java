package com.HM.a01interfacedemo2;

public class TableTennisPlayers extends Players implements Language{
    @Override
    public void speakEnglish() {
        System.out.println("说英语");
    }

    @Override
    public void learn() {
        System.out.println("学打乒乓球");
    }
}
