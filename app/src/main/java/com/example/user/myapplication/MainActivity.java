package com.example.user.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
private double cof, inp, rezult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClickConvert(View v){
        EditText enterVal=(EditText)findViewById(R.id.editVal);
        TextView rez=(TextView)findViewById(R.id.textRez);
        Spinner vals=(Spinner)findViewById(R.id.convert_list);
        String valsType=String.valueOf(vals.getSelectedItem());
        if(valsType.equals("Доллар")){
            cof=0.04;

        }else if(valsType.equals("Евро")){
            cof=0.035;
        }else if(valsType.equals("Фунты")){
            cof=0.027;
        }

        inp=Double.valueOf(enterVal.getText().toString());

        rezult=cof*inp;
        String rezcof = String.format("%.2f", rezult);

        rez.setText(rezcof);
    }
}
