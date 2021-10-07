package com.example.kalkulacka;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Button;
import android.view.View;
public class MainActivity extends AppCompatActivity {
Button btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9, plus,minus,multiply,divide,clear,equal;
TextView tv1;
String str;
int a=0;int b=0;
Double vys;
Character o;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv1=findViewById(R.id.text);
        btn0=findViewById(R.id.btn0);
        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
        btn3=findViewById(R.id.btn3);
        btn4=findViewById(R.id.btn4);
        btn5=findViewById(R.id.btn5);
        btn6=findViewById(R.id.btn6);
        btn7=findViewById(R.id.btn7);
        btn8=findViewById(R.id.btn8);
        btn9=findViewById(R.id.btn9);
        plus=findViewById(R.id.plus);
        minus=findViewById(R.id.minus);
        multiply=findViewById(R.id.multiply);
        divide=findViewById(R.id.divide);
        clear=findViewById(R.id.clear);
        equal=findViewById(R.id.equal);
        str="";
        tv1.setText("");
    }
    public void Zero(View button)
    {
        str+="0";
        tv1.setText(str);
    }
    public void One(View button)
    {
        str+="1";
        tv1.setText(str);
    }
    public void Two(View button)
    {
        str+="2";
        tv1.setText(str);
    }
    public void Three(View button)
    {
        str+="3";
        tv1.setText(str);
    }
    public void Four(View button)
    {
        str+="4";
        tv1.setText(str);
    }
    public void Five(View button)
    {
        str+="5";
        tv1.setText(str);
    }
    public void Six(View button)
    {
        str+="6";
        tv1.setText(str);
    }
    public void Seven(View button)
    {
        str+="7";
        tv1.setText(str);
    }
    public void Eight(View button)
    {
        str+="8";
        tv1.setText(str);
    }
    public void Nine(View button)
    {
        str+="9";
        tv1.setText(str);
    }
    public void Plus(View button)
    {
        a=Integer.parseInt(str);
        str="";
        tv1.setText("");
        o='+';

    }
    public void Minus(View button)
    {
        a=Integer.parseInt(str);
        str="";
        tv1.setText("");
        o='-';

    }

    public void Multiply(View button)
    {
        a=Integer.parseInt(str);
        str="";
        tv1.setText("");
        o='*';

    }

    public void Divide(View button)
    {
        a=Integer.parseInt(str);
        str="";
        tv1.setText("");
        o='/';

    }
    public void Clear (View button)
    {
        str="";
        tv1.setText("");
        a=0;b=0;
    }
    public void Equal (View button)
    {
        int pom=0;
        b=Integer.parseInt(str);
        if (o=='+')vys=Double.valueOf(a)+Double.valueOf(b);
        else if (o=='-')vys=Double.valueOf(a)-Double.valueOf(b);
        else if (o=='*')vys=Double.valueOf(a)*Double.valueOf(b);
        else if (o=='/'&&b!=0)vys=Double.valueOf(a)/Double.valueOf(b);
        else pom++;
        if (pom==0)tv1.setText(String.valueOf(vys));
        else tv1.setText("Error");
    }
}
