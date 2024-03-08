package org.example.encode;

import org.example.impls.encode.CaesarEncodingMethod;

public class CaesarEncoder extends Encoder {

    public CaesarEncoder() {
        encodingMethod = new CaesarEncodingMethod();
    }
}
