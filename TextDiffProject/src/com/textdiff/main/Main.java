package com.textdiff.main;

import java.util.List;

import com.textdiff.model.DiffLine;
import com.textdiff.service.DiffTool;

public class Main {
    public static void main(String[] args) {
        String oldText = """
                apple
                banana
                cat
                dog
                """;

        String newText = """
                apple
                banana
                cow
                dog
                """;

        DiffTool tool = new DiffTool();
        List<DiffLine> diff = tool.generateDiff(oldText, newText);
        tool.printDiff(diff);
    }
}