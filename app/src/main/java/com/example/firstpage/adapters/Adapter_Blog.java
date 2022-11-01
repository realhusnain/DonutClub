package com.example.firstpage.adapters;

import static java.security.AccessController.getContext;

import android.graphics.PorterDuff;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.example.firstpage.R;
import com.example.firstpage.models.ModelClass2;

import java.util.ArrayList;

public class Adapter_Blog extends RecyclerView.Adapter<Adapter_Blog.ViewHolder> {

    private ArrayList<ModelClass2> list;


    public Adapter_Blog(ArrayList<ModelClass2> list) {
        this.list = list;

    }

    @NonNull
    @Override
    public Adapter_Blog.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_blog, parent, false);
        return new ViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull Adapter_Blog.ViewHolder holder, int position) {

        int alex_dp = list.get(position).getIv_alex();
        int Main_img = list.get(position).getmainimg();
        int drawable_dot = list.get(position).getDraw_dot();
        int iv_heart = list.get(position).getIv_heart();
        int iv_comment = list.get(position).getIv_comment();

        String name = list.get(position).getText1();
        String oman = list.get(position).getText2();
        String time = list.get(position).getText4();
        String description = list.get(position).getText5();
        String like = list.get(position).getText6();
        String comment = list.get(position).getText7();

        if (list.get(position).isLike()) {
            holder.Iv_heart.setColorFilter(ContextCompat.getColor(holder.itemView.getContext(), R.color.red), PorterDuff.Mode.MULTIPLY);
        } else {
            holder.Iv_heart.setColorFilter(ContextCompat.getColor(holder.itemView.getContext(), R.color.black), android.graphics.PorterDuff.Mode.MULTIPLY);
        }
        holder.drawable_dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                PopupMenu popupMenu = new PopupMenu(view.getContext(), holder.drawable_dot);
                popupMenu.getMenuInflater().inflate(R.menu.popup_menu2, popupMenu.getMenu());
                popupMenu.show();

            }
        });


        holder.Iv_heart.setOnClickListener(view -> {
            list.get(position).setLike(!list.get(position).isLike());
            Adapter_Blog.this.notifyItemChanged(position);
        });

        holder.setData(alex_dp, Main_img, drawable_dot, iv_heart, iv_comment, oman, name, time, description, like, comment);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public ImageView iv_alex, main_img, drawable_dot, Iv_heart, iv_comment;
        private TextView textView1, textView2, textView4, textView5, textView6, textView7;


        public ViewHolder(View view) {
            super(view);
            iv_alex = itemView.findViewById(R.id.alex_image);
            main_img = itemView.findViewById(R.id.group_pic);
            drawable_dot = itemView.findViewById(R.id.btn_three);
            Iv_heart = itemView.findViewById(R.id.heart);
            iv_comment = itemView.findViewById(R.id.comment);
            textView1 = itemView.findViewById(R.id.alex_blog);
            textView2 = itemView.findViewById(R.id.Oman);
            textView4 = itemView.findViewById(R.id.date);
            textView5 = itemView.findViewById(R.id.description_blog);
            textView6 = itemView.findViewById(R.id.text21);
            textView7 = itemView.findViewById(R.id.text28);


        }

        public void setData(int alex_dp, int grp_img, int dot, int heart, int draw_comment, String name, String oman, String time, String description, String like, String comment) {
            iv_alex.setImageResource(alex_dp);
            main_img.setImageResource(grp_img);
            drawable_dot.setImageResource(dot);
            Iv_heart.setImageResource(heart);
            iv_comment.setImageResource(draw_comment);
            textView1.setText(name);
            textView2.setText(oman);
            textView4.setText(time);
            textView5.setText(description);
            textView6.setText(like);
            textView7.setText(comment);


        }
    }
}

