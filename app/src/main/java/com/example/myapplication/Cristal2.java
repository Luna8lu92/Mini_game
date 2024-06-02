package com.example.myapplication;

import static com.example.myapplication.R.id.number13;

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
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Cristal2 extends AppCompatActivity {
    Dialog dialog2;
    ImageButton bt1, bt2, bt3, bt4, bt5, bt6, bt7, bt8, bt9, bt10, bt11, bt12, bt13, bt14, bt15, bt16;
    int nomer = 0;
    ImageButton prom; //-Последняя нажатая кнопка
    TextView editText;
    public int nov = 0; //-Счетчик найденных пар
    public int count = 0; //-Счетчик правильных пар


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cristal2);
        Button exit2 = findViewById(R.id.back);
        editText = findViewById(R.id.editText2);

        bt1 = (ImageButton) findViewById(R.id.number3);
        bt2 = (ImageButton) findViewById(R.id.number7);
        bt3 = (ImageButton) findViewById(R.id.number8);
        bt4 = (ImageButton) findViewById(R.id.number10);
        bt5 = (ImageButton) findViewById(R.id.number13);
        bt6 = (ImageButton) findViewById(R.id.number16);
        bt7 = (ImageButton) findViewById(R.id.number15);
        bt8 = (ImageButton) findViewById(R.id.number14);
        bt9 = (ImageButton) findViewById(R.id.number1);
        bt10 = (ImageButton) findViewById(R.id.number5);
        bt11 = (ImageButton) findViewById(R.id.number2);
        bt12 = (ImageButton) findViewById(R.id.number12);
        bt13 = (ImageButton) findViewById(R.id.number4);
        bt14 = (ImageButton) findViewById(R.id.number6);
        bt15 = (ImageButton) findViewById(R.id.number9);
        bt16 = (ImageButton) findViewById(R.id.number11);


        new CountDownTimer(2000, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                bt1.setImageResource(R.drawable.animal01);
                bt1.setEnabled(false);
                bt2.setImageResource(R.drawable.animal01);
                bt2.setEnabled(false);
                bt3.setImageResource(R.drawable.animal2);
                bt3.setEnabled(false);
                bt4.setImageResource(R.drawable.animal2);
                bt4.setEnabled(false);
                bt5.setImageResource(R.drawable.animal3);
                bt5.setEnabled(false);
                bt6.setImageResource(R.drawable.animal3);
                bt6.setEnabled(false);
                bt7.setImageResource(R.drawable.animal4);
                bt7.setEnabled(false);
                bt8.setImageResource(R.drawable.animal4);
                bt8.setEnabled(false);
                bt9.setImageResource(R.drawable.animal5);
                bt9.setEnabled(false);
                bt10.setImageResource(R.drawable.animal5);
                bt10.setEnabled(false);
                bt11.setImageResource(R.drawable.animal6);
                bt11.setEnabled(false);
                bt12.setImageResource(R.drawable.animal6);
                bt12.setEnabled(false);
                bt13.setImageResource(R.drawable.animal5);
                bt13.setEnabled(false);
                bt14.setImageResource(R.drawable.animal5);
                bt14.setEnabled(false);
                bt15.setImageResource(R.drawable.animal6);
                bt15.setEnabled(false);
                bt16.setImageResource(R.drawable.animal6);
                bt16.setEnabled(false);
            }

            @Override
            public void onFinish() {
                bt1.setImageResource(R.drawable.shirt);
                bt1.setEnabled(true);
                bt2.setImageResource(R.drawable.shirt);
                bt2.setEnabled(true);
                bt3.setImageResource(R.drawable.shirt);
                bt3.setEnabled(true);
                bt4.setImageResource(R.drawable.shirt);
                bt4.setEnabled(true);
                bt5.setImageResource(R.drawable.shirt);
                bt5.setEnabled(true);
                bt6.setImageResource(R.drawable.shirt);
                bt6.setEnabled(true);
                bt7.setImageResource(R.drawable.shirt);
                bt7.setEnabled(true);
                bt8.setImageResource(R.drawable.shirt);
                bt8.setEnabled(true);
                bt9.setImageResource(R.drawable.shirt);
                bt9.setEnabled(true);
                bt10.setImageResource(R.drawable.shirt);
                bt10.setEnabled(true);
                bt11.setImageResource(R.drawable.shirt);
                bt11.setEnabled(true);
                bt12.setImageResource(R.drawable.shirt);
                bt12.setEnabled(true);
                bt13.setImageResource(R.drawable.shirt);
                bt13.setEnabled(true);
                bt14.setImageResource(R.drawable.shirt);
                bt14.setEnabled(true);
                bt15.setImageResource(R.drawable.shirt);
                bt15.setEnabled(true);
                bt16.setImageResource(R.drawable.shirt);
                bt16.setEnabled(true);
            }
        }.start();



        //вызов конечного диалога
        dialog2 = new Dialog(this);
        dialog2.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog2.setContentView(R.layout.ending01);
        dialog2.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog2.setCancelable(false);
        TextView btnclose2 = (TextView) dialog2.findViewById(R.id.btnclose2);//кнопка выхода
        btnclose2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(Cristal2.this, MainCristals.class);
                    startActivity(intent);
                    finish();
                } catch (Exception e) {
                }
                dialog2.dismiss();
            }
        });
        Button btncontinue2 = (Button) dialog2.findViewById(R.id.btncontinue2);//кнопка перехода на др уровень
        btncontinue2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(Cristal2.this, Cristal2.class);
                    startActivity(intent);
                } catch (Exception e) {
                }
                dialog2.dismiss();
            }
        });//-конец вызова диалога

        //кнопка выхода
        exit2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainCristals.class);
                startActivity(intent);
            }
        });//-конец

        bt1.setClipToOutline(true);
        bt1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // меняем изображение на кнопке
                if (nomer == 0) {
                    bt1.setImageResource(R.drawable.animal01);
                    bt1.setEnabled(false);
                    prom = bt1;
                    nomer = 1;
                } else if (nomer == 1 && nov!=7) {
                    count++;
                    nomer = 0;
                    new CountDownTimer(1000, 1000) {
                        @Override
                        public void onTick(long millisUntilFinished) {
                            bt1.setImageResource(R.drawable.animal01);
                            bt2.setImageResource(R.drawable.animal01);
                            bt1.setEnabled(false);
                            bt2.setEnabled(false);
                            bt3.setEnabled(false);
                            bt4.setEnabled(false);
                            bt5.setEnabled(false);
                            bt6.setEnabled(false);
                            bt7.setEnabled(false);
                            bt8.setEnabled(false);
                            bt9.setEnabled(false);
                            bt10.setEnabled(false);
                            bt11.setEnabled(false);
                            bt12.setEnabled(false);
                            bt13.setEnabled(false);
                            bt14.setEnabled(false);
                            bt15.setEnabled(false);
                            bt16.setEnabled(false);
                        }

                        @Override
                        public void onFinish() {
                            bt1.setVisibility(View.INVISIBLE);
                            bt2.setVisibility(View.INVISIBLE);
                            bt1.setEnabled(true);
                            bt2.setEnabled(true);
                            bt3.setEnabled(true);
                            bt4.setEnabled(true);
                            bt5.setEnabled(true);
                            bt6.setEnabled(true);
                            bt7.setEnabled(true);
                            bt8.setEnabled(true);
                            bt9.setEnabled(true);
                            bt10.setEnabled(true);
                            bt11.setEnabled(true);
                            bt12.setEnabled(true);
                            bt13.setEnabled(true);
                            bt14.setEnabled(true);
                            bt15.setEnabled(true);
                            bt16.setEnabled(true);
                        }
                    }.start();
                    nov++;
                    editText.setText(String.valueOf(count));
                } else if (nomer == 1 && nov==7) {
                    bt1.setImageResource(R.drawable.animal01);
                    dialog2.show();
                } else {
                    // возвращаем первую картинку
                    nomer = 0;
                    new CountDownTimer(1000, 1000) {
                        @Override
                        public void onTick(long millisUntilFinished) {
                            bt1.setImageResource(R.drawable.animal01);
                            bt1.setEnabled(false);
                            bt2.setEnabled(false);
                            bt3.setEnabled(false);
                            bt4.setEnabled(false);
                            bt5.setEnabled(false);
                            bt6.setEnabled(false);
                            bt7.setEnabled(false);
                            bt8.setEnabled(false);
                            bt9.setEnabled(false);
                            bt10.setEnabled(false);
                            bt11.setEnabled(false);
                            bt12.setEnabled(false);
                            bt13.setEnabled(false);
                            bt14.setEnabled(false);
                            bt15.setEnabled(false);
                            bt16.setEnabled(false);
                        }

                        @Override
                        public void onFinish() {
                            bt1.setImageResource(R.drawable.shirt);
                            prom.setImageResource(R.drawable.shirt);
                            bt1.setEnabled(true);
                            bt2.setEnabled(true);
                            bt3.setEnabled(true);
                            bt4.setEnabled(true);
                            bt5.setEnabled(true);
                            bt6.setEnabled(true);
                            bt7.setEnabled(true);
                            bt8.setEnabled(true);
                            bt9.setEnabled(true);
                            bt10.setEnabled(true);
                            bt11.setEnabled(true);
                            bt12.setEnabled(true);
                            bt13.setEnabled(true);
                            bt14.setEnabled(true);
                            bt15.setEnabled(true);
                            bt16.setEnabled(true);
                        }
                    }.start();
                    count = 0;
                    editText.setText("0");
                }
            }
        });
        bt2.setClipToOutline(true);
        bt2.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                // меняем изображение на кнопке
                if (nomer == 0) {
                    bt2.setImageResource(R.drawable.animal01);
                    bt2.setEnabled(false);
                    prom = bt2;
                    nomer = 1;
                } else if (nomer == 1 && nov!=7) {
                    count++;
                    nomer = 0;
                    new CountDownTimer(1000, 1000) {
                        @Override
                        public void onTick(long millisUntilFinished) {
                            bt2.setImageResource(R.drawable.animal01);
                            bt1.setEnabled(false);
                            bt2.setEnabled(false);
                            bt3.setEnabled(false);
                            bt4.setEnabled(false);
                            bt5.setEnabled(false);
                            bt6.setEnabled(false);
                            bt7.setEnabled(false);
                            bt8.setEnabled(false);
                            bt9.setEnabled(false);
                            bt10.setEnabled(false);
                            bt11.setEnabled(false);
                            bt12.setEnabled(false);
                            bt13.setEnabled(false);
                            bt14.setEnabled(false);
                            bt15.setEnabled(false);
                            bt16.setEnabled(false);
                        }

                        @Override
                        public void onFinish() {
                            bt1.setVisibility(View.INVISIBLE);
                            bt2.setVisibility(View.INVISIBLE);
                            bt1.setEnabled(true);
                            bt2.setEnabled(true);
                            bt3.setEnabled(true);
                            bt4.setEnabled(true);
                            bt5.setEnabled(true);
                            bt6.setEnabled(true);
                            bt7.setEnabled(true);
                            bt8.setEnabled(true);
                            bt9.setEnabled(true);
                            bt10.setEnabled(true);
                            bt11.setEnabled(true);
                            bt12.setEnabled(true);
                            bt13.setEnabled(true);
                            bt14.setEnabled(true);
                            bt15.setEnabled(true);
                            bt16.setEnabled(true);
                        }
                    }.start();
                    nov++;
                    editText.setText(String.valueOf(count));
                } else if (nomer == 1 && nov==7) {
                    bt2.setImageResource(R.drawable.animal01);
                    dialog2.show();
                } else {
                    // возвращаем первую картинку
                    nomer = 0;
                    new CountDownTimer(1000, 1000) {
                        @Override
                        public void onTick(long millisUntilFinished) {
                            bt2.setImageResource(R.drawable.animal01);
                            bt1.setEnabled(false);
                            bt2.setEnabled(false);
                            bt3.setEnabled(false);
                            bt4.setEnabled(false);
                            bt5.setEnabled(false);
                            bt6.setEnabled(false);
                            bt7.setEnabled(false);
                            bt8.setEnabled(false);
                            bt9.setEnabled(false);
                            bt10.setEnabled(false);
                            bt11.setEnabled(false);
                            bt12.setEnabled(false);
                            bt13.setEnabled(false);
                            bt14.setEnabled(false);
                            bt15.setEnabled(false);
                            bt16.setEnabled(false);
                        }

                        @Override
                        public void onFinish() {
                            bt2.setImageResource(R.drawable.shirt);
                            prom.setImageResource(R.drawable.shirt);
                            bt1.setEnabled(true);
                            bt2.setEnabled(true);
                            bt3.setEnabled(true);
                            bt4.setEnabled(true);
                            bt5.setEnabled(true);
                            bt6.setEnabled(true);
                            bt7.setEnabled(true);
                            bt8.setEnabled(true);
                            bt9.setEnabled(true);
                            bt10.setEnabled(true);
                            bt11.setEnabled(true);
                            bt12.setEnabled(true);
                            bt13.setEnabled(true);
                            bt14.setEnabled(true);
                            bt15.setEnabled(true);
                            bt16.setEnabled(true);
                        }
                    }.start();
                    count = 0;
                    editText.setText("0");
                }
            }
        });
        bt3.setClipToOutline(true);
        bt3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // меняем изображение на кнопке
                if (nomer == 0) {
                    bt3.setImageResource(R.drawable.animal2);
                    bt3.setEnabled(false);
                    prom = bt3;
                    nomer = 2;
                } else if (nomer == 2  && nov!=7) {
                    count++;
                    nomer = 0;
                    new CountDownTimer(1000, 1000) {
                        @Override
                        public void onTick(long millisUntilFinished) {
                            bt3.setImageResource(R.drawable.animal2);
                            bt1.setEnabled(false);
                            bt2.setEnabled(false);
                            bt3.setEnabled(false);
                            bt4.setEnabled(false);
                            bt5.setEnabled(false);
                            bt6.setEnabled(false);
                            bt7.setEnabled(false);
                            bt8.setEnabled(false);
                            bt9.setEnabled(false);
                            bt10.setEnabled(false);
                            bt11.setEnabled(false);
                            bt12.setEnabled(false);
                            bt13.setEnabled(false);
                            bt14.setEnabled(false);
                            bt15.setEnabled(false);
                            bt16.setEnabled(false);
                        }

                        @Override
                        public void onFinish() {
                            bt3.setVisibility(View.INVISIBLE);
                            bt4.setVisibility(View.INVISIBLE);
                            bt1.setEnabled(true);
                            bt2.setEnabled(true);
                            bt3.setEnabled(true);
                            bt4.setEnabled(true);
                            bt5.setEnabled(true);
                            bt6.setEnabled(true);
                            bt7.setEnabled(true);
                            bt8.setEnabled(true);
                            bt9.setEnabled(true);
                            bt10.setEnabled(true);
                            bt11.setEnabled(true);
                            bt12.setEnabled(true);
                            bt13.setEnabled(true);
                            bt14.setEnabled(true);
                            bt15.setEnabled(true);
                            bt16.setEnabled(true);
                        }
                    }.start();
                    nov++;
                    editText.setText(String.valueOf(count));
                } else if (nomer == 2 && nov==7) {
                    bt3.setImageResource(R.drawable.animal2);
                    dialog2.show();
                } else {
                    // возвращаем картинку
                    nomer = 0;
                    new CountDownTimer(1000, 1000) {
                        @Override
                        public void onTick(long millisUntilFinished) {
                            bt3.setImageResource(R.drawable.animal2);
                            bt1.setEnabled(false);
                            bt2.setEnabled(false);
                            bt3.setEnabled(false);
                            bt4.setEnabled(false);
                            bt5.setEnabled(false);
                            bt6.setEnabled(false);
                            bt7.setEnabled(false);
                            bt8.setEnabled(false);
                            bt9.setEnabled(false);
                            bt10.setEnabled(false);
                            bt11.setEnabled(false);
                            bt12.setEnabled(false);
                            bt13.setEnabled(false);
                            bt14.setEnabled(false);
                            bt15.setEnabled(false);
                            bt16.setEnabled(false);
                        }

                        @Override
                        public void onFinish() {
                            bt3.setImageResource(R.drawable.shirt);
                            prom.setImageResource(R.drawable.shirt);
                            bt1.setEnabled(true);
                            bt2.setEnabled(true);
                            bt3.setEnabled(true);
                            bt4.setEnabled(true);
                            bt5.setEnabled(true);
                            bt6.setEnabled(true);
                            bt7.setEnabled(true);
                            bt8.setEnabled(true);
                            bt9.setEnabled(true);
                            bt10.setEnabled(true);
                            bt11.setEnabled(true);
                            bt12.setEnabled(true);
                            bt13.setEnabled(true);
                            bt14.setEnabled(true);
                            bt15.setEnabled(true);
                            bt16.setEnabled(true);
                        }
                    }.start();
                    count = 0;
                    editText.setText("0");

                }
            }
        });
        bt4.setClipToOutline(true);
        bt4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // меняем изображение на кнопке
                if (nomer == 0) {
                    bt4.setImageResource(R.drawable.animal2);
                    bt4.setEnabled(false);
                    prom = bt4;
                    nomer = 2;
                } else if (nomer == 2 && nov!=7) {
                    count++;
                    nomer = 0;
                    new CountDownTimer(1000, 1000) {
                        @Override
                        public void onTick(long millisUntilFinished) {
                            bt4.setImageResource(R.drawable.animal2);
                            bt1.setEnabled(false);
                            bt2.setEnabled(false);
                            bt3.setEnabled(false);
                            bt4.setEnabled(false);
                            bt5.setEnabled(false);
                            bt6.setEnabled(false);
                            bt7.setEnabled(false);
                            bt8.setEnabled(false);
                            bt9.setEnabled(false);
                            bt10.setEnabled(false);
                            bt11.setEnabled(false);
                            bt12.setEnabled(false);
                            bt13.setEnabled(false);
                            bt14.setEnabled(false);
                            bt15.setEnabled(false);
                            bt16.setEnabled(false);
                        }

                        @Override
                        public void onFinish() {
                            bt3.setVisibility(View.INVISIBLE);
                            bt4.setVisibility(View.INVISIBLE);
                            bt1.setEnabled(true);
                            bt2.setEnabled(true);
                            bt3.setEnabled(true);
                            bt4.setEnabled(true);
                            bt5.setEnabled(true);
                            bt6.setEnabled(true);
                            bt7.setEnabled(true);
                            bt8.setEnabled(true);
                            bt9.setEnabled(true);
                            bt10.setEnabled(true);
                            bt11.setEnabled(true);
                            bt12.setEnabled(true);
                            bt13.setEnabled(true);
                            bt14.setEnabled(true);
                            bt15.setEnabled(true);
                            bt16.setEnabled(true);
                        }
                    }.start();
                    editText.setText(String.valueOf(count));
                    nov++;
                } else if (nomer == 2 && nov==7) {
                    bt4.setImageResource(R.drawable.animal2);
                    dialog2.show();
                } else {
                    // возвращаем картинку
                    nomer = 0;
                    new CountDownTimer(1000, 1000) {
                        @Override
                        public void onTick(long millisUntilFinished) {
                            bt4.setImageResource(R.drawable.animal2);
                            bt1.setEnabled(false);
                            bt2.setEnabled(false);
                            bt3.setEnabled(false);
                            bt4.setEnabled(false);
                            bt5.setEnabled(false);
                            bt6.setEnabled(false);
                            bt7.setEnabled(false);
                            bt8.setEnabled(false);
                            bt9.setEnabled(false);
                            bt10.setEnabled(false);
                            bt11.setEnabled(false);
                            bt12.setEnabled(false);
                            bt13.setEnabled(false);
                            bt14.setEnabled(false);
                            bt15.setEnabled(false);
                            bt16.setEnabled(false);
                        }

                        @Override
                        public void onFinish() {
                            bt4.setImageResource(R.drawable.shirt);
                            prom.setImageResource(R.drawable.shirt);
                            bt1.setEnabled(true);
                            bt2.setEnabled(true);
                            bt3.setEnabled(true);
                            bt4.setEnabled(true);
                            bt5.setEnabled(true);
                            bt6.setEnabled(true);
                            bt7.setEnabled(true);
                            bt8.setEnabled(true);
                            bt9.setEnabled(true);
                            bt10.setEnabled(true);
                            bt11.setEnabled(true);
                            bt12.setEnabled(true);
                            bt13.setEnabled(true);
                            bt14.setEnabled(true);
                            bt15.setEnabled(true);
                            bt16.setEnabled(true);
                        }
                    }.start();
                    count = 0;
                    editText.setText("0");
                }
            }
        });
        bt5.setClipToOutline(true);
        bt5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // меняем изображение на кнопке
                if (nomer == 0) {
                    bt5.setImageResource(R.drawable.animal3);
                    bt5.setEnabled(false);
                    prom = bt5;
                    nomer = 3;
                } else if (nomer == 3 && nov!=7) {
                    count++;
                    nomer = 0;
                    new CountDownTimer(1000, 1000) {
                        @Override
                        public void onTick(long millisUntilFinished) {
                            bt5.setImageResource(R.drawable.animal3);
                            bt1.setEnabled(false);
                            bt2.setEnabled(false);
                            bt3.setEnabled(false);
                            bt4.setEnabled(false);
                            bt5.setEnabled(false);
                            bt6.setEnabled(false);
                            bt7.setEnabled(false);
                            bt8.setEnabled(false);
                            bt9.setEnabled(false);
                            bt10.setEnabled(false);
                            bt11.setEnabled(false);
                            bt12.setEnabled(false);
                            bt13.setEnabled(false);
                            bt14.setEnabled(false);
                            bt15.setEnabled(false);
                            bt16.setEnabled(false);
                        }

                        @Override
                        public void onFinish() {
                            bt6.setVisibility(View.INVISIBLE);
                            bt5.setVisibility(View.INVISIBLE);
                            bt1.setEnabled(true);
                            bt2.setEnabled(true);
                            bt3.setEnabled(true);
                            bt4.setEnabled(true);
                            bt5.setEnabled(true);
                            bt6.setEnabled(true);
                            bt7.setEnabled(true);
                            bt8.setEnabled(true);
                            bt9.setEnabled(true);
                            bt10.setEnabled(true);
                            bt11.setEnabled(true);
                            bt12.setEnabled(true);
                            bt13.setEnabled(true);
                            bt14.setEnabled(true);
                            bt15.setEnabled(true);
                            bt16.setEnabled(true);
                        }
                    }.start();
                    editText.setText(String.valueOf(count));
                    nov++;
                } else if (nomer == 3 && nov==7) {
                    bt5.setImageResource(R.drawable.animal3);
                    dialog2.show();
                } else {
                    // возвращаем картинку
                    nomer = 0;
                    new CountDownTimer(1000, 1000) {
                        @Override
                        public void onTick(long millisUntilFinished) {
                            bt5.setImageResource(R.drawable.animal3);
                            bt1.setEnabled(false);
                            bt2.setEnabled(false);
                            bt3.setEnabled(false);
                            bt4.setEnabled(false);
                            bt5.setEnabled(false);
                            bt6.setEnabled(false);
                            bt7.setEnabled(false);
                            bt8.setEnabled(false);
                            bt9.setEnabled(false);
                            bt10.setEnabled(false);
                            bt11.setEnabled(false);
                            bt12.setEnabled(false);
                            bt13.setEnabled(false);
                            bt14.setEnabled(false);
                            bt15.setEnabled(false);
                            bt16.setEnabled(false);
                        }

                        @Override
                        public void onFinish() {
                            bt5.setImageResource(R.drawable.shirt);
                            prom.setImageResource(R.drawable.shirt);
                            bt1.setEnabled(true);
                            bt2.setEnabled(true);
                            bt3.setEnabled(true);
                            bt4.setEnabled(true);
                            bt5.setEnabled(true);
                            bt6.setEnabled(true);
                            bt7.setEnabled(true);
                            bt8.setEnabled(true);
                            bt9.setEnabled(true);
                            bt10.setEnabled(true);
                            bt11.setEnabled(true);
                            bt12.setEnabled(true);
                            bt13.setEnabled(true);
                            bt14.setEnabled(true);
                            bt15.setEnabled(true);
                            bt16.setEnabled(true);
                        }
                    }.start();
                    count = 0;
                    editText.setText("0");

                }
            }
        });
        bt6.setClipToOutline(true);
        bt6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // меняем изображение на кнопке
                if (nomer == 0) {
                    bt6.setImageResource(R.drawable.animal3);
                    bt6.setEnabled(false);
                    prom = bt6;
                    nomer = 3;
                } else if (nomer == 3 && nov!=7) {
                    count++;
                    nomer = 0;
                    new CountDownTimer(1000, 1000) {
                        @Override
                        public void onTick(long millisUntilFinished) {
                            bt6.setImageResource(R.drawable.animal3);
                            bt1.setEnabled(false);
                            bt2.setEnabled(false);
                            bt3.setEnabled(false);
                            bt4.setEnabled(false);
                            bt5.setEnabled(false);
                            bt6.setEnabled(false);
                            bt7.setEnabled(false);
                            bt8.setEnabled(false);
                            bt9.setEnabled(false);
                            bt10.setEnabled(false);
                            bt11.setEnabled(false);
                            bt12.setEnabled(false);
                            bt13.setEnabled(false);
                            bt14.setEnabled(false);
                            bt15.setEnabled(false);
                            bt16.setEnabled(false);
                        }

                        @Override
                        public void onFinish() {
                            bt6.setVisibility(View.INVISIBLE);
                            bt5.setVisibility(View.INVISIBLE);
                            bt1.setEnabled(true);
                            bt2.setEnabled(true);
                            bt3.setEnabled(true);
                            bt4.setEnabled(true);
                            bt5.setEnabled(true);
                            bt6.setEnabled(true);
                            bt7.setEnabled(true);
                            bt8.setEnabled(true);
                            bt9.setEnabled(true);
                            bt10.setEnabled(true);
                            bt11.setEnabled(true);
                            bt12.setEnabled(true);
                            bt13.setEnabled(true);
                            bt14.setEnabled(true);
                            bt15.setEnabled(true);
                            bt16.setEnabled(true);
                        }
                    }.start();
                    editText.setText(String.valueOf(count));
                    nov++;
                } else if (nomer == 3 && nov==7) {
                    bt6.setImageResource(R.drawable.animal3);
                    dialog2.show();
                } else {
                    nomer = 0;
                    // возвращаем картинку
                    new CountDownTimer(1000, 1000) {
                        @Override
                        public void onTick(long millisUntilFinished) {
                            bt6.setImageResource(R.drawable.animal3);
                            bt1.setEnabled(false);
                            bt2.setEnabled(false);
                            bt3.setEnabled(false);
                            bt4.setEnabled(false);
                            bt5.setEnabled(false);
                            bt6.setEnabled(false);
                            bt7.setEnabled(false);
                            bt8.setEnabled(false);
                            bt9.setEnabled(false);
                            bt10.setEnabled(false);
                            bt11.setEnabled(false);
                            bt12.setEnabled(false);
                            bt13.setEnabled(false);
                            bt14.setEnabled(false);
                            bt15.setEnabled(false);
                            bt16.setEnabled(false);
                        }

                        @Override
                        public void onFinish() {
                            bt6.setImageResource(R.drawable.shirt);
                            prom.setImageResource(R.drawable.shirt);
                            bt1.setEnabled(true);
                            bt2.setEnabled(true);
                            bt3.setEnabled(true);
                            bt4.setEnabled(true);
                            bt5.setEnabled(true);
                            bt6.setEnabled(true);
                            bt7.setEnabled(true);
                            bt8.setEnabled(true);
                            bt9.setEnabled(true);
                            bt10.setEnabled(true);
                            bt11.setEnabled(true);
                            bt12.setEnabled(true);
                            bt13.setEnabled(true);
                            bt14.setEnabled(true);
                            bt15.setEnabled(true);
                            bt16.setEnabled(true);
                        }
                    }.start();
                    count = 0;
                    editText.setText("0");

                }
            }
        });
        bt7.setClipToOutline(true);
        bt7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // меняем изображение на кнопке
                if (nomer == 0) {
                    bt7.setImageResource(R.drawable.animal4);
                    bt7.setEnabled(false);
                    prom = bt7;
                    nomer = 4;
                } else if (nomer == 4 && nov!=7) {
                    count++;
                    nomer = 0;
                    new CountDownTimer(1000, 1000) {
                        @Override
                        public void onTick(long millisUntilFinished) {
                            bt7.setImageResource(R.drawable.animal4);
                            bt1.setEnabled(false);
                            bt2.setEnabled(false);
                            bt3.setEnabled(false);
                            bt4.setEnabled(false);
                            bt5.setEnabled(false);
                            bt6.setEnabled(false);
                            bt7.setEnabled(false);
                            bt8.setEnabled(false);
                            bt9.setEnabled(false);
                            bt10.setEnabled(false);
                            bt11.setEnabled(false);
                            bt12.setEnabled(false);
                            bt13.setEnabled(false);
                            bt14.setEnabled(false);
                            bt15.setEnabled(false);
                            bt16.setEnabled(false);
                        }

                        @Override
                        public void onFinish() {
                            bt7.setVisibility(View.INVISIBLE);
                            bt8.setVisibility(View.INVISIBLE);
                            bt1.setEnabled(true);
                            bt2.setEnabled(true);
                            bt3.setEnabled(true);
                            bt4.setEnabled(true);
                            bt5.setEnabled(true);
                            bt6.setEnabled(true);
                            bt7.setEnabled(true);
                            bt8.setEnabled(true);
                            bt9.setEnabled(true);
                            bt10.setEnabled(true);
                            bt11.setEnabled(true);
                            bt12.setEnabled(true);
                            bt13.setEnabled(true);
                            bt14.setEnabled(true);
                            bt15.setEnabled(true);
                            bt16.setEnabled(true);
                        }
                    }.start();
                    editText.setText(String.valueOf(count));
                    nov++;
                } else if (nomer == 4 && nov==7) {
                    bt7.setImageResource(R.drawable.animal4);
                    dialog2.show();
                } else {
                    // возвращаем картинку
                    nomer = 0;
                    new CountDownTimer(1000, 1000) {
                        @Override
                        public void onTick(long millisUntilFinished) {
                            bt7.setImageResource(R.drawable.animal4);
                            bt1.setEnabled(false);
                            bt2.setEnabled(false);
                            bt3.setEnabled(false);
                            bt4.setEnabled(false);
                            bt5.setEnabled(false);
                            bt6.setEnabled(false);
                            bt7.setEnabled(false);
                            bt8.setEnabled(false);
                            bt9.setEnabled(false);
                            bt10.setEnabled(false);
                            bt11.setEnabled(false);
                            bt12.setEnabled(false);
                            bt13.setEnabled(false);
                            bt14.setEnabled(false);
                            bt15.setEnabled(false);
                            bt16.setEnabled(false);
                        }

                        @Override
                        public void onFinish() {
                            bt7.setImageResource(R.drawable.shirt);
                            prom.setImageResource(R.drawable.shirt);
                            bt1.setEnabled(true);
                            bt2.setEnabled(true);
                            bt3.setEnabled(true);
                            bt4.setEnabled(true);
                            bt5.setEnabled(true);
                            bt6.setEnabled(true);
                            bt7.setEnabled(true);
                            bt8.setEnabled(true);
                            bt9.setEnabled(true);
                            bt10.setEnabled(true);
                            bt11.setEnabled(true);
                            bt12.setEnabled(true);
                            bt13.setEnabled(true);
                            bt14.setEnabled(true);
                            bt15.setEnabled(true);
                            bt16.setEnabled(true);
                        }
                    }.start();
                    count = 0;
                    editText.setText("0");

                }
            }
        });
        bt8.setClipToOutline(true);
        bt8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // меняем изображение на кнопке
                if (nomer == 0) {
                    bt8.setImageResource(R.drawable.animal4);
                    bt8.setEnabled(false);
                    prom = bt8;
                    nomer = 4;
                } else if (nomer == 4 && nov!=7) {
                    count++;
                    nomer = 0;
                    new CountDownTimer(1000, 1000) {
                        @Override
                        public void onTick(long millisUntilFinished) {
                            bt8.setImageResource(R.drawable.animal4);
                            bt1.setEnabled(false);
                            bt2.setEnabled(false);
                            bt3.setEnabled(false);
                            bt4.setEnabled(false);
                            bt5.setEnabled(false);
                            bt6.setEnabled(false);
                            bt7.setEnabled(false);
                            bt8.setEnabled(false);
                            bt9.setEnabled(false);
                            bt10.setEnabled(false);
                            bt11.setEnabled(false);
                            bt12.setEnabled(false);
                            bt13.setEnabled(false);
                            bt14.setEnabled(false);
                            bt15.setEnabled(false);
                            bt16.setEnabled(false);
                        }

                        @Override
                        public void onFinish() {
                            bt8.setVisibility(View.INVISIBLE);
                            bt7.setVisibility(View.INVISIBLE);
                            bt1.setEnabled(true);
                            bt2.setEnabled(true);
                            bt3.setEnabled(true);
                            bt4.setEnabled(true);
                            bt5.setEnabled(true);
                            bt6.setEnabled(true);
                            bt7.setEnabled(true);
                            bt8.setEnabled(true);
                            bt9.setEnabled(true);
                            bt10.setEnabled(true);
                            bt11.setEnabled(true);
                            bt12.setEnabled(true);
                            bt13.setEnabled(true);
                            bt14.setEnabled(true);
                            bt15.setEnabled(true);
                            bt16.setEnabled(true);
                        }
                    }.start();
                    editText.setText(String.valueOf(count));
                    nov++;
                } else if (nomer == 4 && nov==7) {
                    bt8.setImageResource(R.drawable.animal4);
                    dialog2.show();
                } else {
                    // возвращаем картинку
                    nomer = 0;
                    new CountDownTimer(1000, 1000) {
                        @Override
                        public void onTick(long millisUntilFinished) {
                            bt8.setImageResource(R.drawable.animal4);
                            bt1.setEnabled(false);
                            bt2.setEnabled(false);
                            bt3.setEnabled(false);
                            bt4.setEnabled(false);
                            bt5.setEnabled(false);
                            bt6.setEnabled(false);
                            bt7.setEnabled(false);
                            bt8.setEnabled(false);
                            bt9.setEnabled(false);
                            bt10.setEnabled(false);
                            bt11.setEnabled(false);
                            bt12.setEnabled(false);
                            bt13.setEnabled(false);
                            bt14.setEnabled(false);
                            bt15.setEnabled(false);
                            bt16.setEnabled(false);
                        }

                        @Override
                        public void onFinish() {
                            bt8.setImageResource(R.drawable.shirt);
                            prom.setImageResource(R.drawable.shirt);
                            bt1.setEnabled(true);
                            bt2.setEnabled(true);
                            bt3.setEnabled(true);
                            bt4.setEnabled(true);
                            bt5.setEnabled(true);
                            bt6.setEnabled(true);
                            bt7.setEnabled(true);
                            bt8.setEnabled(true);
                            bt9.setEnabled(true);
                            bt10.setEnabled(true);
                            bt11.setEnabled(true);
                            bt12.setEnabled(true);
                            bt13.setEnabled(true);
                            bt14.setEnabled(true);
                            bt15.setEnabled(true);
                            bt16.setEnabled(true);
                        }
                    }.start();
                    count = 0;
                    editText.setText("0");

                }
            }
        });
        bt9.setClipToOutline(true);
        bt9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // меняем изображение на кнопке
                if (nomer == 0) {
                    bt9.setImageResource(R.drawable.animal5);
                    bt9.setEnabled(false);
                    prom = bt9;
                    nomer = 5;
                } else if (nomer == 5 && nov!=7) {
                    count++;
                    nomer = 0;
                    new CountDownTimer(1000, 1000) {
                        @Override
                        public void onTick(long millisUntilFinished) {
                            bt9.setImageResource(R.drawable.animal5);
                            bt1.setEnabled(false);
                            bt2.setEnabled(false);
                            bt3.setEnabled(false);
                            bt4.setEnabled(false);
                            bt5.setEnabled(false);
                            bt6.setEnabled(false);
                            bt7.setEnabled(false);
                            bt8.setEnabled(false);
                            bt9.setEnabled(false);
                            bt10.setEnabled(false);
                            bt11.setEnabled(false);
                            bt12.setEnabled(false);
                            bt13.setEnabled(false);
                            bt14.setEnabled(false);
                            bt15.setEnabled(false);
                            bt16.setEnabled(false);
                        }

                        @Override
                        public void onFinish() {
                            bt9.setVisibility(View.INVISIBLE);
                            bt10.setVisibility(View.INVISIBLE);
                            bt1.setEnabled(true);
                            bt2.setEnabled(true);
                            bt3.setEnabled(true);
                            bt4.setEnabled(true);
                            bt5.setEnabled(true);
                            bt6.setEnabled(true);
                            bt7.setEnabled(true);
                            bt8.setEnabled(true);
                            bt9.setEnabled(true);
                            bt10.setEnabled(true);
                            bt11.setEnabled(true);
                            bt12.setEnabled(true);
                            bt13.setEnabled(true);
                            bt14.setEnabled(true);
                            bt15.setEnabled(true);
                            bt16.setEnabled(true);
                        }
                    }.start();
                    editText.setText(String.valueOf(count));
                    nov++;
                } else if (nomer == 5 && nov==7) {
                    bt9.setImageResource(R.drawable.animal5);
                    dialog2.show();
                } else {
                    // возвращаем картинку
                    nomer = 0;
                    new CountDownTimer(1000, 1000) {
                        @Override
                        public void onTick(long millisUntilFinished) {
                            bt9.setImageResource(R.drawable.animal5);
                            bt1.setEnabled(false);
                            bt2.setEnabled(false);
                            bt3.setEnabled(false);
                            bt4.setEnabled(false);
                            bt5.setEnabled(false);
                            bt6.setEnabled(false);
                            bt7.setEnabled(false);
                            bt8.setEnabled(false);
                            bt9.setEnabled(false);
                            bt10.setEnabled(false);
                            bt11.setEnabled(false);
                            bt12.setEnabled(false);
                            bt13.setEnabled(false);
                            bt14.setEnabled(false);
                            bt15.setEnabled(false);
                            bt16.setEnabled(false);
                        }

                        @Override
                        public void onFinish() {
                            bt9.setImageResource(R.drawable.shirt);
                            prom.setImageResource(R.drawable.shirt);
                            bt1.setEnabled(true);
                            bt2.setEnabled(true);
                            bt3.setEnabled(true);
                            bt4.setEnabled(true);
                            bt5.setEnabled(true);
                            bt6.setEnabled(true);
                            bt7.setEnabled(true);
                            bt8.setEnabled(true);
                            bt9.setEnabled(true);
                            bt10.setEnabled(true);
                            bt11.setEnabled(true);
                            bt12.setEnabled(true);
                            bt13.setEnabled(true);
                            bt14.setEnabled(true);
                            bt15.setEnabled(true);
                            bt16.setEnabled(true);
                        }
                    }.start();
                    count = 0;
                    editText.setText("0");

                }
            }
        });
        bt10.setClipToOutline(true);
        bt10.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // меняем изображение на кнопке
                if (nomer == 0) {
                    bt10.setImageResource(R.drawable.animal5);
                    bt10.setEnabled(false);
                    prom = bt10;
                    nomer = 5;
                } else if (nomer == 5 && nov!=7) {
                    nomer = 0;
                    count++;
                    new CountDownTimer(1000, 1000) {
                        @Override
                        public void onTick(long millisUntilFinished) {
                            bt10.setImageResource(R.drawable.animal5);
                            bt1.setEnabled(false);
                            bt2.setEnabled(false);
                            bt3.setEnabled(false);
                            bt4.setEnabled(false);
                            bt5.setEnabled(false);
                            bt6.setEnabled(false);
                            bt7.setEnabled(false);
                            bt8.setEnabled(false);
                            bt9.setEnabled(false);
                            bt10.setEnabled(false);
                            bt11.setEnabled(false);
                            bt12.setEnabled(false);
                            bt13.setEnabled(false);
                            bt14.setEnabled(false);
                            bt15.setEnabled(false);
                            bt16.setEnabled(false);
                        }

                        @Override
                        public void onFinish() {
                            bt10.setVisibility(View.INVISIBLE);
                            bt9.setVisibility(View.INVISIBLE);
                            bt1.setEnabled(true);
                            bt2.setEnabled(true);
                            bt3.setEnabled(true);
                            bt4.setEnabled(true);
                            bt5.setEnabled(true);
                            bt6.setEnabled(true);
                            bt7.setEnabled(true);
                            bt8.setEnabled(true);
                            bt9.setEnabled(true);
                            bt10.setEnabled(true);
                            bt11.setEnabled(true);
                            bt12.setEnabled(true);
                            bt13.setEnabled(true);
                            bt14.setEnabled(true);
                            bt15.setEnabled(true);
                            bt16.setEnabled(true);
                        }
                    }.start();
                    editText.setText(String.valueOf(count));
                    nov++;
                } else if (nomer == 5 && nov==7) {
                    bt10.setImageResource(R.drawable.animal5);
                    dialog2.show();
                } else {
                    // возвращаем картинку
                    nomer = 0;
                    new CountDownTimer(1000, 1000) {
                        @Override
                        public void onTick(long millisUntilFinished) {
                            bt10.setImageResource(R.drawable.animal5);
                            bt1.setEnabled(false);
                            bt2.setEnabled(false);
                            bt3.setEnabled(false);
                            bt4.setEnabled(false);
                            bt5.setEnabled(false);
                            bt6.setEnabled(false);
                            bt7.setEnabled(false);
                            bt8.setEnabled(false);
                            bt9.setEnabled(false);
                            bt10.setEnabled(false);
                            bt11.setEnabled(false);
                            bt12.setEnabled(false);
                            bt13.setEnabled(false);
                            bt14.setEnabled(false);
                            bt15.setEnabled(false);
                            bt16.setEnabled(false);
                        }

                        @Override
                        public void onFinish() {
                            bt10.setImageResource(R.drawable.shirt);
                            prom.setImageResource(R.drawable.shirt);
                            bt1.setEnabled(true);
                            bt2.setEnabled(true);
                            bt3.setEnabled(true);
                            bt4.setEnabled(true);
                            bt5.setEnabled(true);
                            bt6.setEnabled(true);
                            bt7.setEnabled(true);
                            bt8.setEnabled(true);
                            bt9.setEnabled(true);
                            bt10.setEnabled(true);
                            bt11.setEnabled(true);
                            bt12.setEnabled(true);
                            bt13.setEnabled(true);
                            bt14.setEnabled(true);
                            bt15.setEnabled(true);
                            bt16.setEnabled(true);
                        }
                    }.start();
                    count = 0;
                    editText.setText("0");
                }
            }
        });
        bt11.setClipToOutline(true);
        bt11.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // меняем изображение на кнопке
                if (nomer == 0) {
                    bt11.setImageResource(R.drawable.animal6);
                    bt11.setEnabled(false);
                    prom = bt11;
                    nomer = 6;
                } else if (nomer == 6 && nov!=7) {
                    count++;
                    nomer = 0;
                    new CountDownTimer(1000, 1000) {
                        @Override
                        public void onTick(long millisUntilFinished) {
                            bt11.setImageResource(R.drawable.animal6);
                            bt1.setEnabled(false);
                            bt2.setEnabled(false);
                            bt3.setEnabled(false);
                            bt4.setEnabled(false);
                            bt5.setEnabled(false);
                            bt6.setEnabled(false);
                            bt7.setEnabled(false);
                            bt8.setEnabled(false);
                            bt9.setEnabled(false);
                            bt10.setEnabled(false);
                            bt11.setEnabled(false);
                            bt12.setEnabled(false);
                            bt13.setEnabled(false);
                            bt14.setEnabled(false);
                            bt15.setEnabled(false);
                            bt16.setEnabled(false);
                        }

                        @Override
                        public void onFinish() {
                            bt11.setVisibility(View.INVISIBLE);
                            bt12.setVisibility(View.INVISIBLE);
                            bt1.setEnabled(true);
                            bt2.setEnabled(true);
                            bt3.setEnabled(true);
                            bt4.setEnabled(true);
                            bt5.setEnabled(true);
                            bt6.setEnabled(true);
                            bt7.setEnabled(true);
                            bt8.setEnabled(true);
                            bt9.setEnabled(true);
                            bt10.setEnabled(true);
                            bt11.setEnabled(true);
                            bt12.setEnabled(true);
                            bt13.setEnabled(true);
                            bt14.setEnabled(true);
                            bt15.setEnabled(true);
                            bt16.setEnabled(true);
                        }
                    }.start();
                    editText.setText(String.valueOf(count));
                    nov++;
                } else if (nomer == 6 && nov==7) {
                    bt11.setImageResource(R.drawable.animal6);
                    dialog2.show();
                } else {
                    // возвращаем картинку
                    nomer = 0;
                    new CountDownTimer(1000, 1000) {
                        @Override
                        public void onTick(long millisUntilFinished) {
                            bt11.setImageResource(R.drawable.animal6);
                            bt1.setEnabled(false);
                            bt2.setEnabled(false);
                            bt3.setEnabled(false);
                            bt4.setEnabled(false);
                            bt5.setEnabled(false);
                            bt6.setEnabled(false);
                            bt7.setEnabled(false);
                            bt8.setEnabled(false);
                            bt9.setEnabled(false);
                            bt10.setEnabled(false);
                            bt11.setEnabled(false);
                            bt12.setEnabled(false);
                            bt13.setEnabled(false);
                            bt14.setEnabled(false);
                            bt15.setEnabled(false);
                            bt16.setEnabled(false);
                        }

                        @Override
                        public void onFinish() {
                            bt11.setImageResource(R.drawable.shirt);
                            prom.setImageResource(R.drawable.shirt);
                            bt1.setEnabled(true);
                            bt2.setEnabled(true);
                            bt3.setEnabled(true);
                            bt4.setEnabled(true);
                            bt5.setEnabled(true);
                            bt6.setEnabled(true);
                            bt7.setEnabled(true);
                            bt8.setEnabled(true);
                            bt9.setEnabled(true);
                            bt10.setEnabled(true);
                            bt11.setEnabled(true);
                            bt12.setEnabled(true);
                            bt13.setEnabled(true);
                            bt14.setEnabled(true);
                            bt15.setEnabled(true);
                            bt16.setEnabled(true);
                        }
                    }.start();
                    count = 0;
                    editText.setText("0");
                }
            }
        });
        bt12.setClipToOutline(true);
        bt12.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // меняем изображение на кнопке
                if (nomer == 0) {
                    bt12.setImageResource(R.drawable.animal6);
                    bt12.setEnabled(false);
                    prom = bt12;
                    nomer = 6;
                } else if (nomer == 6 && nov!=7) {
                    count++;
                    nomer = 0;
                    new CountDownTimer(1000, 1000) {
                        @Override
                        public void onTick(long millisUntilFinished) {
                            bt12.setImageResource(R.drawable.animal6);
                            bt1.setEnabled(false);
                            bt2.setEnabled(false);
                            bt3.setEnabled(false);
                            bt4.setEnabled(false);
                            bt5.setEnabled(false);
                            bt6.setEnabled(false);
                            bt7.setEnabled(false);
                            bt8.setEnabled(false);
                            bt9.setEnabled(false);
                            bt10.setEnabled(false);
                            bt11.setEnabled(false);
                            bt12.setEnabled(false);
                            bt13.setEnabled(false);
                            bt14.setEnabled(false);
                            bt15.setEnabled(false);
                            bt16.setEnabled(false);
                        }
                        @Override
                        public void onFinish() {
                            bt12.setVisibility(View.INVISIBLE);
                            bt11.setVisibility(View.INVISIBLE);
                            bt1.setEnabled(true);
                            bt2.setEnabled(true);
                            bt3.setEnabled(true);
                            bt4.setEnabled(true);
                            bt5.setEnabled(true);
                            bt6.setEnabled(true);
                            bt7.setEnabled(true);
                            bt8.setEnabled(true);
                            bt9.setEnabled(true);
                            bt10.setEnabled(true);
                            bt11.setEnabled(true);
                            bt12.setEnabled(true);
                            bt13.setEnabled(true);
                            bt14.setEnabled(true);
                            bt15.setEnabled(true);
                            bt16.setEnabled(true);
                        }
                    }.start();
                    editText.setText(String.valueOf(count));
                    nov++;
                } else if (nomer == 6 && nov==7) {
                    bt12.setImageResource(R.drawable.animal6);
                    dialog2.show();
                } else {
                    // возвращаем картинку
                    nomer = 0;
                    new CountDownTimer(1000, 1000) {
                        @Override
                        public void onTick(long millisUntilFinished) {
                            bt12.setImageResource(R.drawable.animal6);
                            bt1.setEnabled(false);
                            bt2.setEnabled(false);
                            bt3.setEnabled(false);
                            bt4.setEnabled(false);
                            bt5.setEnabled(false);
                            bt6.setEnabled(false);
                            bt7.setEnabled(false);
                            bt8.setEnabled(false);
                            bt9.setEnabled(false);
                            bt10.setEnabled(false);
                            bt11.setEnabled(false);
                            bt12.setEnabled(false);
                            bt13.setEnabled(false);
                            bt14.setEnabled(false);
                            bt15.setEnabled(false);
                            bt16.setEnabled(false);
                        }

                        @Override
                        public void onFinish() {
                            bt12.setImageResource(R.drawable.shirt);
                            prom.setImageResource(R.drawable.shirt);
                            bt1.setEnabled(true);
                            bt2.setEnabled(true);
                            bt3.setEnabled(true);
                            bt4.setEnabled(true);
                            bt5.setEnabled(true);
                            bt6.setEnabled(true);
                            bt7.setEnabled(true);
                            bt8.setEnabled(true);
                            bt9.setEnabled(true);
                            bt10.setEnabled(true);
                            bt11.setEnabled(true);
                            bt12.setEnabled(true);
                            bt13.setEnabled(true);
                            bt14.setEnabled(true);
                            bt15.setEnabled(true);
                            bt16.setEnabled(true);
                        }
                    }.start();
                    count = 0;
                    editText.setText("0");
                }
            }
        });
        bt13.setClipToOutline(true);
        bt13.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // меняем изображение на кнопке
                if (nomer == 0) {
                    bt13.setImageResource(R.drawable.animal7);
                    bt13.setEnabled(false);
                    prom = bt13;
                    nomer = 7;
                } else if (nomer == 7 && nov!=7) {
                    count++;
                    nomer = 0;
                    new CountDownTimer(1000, 1000) {
                        @Override
                        public void onTick(long millisUntilFinished) {
                            bt13.setImageResource(R.drawable.animal7);
                            bt1.setEnabled(false);
                            bt2.setEnabled(false);
                            bt3.setEnabled(false);
                            bt4.setEnabled(false);
                            bt5.setEnabled(false);
                            bt6.setEnabled(false);
                            bt7.setEnabled(false);
                            bt8.setEnabled(false);
                            bt9.setEnabled(false);
                            bt10.setEnabled(false);
                            bt11.setEnabled(false);
                            bt12.setEnabled(false);
                            bt13.setEnabled(false);
                            bt14.setEnabled(false);
                            bt15.setEnabled(false);
                            bt16.setEnabled(false);
                        }
                        @Override
                        public void onFinish() {
                            bt13.setVisibility(View.INVISIBLE);
                            bt14.setVisibility(View.INVISIBLE);
                            bt1.setEnabled(true);
                            bt2.setEnabled(true);
                            bt3.setEnabled(true);
                            bt4.setEnabled(true);
                            bt5.setEnabled(true);
                            bt6.setEnabled(true);
                            bt7.setEnabled(true);
                            bt8.setEnabled(true);
                            bt9.setEnabled(true);
                            bt10.setEnabled(true);
                            bt11.setEnabled(true);
                            bt12.setEnabled(true);
                            bt13.setEnabled(true);
                            bt14.setEnabled(true);
                            bt15.setEnabled(true);
                            bt16.setEnabled(true);
                        }
                    }.start();
                    editText.setText(String.valueOf(count));
                    nov++;
                } else if (nomer == 7 && nov==7) {
                    bt13.setImageResource(R.drawable.animal7);
                    dialog2.show();
                } else {
                    // возвращаем картинку
                    nomer = 0;
                    new CountDownTimer(1000, 1000) {
                        @Override
                        public void onTick(long millisUntilFinished) {
                            bt13.setImageResource(R.drawable.animal7);
                            bt1.setEnabled(false);
                            bt2.setEnabled(false);
                            bt3.setEnabled(false);
                            bt4.setEnabled(false);
                            bt5.setEnabled(false);
                            bt6.setEnabled(false);
                            bt7.setEnabled(false);
                            bt8.setEnabled(false);
                            bt9.setEnabled(false);
                            bt10.setEnabled(false);
                            bt11.setEnabled(false);
                            bt12.setEnabled(false);
                            bt13.setEnabled(false);
                            bt14.setEnabled(false);
                            bt15.setEnabled(false);
                            bt16.setEnabled(false);
                        }

                        @Override
                        public void onFinish() {
                            bt13.setImageResource(R.drawable.shirt);
                            prom.setImageResource(R.drawable.shirt);
                            bt1.setEnabled(true);
                            bt2.setEnabled(true);
                            bt3.setEnabled(true);
                            bt4.setEnabled(true);
                            bt5.setEnabled(true);
                            bt6.setEnabled(true);
                            bt7.setEnabled(true);
                            bt8.setEnabled(true);
                            bt9.setEnabled(true);
                            bt10.setEnabled(true);
                            bt11.setEnabled(true);
                            bt12.setEnabled(true);
                            bt13.setEnabled(true);
                            bt14.setEnabled(true);
                            bt15.setEnabled(true);
                            bt16.setEnabled(true);
                        }
                    }.start();
                    count = 0;
                    editText.setText("0");
                }
            }
        });
        bt14.setClipToOutline(true);
        bt14.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // меняем изображение на кнопке
                if (nomer == 0) {
                    bt14.setImageResource(R.drawable.animal7);
                    bt14.setEnabled(false);
                    prom = bt14;
                    nomer = 7;
                } else if (nomer == 7 && nov!=7) {
                    count++;
                    nomer = 0;
                    new CountDownTimer(1000, 1000) {
                        @Override
                        public void onTick(long millisUntilFinished) {
                            bt14.setImageResource(R.drawable.animal7);
                            bt1.setEnabled(false);
                            bt2.setEnabled(false);
                            bt3.setEnabled(false);
                            bt4.setEnabled(false);
                            bt5.setEnabled(false);
                            bt6.setEnabled(false);
                            bt7.setEnabled(false);
                            bt8.setEnabled(false);
                            bt9.setEnabled(false);
                            bt10.setEnabled(false);
                            bt11.setEnabled(false);
                            bt12.setEnabled(false);
                            bt13.setEnabled(false);
                            bt14.setEnabled(false);
                            bt15.setEnabled(false);
                            bt16.setEnabled(false);
                        }
                        @Override
                        public void onFinish() {
                            bt13.setVisibility(View.INVISIBLE);
                            bt14.setVisibility(View.INVISIBLE);
                            bt1.setEnabled(true);
                            bt2.setEnabled(true);
                            bt3.setEnabled(true);
                            bt4.setEnabled(true);
                            bt5.setEnabled(true);
                            bt6.setEnabled(true);
                            bt7.setEnabled(true);
                            bt8.setEnabled(true);
                            bt9.setEnabled(true);
                            bt10.setEnabled(true);
                            bt11.setEnabled(true);
                            bt12.setEnabled(true);
                            bt13.setEnabled(true);
                            bt14.setEnabled(true);
                            bt15.setEnabled(true);
                            bt16.setEnabled(true);
                        }
                    }.start();
                    editText.setText(String.valueOf(count));
                    nov++;
                } else if (nomer == 7 && nov==7) {
                    bt14.setImageResource(R.drawable.animal7);
                    dialog2.show();
                } else {
                    // возвращаем картинку
                    nomer = 0;
                    new CountDownTimer(1000, 1000) {
                        @Override
                        public void onTick(long millisUntilFinished) {
                            bt14.setImageResource(R.drawable.animal7);
                            bt1.setEnabled(false);
                            bt2.setEnabled(false);
                            bt3.setEnabled(false);
                            bt4.setEnabled(false);
                            bt5.setEnabled(false);
                            bt6.setEnabled(false);
                            bt7.setEnabled(false);
                            bt8.setEnabled(false);
                            bt9.setEnabled(false);
                            bt10.setEnabled(false);
                            bt11.setEnabled(false);
                            bt12.setEnabled(false);
                            bt13.setEnabled(false);
                            bt14.setEnabled(false);
                            bt15.setEnabled(false);
                            bt16.setEnabled(false);
                        }

                        @Override
                        public void onFinish() {
                            bt14.setImageResource(R.drawable.shirt);
                            prom.setImageResource(R.drawable.shirt);
                            bt1.setEnabled(true);
                            bt2.setEnabled(true);
                            bt3.setEnabled(true);
                            bt4.setEnabled(true);
                            bt5.setEnabled(true);
                            bt6.setEnabled(true);
                            bt7.setEnabled(true);
                            bt8.setEnabled(true);
                            bt9.setEnabled(true);
                            bt10.setEnabled(true);
                            bt11.setEnabled(true);
                            bt12.setEnabled(true);
                            bt13.setEnabled(true);
                            bt14.setEnabled(true);
                            bt15.setEnabled(true);
                            bt16.setEnabled(true);
                        }
                    }.start();
                    count = 0;
                    editText.setText("0");
                }
            }
        });
        bt15.setClipToOutline(true);
        bt15.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // меняем изображение на кнопке
                if (nomer == 0) {
                    bt15.setImageResource(R.drawable.animal8);
                    bt15.setEnabled(false);
                    prom = bt15;
                    nomer = 8;
                } else if (nomer == 8 && nov!=7) {
                    count++;
                    nomer = 0;
                    new CountDownTimer(1000, 1000) {
                        @Override
                        public void onTick(long millisUntilFinished) {
                            bt15.setImageResource(R.drawable.animal8);
                            bt1.setEnabled(false);
                            bt2.setEnabled(false);
                            bt3.setEnabled(false);
                            bt4.setEnabled(false);
                            bt5.setEnabled(false);
                            bt6.setEnabled(false);
                            bt7.setEnabled(false);
                            bt8.setEnabled(false);
                            bt9.setEnabled(false);
                            bt10.setEnabled(false);
                            bt11.setEnabled(false);
                            bt12.setEnabled(false);
                            bt13.setEnabled(false);
                            bt14.setEnabled(false);
                            bt15.setEnabled(false);
                            bt16.setEnabled(false);
                        }
                        @Override
                        public void onFinish() {
                            bt15.setVisibility(View.INVISIBLE);
                            bt16.setVisibility(View.INVISIBLE);
                            bt1.setEnabled(true);
                            bt2.setEnabled(true);
                            bt3.setEnabled(true);
                            bt4.setEnabled(true);
                            bt5.setEnabled(true);
                            bt6.setEnabled(true);
                            bt7.setEnabled(true);
                            bt8.setEnabled(true);
                            bt9.setEnabled(true);
                            bt10.setEnabled(true);
                            bt11.setEnabled(true);
                            bt12.setEnabled(true);
                            bt13.setEnabled(true);
                            bt14.setEnabled(true);
                            bt15.setEnabled(true);
                            bt16.setEnabled(true);
                        }
                    }.start();
                    editText.setText(String.valueOf(count));
                    nov++;
                } else if (nomer == 8 && nov==7) {
                    bt15.setImageResource(R.drawable.animal8);
                    dialog2.show();
                } else {
                    // возвращаем картинку
                    nomer = 0;
                    new CountDownTimer(1000, 1000) {
                        @Override
                        public void onTick(long millisUntilFinished) {
                            bt15.setImageResource(R.drawable.animal8);
                            bt1.setEnabled(false);
                            bt2.setEnabled(false);
                            bt3.setEnabled(false);
                            bt4.setEnabled(false);
                            bt5.setEnabled(false);
                            bt6.setEnabled(false);
                            bt7.setEnabled(false);
                            bt8.setEnabled(false);
                            bt9.setEnabled(false);
                            bt10.setEnabled(false);
                            bt11.setEnabled(false);
                            bt12.setEnabled(false);
                            bt13.setEnabled(false);
                            bt14.setEnabled(false);
                            bt15.setEnabled(false);
                            bt16.setEnabled(false);
                        }

                        @Override
                        public void onFinish() {
                            bt15.setImageResource(R.drawable.shirt);
                            prom.setImageResource(R.drawable.shirt);
                            bt1.setEnabled(true);
                            bt2.setEnabled(true);
                            bt3.setEnabled(true);
                            bt4.setEnabled(true);
                            bt5.setEnabled(true);
                            bt6.setEnabled(true);
                            bt7.setEnabled(true);
                            bt8.setEnabled(true);
                            bt9.setEnabled(true);
                            bt10.setEnabled(true);
                            bt11.setEnabled(true);
                            bt12.setEnabled(true);
                            bt13.setEnabled(true);
                            bt14.setEnabled(true);
                            bt15.setEnabled(true);
                            bt16.setEnabled(true);
                        }
                    }.start();
                    count = 0;
                    editText.setText("0");
                }
            }
        });
        bt16.setClipToOutline(true);
        bt16.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // меняем изображение на кнопке
                if (nomer == 0) {
                    bt16.setImageResource(R.drawable.animal8);
                    bt16.setEnabled(false);
                    prom = bt16;
                    nomer = 8;
                } else if (nomer == 8 && nov!=7) {
                    count++;
                    nomer = 0;
                    new CountDownTimer(1000, 1000) {
                        @Override
                        public void onTick(long millisUntilFinished) {
                            bt16.setImageResource(R.drawable.animal8);
                            bt1.setEnabled(false);
                            bt2.setEnabled(false);
                            bt3.setEnabled(false);
                            bt4.setEnabled(false);
                            bt5.setEnabled(false);
                            bt6.setEnabled(false);
                            bt7.setEnabled(false);
                            bt8.setEnabled(false);
                            bt9.setEnabled(false);
                            bt10.setEnabled(false);
                            bt11.setEnabled(false);
                            bt12.setEnabled(false);
                            bt13.setEnabled(false);
                            bt14.setEnabled(false);
                            bt15.setEnabled(false);
                            bt16.setEnabled(false);
                        }
                        @Override
                        public void onFinish() {
                            bt15.setVisibility(View.INVISIBLE);
                            bt16.setVisibility(View.INVISIBLE);
                            bt1.setEnabled(true);
                            bt2.setEnabled(true);
                            bt3.setEnabled(true);
                            bt4.setEnabled(true);
                            bt5.setEnabled(true);
                            bt6.setEnabled(true);
                            bt7.setEnabled(true);
                            bt8.setEnabled(true);
                            bt9.setEnabled(true);
                            bt10.setEnabled(true);
                            bt11.setEnabled(true);
                            bt12.setEnabled(true);
                            bt13.setEnabled(true);
                            bt14.setEnabled(true);
                            bt15.setEnabled(true);
                            bt16.setEnabled(true);
                        }
                    }.start();
                    editText.setText(String.valueOf(count));
                    nov++;
                } else if (nomer == 8 && nov==7) {
                    bt16.setImageResource(R.drawable.animal8);
                    dialog2.show();
                } else {
                    // возвращаем картинку
                    nomer = 0;
                    new CountDownTimer(1000, 1000) {
                        @Override
                        public void onTick(long millisUntilFinished) {
                            bt16.setImageResource(R.drawable.animal8);
                            bt1.setEnabled(false);
                            bt2.setEnabled(false);
                            bt3.setEnabled(false);
                            bt4.setEnabled(false);
                            bt5.setEnabled(false);
                            bt6.setEnabled(false);
                            bt7.setEnabled(false);
                            bt8.setEnabled(false);
                            bt9.setEnabled(false);
                            bt10.setEnabled(false);
                            bt11.setEnabled(false);
                            bt12.setEnabled(false);
                            bt13.setEnabled(false);
                            bt14.setEnabled(false);
                            bt15.setEnabled(false);
                            bt16.setEnabled(false);
                        }

                        @Override
                        public void onFinish() {
                            bt16.setImageResource(R.drawable.shirt);
                            prom.setImageResource(R.drawable.shirt);
                            bt1.setEnabled(true);
                            bt2.setEnabled(true);
                            bt3.setEnabled(true);
                            bt4.setEnabled(true);
                            bt5.setEnabled(true);
                            bt6.setEnabled(true);
                            bt7.setEnabled(true);
                            bt8.setEnabled(true);
                            bt9.setEnabled(true);
                            bt10.setEnabled(true);
                            bt11.setEnabled(true);
                            bt12.setEnabled(true);
                            bt13.setEnabled(true);
                            bt14.setEnabled(true);
                            bt15.setEnabled(true);
                            bt16.setEnabled(true);
                        }
                    }.start();
                    count = 0;
                    editText.setText("0");
                }
            }
        });
    }
}
