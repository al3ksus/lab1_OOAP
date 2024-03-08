package org.example;

import org.example.decode.BinaryDecoder;
import org.example.decode.CaesarDecoder;
import org.example.decode.Decoder;
import org.example.decode.TranspositionDecoder;
import org.example.encode.BinaryEncoder;
import org.example.encode.CaesarEncoder;
import org.example.encode.Encoder;
import org.example.encode.TranspositionEncoder;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Encoder caesarEncoder = new CaesarEncoder();
        Encoder transpositionEncoder = new TranspositionEncoder();
        Encoder binaryEncoder = new BinaryEncoder();
        Decoder binaryDecoder = new BinaryDecoder();
        Decoder caesarDecoder = new CaesarDecoder();
        Decoder transpositionDecoder = new TranspositionDecoder();
        String str;
        System.out.println("Введите сообщение:");
        str = scanner.nextLine();

        str = binaryEncoder.encodingMethod.encode(str);
        System.out.printf("Результат работы двоичного шифра: %s\n", str);
        str = binaryDecoder.decodingMethod.decode(str);
        System.out.printf("Декодирование: %s\n", str);

        str = caesarEncoder.encodingMethod.encode(str);
        System.out.printf("Результат работы шифра цезаря: %s\n", str);
        str = caesarDecoder.decodingMethod.decode(str);
        System.out.printf("Декодирование: %s\n", str);

        str = transpositionEncoder.encodingMethod.encode(str);
        System.out.printf("Результат работы транспозиционного шифра: %s\n", str);
        str = transpositionDecoder.decodingMethod.decode(str);
        System.out.printf("Декодирование: %s\n", str);
    }
}