package com.hb.utils.modle;

/**
 * Created by txl on 2017/5/23 0023.
 */
public class ImageUploadResultModel extends BaseModel<ImageUploadResultModel.ImageUrl> {

    public static class ImageUrl{
        private String Url;

        public String getUrl() {
            return Url;
        }

        public void setUrl(String url) {
            Url = url;
        }

        @Override
        public String toString() {
            return "ImageUrl{" +
                    "Url='" + Url + '\'' +
                    '}';
        }
    }
}
