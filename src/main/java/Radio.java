public class Radio {
    private int currentStation;
    private int currentVolume;

    public Radio(int stationQuantity) {
        this.stationQuantity = stationQuantity;
    }

    public Radio() {

    }

    private int stationQuantity = 10;


    public int getCurrentVolume() {
        return currentVolume;
    }


    public int getCurrentStation() {
        return currentStation;
    }


    public void setCurrentVolume(int newcurrentVolume) {
        if (newcurrentVolume >= 0) {
            if (newcurrentVolume <= 100) {
                currentVolume = newcurrentVolume;
            }
        }
    }


    public void setCurrentStation(int newStation) {
        if (newStation < stationQuantity) {
            if (newStation >= 0) {
                currentStation = newStation;
            }
        }
    }

    public void next() {
        if (currentStation == stationQuantity - 1) {
            currentStation = 0;
        } else {
            currentStation++;
        }
    }

    public void prew() {
        if (currentStation == 0) {
            currentStation = stationQuantity;
        } else {
            currentStation--;
        }

    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume++;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        }
    }

}
