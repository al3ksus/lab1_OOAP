package org.example.encode;

import org.example.impls.encode.TranspositionEncodingMethod;

public class TranspositionEncoder extends Encoder {
    public TranspositionEncoder() {
        encodingMethod = new TranspositionEncodingMethod();
    }
}
