package org.example.impls.encode;

import org.example.interfaces.EncodingMethod;

public class TranspositionEncodingMethod implements EncodingMethod {
    @Override
    public String encode(String str) {
        char[] arrayStr = str.toCharArray();
        StringBuilder sb = new StringBuilder();

        for (int i = arrayStr.length - 1; i >= 0; i--) {
            sb.append(arrayStr[i]);
        }
        return sb.toString();
    }
}
