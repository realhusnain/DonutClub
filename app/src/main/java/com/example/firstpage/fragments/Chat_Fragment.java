package com.example.firstpage.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.firstpage.R;
import com.example.firstpage.adapters.Adapter_class;
import com.example.firstpage.models.ModelClass;

import java.util.ArrayList;
import java.util.List;

public class Chat_Fragment extends Fragment {
    LinearLayoutManager layoutManager;
    RecyclerView recyclerView;
    List<ModelClass> userlist;
    Adapter_class adapter;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_chat_, container, false);


        initData();
        initRecyclerView(view);
        return view;
    }

    private void initData() {
        userlist = new ArrayList<>();
        userlist.add(new ModelClass(R.drawable.image_card, "Alex Jones", "Sure,I'll pick you up:)", "Today 12:25"));
        userlist.add(new ModelClass(R.drawable.cardview2, "Alex Jones", "Sure,I'll pick you up:)", "Today 12:25"));
        userlist.add(new ModelClass(R.drawable.cardview3, "Alex Jones", "Sure,I'll pick you up:)", "Today 12:25"));
        userlist.add(new ModelClass(R.drawable.cardview4, "Alex Jones", "Sure,I'll pick you up:)", "Today 12:25"));
        userlist.add(new ModelClass(R.drawable.image_card, "Alex Jones", "Sure,I'll pick you up:)", "Today 12:25"));
        userlist.add(new ModelClass(R.drawable.image_card, "Alex Jones", "Sure,I'll pick you up:)", "Today 12:25"));
        userlist.add(new ModelClass(R.drawable.cardview2, "Alex Jones", "Sure,I'll pick you up:)", "Today 12:25"));
        userlist.add(new ModelClass(R.drawable.cardview3, "Alex Jones", "Sure,I'll pick you up:)", "Today 12:25"));
        userlist.add(new ModelClass(R.drawable.cardview4, "Alex Jones", "Sure,I'll pick you up:)", "Today 12:25"));
        userlist.add(new ModelClass(R.drawable.image_card, "Alex Jones", "Sure,I'll pick you up:)", "Today 12:25"));
    }

    private void initRecyclerView(View view) {

        recyclerView = view.findViewById(R.id.recycler_View);
        layoutManager = new LinearLayoutManager(getActivity());
        layoutManager.setOrientation(RecyclerView.VERTICAL);


        recyclerView.setLayoutManager(layoutManager);
        adapter = new Adapter_class((ArrayList<ModelClass>) userlist);
        recyclerView.setAdapter(adapter);

    }

}