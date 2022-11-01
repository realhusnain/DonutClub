package com.example.firstpage.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.firstpage.adapters.Adapter_Chat;
import com.example.firstpage.models.ModelChat;
import com.example.firstpage.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivityChat extends AppCompatActivity {
    Button button;
    Button sendMsg;
    TextView type;

    RecyclerView recyclerView;
    Adapter_Chat MessageAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_chat);

        sendMsg = findViewById(R.id.Msg_send);
        type = findViewById(R.id.editType);

        button = findViewById(R.id.chatBackButton);
        recyclerView = findViewById(R.id.recyclerChat);

        List<ModelChat> modelChats = new ArrayList<>();

        modelChats.add(new ModelChat("Hello", true));
        modelChats.add(new ModelChat("Hey", false));
        modelChats.add(new ModelChat("How are you", true));
        modelChats.add(new ModelChat("I am fine", false));
        modelChats.add(new ModelChat("What about you?", false));
        MessageAdapter = new Adapter_Chat(modelChats);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        layoutManager.setOrientation(RecyclerView.VERTICAL);
        recyclerView.setAdapter(MessageAdapter);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        sendMsg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (MessageAdapter != null) {
                    String txt = type.getText().toString().trim();

                    if (!txt.isEmpty()) {
                        modelChats.add(new ModelChat(txt, true));
                        MessageAdapter.notifyItemInserted(modelChats.size() - 1);
                        recyclerView.scrollToPosition(modelChats.size()-1);
                        type.setText(null);
                    }
                } else {

                }
            }
        });
    }
}