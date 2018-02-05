package com.sem2v2.semana2video2;

import java.io.Serializable;

/**
 * Created by erwin on 2/4/2018.
 */

public class Data implements Serializable {
    int value1;
    int value2;

    public Data(int value1, int value2) {
        this.value1 = value1;
        this.value2 = value2;
    }
}
