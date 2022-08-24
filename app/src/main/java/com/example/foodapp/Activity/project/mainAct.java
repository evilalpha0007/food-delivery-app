package com.example.foodapp.Activity.project;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.foodapp.Activity.project.Adapter.CategoryAdapter;
import com.example.foodapp.Activity.project.domain.CategoryDomain;
import com.example.foodapp.R;

import java.util.ArrayList;

public class mainAct extends AppCompatActivity {
    private RecyclerView.Adapter adapter;
    private RecyclerView recyclerViewcategorylist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerviewcategory();
    }
    private void recyclerviewcategory(){
        recyclerViewcategorylist=findViewById(R.id.recyclerview);

        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);

        recyclerViewcategorylist.setLayoutManager(linearLayoutManager);

        ArrayList<CategoryDomain> category=new ArrayList<>();

        category.add(new CategoryDomain("Pizza","cat_1"));
        category.add(new CategoryDomain("Burger","cat_2"));
        category.add(new CategoryDomain("Hotdog","cat_3"));
        category.add(new CategoryDomain("Drinks","cat_4"));
        category.add(new CategoryDomain("Donut","cat_5"));

        adapter=new CategoryAdapter(category);
        recyclerViewcategorylist.setAdapter(adapter);

    }

}