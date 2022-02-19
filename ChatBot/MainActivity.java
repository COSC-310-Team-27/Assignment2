package com.example.chatbot;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Scanner;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "error" ;
    Button btnReply, btnStart;
    TextView txtViewUser;
    EditText editTxtChatBot, editTxtReply;
    Person person;
    ChatBot chatBot;
    public int index = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnReply = findViewById(R.id.btnReply);
        btnStart = findViewById(R.id.btnStart);
        txtViewUser = findViewById(R.id.txtViewUser);
        editTxtChatBot = findViewById(R.id.editTxtChatBot);
        editTxtReply = findViewById(R.id.editTxtReply);
        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chatBot = new ChatBot();
                person = new Person();
                editTxtChatBot.setText(chatBot.getGreeting());
                askUser();
                index++;
            }
        });
        btnReply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getReply();
            }
        });

    }
    public void askUser() {
        Toast.makeText(MainActivity.this, chatBot.getQuestion(index),Toast.LENGTH_LONG).show();
        editTxtChatBot.setText(chatBot.askByName(chatBot.getQuestion(index),person.getName()));
    }
    public void getReply() {

        switch (index) {
            case 0 :
                person.setName(editTxtReply.getText().toString());
            case 1:

                person.setAge(editTxtReply.getText().toString());
            case 2: {
                person.setOccupation(editTxtReply.getText().toString());
            }
            case 3: {
                person.setHobbies(editTxtReply.getText().toString());
            }
            case 4: {
                person.setQuery(editTxtReply.getText().toString());
            }
            case 5: {
                person.setOccupation(editTxtReply.getText().toString());
            }

            editTxtReply.setText(" ");
            askUser();
            index++;
        }

        }

}