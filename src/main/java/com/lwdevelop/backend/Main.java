package com.lwdevelop.backend;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.StringReader;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import net.minidev.json.JSONObject;

public class Main {
    public static void main(String[] args) {
        Jsonobj obj = new Jsonobj();
        ObjectMapper objectMapper = new ObjectMapper();
        Object jsonData =  obj.getJsonData();
        String xml = "<?xml version='1.0' encoding='BIG-5'?><note><to>YOU</to><from>ME</from>" +
        "<heading>Hello</heading <body>Ｈello World</body><attachs><attach><name></name>"+
        "<content></content></attach><attach></attach><attach></attach></attachs></note>";

        try {
            Jsonobj jsonObj = objectMapper.readValue(jsonData.toString(), Jsonobj.class);
            System.out.println(jsonObj.toString());
        
            JAXBContext ctx = JAXBContext.newInstance(Xmlobj.class);
            Unmarshaller marchaller = ctx.createUnmarshaller();
            StringReader reader = new StringReader(xml);
            Xmlobj xmlObject = (Xmlobj) marchaller.unmarshal(reader);
            
            System.out.println(xmlObject.getBody());

            String data = "{\"userId\" : 2003, \"name\" : \"張三\", \"loginTime\" : 2018-11-13T20:20:39+00:00},{\"userId\" :  2004,\"name\" : \"李四\",\"loginTime\" : 2018-11-13T20:20:01+00:00},{\"userId\" :  2005,\"name\" : \"王五\",\"loginTime\" : 2018-11-13T20:20:01+00:00}";
            // JSONObject jsonObj1 = new JSONObject();
            // jsonObj1 = JSONObject.toJSONString(map);

            // Arrays.sort(inputs, Collections.reverseOrder());
 
            // for (int i = 0; i < inputs.length; i++) {
            //     System.out.print(inputs[i]);
            // }

        }catch(Exception e){
            e.printStackTrace();
        }
        
        
    }   

    public boolean checkTextBig5(String chanseText) {
            
        return false;
    }

}
