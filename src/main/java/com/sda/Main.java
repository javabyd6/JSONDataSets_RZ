package com.sda;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sda.JSONDataSets_RZ.Dane;
import com.sda.JSONDataSets_RZ_NoblePrice.Nobel;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

/**
 * @author Remigiusz Zudzin
 */
public class Main {

    private static void readJsonMeteoriteDataSet() {
        ObjectMapper mapper = new ObjectMapper();

        try {
            Dane[] dane = mapper.readValue(new File("dataset.json"), Dane[].class);
            System.out.println(Arrays.toString(dane));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void readJsonNobelDataSet() {
        ObjectMapper mapper = new ObjectMapper();

        try {
            Nobel nobel = mapper.readValue(new File("prize.json"), Nobel.class);
            System.out.println(nobel);
            System.out.println(nobel.getPrizes().size());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        readJsonNobelDataSet();

    }

}
