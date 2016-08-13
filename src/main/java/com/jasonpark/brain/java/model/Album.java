/*
 * The MIT License
 *
 * Copyright 2016 jason.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package com.jasonpark.brain.java.model;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 *
 * @author jason
 */
public class Album {

    private final String title;

    private final String[] links;

    private final List<String> songs;

    private final Artist artist;

    private final Map<String, String> musicians;

    /**
     * Initialize album.
     *
     * @param title
     * @param links
     * @param songs
     * @param artist
     * @param musicians
     */
    public Album(String title, String[] links, List<String> songs, Artist artist, Map<String, String> musicians) {
        this.title = title;
        this.links = Arrays.copyOf(links, links.length);
        this.songs = songs;
        this.artist = artist;
        this.musicians = musicians;
    }

    /**
     * Get title.
     *
     * @return album title.
     */
    public String getTitle() {
        return title;
    }

    /**
     * get links.
     *
     * @return link about detail information of album.
     */
    public String[] getLinks() {
        return Arrays.copyOf(links, links.length);
    }

    /**
     * Get songs.
     *
     * @return song titles.
     */
    public List<String> getSongs() {
        return songs;
    }

    /**
     * Get artist.
     *
     * @return artist information.
     */
    public Artist getArtist() {
        return artist;
    }

    /**
     * Get musicians.
     *
     * @return musician name and role.
     */
    public Map<String, String> getMusicians() {
        return musicians;
    }
}
