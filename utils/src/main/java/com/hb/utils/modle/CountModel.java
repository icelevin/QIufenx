package com.hb.utils.modle;

/**
 * Created by txl on 2017/4/27 0027.
 */
public class CountModel  extends BaseModel<CountModel.Count> {

    public static class Count{
        private int Count;

        public int getCount() {
            return Count;
        }

        public void setCount(int count) {
            Count = count;
        }

        @Override
        public String toString() {
            return "Count{" +
                    "Count=" + Count +
                    '}';
        }
    }
}
