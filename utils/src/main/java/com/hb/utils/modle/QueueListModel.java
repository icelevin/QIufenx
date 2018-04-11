package com.hb.utils.modle;

import java.io.Serializable;
import java.util.List;

/**
 * Created by ice on 2017/10/16.
 */

public class QueueListModel extends BaseModel<QueueListModel.QueueModel> implements Serializable{
    public static class QueueModel implements Serializable{
        private List<UserQueues> UserQueues;
        private List<Departments> Departments;

        public List<QueueListModel.UserQueues> getUserQueues() {
            return UserQueues;
        }

        public void setUserQueues(List<QueueListModel.UserQueues> userQueues) {
            UserQueues = userQueues;
        }

        public List<QueueListModel.Departments> getDepartments() {
            return Departments;
        }

        public void setDepartments(List<QueueListModel.Departments> departments) {
            Departments = departments;
        }

        @Override
        public String toString() {
            return "QueueModel{" + "UserQueues=" + UserQueues + ", Departments=" + Departments + '}';
        }
    }

    public static class UserQueues implements Serializable {
        private String QueueId;
        private String QueueName;
        private String UserNumber;
        private String RoomName;
        private String CurrentNumber;

        public String getQueueId() {
            return QueueId;
        }

        public void setQueueId(String queueId) {
            QueueId = queueId;
        }

        public String getQueueName() {
            return QueueName;
        }

        public void setQueueName(String queueName) {
            QueueName = queueName;
        }

        public String getUserNumber() {
            return UserNumber;
        }

        public void setUserNumber(String userNumber) {
            UserNumber = userNumber;
        }

        public String getRoomName() {
            return RoomName;
        }

        public void setRoomName(String roomName) {
            RoomName = roomName;
        }

        public String getCurrentNumber() {
            return CurrentNumber;
        }

        public void setCurrentNumber(String currentNumber) {
            CurrentNumber = currentNumber;
        }

        @Override
        public String toString() {
            return "UserQueues{" + "QueueId='" + QueueId + '\'' + ", QueueName='" + QueueName + '\'' + ", UserNumber='" + UserNumber + '\'' + ", " +
                    "RoomName='" + RoomName + '\'' + ", CurrentNumber='" + CurrentNumber + '\'' + '}';
        }
    }

    public static class Departments implements Serializable{
        private String DepartmentId;
        private String DepartmentName;
        private String Id;
        private String FullName;


        public String getDepartmentId() {
            return DepartmentId;
        }

        public void setDepartmentId(String departmentId) {
            DepartmentId = departmentId;
        }

        public String getDepartmentName() {
            return DepartmentName;
        }

        public void setDepartmentName(String departmentName) {
            DepartmentName = departmentName;
        }

        public String getId() {
            return Id;
        }

        public void setId(String id) {
            Id = id;
        }

        public String getFullName() {
            return FullName;
        }

        public void setFullName(String fullName) {
            FullName = fullName;
        }

        @Override
        public String toString() {
            return "Departments{" + "DepartmentId='" + DepartmentId + '\'' + ", DepartmentName='" + DepartmentName + '\'' + ", Id='" + Id + '\'' +
                    ", FullName='" + FullName + '\'' + '}';
        }
    }
}
