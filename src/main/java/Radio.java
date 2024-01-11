public class Radio {
    public int currentStation;
    public int currentVolume;
    public int getCurrentVolume() {
        return currentVolume;
    }


    public int getCurrentStation() {
        return currentStation;
    }


    public void setCurrentVolume(int newcurrentVolume) {
        if(newcurrentVolume >= 0){
            if(newcurrentVolume <= 100){
                currentVolume = newcurrentVolume;
            }
        }
    }


    public void setCurrentStation(int newStation) {
        if (newStation <= 9) {
            if (newStation >= 0)
                currentStation = newStation;
        }
    }
    public void next() {
        if (currentStation == 9) {
            currentStation = 0;
        } else {
            currentStation++;
        }
    }

    public void prew() {
        if (currentStation == 0) {
            currentStation = 9;
        } else {
            currentStation--;
        }

    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume++;
        }
    }
    public void decreaseVolume(){
        if(currentVolume > 0){
            currentVolume--;
        }
    }

}
