package com.app.gifari;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;

public class CustomListAdapter extends BaseAdapter {
    private Activity activity;
    private LayoutInflater inflater;
    private List<Pahlawan> movieItems;

    public CustomListAdapter(Activity activity, List<Pahlawan> movieItems) {
        this.activity = activity;
        this.movieItems = movieItems;
    }

    @Override
    public int getCount() {
        return movieItems.size();
    }

    @Override
    public Object getItem(int location) {
        return movieItems.get(location);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (inflater == null)
            inflater = (LayoutInflater) activity
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        if (convertView == null)
            convertView = inflater.inflate(R.layout.custom_list, null);

        TextView nama = (TextView) convertView.findViewById(R.id.nama);
        TextView latin = (TextView) convertView.findViewById(R.id.latin);
        TextView makanan = (TextView) convertView.findViewById(R.id.makanan);
        TextView habitat = (TextView) convertView.findViewById(R.id.habitat);
        TextView ciri = (TextView) convertView.findViewById(R.id.ciri);
        ImageView imageView = (ImageView) convertView.findViewById(R.id.viewfoto);
        Pahlawan b = movieItems.get(position);

        nama.setText("Nama : "+ b.get_nama());
        latin.setText("Nama Latin : "+ b.get_latin());
        makanan.setText("Makanan : "+ b.get_makanan());
        habitat.setText("Habitat : "+ b.get_habitat());
        ciri.setText("Ciri : "+ b.get_ciri());

        return convertView;
    }
}
