package com.hb.utils.modle;

import java.io.Serializable;

/**
 * Created by txl on 2017/12/22 0022.
 */

public class CardBlanceModel extends BaseModel<CardBlanceModel.Blance> {

    public static class Blance implements Serializable{
        private String CardBlance;

        public String getCardBlance() {
            return CardBlance;
        }

        public void setCardBlance(String cardBlance) {
            CardBlance = cardBlance;
        }

        @Override
        public String toString() {
            return "Blance{" + "CardBlance='" + CardBlance + '\'' + '}';
        }
    }
}
