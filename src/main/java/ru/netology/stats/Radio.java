package ru.netology.stats;

public class Radio {
    private int currentStation;
    private int currentVolum;

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation<0){
            return;
        }
        if (currentStation>9){return;}
        this.currentStation = currentStation;
    }

    public int getCurrentVolum() {
        return currentVolum;
    }

    public void setCurrentVolum(int currentVolum) {
        if (currentVolum<0){return;}
        if (currentVolum>100){return;}
        this.currentVolum = currentVolum;
    }
    public void next(){
        if (currentStation !=9) {
            currentStation++;
        }else {
            currentStation =0;}


    }
    public void



}
