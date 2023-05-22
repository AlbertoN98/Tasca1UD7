package es.iesmz.ed.algoritmes;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Any {

    private final long any;

    public Any(long any) {
        this.any = any;
    }
    public int digitsDiferents() {
        List<Character> digitsList = new ArrayList<>();
        String anyoStr = String.valueOf(any);

        for (char digitChar : anyoStr.toCharArray()) {
            if (!digitsList.contains(digitChar)) {
                digitsList.add(digitChar);
            }
        }
        return digitsList.size();
    }
}

