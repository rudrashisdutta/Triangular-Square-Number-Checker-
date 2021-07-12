package com.android.triangularsquarechecker.logic;

public class SquareNumber {
    private int number;
    public SquareNumber(int num){
        number=num;
    }
    public boolean checker(){
        double sr=Math.sqrt(number);
        return ((sr-Math.floor(sr))==0);
    }
}
