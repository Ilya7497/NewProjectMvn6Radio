package ru.netology.radio;

public class Radio {
    private int minRadioStation = 0;
    private int maxRadioStation = 9;
    private int currentRadioStation = minRadioStation;

    public Radio (int minRadioStation, int maxRadioStation) {
        this.minRadioStation = minRadioStation;
        this.maxRadioStation = maxRadioStation;
        this.currentRadioStation = minRadioStation;
    }
    public Radio (int size) {
        maxRadioStation = minRadioStation + size;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }
    public int getMinRadioStation() {
        return minRadioStation;
    }
    public int getMaxRadioStation() {
        return maxRadioStation;
    }

    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation < minRadioStation) {
            return;
        }
        if (newCurrentRadioStation > maxRadioStation) {
            return;
        }
        currentRadioStation = newCurrentRadioStation;
    }

    public int currentVolume;

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

    public void setToMaxRadioStation() {
        currentRadioStation = 9;
    }

    public void setToMaxVolume() {
        currentVolume = 100;
    }

    public void nextRadioStation() {
        if (currentRadioStation < 9) {
            currentRadioStation = currentRadioStation + 1;
        } else {
            currentRadioStation = 0;
        }
    }

    public void prevRadioStation() {
        if (currentRadioStation > 0) {
            currentRadioStation = currentRadioStation - 1;
        } else {
            currentRadioStation = 9;
        }
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }

}
