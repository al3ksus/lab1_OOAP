package org.example.impls.decode;

import org.example.interfaces.DecodingMethod;

import java.util.List;

public class CaesarDecodingMethod implements DecodingMethod {
    @Override
    public String decode(String str) {
        List<Character> alphabetLower = List.of(
                'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
                'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z');
        List<Character> alphabetUpper = List.of(
                'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M',
                'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z');
        char[] arrayStr = str.toCharArray();
        int step = 13;
        StringBuilder sb = new StringBuilder();

        for (char el : arrayStr) {
            if (alphabetUpper.contains(el)) {
                sb.append(alphabetUpper.get((alphabetUpper.indexOf(el) + step) % 26));
            } else if (alphabetLower.contains(el)) {
                sb.append(alphabetLower.get((alphabetLower.indexOf(el) + step) % 26));
            } else {
                sb.append(el);
            }
        }

        return sb.toString();
    }
}
