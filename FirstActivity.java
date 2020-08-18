package com.example.danu.intentsproj;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    EditText etNo1;
    EditText etNo2;
    String num1,num2;
    int N1,N2;
    TextView IblSum;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        etNo1=findViewById(R.id.etNo1);
        etNo2=findViewById(R.id.etNo2);
        IblSum=findViewById(R.id.summ);
    }

     public void openSecond(View view){

         Intent intent=New intent(this,SecondActivity.class);
         intent.putExtra("N1",etNo1.getText().toString());
         intent.putExtra("N2",etNo2.getText().toString());


    LayoutInflater li = getLayoutInflater();

    View layout = li.inflate(R.layout.customtoast, (ViewGroup)
            findViewById(R.id.custom_toast_layout));


    Toast toast = new Toast(getApplicationContext());
toast.setDuration(Toast.LENGTH_SHORT);
toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
toast.setView(layout);//setting the view of custom toast layout
toast.show();

}



}
