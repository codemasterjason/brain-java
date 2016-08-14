/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jasonpark.brain.java;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.jasonpark.brain.java.model.Album;
import com.jasonpark.brain.java.model.Artist;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;

/**
 * Java programming skill collection.
 *
 * @author jason
 */
public class BrainJavaApplication {

    /**
     *
     * @param args User input.
     * @exception IOException
     */
    public static void main(String[] args) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(SerializationFeature.ORDER_MAP_ENTRIES_BY_KEYS, true);
        mapper.registerModule(new JavaTimeModule());
        mapper.setDateFormat(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"));
        mapper.setPropertyNamingStrategy(new CustomPropertyNamingStrategy());
        mapper.setSerializationInclusion(JsonInclude.Include.NON_EMPTY);

        Album album = new Album(
                "Kind of Blue",
                new String[]{"link1", "link2"},
                ImmutableList.of("So What", "Flamenco Sketches", "Freddie Freeloader"),
                new Artist("Miles Davis", LocalDate.of(1992, Month.MARCH, 26), 54, null, Lists.newArrayList()),
                ImmutableMap.of("Miles Davis", "Trumpet, Band leader", "Julian Adderley", "Alto Saxophone", "Paul Chambers", "double bass")
        );

//        mapper.writeValue(System.out, album);
        String albumJsonStr = mapper.writeValueAsString(album);
        System.out.println(albumJsonStr);
    }
}
