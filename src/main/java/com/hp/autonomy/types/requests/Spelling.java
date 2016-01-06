/*
 * Copyright 2015 Hewlett-Packard Development Company, L.P.
 * Licensed under the MIT License (the "License"); you may not use this file except in compliance with the License.
 */

package com.hp.autonomy.types.requests;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class Spelling {

    private final List<String> corrections;
    private final String correctedQuery;
    private final String originalQuery;

    public Spelling(
        @JsonProperty("corrections") final List<String> corrections,
        @JsonProperty("corrected_query") final String correctedQuery,
        @JsonProperty("original_query") final String originalQuery
    ) {
        this.corrections = corrections;
        this.correctedQuery = correctedQuery;
        this.originalQuery = originalQuery;
    }
}