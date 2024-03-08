package org.example.decode;

import org.example.impls.decode.TranspositionDecodingMethod;

public class TranspositionDecoder extends Decoder {
    public TranspositionDecoder() {
        decodingMethod = new TranspositionDecodingMethod();
    }
}
