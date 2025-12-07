package com.sonicether.soundphysics.utils;

public class Utils {

    public static float mix(float a, float b, float t) {
        return a * (1 - t) + b * t;
    }

}
