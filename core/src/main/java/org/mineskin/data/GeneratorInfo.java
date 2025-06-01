package org.mineskin.data;

import java.util.Objects;

public final class GeneratorInfo {
    private long timestamp;
    private long duration;

    public GeneratorInfo(
            long timestamp,
            long duration
    ) {
        this.timestamp = timestamp;
        this.duration = duration;
    }

    public long timestamp() {
        return timestamp;
    }

    public long duration() {
        return duration;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        var that = (GeneratorInfo) obj;
        return this.timestamp == that.timestamp &&
                this.duration == that.duration;
    }

    @Override
    public int hashCode() {
        return Objects.hash(timestamp, duration);
    }

    @Override
    public String toString() {
        return "GeneratorInfo[" +
                "timestamp=" + timestamp + ", " +
                "duration=" + duration + ']';
    }

}
