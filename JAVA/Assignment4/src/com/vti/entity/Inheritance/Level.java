package com.vti.entity.Inheritance;

public enum Level {
BAC1, BAC2,BAC3,BAC4,BAC5,BAC6,BAC7,BAC8,BAC9,BAC10;

public static Level getLevel(int inputLevel) {
    switch(inputLevel) {

    case 1:
        return BAC1;
    case 2:
    	return BAC2;
    case 3:
    	return BAC3;
    case 4:
    	return BAC4;
    case 5:
    	return BAC5;
    case 6:
    	return BAC6;
    case 7:
    	return BAC7;
    case 8:
    	return BAC8;
    case 9:
    	return BAC9;
    case 10:
    	return BAC10;
    }
    return null;
}
}

