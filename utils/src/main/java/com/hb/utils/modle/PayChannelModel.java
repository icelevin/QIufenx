package com.hb.utils.modle;

import java.util.List;

/**
 * Created by txl on 2017/5/24 0024.
 */
public class PayChannelModel extends BaseModel<List<PayChannelModel.PayChannel>> {

    public static class PayChannel{
        private String PayChannelId;
        private String PayChannelName;
        private String PayChannelDescript;
        private String PayChannelIcon;

        public String getPayChannelId() {
            return PayChannelId;
        }

        public void setPayChannelId(String payChannelId) {
            PayChannelId = payChannelId;
        }

        public String getPayChannelName() {
            return PayChannelName;
        }

        public void setPayChannelName(String payChannelName) {
            PayChannelName = payChannelName;
        }

        public String getPayChannelDescript() {
            return PayChannelDescript;
        }

        public void setPayChannelDescript(String payChannelDescript) {
            PayChannelDescript = payChannelDescript;
        }

        public String getPayChannelIcon() {
            return PayChannelIcon;
        }

        public void setPayChannelIcon(String payChannelIcon) {
            PayChannelIcon = payChannelIcon;
        }

        @Override
        public String toString() {
            return "PayChannel{" +
                    "PayChannelId='" + PayChannelId + '\'' +
                    ", PayChannelName='" + PayChannelName + '\'' +
                    ", PayChannelDescript='" + PayChannelDescript + '\'' +
                    ", PayChannelIcon='" + PayChannelIcon + '\'' +
                    '}';
        }
    }


}
