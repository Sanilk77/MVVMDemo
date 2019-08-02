package com.example.mvvmdemo.data.local;

import androidx.room.TypeConverter;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.List;

public class GenreConverter {

    @TypeConverter
    public String toJson(List<Integer> countryLang) {
        if (countryLang == null) {
            return (null);
        }
        Type type = new TypeToken<List<Integer>>() {}.getType();
        return new Gson().toJson(countryLang, type);
    }

    @TypeConverter
    public List<Integer> fromJson(String countryLangString) {
        if (countryLangString == null) {
            return (null);
        }
        Type type = new TypeToken<List<Integer>>() {}.getType();
        return new Gson().fromJson(countryLangString, type);
    }
}
