package com.hb.utils.modle;

import java.io.Serializable;
import java.util.List;

/**
 * 直播列表model
 * Created by ice on 2018/3/13.
 */

public class LiveListModel extends BaseModel<List<LiveListModel.ResultData>> {
    public static class ResultData implements Serializable {
        private String Id;

        private String CategoryId;

        private String Source;

        private String Title;

        private String ZhaiYao;

        private String UserName;

        private String AddTime;

        private int Click;

        private int CommentCount;

        private String ImgUrl;

        private List<Object> Albums;

        private String CategoryName;

        private String LinkUrl;

        private String Tags;

        private int IsHot;

        public void setId(String Id) {
            this.Id = Id;
        }

        public String getId() {
            return this.Id;
        }

        public void setCategoryId(String CategoryId) {
            this.CategoryId = CategoryId;
        }

        public String getCategoryId() {
            return this.CategoryId;
        }

        public void setSource(String Source) {
            this.Source = Source;
        }

        public String getSource() {
            return this.Source;
        }

        public void setTitle(String Title) {
            this.Title = Title;
        }

        public String getTitle() {
            return this.Title;
        }

        public void setZhaiYao(String ZhaiYao) {
            this.ZhaiYao = ZhaiYao;
        }

        public String getZhaiYao() {
            return this.ZhaiYao;
        }

        public void setUserName(String UserName) {
            this.UserName = UserName;
        }

        public String getUserName() {
            return this.UserName;
        }

        public void setAddTime(String AddTime) {
            this.AddTime = AddTime;
        }

        public String getAddTime() {
            return this.AddTime;
        }

        public void setClick(int Click) {
            this.Click = Click;
        }

        public int getClick() {
            return this.Click;
        }

        public void setCommentCount(int CommentCount) {
            this.CommentCount = CommentCount;
        }

        public int getCommentCount() {
            return this.CommentCount;
        }

        public void setImgUrl(String ImgUrl) {
            this.ImgUrl = ImgUrl;
        }

        public String getImgUrl() {
            return this.ImgUrl;
        }

        public void setAlbums(List<Object> Root) {
            this.Albums = Root;
        }

        public List<Object> getAlbums() {
            return this.Albums;
        }

        public void setCategoryName(String CategoryName) {
            this.CategoryName = CategoryName;
        }

        public String getCategoryName() {
            return this.CategoryName;
        }

        public void setLinkUrl(String LinkUrl) {
            this.LinkUrl = LinkUrl;
        }

        public String getLinkUrl() {
            return this.LinkUrl;
        }

        public void setTags(String Tags) {
            this.Tags = Tags;
        }

        public String getTags() {
            return this.Tags;
        }

        public void setIsHot(int IsHot) {
            this.IsHot = IsHot;
        }

        public int getIsHot() {
            return this.IsHot;
        }

        @Override
        public String toString() {
            return "ResultData{" +
                    "Id='" + Id + '\'' +
                    ", CategoryId='" + CategoryId + '\'' +
                    ", Source='" + Source + '\'' +
                    ", Title='" + Title + '\'' +
                    ", ZhaiYao='" + ZhaiYao + '\'' +
                    ", UserName='" + UserName + '\'' +
                    ", AddTime='" + AddTime + '\'' +
                    ", Click=" + Click +
                    ", CommentCount=" + CommentCount +
                    ", ImgUrl='" + ImgUrl + '\'' +
                    ", Albums=" + Albums +
                    ", CategoryName='" + CategoryName + '\'' +
                    ", LinkUrl='" + LinkUrl + '\'' +
                    ", Tags='" + Tags + '\'' +
                    ", IsHot=" + IsHot +
                    '}';
        }
    }

    public static class Albums implements Serializable {

        private String Id;

        private String ArticleId;

        private String ThumbPath;

        private String OriginalPath;

        private String Remark;

        private String AddTime;

        public void setId(String Id) {
            this.Id = Id;
        }

        public String getId() {
            return this.Id;
        }

        public void setArticleId(String ArticleId) {
            this.ArticleId = ArticleId;
        }

        public String getArticleId() {
            return this.ArticleId;
        }

        public void setThumbPath(String ThumbPath) {
            this.ThumbPath = ThumbPath;
        }

        public String getThumbPath() {
            return this.ThumbPath;
        }

        public void setOriginalPath(String OriginalPath) {
            this.OriginalPath = OriginalPath;
        }

        public String getOriginalPath() {
            return this.OriginalPath;
        }

        public void setRemark(String Remark) {
            this.Remark = Remark;
        }

        public String getRemark() {
            return this.Remark;
        }

        public void setAddTime(String AddTime) {
            this.AddTime = AddTime;
        }

        public String getAddTime() {
            return this.AddTime;
        }

        @Override
        public String toString() {
            return "Root{" +
                    "Id='" + Id + '\'' +
                    ", ArticleId='" + ArticleId + '\'' +
                    ", ThumbPath='" + ThumbPath + '\'' +
                    ", OriginalPath='" + OriginalPath + '\'' +
                    ", Remark='" + Remark + '\'' +
                    ", AddTime='" + AddTime + '\'' +
                    '}';
        }
    }
}
