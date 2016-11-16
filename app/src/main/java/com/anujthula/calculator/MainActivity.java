package com.anujthula.calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText no1;
    private EditText no2;
    private Button btnadd;
    private Button btnsub;
    private Button btnmul;
    private Button btndiv;
    private Button btnclear;
    private TextView resultcalulated;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        no1 = (EditText) findViewById(R.id.firstNumber);
        no2 = (EditText) findViewById(R.id.secondNumber);
        btnadd = (Button) findViewById(R.id.add);
        btnsub = (Button) findViewById(R.id.sub);
        btnmul = (Button) findViewById(R.id.mul);
        btndiv = (Button) findViewById(R.id.div);
        resultcalulated = (TextView) findViewById(R.id.calculated);
        btnclear = (Button) findViewById(R.id.btnclear);

        btnadd.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(no1.getText().length()>0 && no2.getText().length()>0)
                {
                    double number1 = Double.parseDouble(no1.getText().toString());
                    double number2 = Double.parseDouble(no2.getText().toString());

                    double finalresult = number1 + number2;
                    resultcalulated.setText(Double.toString(finalresult));
                }
            else
                {
                    Toast.makeText(MainActivity.this, "Oops, Enter Input!",Toast.LENGTH_LONG).show();
                }
            }
        });

        btnsub.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {
                  if(no1.getText().length()>0 && no2.getText().length()>0)
                  {
                  double number1 = Double.parseDouble(no1.getText().toString());
                  double number2 = Double.parseDouble(no2.getText().toString());

                  double finalresult = number1 - number2;
                  resultcalulated.setText(Double.toString(finalresult));
              }
                  else {
                      Toast.makeText(MainActivity.this, "Oops, Enter Input!",Toast.LENGTH_LONG).show();
                  }
              }
          });

        btnmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(no1.getText().length()>0 && no2.getText().length()>0)
                {
                double number1 = Double.parseDouble(no1.getText().toString());
                double number2 = Double.parseDouble(no2.getText().toString());

                double finalresult = number1 * number2;
                resultcalulated.setText(Double.toString(finalresult));
            }
                else {
                    Toast.makeText(MainActivity.this, "Oops, Enter Input!",Toast.LENGTH_LONG).show();
                }}

        });

        btndiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(no1.getText().length()>0 && no2.getText().length()>0)
                {
                double number1 = Double.parseDouble(no1.getText().toString());
                double number2 = Double.parseDouble(no2.getText().toString());

                double finalresult = number1 / number2;
                resultcalulated.setText(Double.toString(finalresult));
            }
                else {
                    Toast.makeText(MainActivity.this, "Oops, Enter Input!",Toast.LENGTH_LONG).show();
                }}
        });

        btnclear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                no1.setText("");
                no2.setText("");
                resultcalulated.setText("0.00");
                no1.requestFocus();
            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}
