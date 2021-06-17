package com.example.menusample;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

public class MenuThanksActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_thanks);

        Intent intent=getIntent();

        String menuName=intent.getStringExtra("menuName");
        String menuPrice=intent.getStringExtra("menuPrice");


        TextView tvMenuName=findViewById(R.id.tvMenuName);
        TextView tvMenuPrice=findViewById(R.id.tvMenuPrice);

        tvMenuName.setText(menuName);
        tvMenuPrice.setText(menuPrice);

        ActionBar actionBar=getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        boolean returnVal=true;
        int itemd=item.getItemId();

        if(itemd==android.R.id.home){
            finish();
        }
        else{
            returnVal=super.onOptionsItemSelected(item);
        }
        return returnVal;
    }


}