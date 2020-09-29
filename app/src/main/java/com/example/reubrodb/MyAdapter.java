package com.example.reubrodb;


import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;




import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import static android.provider.ContactsContract.CommonDataKinds.Website.URL;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {


    String status[];
    int count;

    Context context;

    public MyAdapter(Context ct,String jstatus[],int c){


        context=ct;
        status=jstatus;
        count=c;


    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {

        LayoutInflater inflater=LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.my_row, parent , false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int i) {
        holder.mytext1.setText(status[i]);


    }

    @Override
    public int getItemCount() {
        return count;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView mytext1;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            mytext1=itemView.findViewById(R.id.textView);

        }
    }
}
