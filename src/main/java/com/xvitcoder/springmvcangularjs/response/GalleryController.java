package com.xvitcoder.springmvcangularjs.response;

import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.FileReader;

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
   String getGalleryList() {

      try {
         JSONParser parser = new JSONParser();
         JSONArray a = (JSONArray) parser.parse(new FileReader("/Users/ak/Raghu/spring-mvc/src/main/resources/json/gallery.json"));

         //         System.out.println(a.toString());


         return a.toString();

         //         return "[{image:images/gallery/image-1.jpg,thumb:images/gallery/thumb-1.jpg,tools:default},{image:images/gallery/image-2.jpg,thumb:images/gallery/thumb-2.jpg,caption:Sample Caption on Hover}]";

      } catch (Exception e) {
         e.printStackTrace();
      }

      return "{\"failed\":-1}";
   }

}
