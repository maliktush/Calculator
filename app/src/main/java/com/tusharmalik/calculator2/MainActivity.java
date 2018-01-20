package com.tusharmalik.calculator2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static java.sql.Types.NULL;

public class MainActivity extends AppCompatActivity {
    public static final String TAG = "Main Activity";

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy: ");
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }
    boolean doneonce=true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: ");
        Log.i(TAG, "onCreate: ");
        Log.w(TAG, "onCreate: ");
        Log.e(TAG, "onCreate: ");
        for(int i=0;i<10;i++) {
            final int ans= 0;
            Log.v("TAG",ans+"");
        }
        
    }

    boolean isadd=false ,issub=false, ismul=false , isdiv=false ;
    float val1 = 0;
    float val2,result;
    public void calc(View view) {
        Button b = (Button) view;
        EditText tv = (EditText) findViewById(R.id.txtScreen);
        EditText tv2 = (EditText) findViewById(R.id.txtScreen2);
        if (b.getId() == R.id.btnZero) {
            tv.setText(tv.getText() + "0");
        }
        if (b.getId() == R.id.btnOne) {
            tv.setText(tv.getText() + "1");
        }
        if (b.getId() == R.id.btnTwo) {
            tv.setText(tv.getText() + "2");
        }
        if (b.getId() == R.id.btnThree) {
            tv.setText(tv.getText() + "3");
        }
        if (b.getId() == R.id.btnFour) {
            tv.setText(tv.getText() + "4");
        }
        if (b.getId() == R.id.btnFive) {
            tv.setText(tv.getText() + "5");
        }
        if (b.getId() == R.id.btnSix) {
            tv.setText(tv.getText() + "6");
        }
        if (b.getId() == R.id.btnSeven) {
            tv.setText(tv.getText() + "7");
        }
        if (b.getId() == R.id.btnEight) {
            tv.setText(tv.getText() + "8");
        }
        if (b.getId() == R.id.btnNine) {
            tv.setText(tv.getText() + "9");
        }
        if (b.getId() == R.id.btnAdd) {
            if(tv.getText().toString().equals("")){
                //0.setText(tv.getText() + " * ");

                Toast.makeText(MainActivity.this,"Enter a number first",Toast.LENGTH_SHORT).show();
            }
            else {
                val1 = Float.parseFloat(tv.getText() + "");
                tv2.setText(tv.getText() + " + ");
                isadd = true;
                tv.setText(null);
            }
        }
        if (b.getId() == R.id.btnSubtract) {
            if(tv.getText().toString().equals("")){
                //0.setText(tv.getText() + " * ");

                Toast.makeText(MainActivity.this,"Enter a number first",Toast.LENGTH_SHORT).show();
            }
            else {
                val1 = Float.parseFloat(tv.getText() + "");
                tv2.setText(tv.getText() + " - ");
                issub = true;
                tv.setText(null);
            }
        }

        if (b.getId() == R.id.btnDivide) {
            if(tv.getText().toString().equals("")){
                //0.setText(tv.getText() + " * ");

                Toast.makeText(MainActivity.this,"Enter a number first",Toast.LENGTH_SHORT).show();
            }
            else {
                val1 = Float.parseFloat(tv.getText() + "");
                tv2.setText(tv.getText() + " / ");
                isdiv = true;
                tv.setText(null);
            }
        }
        if (b.getId() == R.id.btnMultiply) {
            if(tv.getText().toString().equals("")){
               //0.setText(tv.getText() + " * ");

                Toast.makeText(MainActivity.this,"Enter a number first",Toast.LENGTH_SHORT).show();
            }
            else {
                val1 = Float.parseFloat(tv.getText() + "");
                tv2.setText(tv.getText() + " * ");
                ismul = true;
                tv.setText(null);


            }
        }
        if (b.getId() == R.id.btnClear) {
            tv.setText("");
            tv2.setText("");
        }
        if (b.getId() == R.id.btnDot) {
            tv.setText(tv.getText() + ".");
        }
        if (b.getId() == R.id.btnEqual) {
            if(tv.getText().toString().equals("")){
                //0.setText(tv.getText() + " * ");

                Toast.makeText(MainActivity.this,"Enter a number first",Toast.LENGTH_SHORT).show();
            }
            else {
                val2 = Float.parseFloat(tv.getText() + "");
                if (isadd == true) {
                    result = val1 + val2;
                    tv2.setText(tv2.getText() + "" + tv.getText());
                    tv.setText("" + result);
                    isadd = false;
                }

                if (issub == true) {
                    result = val1 - val2;
                    tv2.setText(tv2.getText() + "" + tv.getText());
                    tv.setText("" + result);
                    issub = false;
                }

                if (ismul == true) {
                    result = val1 * val2;
                    tv2.setText(tv2.getText() + "" + tv.getText());
                    tv.setText("" + result);
                    ismul = false;
                }

                if (isdiv == true) {
                    if (val2 == 0) {
                        tv.setText("Cant divide by 0");
                    } else {
                        result = val1 / val2;
                        tv2.setText(tv2.getText() + "" + tv.getText());
                        tv.setText("" + result);
                        isdiv = false;
                    }
                }
            }
        }

    }
}



