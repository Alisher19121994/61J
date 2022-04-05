package com.best.a61j.Module;

import android.content.Context;
import android.telecom.Call;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.best.a61j.Details;
import com.best.a61j.MainActivity;
import com.best.a61j.R;

import java.util.ArrayList;

public class GetAdapter extends BaseAdapter {
    Context context;
    LayoutInflater inflater;
    ArrayList<Details> list;

    public GetAdapter(Context context, ArrayList<Details> list) {
        this.context = context;
        this.inflater = (LayoutInflater.from(context));
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }
    @Override
    public Object getItem(int i) {

        return list.get(i);
    }
    @Override
    public long getItemId(int i) {

        return i;
    }
    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        view = inflater.inflate(R.layout.activity_foradapter,null);

        ImageView imageView = view.findViewById(R.id.imgBtn);
        TextView textView = view.findViewById(R.id.txtBtn1);

        Details details = list.get(i);

        imageView.setImageResource(details.getImageview());
        textView.setText(details.getName());
        return view;
    }
}
