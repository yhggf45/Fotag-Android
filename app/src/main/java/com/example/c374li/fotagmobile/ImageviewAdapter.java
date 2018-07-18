package com.example.c374li.fotagmobile;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;


public class ImageviewAdapter extends BaseAdapter {
    private Context context;
    private View view;
    private LayoutInflater layoutinflater;
    private ArrayList<com.example.c374li.fotagmobile.ImageView> array;

    ImageviewAdapter(Context context, ArrayList<com.example.c374li.fotagmobile.ImageView> ic) {
        this.context = context;
        this.array = ic;
    }

    @Override
    public int getCount() {
        return array.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        return array.get(position);
    }

    void change_data(ArrayList<com.example.c374li.fotagmobile.ImageView> array) {
        this.array = array;
    }

    @Override
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
    }
}
