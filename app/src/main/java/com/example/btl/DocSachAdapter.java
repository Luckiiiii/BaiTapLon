package com.example.btl;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class DocSachAdapter extends BaseAdapter {
    private Context context;
    private int layout;
    private List<Truyen> docSachList;

    public DocSachAdapter(Context context, int layout, List<Truyen> docSachList) {
        this.context = context;
        this.layout = layout;
        this.docSachList = docSachList;
    }

    @Override
    public int getCount() {
        return docSachList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view = inflater.inflate(layout, null);
        TextView txtTen = (TextView) view.findViewById(R.id.textViewTen);
        TextView txtMoTa = (TextView) view.findViewById(R.id.textViewMota);
        ImageView imgHinh = (ImageView) view.findViewById(R.id.imageViewHinh);
        Truyen docSach = docSachList.get(position);
        txtTen.setText(docSach.getTen());
        txtMoTa.setText(docSach.getMoTa());
        imgHinh.setImageResource(docSach.getHinh());

        return view;
    }
}
