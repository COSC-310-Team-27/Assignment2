package com.example.chatbot2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    ArrayList names, messages,images;

    Context context;
    public MyAdapter(Context context, ArrayList names, ArrayList messages, ArrayList images) {

        this.context = context;
        this.names = names;
        this.messages = messages;
        this.images = images;


    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.my_row, parent, false);
        System.out.println("onCreateViewHolder");
        return new MyViewHolder(view);
    }
    @Override
    public void onBindViewHolder(@NonNull MyAdapter.MyViewHolder holder, int position) {

        holder.textViewName.setText(names.get(position).toString());
        holder.textViewMessage.setText(messages.get(position).toString());
        holder.imageViewAvatar.setImageResource((Integer) images.get(position));
        System.out.println("onBindViewHolder");
    }
    @Override
    public int getItemCount() {
        return messages.size();
    }


    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView textViewName, textViewMessage;
        ImageView imageViewAvatar;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            textViewName = itemView.findViewById(R.id.textViewName);
            textViewMessage = itemView.findViewById(R.id.textViewMessage);
            imageViewAvatar = itemView.findViewById(R.id.imageViewAvatar);
            System.out.println("MyViewHolder");

        }
    }


}
