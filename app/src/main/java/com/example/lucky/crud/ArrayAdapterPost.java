package com.example.lucky.crud;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class ArrayAdapterPost extends BaseAdapter {

    ArrayList<Post> myList;
    LayoutInflater myLayoutInflater;
    Context context;

    public ArrayAdapterPost(Context context, ArrayList<Post> lista) {
        this.myList = lista;
        this.context = context;
        this.myLayoutInflater = LayoutInflater.from(this.context);
    }

    @Override
    public int getCount() {
        return myList.size();
    }

    @Override
    public Post getItem(int i) {
        return myList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        MyViewHolder myViewHolder;
        if (view == null) {
            view = myLayoutInflater.inflate(R.layout.layout_list_item, null);
            myViewHolder = new MyViewHolder();
            view.setTag(myViewHolder);
        } else {
            myViewHolder = (MyViewHolder) view.getTag();
        }
        myViewHolder.txtPostId = setText(view, R.id.tvPostId, myList.get(i).getPostId());
        myViewHolder.txtUserId = setText(view, R.id.tvUserId, myList.get(i).getUserId());
        myViewHolder.txtBody = setText(view, R.id.tvBody, myList.get(i).getBody());
        myViewHolder.txtTitle = setText(view, R.id.tvTitle, myList.get(i).getTitle());
        return view;
    }

    public TextView setText(View view, int i, String text) {
        TextView tv = (TextView) view.findViewById(i);
        tv.setText(text);
        return tv;
    }

    private class MyViewHolder {
        TextView txtUserId, txtPostId, txtTitle, txtBody;
    }

}