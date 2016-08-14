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

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author jason
 */
public class Artist {

    private final String name;

    private final LocalDate birthDate;

    private final Integer age;

    private final String homeTown;

    private final List<String> awardWon;

    public Artist(String name, LocalDate birthDate, Integer age, String homeTown, List<String> awardWon) {
        this.name = name;
        this.birthDate = birthDate;
        this.age = age;
        this.homeTown = homeTown;
        this.awardWon = awardWon;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public Integer getAge() {
        return age;
    }

    public String getHomeTown() {
        return homeTown;
    }

    public List<String> getAwardWon() {
        return awardWon;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + Objects.hashCode(this.name);
        hash = 79 * hash + Objects.hashCode(this.birthDate);
        hash = 79 * hash + Objects.hashCode(this.age);
        hash = 79 * hash + Objects.hashCode(this.homeTown);
        hash = 79 * hash + Objects.hashCode(this.awardWon);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Artist other = (Artist) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.homeTown, other.homeTown)) {
            return false;
        }
        if (!Objects.equals(this.birthDate, other.birthDate)) {
            return false;
        }
        if (!Objects.equals(this.age, other.age)) {
            return false;
        }
        if (!Objects.equals(this.awardWon, other.awardWon)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Artist{" + "name=" + name + ", birthDate=" + birthDate + ", age=" + age + ", homeTown=" + homeTown + ", awardWon=" + awardWon + '}';
    }
}
