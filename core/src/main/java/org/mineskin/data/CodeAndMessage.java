package org.mineskin.data;

import com.google.gson.reflect.TypeToken;

import java.util.List;
import java.util.Objects;

public final class CodeAndMessage {

    public static final TypeToken<List<CodeAndMessage>> LIST_TYPE_TOKEN = new TypeToken<>() {
    };

    private String code;
    private String message;

    public CodeAndMessage(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String code() {
        return code;
    }

    public String message() {
        return message;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        var that = (CodeAndMessage) obj;
        return Objects.equals(this.code, that.code) &&
                Objects.equals(this.message, that.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, message);
    }

    @Override
    public String toString() {
        return "CodeAndMessage[" +
                "code=" + code + ", " +
                "message=" + message + ']';
    }


}
