package lifanov;

public class Radio {
    private int numberOfStation;
    private int currentStation;

    private int currentVolume;

    public Radio(int numberOfStation) {
        this.numberOfStation = numberOfStation;
    }
    public Radio () {
        numberOfStation = 10;
    }
    public int getCurrentStation() {

        return currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {

        currentVolume = newCurrentVolume;
    }

    public void setCurrentStation(int currentStation) {

        if (currentStation < 0) {
            return;
        }
        if (currentStation >= numberOfStation) {
            return;
        }
        this.currentStation = currentStation;
    }

    public void nextStation() {

        if (currentStation >= numberOfStation - 1) {
            currentStation = 0;
            return;
        }
        this.currentStation = currentStation + 1;
    }

    public void prevStation() {

        if (currentStation < 1) {
            currentStation = numberOfStation - 1;
            return;
        }
        this.currentStation = currentStation - 1;
    }

    public void upVolume() {

        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
            return;
        }

        this.currentVolume = 100;
    }

    public void downVolume() {

        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
            return;
        }
        this.currentVolume = 0;
    }

}