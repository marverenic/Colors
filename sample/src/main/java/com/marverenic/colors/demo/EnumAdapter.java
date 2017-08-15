package com.marverenic.colors.demo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class EnumAdapter<E extends Enum<E>> extends BaseAdapter {

    private E[] mData;

    public EnumAdapter(E[] values) {
        mData = values;
    }

    @Override
    public int getCount() {
        return mData.length;
    }

    @Override
    public E getItem(int position) {
        return mData[position];
    }

    @Override
    public long getItemId(int position) {
        return getItem(position).hashCode();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(parent.getContext())
                    .inflate(android.R.layout.simple_spinner_item, parent, false);
        }

        TextView text = (TextView) convertView.findViewById(android.R.id.text1);
        text.setText(getItem(position).toString());

        return convertView;
    }

    @Override
    public View getDropDownView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(parent.getContext())
                    .inflate(android.R.layout.simple_spinner_dropdown_item, parent, false);
        }

        TextView text = (TextView) convertView.findViewById(android.R.id.text1);
        text.setText(getItem(position).toString());

        return convertView;
    }
}
