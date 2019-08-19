package com.example.mobilenewsapp;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    private List<News> Newses = new ArrayList<>();
    private News_Tekil tekil_news;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final RecyclerView liste = (RecyclerView) findViewById(R.id.list);
        liste.setLayoutManager(new LinearLayoutManager(this));
        ApiInterface servis = ApiClient.GetClient().create(ApiInterface.class);
        Call<News[]> cagri = servis.getNews();
        cagri.enqueue(new Callback<News[]>() {
            @Override
            public void onResponse(Call<News[]> call, Response<News[]> response) {
                Newses = Arrays.asList(response.body());
                tekil_news = new News_Tekil(Newses, R.layout.news, getApplicationContext());
                liste.setAdapter(tekil_news);
            }

            @Override
            public void onFailure(Call<News[]> call, Throwable t)
            {

            }
        });
    }
}


