package com.example.durgesh.hotel_mangement_system;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;




public class Splashscreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);

        Thread timerThread = new Thread(){
            public void run(){
                try{
                    sleep(3000);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }finally{
                    Intent a = new Intent(Splashscreen.this,MainActivity.class);
                    startActivity(a);
                }
            }
        };
        timerThread.start();


    }


    @Override
    protected void onPause() {
        // TODO Auto-generated method stub
        super.onPause();
        finish();
    }


}


