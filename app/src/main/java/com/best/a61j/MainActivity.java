package com.best.a61j;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.GridView;

import com.best.a61j.Module.GetAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    GridView gridView;
    Context context;
    LayoutInflater inflater;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        open();
        ArrayList<Details> list = getData();
        refresh(list);
    }

    public void open() {
        gridView = findViewById(R.id.gridViewBtn1);
    }

    public void refresh(ArrayList<Details> list) {
        GetAdapter adapter = new GetAdapter(this,list);
        gridView.setAdapter(adapter);
    }

    public ArrayList<Details> getData() {
        ArrayList<Details> list = new ArrayList<>();
        for (int i = 1; i <= 20; i++) {
            list.add(new Details("Programmer "+i, R.drawable.rasm1));
        }
        return list;
    }

}