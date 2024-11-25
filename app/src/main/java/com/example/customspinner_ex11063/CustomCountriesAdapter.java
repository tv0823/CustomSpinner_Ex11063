package com.example.customspinner_ex11063;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomCountriesAdapter extends BaseAdapter {
    private Country[] countries;
    private Context context;
    private LayoutInflater inflater;

    public CustomCountriesAdapter(Country[] countries, Context context, LayoutInflater inflater) {
        this.countries = countries;
        this.context = context;
        this.inflater = inflater;
    }

    @Override
    public int getCount() {
        return countries.length;
    }

    @Override
    public Object getItem(int i) {
        return countries[i];
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup parent) {
        view = inflater.inflate(R.layout.custom_spin_layout, parent, false);
        ImageView flag = view.findViewById(R.id.cl_flag_iV);
        TextView countryName = view.findViewById(R.id.cl_country_tV);
        TextView capital = view.findViewById(R.id.cl_capital_tV);

        flag.setImageResource(countries[i].getFlag());
        countryName.setText(countries[i].getName());
        capital.setText(countries[i].getCapital());

        return view;
    }
}
