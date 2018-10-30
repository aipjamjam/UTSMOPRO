package com.example.aipjamjam.uts_mopro;

import android.content.Intent;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    private ArrayList<Makanan> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);

        list = new ArrayList<>();
        list.addAll(DataMakanan.getListData());

        showListPresident();

    }

    private void showListPresident() {
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        ListMakanan listMakanan= new ListMakanan(this);
        listMakanan.setListmakanan(list);
        recyclerView.setAdapter(listMakanan);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.main_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    private void setActionBarTitle(String title){
        getSupportActionBar().setTitle(title);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        String title = null;
        switch (item.getItemId()){
            case R.id.action_profile:
                title = "MyProfile";
                break;
            case R.id.action_change_language:
                title = "Change Language";
                break;
        }
        setActionBarTitle(title);
        return super.onOptionsItemSelected(item);
    }

    /*
    public void profileku(MenuItem view) {
        Intent i = new Intent(MainActivity.this, MyProfile.class);
        startActivity(i);
    }*/
}
