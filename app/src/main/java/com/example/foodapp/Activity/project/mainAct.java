package com.example.foodapp.Activity.project;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.foodapp.Activity.project.Adapter.CategoryAdapter;
import com.example.foodapp.Activity.project.Adapter.PopularAdapter;
import com.example.foodapp.Activity.project.domain.CategoryDomain;
import com.example.foodapp.Activity.project.domain.FoodDomain;
import com.example.foodapp.R;

import java.util.ArrayList;

public class mainAct extends AppCompatActivity {
    private RecyclerView.Adapter adapter,adapter2;
    private RecyclerView recyclerViewcategorylist,recyclerViewPopularlist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerviewcategory();
        recylerviewpopular();
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
    private void recylerviewpopular(){
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        recyclerViewPopularlist=findViewById(R.id.recyclerview2);


        ArrayList<FoodDomain> foodlist=new ArrayList<>();
        foodlist.add(new FoodDomain("Pepperoni pizza","pizza"," Cheese slices ,mozerella cheese,oregano,black salt,pepper,chilli flakes",80.00));
        foodlist.add(new FoodDomain("Cheese Burger","pop_2"," mozerella cheese,mayonnaise,oregano,pepper,chilli flakes,tomato,onion",90.00));
        foodlist.add(new FoodDomain("Mix Veg pizza","pop_3"," Cheese slices ,Vegetables,mozerella cheese,oregano,corn,pepper,chilli flakes",95.00));

        recyclerViewPopularlist.setLayoutManager(linearLayoutManager);
        adapter2=new PopularAdapter(foodlist);
        recyclerViewPopularlist.setAdapter(adapter2);
    }

}