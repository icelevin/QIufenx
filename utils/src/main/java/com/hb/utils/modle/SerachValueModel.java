package com.hb.utils.modle;

import java.io.Serializable;
import java.util.List;

/**
 * 搜索结果
 * <p/>
 * Created by txl on 2017/5/17 0017.
 */
public class SerachValueModel extends BaseModel<SerachValueModel.SerachValueResult> {

    public static class SerachValueResult implements Serializable{
        private List<HospitalInfoModel.Hospital> Hospitals;
        private List<DepartModel.Depart> Departments;
        private List<CliniclabelModel.Cliniclabel> Doctors;

        public List<HospitalInfoModel.Hospital> getHospitals() {
            return Hospitals;
        }

        public void setHospitals(List<HospitalInfoModel.Hospital> hospitals) {
            Hospitals = hospitals;
        }

        public List<DepartModel.Depart> getDepartments() {
            return Departments;
        }

        public void setDepartments(List<DepartModel.Depart> departments) {
            Departments = departments;
        }

        public List<CliniclabelModel.Cliniclabel> getDoctors() {
            return Doctors;
        }

        public void setDoctors(List<CliniclabelModel.Cliniclabel> doctors) {
            Doctors = doctors;
        }

        @Override
        public String toString() {
            return "SerachValueResult{" +
                    "Hospitals=" + Hospitals +
                    ", Departments=" + Departments +
                    ", Doctors=" + Doctors +
                    '}';
        }
    }
}
