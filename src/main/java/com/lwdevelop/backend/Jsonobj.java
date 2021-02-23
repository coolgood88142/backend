package com.lwdevelop.backend;

import net.minidev.json.JSONObject;
import net.minidev.json.JSONArray;

public class Jsonobj{

    public JSONObject getJsonData(){
        JSONArray menuitem = new JSONArray();
        JSONObject total = new JSONObject();
        JSONObject sum = new JSONObject();

        for(int i=1; i < 4; i++){
            JSONObject obj = new JSONObject();
            obj.put("id", i);
            obj.put("name", i);
            menuitem.add(obj);
        }

        sum.put("id", "A");
        sum.put("name", "A");
        sum.put("menuitem", menuitem);
        total.put("menu", sum);
        return total;
    }
}
