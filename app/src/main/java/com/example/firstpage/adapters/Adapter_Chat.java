package com.example.firstpage.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.firstpage.R;
import com.example.firstpage.models.ModelChat;

import java.util.List;

public class Adapter_Chat extends RecyclerView.Adapter<Adapter_Chat.ViewHolder> {

    private int message_send = 0;
    private int message_receive = 1;
    private List<ModelChat> arrayList;

    public Adapter_Chat(List<ModelChat> arrayList) {
        this.arrayList = arrayList;
    }


    @Override
    public Adapter_Chat.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view;
        if (viewType == message_send) {
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_chat_right, parent, false);
        } else {
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_chat_left, parent, false);
        }

        return new ViewHolder(view);

    }


    @Override
    public void onBindViewHolder(Adapter_Chat.ViewHolder holder, int position) {
        ModelChat modelChat = arrayList.get(position);
        holder.tvText.setText(modelChat.getTxt());
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    @Override
    public int getItemViewType(int position) {

        if (arrayList.get(position).isSender()) {
            return message_send;
        } else {
            return message_receive;
        }
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        private TextView tvText;


        public ViewHolder(View view) {
            super(view);
            tvText = itemView.findViewById(R.id.tv_text);
        }
    }
}










