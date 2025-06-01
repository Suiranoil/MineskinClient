package org.mineskin.data;

import java.util.Objects;

public final class NextRequest {
    private long absolute;
    private long relative;

    public NextRequest(long absolute, long relative) {
        this.absolute = absolute;
        this.relative = relative;
    }

    public long absolute() {
        return absolute;
    }

    public long relative() {
        return relative;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        var that = (NextRequest) obj;
        return this.absolute == that.absolute &&
                this.relative == that.relative;
    }

    @Override
    public int hashCode() {
        return Objects.hash(absolute, relative);
    }

    @Override
    public String toString() {
        return "NextRequest[" +
                "absolute=" + absolute + ", " +
                "relative=" + relative + ']';
    }

}
