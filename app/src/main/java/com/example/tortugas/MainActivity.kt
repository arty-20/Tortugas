package com.example.tortugas

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        metodo();
    }
    fun radioButtonClick(view:View){

        metodo();
    }
    fun metodo(){
        if (radioLeo.isChecked==true){
            tortuga.setImageResource(R.drawable.tmntleo);
        }else{
            if (radioDon.isChecked==true){
                tortuga.setImageResource(R.drawable.tmntdon);
            }else{
                if (radioMiguel.isChecked==true){
                    tortuga.setImageResource(R.drawable.tmntmike);
                }else{
                    if (radioRafa.isChecked==true){
                        tortuga.setImageResource(R.drawable.tmntraph);
                    }
                }
            }
        }
    }

}
