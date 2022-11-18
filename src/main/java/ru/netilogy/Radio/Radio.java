package ru.netilogy.Radio;

public class Radio {
    private final int maxVolume = 100;
    private final int minVolume = 0;
    private int currentVolume;
    private int maxRadioStation = 9;
    private final int minRadioStation = 0;
    private int currentRadioStation;
    private boolean on;

    public Radio() {

    }

    public Radio( int currentRadioStation ) {
        setCurrentRadioStation(currentRadioStation);
    }

    public int getMaxVolume() {

        return maxVolume;
    }


    public int getMinVolume() {

        return minVolume;
    }


    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            return;
        }
        if (currentVolume < minVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public int getMaxRadioStation() {
        return maxRadioStation;
    }

    public void setMaxRadioStation(int maxRadioStation) {
        this.maxRadioStation = maxRadioStation - 1;
    }

    public int getMinRadioStation() {
        return minRadioStation;
    }


    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation > maxRadioStation) {
            return;
        }
        if (currentRadioStation < minRadioStation) {
            return;
        }
        this.currentRadioStation = currentRadioStation;

    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void pressNextStation() {
        if (currentRadioStation >= maxRadioStation) {
            setCurrentRadioStation(minRadioStation);
        } else {
            setCurrentRadioStation(currentRadioStation + 1);
        }
    }

    public void pressPrevStation() {
        if (currentRadioStation <= minRadioStation) {
            setCurrentRadioStation(maxRadioStation);
        } else {
            setCurrentRadioStation(currentRadioStation - 1);
        }
    }

    public void pressPlusVolume() {
        setCurrentVolume(currentVolume + 1);
    }

    public void pressMinusVolume() {
        setCurrentVolume(currentVolume - 1);
    }
}