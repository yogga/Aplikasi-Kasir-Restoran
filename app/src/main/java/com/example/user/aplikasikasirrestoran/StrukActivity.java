package com.example.user.aplikasikasirrestoran;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class StrukActivity extends AppCompatActivity {

    int tot1,tot2,tot3,tot4,tot5,tot6,tot7,totTot;
    String tots1,tots2,tots3,tots4,tots5,tots6,tots7,totsTots;
    String jml1,jml2,jml3,jml4,jml5,jml6,jml7;
    TextView total1,total2,total3,total4,total5,total6,total7,totalTot;
    SharedPreferences sharedpreferences;
    public static final String MyPREFERENCES = "MyPrefs";
    public static final String makan1 = "makan1";
    public static final String makan2 = "makan2";
    public static final String makan3 = "makan3";
    public static final String makan4 = "makan4";
    public static final String makan5 = "makan5";
    public static final String makan6 = "makan6";
    public static final String makan7 = "makan7";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_struk);
        sharedpreferences = getSharedPreferences(MyPREFERENCES, Context.MODE_PRIVATE);
        Intent gin = getIntent();
        Bundle b = gin.getExtras();
        if(b!=null){
            jml1= (String) b.get("jumlah1");
            jml2= (String) b.get("jumlah2");
            jml3= (String) b.get("jumlah3");
            jml4= (String) b.get("jumlah4");
            jml5= (String) b.get("jumlah5");
            jml6= (String) b.get("jumlah6");
            jml7= (String) b.get("jumlah7");
        }

        total1= (TextView) findViewById(R.id.total1);
        total2= (TextView) findViewById(R.id.total2);
        total3= (TextView) findViewById(R.id.total3);
        total4= (TextView) findViewById(R.id.total4);
        total5= (TextView) findViewById(R.id.total5);
        total6= (TextView) findViewById(R.id.total6);
        total7= (TextView) findViewById(R.id.total7);
        totalTot= (TextView) findViewById(R.id.totalTotal);

        tot1= Integer.parseInt(jml1) * Integer.parseInt(sharedpreferences.getString(makan1,makan1));
        tot2= Integer.parseInt(jml2) * Integer.parseInt(sharedpreferences.getString(makan2,makan2));
        tot3= Integer.parseInt(jml3) * Integer.parseInt(sharedpreferences.getString(makan3,makan3));
        tot4= Integer.parseInt(jml4) * Integer.parseInt(sharedpreferences.getString(makan4,makan4));
        tot5= Integer.parseInt(jml5) * Integer.parseInt(sharedpreferences.getString(makan5,makan5));
        tot6= Integer.parseInt(jml6) * Integer.parseInt(sharedpreferences.getString(makan6,makan6));
        tot7= Integer.parseInt(jml7) * Integer.parseInt(sharedpreferences.getString(makan7,makan7));
        totTot=tot1+tot2+tot3+tot4+tot5+tot6+tot7;
        tots1= String.valueOf(Integer.parseInt(jml1) * Integer.parseInt(sharedpreferences.getString(makan1,makan1)));
        tots2= String.valueOf(Integer.parseInt(jml2) * Integer.parseInt(sharedpreferences.getString(makan2,makan2)));
        tots3= String.valueOf(Integer.parseInt(jml3) * Integer.parseInt(sharedpreferences.getString(makan3,makan3)));
        tots4= String.valueOf(Integer.parseInt(jml4) * Integer.parseInt(sharedpreferences.getString(makan4,makan4)));
        tots5= String.valueOf(Integer.parseInt(jml5) * Integer.parseInt(sharedpreferences.getString(makan5,makan5)));
        tots6= String.valueOf(Integer.parseInt(jml6) * Integer.parseInt(sharedpreferences.getString(makan6,makan6)));
        tots7= String.valueOf(Integer.parseInt(jml7) * Integer.parseInt(sharedpreferences.getString(makan7,makan7)));
        totsTots= String.valueOf(totTot);

        total1.setText(tots1);
        total2.setText(tots2);
        total3.setText(tots3);
        total4.setText(tots4);
        total5.setText(tots5);
        total6.setText(tots6);
        total7.setText(tots7);
        totalTot.setText(totsTots);
    }
}
