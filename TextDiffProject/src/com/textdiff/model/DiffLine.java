package com.textdiff.model;

public class DiffLine {
    String type;
    String line;

    public DiffLine(String type, String line) {
        this.type = type;
        this.line = line;
    }

    public String getType() {
        return type;
    }

    public String getLine() {
        return line;
    }

    @Override
    public String toString() {
        if (type.equals("SAME")) {
            return "  " + line;
        } else if (type.equals("ADD")) {
            return "+ " + line;
        } else {
            return "- " + line;
        }
    }
}