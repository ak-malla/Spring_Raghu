package com.xvitcoder.springmvcangularjs.response;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: xvitcoder
 * Date: 12/21/12
 * Time: 12:22 AM
 */
@Controller
@RequestMapping("/gallery")
public class GalleryController {

   @RequestMapping(value = "items.json", produces = "application/json")
   public @ResponseBody
   List<GalleryPojo> getGalleryList() {

      try {
         JSONParser parser = new JSONParser();
         JSONArray a = (JSONArray) parser.parse(new FileReader("/Users/ak/Raghu/spring-mvc/src/main/resources/json/gallery.json"));

         List<GalleryPojo> l = new ArrayList<>();
         for (int i = 0; i < a.size(); i++) {

            JSONObject jobj = (JSONObject) a.get(i);

            GalleryPojo pojo = new GalleryPojo();
            pojo.setImage((String) jobj.get("image"));
            pojo.setThumb((String) jobj.get("thumb"));

            l.add(pojo);

         }

         System.out.println(Arrays.toString(l.toArray()));

         return l;

      } catch (Exception e) {
         e.printStackTrace();
      }

      return null;
   }

}
