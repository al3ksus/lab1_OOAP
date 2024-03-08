package org.example.encode;

import org.example.impls.encode.BinaryEncodingMethod;

public class BinaryEncoder extends Encoder {
    public BinaryEncoder() {
        encodingMethod = new BinaryEncodingMethod();
    }
}
