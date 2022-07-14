package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;

public interface ISymptomsCount {
    /**
     * Anything that will count symptoms from a read source.
     * The important part is that it return a key and a value from the operation
     * Which is a map and doesn't contains duplications
     * The implementation need to an ordered list.
     *
     * @param symptoms
     * @return
     */
    Map<String, Integer> countSymptoms(List<String> symptoms);

    /**
     *
     */

}
