package org.mineskin.data;

import java.util.Objects;

public final class RateLimitInfo {
    private NextRequest next;
    private DelayInfo delay;
    private LimitInfo limit;

    public RateLimitInfo(NextRequest next, DelayInfo delay, LimitInfo limit) {
        this.next = next;
        this.delay = delay;
        this.limit = limit;
    }

    public NextRequest next() {
        return next;
    }

    public DelayInfo delay() {
        return delay;
    }

    public LimitInfo limit() {
        return limit;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        var that = (RateLimitInfo) obj;
        return Objects.equals(this.next, that.next) &&
                Objects.equals(this.delay, that.delay) &&
                Objects.equals(this.limit, that.limit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(next, delay, limit);
    }

    @Override
    public String toString() {
        return "RateLimitInfo[" +
                "next=" + next + ", " +
                "delay=" + delay + ", " +
                "limit=" + limit + ']';
    }

}
