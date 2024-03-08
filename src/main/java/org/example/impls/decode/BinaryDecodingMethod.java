package org.example.impls.decode;

import org.example.interfaces.DecodingMethod;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;

public class BinaryDecodingMethod implements DecodingMethod {
    @Override
    public String decode(String str) {
        Base64.Decoder decoder = Base64.getDecoder();
        return new String(decoder.decode(str), StandardCharsets.UTF_8);
    }
}
