package com.hb.utils.modle;

import android.text.TextUtils;

import java.io.Serializable;
import java.util.List;

public class MessageBeanModel extends BaseModel<List<MessageBeanModel.MessageBean>> {

    public static class  MessageBean implements Serializable {

        private static final long serialVersionUID = 1L;
        private String Title;
        private String PlanDate;
        private String PlanDateText;
        private int MsgCount;
        private int MessageType;
        private String MessageTypeText;


        public String getPlanDate() {
            if (TextUtils.isEmpty(PlanDate)) {
                return "";
            }
            if (PlanDate.contains("T")) {
                PlanDate = PlanDate.replace("T", " ");
            }
            return PlanDate;
        }

        public String getTitle() {
            return Title;
        }

        public void setTitle(String title) {
            Title = title;
        }

        public void setPlanDate(String planDate) {
            PlanDate = planDate;
        }

        public String getPlanDateText() {
            return PlanDateText;
        }

        public void setPlanDateText(String planDateText) {
            PlanDateText = planDateText;
        }

        public int getMsgCount() {
            return MsgCount;
        }

        public void setMsgCount(int msgCount) {
            MsgCount = msgCount;
        }

        public int getMessageType() {
            return MessageType;
        }

        public void setMessageType(int messageType) {
            MessageType = messageType;
        }

        public String getMessageTypeText() {
            return MessageTypeText;
        }

        public void setMessageTypeText(String messageTypeText) {
            MessageTypeText = messageTypeText;
        }

        @Override
        public String toString() {
            return "MessageBean{" +
                    "Title='" + Title + '\'' +
                    ", PlanDate='" + PlanDate + '\'' +
                    ", PlanDateText='" + PlanDateText + '\'' +
                    ", MsgCount=" + MsgCount +
                    ", MessageType=" + MessageType +
                    ", MessageTypeText='" + MessageTypeText + '\'' +
                    '}';
        }
    }
}
