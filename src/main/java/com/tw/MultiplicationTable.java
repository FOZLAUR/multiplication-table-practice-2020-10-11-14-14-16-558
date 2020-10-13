package com.tw;

public class MultiplicationTable {
    public String createMultiplicationTable(int startNumber, int endNumber) {
        boolean isValid = isStartNumLessThanEndNum(startNumber, endNumber);
        isValid = isValid && areNumbersWithinRange(startNumber, endNumber);
        return printMultiplicationTable(startNumber,endNumber,isValid);
    }

    public static boolean isStartNumLessThanEndNum(int startNum, int endNum){
        return (endNum >= startNum);
    }

    public static boolean areNumbersWithinRange(int startNum, int endNum){
        return (startNum > 0 && startNum < 1001) &&
                (endNum > 0 && endNum < 1001) ;
    }

    public static String printMultiplicationTable(int startNum, int endNum, boolean isValid){
        if(isValid){
            String multTable = "";
            for(int i=startNum; i<=endNum; i++){
                for (int j=startNum; j<=i; j++){
                    multTable += j+"*";
                    multTable += i+"=";
                    multTable += i*j;
                    if(i!=j){
                        multTable += "  ";
                    }
                }
                multTable += "\r\n";
            }
            return multTable.trim();
        }
        return null;
    }
}
