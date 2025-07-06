public class Radio {

    private int currentStation;
    private int currentVolume;
    private int maxStation;
    private int minStation;
    private int maxVolume;
    private int minVolume;

    public Radio () {
        maxStation = 9;
        minStation = 0;
        maxVolume = 10;
        minVolume = 0;
   }

    public Radio(int stationNumber) {
        if (stationNumber >= 0 && stationNumber <= 9) {
            this.currentStation = stationNumber;
        } else {
            this.currentStation = 0;
        }
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < minStation) {
            return;
        }
        if (currentStation > maxStation) {
            return;
        }
        this.currentStation = currentStation;
    }

    public void nextStation() {
        if (currentStation != maxStation) {
            currentStation++;
            return;
        } else {
            currentStation = minStation;
        }
    }

    public void prevStation() {
        if (currentStation != minStation) {
            currentStation--;
            return;
        } else {
            currentStation = maxStation;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < minVolume) {
            return;
        }
        if (currentVolume > maxVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }
    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
            }
        }
    public void decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        }
    }
}
    //    public void setToMaxStation () {
//        currentStation = 9;
//    }

//    public void setToMinStation () {
//        currentStation = 0;
//    }
//    public int getCurrentStation (int currentStation) {
//        if (currentStation >= 0 && currentStation < 9) {
//            currentStation = currentStation + 1;
//        } else {
//        currentStation = 0;
//        }
//        return currentStation;
//        }
//    public int setCurrentStation () {
//        int target = currentStation;
//        if (currentStation >= 0 && currentStation < 9) {
//            newCurrentStation = currentStation;
//        }
//        return currentStation;
//        }

