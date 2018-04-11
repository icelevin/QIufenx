package com.hb.utils.modle.weather;

/**
 * Created by ice on 2018/1/26.
 */

public class Suggestion {
    private Dressing dressing;

    private Uv uv;

    private Car_washing car_washing;

    private Travel travel;

    private Flu flu;

    private Sport sport;

    private Restriction restriction;

    public void setDressing(Dressing dressing) {
        this.dressing = dressing;
    }

    public Dressing getDressing() {
        return this.dressing;
    }

    public void setUv(Uv uv) {
        this.uv = uv;
    }

    public Uv getUv() {
        return this.uv;
    }

    public void setCar_washing(Car_washing car_washing) {
        this.car_washing = car_washing;
    }

    public Car_washing getCar_washing() {
        return this.car_washing;
    }

    public void setTravel(Travel travel) {
        this.travel = travel;
    }

    public Travel getTravel() {
        return this.travel;
    }

    public void setFlu(Flu flu) {
        this.flu = flu;
    }

    public Flu getFlu() {
        return this.flu;
    }

    public void setSport(Sport sport) {
        this.sport = sport;
    }

    public Sport getSport() {
        return this.sport;
    }

    public void setRestriction(Restriction restriction) {
        this.restriction = restriction;
    }

    public Restriction getRestriction() {
        return this.restriction;
    }

    public static class Dressing {
        private String brief;

        private String details;

        public void setBrief(String brief) {
            this.brief = brief;
        }

        public String getBrief() {
            return this.brief;
        }

        public void setDetails(String details) {
            this.details = details;
        }

        public String getDetails() {
            return this.details;
        }
    }


    public static class Uv {
        private String brief;

        private String details;

        public void setBrief(String brief) {
            this.brief = brief;
        }

        public String getBrief() {
            return this.brief;
        }

        public void setDetails(String details) {
            this.details = details;
        }

        public String getDetails() {
            return this.details;
        }
    }

    public static class Car_washing {
        private String brief;

        private String details;

        public void setBrief(String brief) {
            this.brief = brief;
        }

        public String getBrief() {
            return this.brief;
        }

        public void setDetails(String details) {
            this.details = details;
        }

        public String getDetails() {
            return this.details;
        }
    }

    public static class Travel {
        private String brief;

        private String details;

        public void setBrief(String brief) {
            this.brief = brief;
        }

        public String getBrief() {
            return this.brief;
        }

        public void setDetails(String details) {
            this.details = details;
        }

        public String getDetails() {
            return this.details;
        }
    }


    public static class Flu {
        private String brief;

        private String details;

        public void setBrief(String brief) {
            this.brief = brief;
        }

        public String getBrief() {
            return this.brief;
        }

        public void setDetails(String details) {
            this.details = details;
        }

        public String getDetails() {
            return this.details;
        }
    }


    public static class Sport {
        private String brief;

        private String details;

        public void setBrief(String brief) {
            this.brief = brief;
        }

        public String getBrief() {
            return this.brief;
        }

        public void setDetails(String details) {
            this.details = details;
        }

        public String getDetails() {
            return this.details;
        }
    }


    public static class Restriction {
        private String brief;

        private String details;

        public void setBrief(String brief) {
            this.brief = brief;
        }

        public String getBrief() {
            return this.brief;
        }

        public void setDetails(String details) {
            this.details = details;
        }

        public String getDetails() {
            return this.details;
        }
    }

}
