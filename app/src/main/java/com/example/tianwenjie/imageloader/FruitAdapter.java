package com.example.tianwenjie.imageloader;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by tianwenjie on 6/17/16.
 */
public class FruitAdapter extends ArrayAdapter<Gii> {
    private int resourceId;
    public FruitAdapter(Context context, int resource) {
        super(context, resource);
        resourceId = resource;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        Gii fruit = getItem(position); // 获取当前项的Fruit实例
        View view = LayoutInflater.from(getContext()).inflate(resourceId, null);
        ImageView fruitImage = (ImageView) view.findViewById(R.id.imageview);
        fruitImage.setImageResource(Integer.parseInt(fruit.getUrl()));
        return view;

    }
}
