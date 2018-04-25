package com.mvc.response.gallery;

import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.FileReader;

@Controller
@RequestMapping("/gallery")
public class GalleryController {

   @RequestMapping(value = "items.json", produces = "application/json")
   public @ResponseBody
   Object[] getGalleryList() {

      try {
         JSONParser parser = new JSONParser();
         JSONArray a = (JSONArray) parser.parse(new FileReader("/Users/ak/Raghu/spring-mvc/src/main/resources/json/gallery.json"));

         return a.toArray();

      } catch (Exception e) {
         e.printStackTrace();
      }

      return null;
   }

}
