package com.example.weatherapp.RetrofitSample;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class Model {

        private String status;
        private String message;
        Data data;

        public Model(String status, String message, Data data) {
            this.status = status;
            this.message = message;
            this.data = data;
        }

        public String getStatus() {
            return status;
        }

        public String getMessage() {
            return message;
        }

        public Data getData() {
            return data;
        }

        public class Data {

            @SerializedName("Daily_market_summary")
            ArrayList<Daily> dailyMarketSummary = new ArrayList<Daily>();

            @SerializedName("Equity_Research_Report")
            ArrayList<Weekly> weeklyMarketSummary = new ArrayList<Weekly>();

            @SerializedName("IPO_Snapshots")
            ArrayList<Monthly> monthlyMarketSummary = new ArrayList<Monthly>();

            public Data(ArrayList<Daily> dailyMarketSummary, ArrayList<Weekly> weeklyMarketSummary, ArrayList<Monthly> monthlyMarketSummary) {
                this.dailyMarketSummary = dailyMarketSummary;
                this.weeklyMarketSummary = weeklyMarketSummary;
                this.monthlyMarketSummary = monthlyMarketSummary;
            }

            public ArrayList<Daily> getDailyMarketSummary() {
                return dailyMarketSummary;
            }

            public ArrayList<Weekly> getWeeklyMarketSummary() {
                return weeklyMarketSummary;
            }

            public ArrayList<Monthly> getMonthlyMarketSummary() {
                return monthlyMarketSummary;
            }

            public class Daily   {

                private String Name;
                private String Author_source;
                private String Description;
                private String File_attachment;
                private String Image;
                private String Posted_on;

                public Daily(String name, String author_source, String description, String file_attachment, String image, String posted_on) {
                    Name = name;
                    Author_source = author_source;
                    Description = description;
                    File_attachment = file_attachment;
                    Image = image;
                    Posted_on = posted_on;
                }

                public String getName() {
                    return Name;
                }

                public String getAuthor_source() {
                    return Author_source;
                }

                public String getDescription() {
                    return Description;
                }

                public String getFile_attachment() {
                    return File_attachment;
                }

                public String getImage() {
                    return Image;
                }

                public String getPosted_on() {
                    return Posted_on;
                }
            }

            public class Weekly   {
                private String Name;
                private String Author_source;
                private String Description;
                private String File_attachment;
                private String Image;
                private String Posted_on;

                public Weekly(String name, String author_source, String description, String file_attachment, String image, String posted_on) {
                    Name = name;
                    Author_source = author_source;
                    Description = description;
                    File_attachment = file_attachment;
                    Image = image;
                    Posted_on = posted_on;
                }

                public String getName() {
                    return Name;
                }

                public String getAuthor_source() {
                    return Author_source;
                }

                public String getDescription() {
                    return Description;
                }

                public String getFile_attachment() {
                    return File_attachment;
                }

                public String getImage() {
                    return Image;
                }

                public String getPosted_on() {
                    return Posted_on;
                }
            }

            public class Monthly   {
                private String Name;
                private String Author_source;
                private String Description;
                private String File_attachment;
                private String Image;
                private String Posted_on;

                public Monthly(String name, String author_source, String description, String file_attachment, String image, String posted_on) {
                    Name = name;
                    Author_source = author_source;
                    Description = description;
                    File_attachment = file_attachment;
                    Image = image;
                    Posted_on = posted_on;
                }

                public String getName() {
                    return Name;
                }

                public String getAuthor_source() {
                    return Author_source;
                }

                public String getDescription() {
                    return Description;
                }

                public String getFile_attachment() {
                    return File_attachment;
                }

                public String getImage() {
                    return Image;
                }

                public String getPosted_on() {
                    return Posted_on;
                }
            }
        }
}