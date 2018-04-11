package com.hb.utils.modle;

import android.text.TextUtils;

import java.io.Serializable;
import java.util.List;

public class MessageTypeListModel extends BaseModel<List<MessageTypeListModel.MessageTypeList>> {

    public static class MessageTypeList implements Serializable {


        private static final long serialVersionUID = 1L;
        private String MsgId;
        private String Title;
        private String Summary;
        private String Content;
        private String ContentHtml;
        private String Thumbnail;
        private String PushLink;
        private String ReadStatus;
        private String MessageType;
        private String MessageTypeText;
        private String PlanDate;
        private String ReadDate;


        public String getContentHtml() {
            return ContentHtml;
        }

        public void setContentHtml(String contentHtml) {
            ContentHtml = contentHtml;
        }

        public String getMsgId() {
            return MsgId;
        }

        public void setMsgId(String msgId) {
            MsgId = msgId;
        }

        public String getTitle() {
            return Title;
        }

        public void setTitle(String title) {
            Title = title;
        }

        public String getSummary() {
            return Summary;
        }

        public void setSummary(String summary) {
            Summary = summary;
        }

        public String getContent() {
            return Content;
        }

        public void setContent(String content) {
            Content = content;
        }

        public String getThumbnail() {
            return Thumbnail;
        }

        public void setThumbnail(String thumbnail) {
            Thumbnail = thumbnail;
        }

        public String getPushLink() {
            return PushLink;
        }

        public void setPushLink(String pushLink) {
            PushLink = pushLink;
        }

        public String getReadStatus() {
            return ReadStatus;
        }

        public void setReadStatus(String readStatus) {
            ReadStatus = readStatus;
        }

        public String getMessageType() {
            return MessageType;
        }

        public void setMessageType(String messageType) {
            MessageType = messageType;
        }

        public String getMessageTypeText() {
            return MessageTypeText;
        }

        public void setMessageTypeText(String messageTypeText) {
            MessageTypeText = messageTypeText;
        }

        public String getPlanDate() {
            if (TextUtils.isEmpty(PlanDate)) {
                return "";
            }
            if (PlanDate.contains("T")) {
                PlanDate = PlanDate.replace("T", " ");
            }
            return PlanDate;
        }

        public void setPlanDate(String planDate) {
            PlanDate = planDate;
        }

        public String getReadDate() {
            return ReadDate;
        }

        public void setReadDate(String readDate) {
            ReadDate = readDate;
        }

        @Override
        public String toString() {
            return "MessageTypeListBean [MsgId=" + MsgId + ", Title=" + Title + ", Summary=" + Summary + ", Content=" + Content + ", ContentHtml=" + ContentHtml + ", Thumbnail=" + Thumbnail
                    + ", PushLink=" + PushLink + ", ReadStatus=" + ReadStatus + ", MessageType=" + MessageType + ", MessageTypeText=" + MessageTypeText + ", PlanDate=" + PlanDate + ", ReadDate="
                    + ReadDate + "]";
        }


    }
}
