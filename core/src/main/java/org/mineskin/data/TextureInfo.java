package org.mineskin.data;

import java.util.Objects;

public final class TextureInfo {
    private ValueAndSignature data;
    private SkinHashes hash;
    private SkinUrls url;

    public TextureInfo(
            ValueAndSignature data,
            SkinHashes hash,
            SkinUrls url
    ) {
        this.data = data;
        this.hash = hash;
        this.url = url;
    }

    public ValueAndSignature data() {
        return data;
    }

    public SkinHashes hash() {
        return hash;
    }

    public SkinUrls url() {
        return url;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        var that = (TextureInfo) obj;
        return Objects.equals(this.data, that.data) &&
                Objects.equals(this.hash, that.hash) &&
                Objects.equals(this.url, that.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data, hash, url);
    }

    @Override
    public String toString() {
        return "TextureInfo[" +
                "data=" + data + ", " +
                "hash=" + hash + ", " +
                "url=" + url + ']';
    }

}
