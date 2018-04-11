package com.hb.utils.modle;

import java.io.Serializable;
import java.util.List;

/**
 *
 * 时间段
 * Created by txl on 2017/5/12 0012.
 */
public class AppointmentTimePartModel extends BaseModel<List<AppointmentTimePartModel.AppointmentTimePart>> {
    public static class AppointmentTimePart implements Serializable{
        private String StartTime;
        private String EndTime;
        private int Count;
        private int Total;

        public String getStartTime() {
            return StartTime;
        }

        public void setStartTime(String startTime) {
            StartTime = startTime;
        }

        public String getEndTime() {
            return EndTime;
        }

        public void setEndTime(String endTime) {
            EndTime = endTime;
        }

        public int getCount() {
            return Count;
        }

        public void setCount(int count) {
            Count = count;
        }

        public int getTotal() {
            return Total;
        }

        public void setTotal(int total) {
            Total = total;
        }

        @Override
        public String toString() {
            return "AppointmentTimePart{" +
                    "StartTime='" + StartTime + '\'' +
                    ", EndTime='" + EndTime + '\'' +
                    ", Count=" + Count +
                    ", Total=" + Total +
                    '}';
        }
    }
}
