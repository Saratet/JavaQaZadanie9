package ru.netology.smartHouse;

public class Radio {
    int currentRadioStation;
    int currentVolume;

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation < 0) {
            return;
        }
        if (newCurrentRadioStation > 9) {
            return;
        }
        currentRadioStation = newCurrentRadioStation;
    }

    public void setNextRadioStation() {
        next();
    }

    private void next() {
        if (currentRadioStation < 9) {
            currentRadioStation = currentRadioStation + 1;
            return;
        }
        currentRadioStation = 0;
    }

    public void setPrevRadioStation() {
        prev();
    }

    private void prev() {
        if (currentRadioStation >= 1) {
            currentRadioStation = currentRadioStation - 1;
            return;
        }
        currentRadioStation = 9;
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

    public void setIncreasedVolume() {
        increaseVolume();
    }

    private void increaseVolume() {
        if (currentVolume > 99) {
            return;
        }
        currentVolume = currentVolume + 1;
    }

    public void setDecreasedVolume() {
        decreaseVolume();
    }

    private void decreaseVolume() {
        if (currentVolume < 1) {
            return;
        }
        currentVolume = currentVolume - 1;
    }
}