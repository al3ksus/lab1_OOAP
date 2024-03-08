package org.example.impls.encode;

import org.example.interfaces.EncodingMethod;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class BinaryEncodingMethod implements EncodingMethod {
    @Override
    public String encode(String str) {
        Base64.Encoder encoder = Base64.getEncoder();
        return encoder.encodeToString(str.getBytes(StandardCharsets.UTF_8));
    }
}
