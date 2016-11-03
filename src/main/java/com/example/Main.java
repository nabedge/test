package com.example;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class Main {

    public static void main(String[] args) {

        Properties properties = new Properties();

        try {

            InputStream inputStream = Main.class.getResourceAsStream("foo.properties");

            properties.load(inputStream);
            inputStream.close();

            // 値の取得
            System.out.println(properties.getProperty("foo.bar"));

        } catch (Exception ex) {
            System.out.println(ex.getMessage());

        }
    }
}