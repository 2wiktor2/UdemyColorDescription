package com.wiktor.colordDscriptor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Spinner spinner;
    TextView textView;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = findViewById(R.id.spinner);
        textView = findViewById(R.id.tv_show_description);
        button = findViewById(R.id.b_find_description);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        int position = spinner.getSelectedItemPosition();
        textView.setText(getStringFromPosition(position));
    }

    public String getStringFromPosition(int position) {
        String[] descriptions = getResources().getStringArray(R.array.descriptionOfTemperament);
        return descriptions[position];
    }
}
