package com.example.taskagitmakas;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    ImageView rakip,ben;
    Button tas,kagit,makas,restart;
    public int me_skor=0;
    public int rakip_skor=0;
    TextView rakip_puan,me_puan,sonuc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rakip_puan = findViewById(R.id.rakip_puan);
        sonuc=findViewById(R.id.sonuc);
        me_puan = findViewById(R.id.me_puan);
        kagit = (Button) findViewById(R.id.button2);
        makas = (Button) findViewById(R.id.button3);
        restart = (Button) findViewById(R.id.button4);
        restart.setVisibility(View.INVISIBLE);

        sonuc.setText("Bekleniyor...");
        rakip_puan.setText("Rakip: "+rakip_skor);
        me_puan.setText("Skorum: "+me_skor);
        ben = (ImageView) findViewById(R.id.ben);
        rakip = (ImageView) findViewById(R.id.rakip);
        tas = (Button) findViewById(R.id.button);
        tas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ben.setImageResource(R.drawable.tas);
                int[] cards={R.drawable.tas,R.drawable.makas,R.drawable.kagit};
                Random r = new Random();
                int n=r.nextInt(3);

                Drawable.ConstantState me = rakip.getDrawable().getConstantState();
                Drawable.ConstantState bilgisayar_tas = getDrawable(R.drawable.tas).getConstantState();
                Drawable.ConstantState bilgisayar_kagit = getDrawable(R.drawable.kagit).getConstantState();
                Drawable.ConstantState bilgisayar_makas = getDrawable(R.drawable.makas).getConstantState();

                if (me==bilgisayar_makas){
                    me_skor++;
                    me_puan.setText("Skorum:"+me_skor);

                    if (me_skor==3){
                        sonuc.setText("Ben Kazandım!");
                        restart.setVisibility(View.VISIBLE);
                        tas.setVisibility(View.INVISIBLE);
                        kagit.setVisibility(View.INVISIBLE);
                        makas.setVisibility(View.INVISIBLE);
                        rakip_puan.setText("Rakip:"+rakip_skor);
                        me_puan.setText("Skorum:"+me_skor);
                    }
                }
                else if (me==bilgisayar_tas){
                    sonuc.setText("Berabere");
                }
                else {
                    rakip_skor++;
                    rakip_puan.setText("Rakip:"+rakip_skor);

                    if (rakip_skor==3){
                        sonuc.setText("Rakip Kazandı!");
                        restart.setVisibility(View.VISIBLE);
                        tas.setVisibility(View.INVISIBLE);
                        kagit.setVisibility(View.INVISIBLE);
                        makas.setVisibility(View.INVISIBLE);
                        rakip_puan.setText("Rakip:"+rakip_skor);
                        me_puan.setText("Skorum:"+me_skor);
                    }
                }
            }
        });
        kagit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ben.setImageResource(R.drawable.kagit);
                int[] cards={R.drawable.tas,R.drawable.makas,R.drawable.kagit};
                Random r = new Random();
                int n=r.nextInt(3);
                rakip.setImageResource(cards[n]);
                Drawable.ConstantState me = rakip.getDrawable().getConstantState();
                Drawable.ConstantState bilgisayar_tas = getDrawable(R.drawable.tas).getConstantState();
                Drawable.ConstantState bilgisayar_kagit = getDrawable(R.drawable.kagit).getConstantState();
                Drawable.ConstantState bilgisayar_makas = getDrawable(R.drawable.makas).getConstantState();

                if (me==bilgisayar_tas){
                    me_skor++;
                    me_puan.setText("Skorum:"+me_skor);

                    if (me_skor==3){
                        sonuc.setText("Ben Kazandım!");
                        restart.setVisibility(View.VISIBLE);
                        tas.setVisibility(View.INVISIBLE);
                        kagit.setVisibility(View.INVISIBLE);
                        makas.setVisibility(View.INVISIBLE);
                        rakip_puan.setText("Rakip:"+rakip_skor);
                        me_puan.setText("Skorum:"+me_skor);
                    }
                }
                else if (me==bilgisayar_kagit){
                    sonuc.setText("Berabere");
                }
                else {
                    rakip_skor++;
                    rakip_puan.setText("Rakip:"+rakip_skor);

                    if (rakip_skor==3){
                        sonuc.setText("Rakip Kazandı!");
                        restart.setVisibility(View.VISIBLE);
                        tas.setVisibility(View.INVISIBLE);
                        kagit.setVisibility(View.INVISIBLE);
                        makas.setVisibility(View.INVISIBLE);
                        rakip_puan.setText("Rakip:"+rakip_skor);
                        me_puan.setText("Skorum:"+me_skor);
                    }
                }
            }
        });
        makas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ben.setImageResource(R.drawable.makas);

                Drawable.ConstantState me = rakip.getDrawable().getConstantState();
                Drawable.ConstantState bilgisayar_tas = getDrawable(R.drawable.tas).getConstantState();
                Drawable.ConstantState bilgisayar_kagit = getDrawable(R.drawable.kagit).getConstantState();
                Drawable.ConstantState bilgisayar_makas = getDrawable(R.drawable.makas).getConstantState();

                if (me==bilgisayar_kagit){
                    me_skor++;
                    me_puan.setText("Skorum:"+me_skor);

                    if (me_skor==3){
                        sonuc.setText("Ben Kazandım!");
                        restart.setVisibility(View.VISIBLE);
                        tas.setVisibility(View.INVISIBLE);
                        kagit.setVisibility(View.INVISIBLE);
                        makas.setVisibility(View.INVISIBLE);
                        rakip_puan.setText("Rakip:"+rakip_skor);
                        me_puan.setText("Skorum:"+me_skor);
                    }
                }
                else if (me==bilgisayar_makas){
                    sonuc.setText("Berabere");
                }
                else {
                    rakip_skor++;
                    rakip_puan.setText("Rakip:"+rakip_skor);

                    if (rakip_skor==3){
                        sonuc.setText("Rakip Kazandı!");
                        restart.setVisibility(View.VISIBLE);
                        tas.setVisibility(View.INVISIBLE);
                        kagit.setVisibility(View.INVISIBLE);
                        makas.setVisibility(View.INVISIBLE);
                        rakip_puan.setText("Rakip:"+rakip_skor);
                        me_puan.setText("Skorum:"+me_skor);
                    }
                }
            }
        });

    }

}