package com.example.mobilenewsapp;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;

public class News_Tekil extends RecyclerView.Adapter<News_Tekil.NewsYerleskesi>
{
    private List<News> newses;
    private int siralayout;
    private Context context;
    public static class NewsYerleskesi extends RecyclerView.ViewHolder
    {
        TextView Title, Type, Description, ReleaseDate;
        ImageView Image;
        public NewsYerleskesi(View v)
        {
            super(v);
            Title=(TextView) v.findViewById(R.id.newsTitle);
            Image=(ImageView) v.findViewById(R.id.newsImage);
            Description =(TextView) v.findViewById(R.id.newsContent);
            Type=(TextView) v.findViewById(R.id.newsType);
            ReleaseDate=(TextView) v.findViewById(R.id.newsReleaseDate);

        }
    }
    public News_Tekil(List<News> newses,int siralayout,Context context)
    {
        this.newses=newses;
        this.siralayout=siralayout;
        this.context=context;

    }
    public NewsYerleskesi onCreateViewHolder (ViewGroup v,int viewType)
    {
        View view= LayoutInflater.from(v.getContext()).inflate(siralayout,v,false);
        return new NewsYerleskesi(view);
    }
    public void onBindViewHolder(NewsYerleskesi tutucu,int sira)
    {
        tutucu.Title.setText(newses.get(sira).newsTitle);
        tutucu.Description.setText(newses.get(sira).newsContent);
        tutucu.Type.setText(newses.get(sira).newsType);
        tutucu.ReleaseDate.setText(newses.get(sira).newsReleaseDate);

    }
    public int getItemCount()
    {
        return newses.size();
    }
}
