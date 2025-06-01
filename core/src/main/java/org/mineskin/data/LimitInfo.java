package org.mineskin.data;

import java.util.Objects;

public final class LimitInfo {
    private int limit;
    private int remaining;

    public LimitInfo(int limit, int remaining) {
        this.limit = limit;
        this.remaining = remaining;
    }

    public int limit() {
        return limit;
    }

    public int remaining() {
        return remaining;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        var that = (LimitInfo) obj;
        return this.limit == that.limit &&
                this.remaining == that.remaining;
    }

    @Override
    public int hashCode() {
        return Objects.hash(limit, remaining);
    }

    @Override
    public String toString() {
        return "LimitInfo[" +
                "limit=" + limit + ", " +
                "remaining=" + remaining + ']';
    }

}
