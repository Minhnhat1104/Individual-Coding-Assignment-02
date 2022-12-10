package com.example.todolist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public  class CongViecAdaptor extends BaseAdapter {
    private Context context;
    private int layout;

    private List<CongViec> congViecList;

    public CongViecAdaptor(Context context, int layout, List<CongViec> congViecList) {
        this.context = context;
        this.layout = layout;
        this.congViecList = congViecList;
    }

    public int getCount() {
        return congViecList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    private class viewHolder {
        TextView txtTen;
        ImageView imgDelete, imgEdit;

    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder holder = null;

        if (view ==nul) {
            holder=new ViewHolder();
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(layout, null);
            holder.txtTen = (TextView) view.findViewById(R.id.textviewTen);
            hodler.imgDelete = (ImageView) view.findViewById(R.id.imageviewDelete);
            hodler.imgEdit = (ImageView) view.findViewById(R.id.imageviewEdit);
        } else {
            hodler = view.getTag();
        }

        Congviec congViec = congViecList.get(i);
        holder.txtTen.setText(congViec.getTenCV());

        return view;
    }
}