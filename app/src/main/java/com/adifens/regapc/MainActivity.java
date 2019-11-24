package com.adifens.regapc;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.adifens.regapc.adapter.GameGridAdapter;
import com.adifens.regapc.adapter.GameListAdapter;
import com.adifens.regapc.data.AboutActivity;
import com.adifens.regapc.data.GameData;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ArrayList<Game> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);

        list.addAll(GameData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList(){

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        GameListAdapter gameListAdapter = new GameListAdapter(list);
        recyclerView.setAdapter(gameListAdapter);
    }

    private void showRecyclerGrid() {
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        GameGridAdapter gameGridAdapter = new GameGridAdapter(list);
        recyclerView.setAdapter(gameGridAdapter);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        Intent goToAbout = new Intent(MainActivity.this, AboutActivity.class);
        startActivity(goToAbout);

        return super.onOptionsItemSelected(item);
    }
    public void setMode(int selectedMode) {
        switch (selectedMode) {
            case R.id.action_list:
                showRecyclerList();
                break;

            case R.id.action_grid:
                showRecyclerGrid();
                break;

        }
    }

}

