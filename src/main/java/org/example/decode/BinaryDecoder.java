package org.example.decode;

import org.example.encode.BinaryEncoder;
import org.example.impls.decode.BinaryDecodingMethod;

public class BinaryDecoder extends Decoder {
    public BinaryDecoder() {
        decodingMethod = new BinaryDecodingMethod();
    }
}
