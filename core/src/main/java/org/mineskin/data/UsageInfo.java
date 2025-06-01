package org.mineskin.data;

import java.util.Objects;

public final class UsageInfo {
    private CreditsUsageInfo credits;

    public UsageInfo(CreditsUsageInfo credits) {
        this.credits = credits;
    }

    public CreditsUsageInfo credits() {
        return credits;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        var that = (UsageInfo) obj;
        return Objects.equals(this.credits, that.credits);
    }

    @Override
    public int hashCode() {
        return Objects.hash(credits);
    }

    @Override
    public String toString() {
        return "UsageInfo[" +
                "credits=" + credits + ']';
    }

}
