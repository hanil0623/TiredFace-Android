package com.example.thirty.tiredfaceapp.JsonObjectEventObserver;

import org.json.JSONObject;

public interface JsonObjectEventSubject {
    public void registerObserver(JsonObjectEventObserver observer);
    public void removeObserver(JsonObjectEventObserver observber);
    public void notifyObserver(JSONObject jsonObject);
}
