package com.example.firstpage.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.example.firstpage.R;


public class AdapterHome extends BaseAdapter {

    int[] images;
    Context context;


    public AdapterHome(int[] images, Context context) {
        this.images = images;
        this.context = context;
    }


    @Override
    public int getCount() {
        return images.length;
    }


    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int index, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);

        view = inflater.inflate(R.layout.item_home, null);
        ImageView imageView = (ImageView) view.findViewById(R.id.homeImage);
        imageView.setImageResource(images[index]);
        return view;
    }
}