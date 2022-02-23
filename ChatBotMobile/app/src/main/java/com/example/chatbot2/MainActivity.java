package com.example.chatbot2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.Rect;
import android.media.Image;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Person person = new Person();
    ChatBot chatBot = new ChatBot();
    FloatingActionButton btnMessage;
    EditText editTxtMessage;
    RecyclerView recyclerView;
    ArrayList<String> names = new ArrayList<>();
    ArrayList<String> messages = new ArrayList<>();
    ArrayList<Integer> images = new ArrayList<>();

    MyAdapter myAdapter;

    CountDownTimer timer = new CountDownTimer(500,1) {
        @Override
        public void onTick(long l) {
            //Toast.makeText(MainActivity.this, "Tick", Toast.LENGTH_LONG).show();
        }

        @Override
        public void onFinish() {
            //Toast.makeText(MainActivity.this, "Finished delay", Toast.LENGTH_LONG).show();
            chatBot();
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnMessage = findViewById(R.id.btnMessage);
        editTxtMessage = findViewById(R.id.editTxtMessage);
        recyclerView = findViewById(R.id.recyclerView);

        myAdapter = new MyAdapter(this, names,messages,images);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL,false );
        layoutManager.scrollToPosition(myAdapter.getItemCount()-1);
        //recyclerView.scrollToPosition(myAdapter.getItemCount());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(myAdapter);
        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(recyclerView.getContext(), DividerItemDecoration.VERTICAL);
        dividerItemDecoration.setDrawable(ContextCompat.getDrawable(MainActivity.this, R.drawable.divider));
        recyclerView.addItemDecoration(dividerItemDecoration);

        images.add(R.drawable.bot);
        names.add("Bot");
        messages.add(chatBot.getQuestion());
        //myAdapter.notifyDataSetChanged();

        btnMessage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String m = editTxtMessage.getText().toString();
                images.add(R.drawable.user);
                names.add("User");
                messages.add(m);
                myAdapter.notifyDataSetChanged();

                timer.start();

            }
        });
    }

    public void chatBot() {
        images.add(R.drawable.bot);
        names.add("Bot");
        messages.add(chatBot.getQuestion());
        myAdapter.notifyDataSetChanged();
    }
}
