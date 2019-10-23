package com.example.dicodings;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvCategory;

    private ArrayList<Karakter> list = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvCategory = findViewById(R.id.rv_category);
        rvCategory.setHasFixedSize(true);
        list.addAll(KarakterData.getListData());
        showRecyclerList();
    }
    private void showRecyclerList(){
        rvCategory.setLayoutManager(new LinearLayoutManager(this));
        ListKarakterAdapter listKarakterAdapter = new ListKarakterAdapter(list);
        rvCategory.setAdapter(listKarakterAdapter);
        listKarakterAdapter.setOnItemClickCallback(new ListKarakterAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Karakter data) {
                Intent moveIntent = new Intent(MainActivity.this, DetailActivity.class);
                moveIntent.putExtra(DetailActivity.EXTRA_NAME, data.getName());
                moveIntent.putExtra(DetailActivity.EXTRA_DETAIL, data.getFrom());
                moveIntent.putExtra(DetailActivity.EXTRA_LINK, data.getPhoto());
                startActivity(moveIntent);
            }
        });
    }
    private void showSelectedPresident(Karakter data){
        Toast.makeText(this, "Kamu memilih "+data.getName(), Toast.LENGTH_SHORT).show();
    }
}
