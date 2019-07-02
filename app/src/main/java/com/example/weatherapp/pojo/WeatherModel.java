package com.example.weatherapp.pojo;

public class WeatherModel {

    Location location;
    Current current;

    public WeatherModel(Location location, Current current) {
        this.location = location;
        this.current = current;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Current getCurrent() {
        return current;
    }

    public void setCurrent(Current current) {
        this.current = current;
    }

    public class Location{
        private String localtime;
        private String country;
        private int localtime_epoch;
        private String name;
        private double lon;
        private String region;
        private double lat;
        private String tz_id;

        public Location(String localtime, String country, int localtime_epoch, String name, double lon, String region, double lat, String tz_id) {
            this.localtime = localtime;
            this.country = country;
            this.localtime_epoch = localtime_epoch;
            this.name = name;
            this.lon = lon;
            this.region = region;
            this.lat = lat;
            this.tz_id = tz_id;
        }

        public String getLocaltime() {
            return localtime;
        }

        public void setLocaltime(String localtime) {
            this.localtime = localtime;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public int getLocaltime_epoch() {
            return localtime_epoch;
        }

        public void setLocaltime_epoch(int localtime_epoch) {
            this.localtime_epoch = localtime_epoch;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getLon() {
            return lon;
        }

        public void setLon(double lon) {
            this.lon = lon;
        }

        public String getRegion() {
            return region;
        }

        public void setRegion(String region) {
            this.region = region;
        }

        public double getLat() {
            return lat;
        }

        public void setLat(double lat) {
            this.lat = lat;
        }

        public String getTz_id() {
            return tz_id;
        }

        public void setTz_id(String tz_id) {
            this.tz_id = tz_id;
        }
    }

    public class Current {
        private String feelslike_c;
        private String uv;
        private String last_updated;
        private String feelslike_f;
        private String wind_degree;
        private String last_updated_epoch;
        private String is_day;
        private String precip_in;
        private String wind_dir;
        private String gust_mph;
        private String temp_c;
        private String pressure_in;
        private String gust_kph;
        private String temp_f;
        private String precip_mm;
        private String cloud;
        private String wind_kph;
        Condition condition;
        private String wind_mph;
        private String vis_km;
        private String humidity;
        private String pressure_mb;
        private String vis_miles;

        public Current(String feelslike_c, String uv, String last_updated, String feelslike_f, String wind_degree, String last_updated_epoch, String is_day, String precip_in, String wind_dir, String gust_mph, String temp_c, String pressure_in, String gust_kph, String temp_f, String precip_mm, String cloud, String wind_kph, Condition condition, String wind_mph, String vis_km, String humidity, String pressure_mb, String vis_miles) {
            this.feelslike_c = feelslike_c;
            this.uv = uv;
            this.last_updated = last_updated;
            this.feelslike_f = feelslike_f;
            this.wind_degree = wind_degree;
            this.last_updated_epoch = last_updated_epoch;
            this.is_day = is_day;
            this.precip_in = precip_in;
            this.wind_dir = wind_dir;
            this.gust_mph = gust_mph;
            this.temp_c = temp_c;
            this.pressure_in = pressure_in;
            this.gust_kph = gust_kph;
            this.temp_f = temp_f;
            this.precip_mm = precip_mm;
            this.cloud = cloud;
            this.wind_kph = wind_kph;
            this.condition = condition;
            this.wind_mph = wind_mph;
            this.vis_km = vis_km;
            this.humidity = humidity;
            this.pressure_mb = pressure_mb;
            this.vis_miles = vis_miles;
        }

        public String getFeelslike_c() {
            return feelslike_c;
        }

        public void setFeelslike_c(String feelslike_c) {
            this.feelslike_c = feelslike_c;
        }

        public String getUv() {
            return uv;
        }

        public void setUv(String uv) {
            this.uv = uv;
        }

        public String getLast_updated() {
            return last_updated;
        }

        public void setLast_updated(String last_updated) {
            this.last_updated = last_updated;
        }

        public String getFeelslike_f() {
            return feelslike_f;
        }

        public void setFeelslike_f(String feelslike_f) {
            this.feelslike_f = feelslike_f;
        }

        public String getWind_degree() {
            return wind_degree;
        }

        public void setWind_degree(String wind_degree) {
            this.wind_degree = wind_degree;
        }

        public String getLast_updated_epoch() {
            return last_updated_epoch;
        }

        public void setLast_updated_epoch(String last_updated_epoch) {
            this.last_updated_epoch = last_updated_epoch;
        }

        public String getIs_day() {
            return is_day;
        }

        public void setIs_day(String is_day) {
            this.is_day = is_day;
        }

        public String getPrecip_in() {
            return precip_in;
        }

        public void setPrecip_in(String precip_in) {
            this.precip_in = precip_in;
        }

        public String getWind_dir() {
            return wind_dir;
        }

        public void setWind_dir(String wind_dir) {
            this.wind_dir = wind_dir;
        }

        public String getGust_mph() {
            return gust_mph;
        }

        public void setGust_mph(String gust_mph) {
            this.gust_mph = gust_mph;
        }

        public String getTemp_c() {
            return temp_c;
        }

        public void setTemp_c(String temp_c) {
            this.temp_c = temp_c;
        }

        public String getPressure_in() {
            return pressure_in;
        }

        public void setPressure_in(String pressure_in) {
            this.pressure_in = pressure_in;
        }

        public String getGust_kph() {
            return gust_kph;
        }

        public void setGust_kph(String gust_kph) {
            this.gust_kph = gust_kph;
        }

        public String getTemp_f() {
            return temp_f;
        }

        public void setTemp_f(String temp_f) {
            this.temp_f = temp_f;
        }

        public String getPrecip_mm() {
            return precip_mm;
        }

        public void setPrecip_mm(String precip_mm) {
            this.precip_mm = precip_mm;
        }

        public String getCloud() {
            return cloud;
        }

        public void setCloud(String cloud) {
            this.cloud = cloud;
        }

        public String getWind_kph() {
            return wind_kph;
        }

        public void setWind_kph(String wind_kph) {
            this.wind_kph = wind_kph;
        }

        public Condition getCondition() {
            return condition;
        }

        public void setCondition(Condition condition) {
            this.condition = condition;
        }

        public String getWind_mph() {
            return wind_mph;
        }

        public void setWind_mph(String wind_mph) {
            this.wind_mph = wind_mph;
        }

        public String getVis_km() {
            return vis_km;
        }

        public void setVis_km(String vis_km) {
            this.vis_km = vis_km;
        }

        public String getHumidity() {
            return humidity;
        }

        public void setHumidity(String humidity) {
            this.humidity = humidity;
        }

        public String getPressure_mb() {
            return pressure_mb;
        }

        public void setPressure_mb(String pressure_mb) {
            this.pressure_mb = pressure_mb;
        }

        public String getVis_miles() {
            return vis_miles;
        }

        public void setVis_miles(String vis_miles) {
            this.vis_miles = vis_miles;
        }

        public class Condition{
            private int code;
            private String icon;
            private String text;

            public Condition(int code, String icon, String text) {
                this.code = code;
                this.icon = icon;
                this.text = text;
            }

            public int getCode() {
                return code;
            }

            public void setCode(int code) {
                this.code = code;
            }

            public String getIcon() {
                return icon;
            }

            public void setIcon(String icon) {
                this.icon = icon;
            }

            public String getText() {
                return text;
            }

            public void setText(String text) {
                this.text = text;
            }
        }
    }
}
