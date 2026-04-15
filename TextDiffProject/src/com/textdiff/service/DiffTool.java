package com.textdiff.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.textdiff.model.DiffLine;

public class DiffTool {

    public List<DiffLine> generateDiff(String oldText, String newText) {
        String[] oldLines = oldText.split("\\R");
        String[] newLines = newText.split("\\R");

        int m = oldLines.length;
        int n = newLines.length;

        int[][] dp = new int[m + 1][n + 1];

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (oldLines[i - 1].equals(newLines[j - 1])) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        List<DiffLine> result = new ArrayList<>();

        int i = m;
        int j = n;

        while (i > 0 && j > 0) {
            if (oldLines[i - 1].equals(newLines[j - 1])) {
                result.add(new DiffLine("SAME", oldLines[i - 1]));
                i--;
                j--;
            } else if (dp[i - 1][j] >= dp[i][j - 1]) {
                result.add(new DiffLine("REMOVE", oldLines[i - 1]));
                i--;
            } else {
                result.add(new DiffLine("ADD", newLines[j - 1]));
                j--;
            }
        }

        while (i > 0) {
            result.add(new DiffLine("REMOVE", oldLines[i - 1]));
            i--;
        }

        while (j > 0) {
            result.add(new DiffLine("ADD", newLines[j - 1]));
            j--;
        }

        Collections.reverse(result);
        return result;
    }

    public void printDiff(List<DiffLine> diff) {
        for (DiffLine line : diff) {
            System.out.println(line);
        }
    }
}