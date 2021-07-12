package com.android.triangularsquarechecker.logic;

public class TriangularNumber {
    private int number;
    public TriangularNumber(int num){
        number = num;
    }
    public boolean checker(){
        if(number<0)
            return false;
        int sum = 0;
        for(int n = 1;sum<=number;n++)
        {
            sum = sum + n;
            if(sum==number)
                return true;
        }
        return false;
    }
}
