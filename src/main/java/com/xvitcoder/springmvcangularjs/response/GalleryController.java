package com.xvitcoder.springmvcangularjs.response;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
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

   @RequestMapping("items.json")
   public @ResponseBody
   List<GalleryPojo> getGalleryList() {
      List<GalleryPojo> items = new ArrayList<>();

      GalleryPojo p1 = new GalleryPojo();
      p1.setImgRef("Anil");
      items.add(p1);

      return items;
   }

}
