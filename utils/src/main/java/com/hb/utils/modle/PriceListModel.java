package com.hb.utils.modle;

import java.io.Serializable;
import java.util.List;

/**
 * Created by ice on 2017/12/25.
 */

public class PriceListModel extends BaseModel<List<PriceListModel.PriceList>> {
    public static class PriceList implements Serializable {
        /// 类别Id
        public String TypeId;

        /// 类别名称
        public String TypeName;

        public String getTypeId() {
            return TypeId;
        }

        public void setTypeId(String typeId) {
            TypeId = typeId;
        }

        public String getTypeName() {
            return TypeName;
        }

        public void setTypeName(String typeName) {
            TypeName = typeName;
        }

        @Override
        public String toString() {
            return "JMCX{" +
                    "TypeId='" + TypeId + '\'' +
                    ", TypeName='" + TypeName + '\'' +
                    '}';
        }
    }
}
