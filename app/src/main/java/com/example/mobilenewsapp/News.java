package com.example.mobilenewsapp;

import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
public class News {

    @SerializedName("id")
    @Expose
    public Integer id;
    @SerializedName("newsTitle")
    @Expose
    public String newsTitle;
    @SerializedName("newsImage")
    @Expose
    public String newsImage;
    @SerializedName("newsType")
    @Expose
    public String newsType;
    @SerializedName("newsContent")
    @Expose
    public String newsContent;
    @SerializedName("newsReleaseDate")
    @Expose
    public String newsReleaseDate;
}
