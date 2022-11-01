package com.example.firstpage.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.PopupMenu;

import com.example.firstpage.R;
import com.example.firstpage.adapters.Adapter_Blog;
import com.example.firstpage.models.ModelClass2;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;

public class Blog_fragment extends Fragment {
    RecyclerView recyclerView;
    LinearLayoutManager layoutManager;
    List<ModelClass2> list;
    Adapter_Blog adapter;
    Button button;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.blog_fragment, container, false);
        initData();
        initRecyclerView(view);

        button= view.findViewById(R.id.btn_Six);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PopupMenu popupMenu= new PopupMenu(getContext(),button);
                popupMenu.getMenuInflater().inflate(R.menu.popup_menu, popupMenu.getMenu());
                popupMenu.show();

            }
        });


        return view;
    }

    private void initData() {
        list = new ArrayList<>();

        list.add(new ModelClass2(R.drawable.blog, R.drawable.groupstudy, "Oman", "Alex Jones", R.drawable.ic_baseline_more_horiz_24, "2 mintues ago", "For athletes, high altitude produces two or more \\n condradictory effects on performance.For example", R.drawable.ic_outline_favorite_border_24, R.drawable.chat_24, "21", "28"));
        list.add(new ModelClass2(R.drawable.blog, R.drawable.groupstudy, "Oman", "Alex Jones", R.drawable.ic_baseline_more_horiz_24, "2 mintues ago", "For athletes, high altitude produces two or more \\n condradictory effects on performance.For example", R.drawable.ic_outline_favorite_border_24, R.drawable.chat_24, "21", "28"));
        list.add(new ModelClass2(R.drawable.blog, R.drawable.groupstudy, "Oman", "Alex Jones", R.drawable.ic_baseline_more_horiz_24, "2 mintues ago", "For athletes, high altitude produces two or more \\n condradictory effects on performance.For example", R.drawable.ic_outline_favorite_border_24, R.drawable.chat_24, "21", "28"));
        list.add(new ModelClass2(R.drawable.blog, R.drawable.groupstudy, "Oman", "Alex Jones", R.drawable.ic_baseline_more_horiz_24, "2 mintues ago", "For athletes, high altitude produces two or more \\n condradictory effects on performance.For example", R.drawable.ic_outline_favorite_border_24, R.drawable.chat_24, "21", "28"));
    }

    private void initRecyclerView(View view) {
        recyclerView = view.findViewById(R.id.recycler_View_blog);
        layoutManager = new LinearLayoutManager(getActivity());
        layoutManager.setOrientation(RecyclerView.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        adapter = new Adapter_Blog((ArrayList<ModelClass2>) list);

        recyclerView.setAdapter(adapter);


    }
}