package org.mineskin.data;

import java.util.Objects;

public final class SkinUrls {
    private String skin;

    public SkinUrls(String skin) {
        this.skin = skin;
    }

    public String skin() {
        return skin;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        var that = (SkinUrls) obj;
        return Objects.equals(this.skin, that.skin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(skin);
    }

    @Override
    public String toString() {
        return "SkinUrls[" +
                "skin=" + skin + ']';
    }

}
