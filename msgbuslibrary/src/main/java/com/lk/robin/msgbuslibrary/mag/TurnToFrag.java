package com.lk.robin.msgbuslibrary.mag;

import android.os.Bundle;

public class TurnToFrag {
    public static int FRAG_CLOSE = 1;
    public static int FRAG_OPEN = 2;

    public String fragHoust;
    public Bundle bundle;
    public int launchMode;

    @Override
    public String toString() {
        return "TurnToFrag{" +
                "fragHoust='" + fragHoust + '\'' +
                ", bundle=" + bundle +
                '}';
    }
}
