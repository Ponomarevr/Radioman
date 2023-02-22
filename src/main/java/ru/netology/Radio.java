package ru.netology;

public class Radio {
    public int currentWave;

    public void setCurrentWave(int newCurrentWave) {
        if (newCurrentWave >= 0 && newCurrentWave <= 9) {
            currentWave = newCurrentWave;
        } else if (newCurrentWave < 0) {
            currentWave = 9;
        } else currentWave = 0;
    }

    public int getCurrentWave() {
        return currentWave;
    }

    public void next() {
        if (currentWave < 9) {
            currentWave = currentWave + 1;
        } else currentWave = 0;
    }

    public void prev() {
        if (currentWave > 0) {
            currentWave = currentWave - 1;
        } else currentWave = 9;
    }

    public int currentVolume;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 10 && currentVolume >= 0) {
            currentVolume = currentVolume + 1;
        } else if (currentVolume < 0) {
            currentVolume = 0;
        } else currentVolume = 10;
    }

    public void decreaseVolume() {
        if (currentVolume <= 10 && currentVolume > 0) {
            currentVolume = currentVolume - 1;
        } else if (currentVolume <= 0) {
            currentVolume = 0;
        } else currentVolume = 10;
    }
}
