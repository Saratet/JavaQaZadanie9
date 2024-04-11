package ru.netology.smartHouse;

public class Radio {
    private int currentRadioStation;
    private int currentVolume;

    private int numberOfRadioStations;

    public Radio() {
        numberOfRadioStations = 10;
    }

    public Radio(int numberOfRadioStations) {
        this.numberOfRadioStations = numberOfRadioStations;
    }

    public int getNumberOfRadioStations() {
        return numberOfRadioStations;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation < 0) {
            return;
        }
        if (newCurrentRadioStation >= numberOfRadioStations) {
            return;
        }
        currentRadioStation = newCurrentRadioStation;
    }

    public void next() {
        if (currentRadioStation < numberOfRadioStations - 1) {
            currentRadioStation = currentRadioStation + 1;
            return;
        }
        currentRadioStation = 0;
    }

    public void prev() {
        if (currentRadioStation >= 1) {
            currentRadioStation = currentRadioStation - 1;
            return;
        }
        currentRadioStation = numberOfRadioStations - 1;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 100) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void increaseVolume() {
        if (currentVolume > 99) {
            return;
        }
        currentVolume = currentVolume + 1;
    }

    public void decreaseVolume() {
        if (currentVolume < 1) {
            return;
        }
        currentVolume = currentVolume - 1;
    }
}