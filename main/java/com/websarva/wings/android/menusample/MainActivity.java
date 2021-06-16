package com.websarva.wings.android.menusample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

//    疑問・なぜリスト作成をメソッドの中でやったのか
//    　　　descが１ミリも出てきてない。
//    　　　　_lvMenuをローカル変数ではなく、フィールド変数として扱おうとした意味
//    　　　　getStringExtraでいちいち円を入力しなきゃいけない

    ListView _lvMenu;
    List<Map<String,Object>> _menuList;
    String[] FROM={"name","price"};
    int[] TO={R.id.tvMenuNameRow,R.id.tvMenuPriceRow};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        _lvMenu=findViewById(R.id.lvMenu);
        _menuList=createTeishokuList();
        SimpleAdapter adapter=new SimpleAdapter
                (MainActivity.this,_menuList,R.layout.row,FROM,TO);
        _lvMenu.setAdapter(adapter);
        _lvMenu.setOnItemClickListener(new ListItemClickListener());

    }

    private List<Map<String,Object>> createTeishokuList(){
        List<Map<String,Object>> menuList=new ArrayList<>();
        Map<String,Object> menu=new HashMap<>();
        menu.put("name","からあげ");
        menu.put("price",800);
        menu.put("desc","からあげ、サラダ、ごはん、みそ汁付き");
        menuList.add(menu);

        menu=new HashMap<>();
        menu.put("name","天ぷら");
        menu.put("price",1000);
        menu.put("desc","塩で食べて");
        menuList.add(menu);

        menu=new HashMap<>();
        menu.put("name","とんかつ");
        menu.put("price",100);
        menu.put("desc","おいしくないとんかつ");
        menuList.add(menu);

        menu=new HashMap<>();
        menu.put("name","焼き鳥");
        menu.put("price",150);
        menu.put("desc","そこそこな焼き鳥");
        menuList.add(menu);

        return menuList;

    }

    private class ListItemClickListener implements AdapterView.OnItemClickListener{
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            Map<String,Object> item= (Map<String, Object>) parent.getItemAtPosition(position);
            String menuName= (String) item.get("name");
            Integer menuPrice= (Integer) item.get("price");
            Log.d("Main",""+menuPrice);

            Intent intent=new Intent(MainActivity.this,MenuThanksActivity.class);

            intent.putExtra("menuName",menuName);
            intent.putExtra("menuPrice",menuPrice+"円");

            startActivity(intent);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.menu_options_menu_list,menu);
        return true;
    }


    private List<Map<String,Object>> createCurryList(){

        List<Map<String,Object>> curryList=new ArrayList<>();
        Map<String,Object> cuList=new HashMap<>();

        cuList.put("name","ジャワカレー");
        cuList.put("price",300);
        cuList.put("desc","リンゴが香るカレーだよ");
        curryList.add(cuList);

        cuList=new HashMap<>();
        cuList.put("name","バーモントカレー");
        cuList.put("price",1000);
        cuList.put("desc","こっちはリンゴと蜂蜜だい");
        curryList.add(cuList);

        cuList=new HashMap<>();
        cuList.put("name","こくまろカレー");
        cuList.put("price",200);
        cuList.put("desc","コクがあってまろやかー");
        curryList.add(cuList);

        cuList=new HashMap<>();
        cuList.put("name","ゴールドカレー");
        cuList.put("price",5000);
        cuList.put("desc","とっても美味しいよ");
        curryList.add(cuList);

        return curryList;

    }

    @Override
    public boolean onOptionsItemSelected (MenuItem item){
        boolean returnVal=true;

        switch (item.getItemId()){
            case R.id.menuListOptionTeishoku:
                _menuList=createTeishokuList();
                break;

            case R.id.menuListOptionCurry:
                _menuList=createCurryList();
                break;

            default:
                returnVal=super.onOptionsItemSelected(item);
                break;

        }
        SimpleAdapter adapter=new SimpleAdapter
                (MainActivity.this,_menuList, R.layout.row,FROM,TO);
        _lvMenu.setAdapter(adapter);
        return returnVal;


    }



}