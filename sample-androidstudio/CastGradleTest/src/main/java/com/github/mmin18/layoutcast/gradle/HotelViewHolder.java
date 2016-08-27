package com.github.mmin18.layoutcast.gradle;

import android.util.SparseArray;
import android.view.View;

public class HotelViewHolder {

    public static  <T extends View> T requestView(View convertView, int id){
        SparseArray<View> viewHolder = (SparseArray<View>)convertView.getTag();
        if(viewHolder == null){
            viewHolder = new SparseArray<View>();
            convertView.setTag(viewHolder);
        }
        View view = viewHolder.get(id);
        if(view == null){
            view = convertView.findViewById(id);
            viewHolder.put(id,view);
        }
        return (T)view;
    }
}
