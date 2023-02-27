package ru.netology;

public class Radio {

    private int stationsAmount = 9; // количество станций 10 по умолчанию. от 0 до 9.
    private int currentWave;
    private int currentVolume;

    public Radio() {
    }

    public Radio(int stationsAmount) {
        this.stationsAmount = stationsAmount - 1;
    }

    public void setCurrentWave(int newCurrentWave) {
        if (newCurrentWave >= 0 && newCurrentWave <= stationsAmount) {
            currentWave = newCurrentWave;
        } else if (newCurrentWave < 0) {
            currentWave = 0;
        } else currentWave = stationsAmount;
    }

    public int getCurrentWave() {
        return currentWave;
    }

    public void next() {
        if (currentWave <= stationsAmount - 1) {
            currentWave = currentWave + 1;
        } else currentWave = 0;
    }

    public void prev() {
        if (currentWave > 0) {
            currentWave = currentWave - 1;
        } else currentWave = stationsAmount;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume >= 0 && newCurrentVolume <= 100) {
            currentVolume = newCurrentVolume;
        } else if (newCurrentVolume < 0) {
            currentVolume = 0;
        } else currentVolume = 100;
    }

    public int getCurrentVolume() {
        return currentVolume;
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