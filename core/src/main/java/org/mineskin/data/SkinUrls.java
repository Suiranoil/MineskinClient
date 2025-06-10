package org.mineskin.data;

import java.util.Objects;

public final class SkinUrls {
    private String skin;
    private String cape;

    public SkinUrls(String skin, String cape) {
        this.skin = skin;
        this.cape = cape;
    }

    public String skin() {
        return skin;
    }

    public String cape() {
        return cape;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        var that = (SkinUrls) obj;
        return Objects.equals(this.skin, that.skin) && Objects.equals(this.cape, that.cape);
    }

    @Override
    public int hashCode() {
        return Objects.hash(skin);
    }

    @Override
    public String toString() {
        return "SkinUrls[" +
                "skin=" + skin + ", " +
                "cape=" + cape + ']';
    }
}
