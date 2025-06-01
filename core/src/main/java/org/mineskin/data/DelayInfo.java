package org.mineskin.data;

import java.util.Objects;

public final class DelayInfo {
    private int millis;
    private int seconds;

    public DelayInfo(int millis, int seconds) {
        this.millis = millis;
        this.seconds = seconds;
    }

    public int millis() {
        return millis;
    }

    public int seconds() {
        return seconds;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        var that = (DelayInfo) obj;
        return this.millis == that.millis &&
                this.seconds == that.seconds;
    }

    @Override
    public int hashCode() {
        return Objects.hash(millis, seconds);
    }

    @Override
    public String toString() {
        return "DelayInfo[" +
                "millis=" + millis + ", " +
                "seconds=" + seconds + ']';
    }

}
