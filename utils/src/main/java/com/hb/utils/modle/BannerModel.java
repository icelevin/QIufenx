package com.hb.utils.modle;

import java.io.Serializable;
import java.util.List;

/**
 * Created by txl on 2017/5/26 0026.
 */
public class BannerModel extends BaseModel<List<BannerModel.Banner>> implements Serializable{
    public static class Banner implements Serializable{
        private String Id;
        private String CategoryId;
        private String Title;
        private String ZhaiYao;
        private String UserName;
        private String AddTime;
        private int Click;
        private int CommentCount;
        private String ImgUrl;
        private String CategoryName;
        private String LinkUrl;
        private String Tags;
        private int IsHot;


        public String getCategoryId() {
            return CategoryId;
        }

        public void setCategoryId(String categoryId) {
            CategoryId = categoryId;
        }

        public String getTitle() {
            return Title;
        }

        public void setTitle(String title) {
            Title = title;
        }

        public String getZhaiYao() {
            return ZhaiYao;
        }

        public void setZhaiYao(String zhaiYao) {
            ZhaiYao = zhaiYao;
        }

        public String getUserName() {
            return UserName;
        }

        public void setUserName(String userName) {
            UserName = userName;
        }

        public String getAddTime() {
            return AddTime;
        }

        public void setAddTime(String addTime) {
            AddTime = addTime;
        }

        public int getClick() {
            return Click;
        }

        public void setClick(int click) {
            Click = click;
        }

        public int getCommentCount() {
            return CommentCount;
        }

        public void setCommentCount(int commentCount) {
            CommentCount = commentCount;
        }

        public String getImgUrl() {
            return ImgUrl;
        }

        public void setImgUrl(String imgUrl) {
            ImgUrl = imgUrl;
        }

        public String getCategoryName() {
            return CategoryName;
        }

        public void setCategoryName(String categoryName) {
            CategoryName = categoryName;
        }

        public String getLinkUrl() {
            return LinkUrl;
        }

        public void setLinkUrl(String linkUrl) {
            LinkUrl = linkUrl;
        }

        public String getTags() {
            return Tags;
        }

        public void setTags(String tags) {
            Tags = tags;
        }

        public int getIsHot() {
            return IsHot;
        }

        public void setIsHot(int isHot) {
            IsHot = isHot;
        }

        public String getId() {
            return Id;
        }

        public void setId(String id) {
            Id = id;
        }

        @Override
        public String toString() {
            return "Banner{" + "Id='" + Id + '\'' + ", CategoryId='" + CategoryId + '\'' + ", Title='" + Title + '\'' + ", ZhaiYao='" + ZhaiYao +
                    '\'' + ", UserName='" + UserName + '\'' + ", AddTime='" + AddTime + '\'' + ", Click=" + Click + ", CommentCount=" +
                    CommentCount + ", ImgUrl='" + ImgUrl + '\'' + ", CategoryName='" + CategoryName + '\'' + ", LinkUrl='" + LinkUrl + '\'' + ", " +
                    "Tags='" + Tags + '\'' + ", IsHot=" + IsHot + '}';
        }
    }
}
