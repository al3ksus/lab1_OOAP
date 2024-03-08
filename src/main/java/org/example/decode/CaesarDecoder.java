package org.example.decode;

import org.example.encode.CaesarEncoder;
import org.example.impls.decode.CaesarDecodingMethod;

public class CaesarDecoder extends Decoder {
    public CaesarDecoder() {
        decodingMethod = new CaesarDecodingMethod();
    }
}
