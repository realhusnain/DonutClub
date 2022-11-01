package com.example.firstpage.adapters;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.firstpage.R;
import com.example.firstpage.activities.MainActivityChat;
import com.example.firstpage.models.ModelClass;


//OnCreateViewHolder
//OnBindViewHolder
//GetItemCount

public class Adapter_class extends RecyclerView.Adapter<Adapter_class.ViewHolder> {

    private ArrayList<ModelClass> userlist;


    public Adapter_class(ArrayList<ModelClass> userlist) {
        this.userlist = userlist;
    }

    @NonNull
    @Override
    public Adapter_class.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_chat, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter_class.ViewHolder holder, int position) {
        int image_resource = userlist.get(position).getImageview1();
        String name = userlist.get(position).getText1();
        String msg = userlist.get(position).getText2();
        String time = userlist.get(position).getText3();
        holder.setData(image_resource, name, msg, time);




    }

    @Override
    public int getItemCount() {
        return userlist.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView imageView;
        private TextView textView;
        private TextView textView2;
        private TextView textView3;

      LinearLayout linear;

        public ViewHolder(View view) {
            super(view);
            imageView = itemView.findViewById(R.id.picture1);
            textView = itemView.findViewById(R.id.alex);
            textView2 = itemView.findViewById(R.id.description);
            textView3 = itemView.findViewById(R.id.today_date);

            linear = itemView.findViewById(R.id.linearChat);
            linear.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    view.getContext().startActivity(new Intent(linear.getContext(), MainActivityChat.class));


                }
            });
        }


        public void setData(int image_resource, String name, String msg, String time) {
            imageView.setImageResource(image_resource);
            textView.setText(name);
            textView2.setText(msg);
            textView3.setText(time);
        }
    }
}

