package com.example.customspinner_ex11063;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    Spinner countries_spin;
    TextView country_details;
    Country[] countries;
    CustomCountriesAdapter customAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        countries_spin = findViewById(R.id.countries_spin);
        country_details = findViewById(R.id.country_details);
        createCountriesLst();

        customAdapter = new CustomCountriesAdapter(this, countries);
        countries_spin.setAdapter(customAdapter);
        countries_spin.setOnItemSelectedListener(this);
    }

    public void createCountriesLst(){
        countries = new Country[]{
                new Country(R.drawable.franceflag, "Paris", "France", 68170000),
                new Country(R.drawable.germanyflag, "Berlin", "Germany", 84480000),
                new Country(R.drawable.hungaryflag, "Budapest", "Hungary", 9590000),
                new Country(R.drawable.israelflag, "Jerusalem", "Israel", 9757000),
                new Country(R.drawable.italyflag, "Rome", "Italy", 58760000),
                new Country(R.drawable.polandflag, "Warsaw", "Poland", 36690000),
                new Country(R.drawable.romaniaflag, "Bucharest", "Romania", 19060000)
        };
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int pos, long id) {
        country_details.setText("Country details:\nCountry name: " + countries[pos].getName() + "\nCapital: " + countries[pos].getCapital() + "\nPopulation size: " + countries[pos].getPopulation());
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}