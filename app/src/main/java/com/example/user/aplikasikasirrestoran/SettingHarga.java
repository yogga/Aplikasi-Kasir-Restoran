package com.example.user.aplikasikasirrestoran;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SettingHarga extends AppCompatActivity {

    EditText edit1,edit2,edit3,edit4,edit5,edit6,edit7;
    Button button;

    public static final String MyPREFERENCES = "MyPrefs";
    public static final String makan1 = "makan1";
    public static final String makan2 = "makan2";
    public static final String makan3 = "makan3";
    public static final String makan4 = "makan4";
    public static final String makan5 = "makan5";
    public static final String makan6 = "makan6";
    public static final String makan7 = "makan7";

    SharedPreferences sharedpreferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting_harga);

        edit1= (EditText) findViewById(R.id.hrg1);
        edit2= (EditText) findViewById(R.id.hrg2);
        edit3= (EditText) findViewById(R.id.hrg3);
        edit4= (EditText) findViewById(R.id.hrg4);
        edit5= (EditText) findViewById(R.id.hrg5);
        edit6= (EditText) findViewById(R.id.hrg6);
        edit7= (EditText) findViewById(R.id.hrg7);

        button= (Button) findViewById(R.id.simpan);
        sharedpreferences = getSharedPreferences(MyPREFERENCES, Context.MODE_PRIVATE);

        DisplayText();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String f1 = edit1.getText().toString();
                String f2 = edit2.getText().toString();
                String f3 = edit3.getText().toString();
                String f4 = edit4.getText().toString();
                String f5 = edit5.getText().toString();
                String f6 = edit6.getText().toString();
                String f7 = edit7.getText().toString();

                SharedPreferences.Editor editor = sharedpreferences.edit();

                editor.putString(makan1,f1);
                editor.putString(makan2,f2);
                editor.putString(makan3,f3);
                editor.putString(makan4,f4);
                editor.putString(makan5,f5);
                editor.putString(makan6,f6);
                editor.putString(makan7,f7);
                editor.commit();
                Toast.makeText(SettingHarga.this, "Tersimpan!", Toast.LENGTH_SHORT).show();

                DisplayText();

            }
        });
    }

    void DisplayText(){
        edit1.setText(sharedpreferences.getString(makan1,makan1));
        edit2.setText(sharedpreferences.getString(makan2,makan2));
        edit3.setText(sharedpreferences.getString(makan3,makan3));
        edit4.setText(sharedpreferences.getString(makan4,makan4));
        edit5.setText(sharedpreferences.getString(makan5,makan5));
        edit6.setText(sharedpreferences.getString(makan6,makan6));
        edit7.setText(sharedpreferences.getString(makan7,makan7));
    }
}

