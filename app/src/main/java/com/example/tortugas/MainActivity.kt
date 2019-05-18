package com.example.tortugas

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun radioButtonClick(view:View){
        if (view == radioLeo){
            tortuga.setImageResource(R.drawable.tmntleo);
        }else{
            if (view == radioDon){
                tortuga.setImageResource(R.drawable.tmntdon);
            }else{
                if (view == radioMiguel){
                    tortuga.setImageResource(R.drawable.tmntmike);
                }else{
                    if (view == radioRafa){
                        tortuga.setImageResource(R.drawable.tmntraph);
                    }
                }
            }
        }
    }


}
