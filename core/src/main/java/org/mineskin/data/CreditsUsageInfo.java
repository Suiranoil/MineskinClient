package org.mineskin.data;

import java.util.Objects;

public final class CreditsUsageInfo {
    private int used;
    private int remaining;

    public CreditsUsageInfo(int used, int remaining) {
        this.used = used;
        this.remaining = remaining;
    }

    public int used() {
        return used;
    }

    public int remaining() {
        return remaining;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        var that = (CreditsUsageInfo) obj;
        return this.used == that.used &&
                this.remaining == that.remaining;
    }

    @Override
    public int hashCode() {
        return Objects.hash(used, remaining);
    }

    @Override
    public String toString() {
        return "CreditsUsageInfo[" +
                "used=" + used + ", " +
                "remaining=" + remaining + ']';
    }

}
