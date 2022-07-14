package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.Map;

public interface ISymptomWrite {

    /**
     * it write symptoms in a file taken from a given source
     * @param symptomsWithOccurrences
     * @throws IOException
     */
    void writeToFile(Map<String, Integer> symptomsWithOccurrences) throws IOException;


}