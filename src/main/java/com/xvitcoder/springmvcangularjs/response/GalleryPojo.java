package com.xvitcoder.springmvcangularjs.response;

public class GalleryPojo {

   /*
   {
		"thumb": "images/gallery/thumb-1.jpg",
		"image": "images/gallery/image-1.jpg",
		"tags": [
			{"type": "info", "name": "breakfast"},
			{"type": "danger", "name": "fruits"},
			{"type": "success", "name": "toast"},
			{"type": "warning arrowed-in", "name": "diet"}
		],
		"tools": "default"
	}
    */

   String thumb;
   String image;

   public String getThumb() {
      return thumb;
   }

   public void setThumb(String thumb) {
      this.thumb = thumb;
   }

   public String getImage() {
      return image;
   }

   public void setImage(String image) {
      this.image = image;
   }
}
