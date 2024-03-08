package org.example.impls.decode;

import org.example.interfaces.DecodingMethod;

public class TranspositionDecodingMethod implements DecodingMethod {
    @Override
    public String decode(String str) {
        char[] arrayStr = str.toCharArray();
        StringBuilder sb = new StringBuilder();

        for (int i = arrayStr.length - 1; i >= 0; i--) {
            sb.append(arrayStr[i]);
        }
        return sb.toString();
    }
}
