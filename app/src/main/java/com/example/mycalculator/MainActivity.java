package com.example.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
TextView tv1;
EditText et1,et2;
Button add,sub,div,pro;
float n3,n1,n2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv1=(TextView)findViewById(R.id.tv1);
        et1=(EditText)findViewById(R.id.et1);
        et2=(EditText)findViewById(R.id.et2);
        add=(Button)findViewById(R.id.add);
        sub=(Button)findViewById(R.id.sub);
        div=(Button)findViewById(R.id.div);
        pro=(Button)findViewById(R.id.pro);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              n1=Integer.parseInt(et1.getText().toString());
                n2=Integer.parseInt(et2.getText().toString());
                n3=n1+n2;
                tv1.setText("Addition is: "+String.valueOf(n3));
                Toast.makeText(MainActivity.this,"addition is performed",Toast.LENGTH_SHORT);
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n1=Integer.parseInt(et1.getText().toString());
                n2=Integer.parseInt(et2.getText().toString());
                n3=n1-n2;
                tv1.setText("Subtraction is: "+String.valueOf(n3));
                Toast.makeText(MainActivity.this,"subtraction is performed",Toast.LENGTH_SHORT);
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n1=Integer.parseInt(et1.getText().toString());
                n2=Integer.parseInt(et2.getText().toString());
                n3=n1/n2;
                tv1.setText("Division is: "+String.valueOf(n3));
                Toast.makeText(MainActivity.this,"division is performed",Toast.LENGTH_SHORT);
            }
        });
        pro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n1=Integer.parseInt(et1.getText().toString());
                n2=Integer.parseInt(et2.getText().toString());
                n3=n1*n2;
                tv1.setText("Product is: "+String.valueOf(n3));
                Toast.makeText(MainActivity.this,"multiplication is performed",Toast.LENGTH_SHORT);
            }
        });
    }
}
