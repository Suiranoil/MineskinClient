package org.mineskin.data;

import java.util.Objects;

public final class ValueAndSignature {
    private String value;
    private String signature;

    public ValueAndSignature(String value, String signature) {
        this.value = value;
        this.signature = signature;
    }

    public String value() {
        return value;
    }

    public String signature() {
        return signature;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        var that = (ValueAndSignature) obj;
        return Objects.equals(this.value, that.value) &&
                Objects.equals(this.signature, that.signature);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, signature);
    }

    @Override
    public String toString() {
        return "ValueAndSignature[" +
                "value=" + value + ", " +
                "signature=" + signature + ']';
    }

}
