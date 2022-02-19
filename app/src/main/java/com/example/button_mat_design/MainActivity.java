package com.example.button_mat_design;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.Toast;

import com.google.android.material.button.MaterialButtonToggleGroup;

public class MainActivity extends AppCompatActivity {

    private MaterialButtonToggleGroup materialButtonToggleGroup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        materialButtonToggleGroup=findViewById(R.id.toggleButton);

        materialButtonToggleGroup.addOnButtonCheckedListener(new MaterialButtonToggleGroup.OnButtonCheckedListener() {
            @Override
            public void onButtonChecked(MaterialButtonToggleGroup materialButtonToggleGroup, int i, boolean b) {
                materialButtonToggleGroup.getCheckedButtonId();
                Toast.makeText(MainActivity.this,"click"+b,Toast.LENGTH_LONG).show();
            }
        });
        ///
        CheckBox checkBox;
        checkBox =findViewById(R.id.checkBox2);
        if(checkBox.isChecked())
        checkBox.setChecked(false);
        else
            checkBox.setChecked(true);
    }//on cerate close
}//clas clsoe