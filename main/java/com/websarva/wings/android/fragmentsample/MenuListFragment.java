package com.websarva.wings.android.fragmentsample;

import android.app.Activity;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MenuListFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Activity parentActivity=getActivity();

        View view=inflater.inflate(R.layout.fragment_menu_list,container,false);

        ListView lvMenu=view.findViewById(R.id.lvMenu);

        List<Map<String,String>> menuList=new ArrayList<>();

        Map<String,String>menu=new HashMap<>();
        menu.put("name","唐揚げ");
        menu.put("price","８００円");
        menuList.add(menu);

        menu=new HashMap<>();
        menu.put("name","ステーキ");
        menu.put("price","８５０円");
        menuList.add(menu);

        menu=new HashMap<>();
        menu.put("name","がん");
        menu.put("price","９００円");
        menuList.add(menu);

        menu=new HashMap<>();
        menu.put("name","かつ");
        menu.put("price","１００円");
        menuList.add(menu);

        String[] from={"name","price"};
        int[] to={android.R.id.text1,android.R.id.text2};

        SimpleAdapter adapter=new SimpleAdapter
                (parentActivity,menuList, android.R.layout.simple_list_item_2,from,to);
        lvMenu.setAdapter(adapter);

        return view;

    }
}