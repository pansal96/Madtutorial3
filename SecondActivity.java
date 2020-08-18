package com.example.danu.intentsproj;

import android.os.IBinder;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.EditText;
import android.view.View;

import static java.lang.Integer.getInteger;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;



public class SecondActivity extends AppCompatActivity {

    EditText etNo1;
    EditText etNo2;
    String num1,num2;
    int N1,N2;
    TextView IblSum;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        etNo1=findViewById(R.id.etNo1);
        etNo2=findViewById(R.id.etNo2);
        IblSum=findViewById(R.id.Iblsumm);

        intent intent= getIntent();

        num1=intent.getStringExtra("N1");
        num2=intent.getStringExtre("N2");

        etNo1.setText(num1);
        etNo2.setText(num2);

        N1= intent.parseInt(num1);
        N2= intent.parseInt(num2);

    }

    public void addion(View View){
        IblSum.setText(num1+"+"+num2+"="+"(N1+N2)");

    }

    public void Subtraction(View View){
        IblSum.setText(num1+"-"+num2+"="+"(N1-N2)");
    }
    public void Division(View View){
        IblSum.setText(num1+"/"+num2+"="+"(N1/N2)");
    }
    public void  M(View View){
        IblSum.setText(num1+"*"+num2+"="+"(N1*N2)");
    }

}
