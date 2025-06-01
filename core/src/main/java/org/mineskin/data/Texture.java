package org.mineskin.data;

import java.util.Objects;

@Deprecated
public final class Texture {
    private String value;
    private String signature;
    private String url;

    public Texture(String value, String signature, String url) {
        this.value = value;
        this.signature = signature;
        this.url = url;
    }

    public String value() {
        return value;
    }

    public String signature() {
        return signature;
    }

    public String url() {
        return url;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        var that = (Texture) obj;
        return Objects.equals(this.value, that.value) &&
                Objects.equals(this.signature, that.signature) &&
                Objects.equals(this.url, that.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, signature, url);
    }

    @Override
    public String toString() {
        return "Texture[" +
                "value=" + value + ", " +
                "signature=" + signature + ", " +
                "url=" + url + ']';
    }

}