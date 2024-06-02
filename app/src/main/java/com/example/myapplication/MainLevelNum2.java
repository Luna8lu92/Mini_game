package com.example.myapplication;


import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainLevelNum2 extends AppCompatActivity {


    Dialog dialog2;
    EditText editText;
    Boolean isNew = true;
    String nomer;
    public Random rnd = new Random();
    String number;
    public int count= 0;//Счетчик правильных полей

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_level_num2);

        //вызов диалогового окна

        Button exit2 = findViewById(R.id.back);
        TextView text_levels = findViewById(R.id.text_levels);
        text_levels.setText(R.string.level2);
        editText = findViewById(R.id.editText);
        nomer = String.valueOf((rnd.nextInt(100)));
        editText.setText(nomer);


        new CountDownTimer(3000, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
            }
            @Override
            public void onFinish() {
                editText.setText("");
            }
        }.start();


        //вызов конечного диалога
        dialog2 = new Dialog(this);
        dialog2.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog2.setContentView(R.layout.ending);
        dialog2.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog2.setCancelable(false);
        TextView btnclose2 = (TextView)dialog2.findViewById(R.id.btnclose2);
        btnclose2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(MainLevelNum2.this, MainNumbers.class);
                    startActivity(intent);
                    finish();
                }catch (Exception e){
                }
                dialog2.dismiss();
            }
        });
        Button btncontinue2 = (Button)dialog2.findViewById(R.id.btncontinue2);
        btncontinue2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(MainLevelNum2.this, MainLevelNum3.class);
                    startActivity(intent);
                }catch (Exception e){}
                dialog2.dismiss();
            }
        });//вызов конечного диалога - конец

        //кнопка выхода
        exit2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainNumbers.class);
                startActivity(intent);
            }
        });//
    }
    final int[] progress = new int[]{R.id.point1, R.id.point2, R.id.point3, R.id.point4, R.id.point5};

    //нажатие кнопок
    public void clickNum(View view) {
        if(isNew)
            editText.setText("");
        isNew=false;
        number = editText.getText().toString();
        if (view.getId() == R.id.number0) {
            number = number + "0";
        }if (view.getId() == R.id.number1) {
            number = number + "1";
        }if (view.getId() == R.id.number2) {
            number = number + "2";
        }if (view.getId() == R.id.number3) {
            number = number + "3";
        }if (view.getId() == R.id.number4) {
            number = number + "4";
        }if (view.getId() == R.id.number5) {
            number = number + "5";
        }if (view.getId() == R.id.number6) {
            number = number + "6";
        }if (view.getId() == R.id.number7) {
            number = number + "7";
        }if (view.getId() == R.id.number8) {
            number = number + "8";
        }if (view.getId() == R.id.number9) {
            number = number + "9";
        }
        editText.setText(number);
    }//

    public void clickFinish2(View view) {
        if (count==4) {
            dialog2.show();}
        new CountDownTimer(3000, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
            }
            @Override
            public void onFinish() {
                editText.setText("");}
        }.start();
        if (number.equals(nomer)) {
            count = count + 1;
            for (int i = 0; i < count; i++) {
                TextView tv = findViewById(progress[i]);
                tv.setBackgroundResource(R.drawable.style_press_points);
            }
        } else if (editText.getText().toString().isEmpty()) {
            Toast toast = Toast.makeText(MainLevelNum2.this, "Пожалуйста, введите число", Toast.LENGTH_LONG);
            toast.show();
        }else {
            if (count > 0) {
                count = count - 1;
            }
            for (int i = 0; i < 4; i++) {
                TextView tv = findViewById(progress[i]);
                tv.setBackgroundResource(R.drawable.style_points);
            }
            for (int i = 0; i < count; i++) {
                TextView tv = findViewById(progress[i]);
                tv.setBackgroundResource(R.drawable.style_press_points);
            }
        }
        nomer = String.valueOf((rnd.nextInt(100)));
        editText.setText(nomer);
    }
}
