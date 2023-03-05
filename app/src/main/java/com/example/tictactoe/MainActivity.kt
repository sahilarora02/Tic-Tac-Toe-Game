package com.example.tictactoe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var arr = listOf<Button>(first_First , first_Second, first_Third , second_First ,
            second_Second , second_Third , third_First , third_Second , third_Third)

        var PlayerVal = true

    first_First.setOnClickListener {
        if(PlayerVal){
            first_First.text = "X"
          PlayerVal =   !PlayerVal
        }else{
            first_First.text = "O"
            PlayerVal =   !PlayerVal
        }
    }
   first_Second.setOnClickListener {
       if(PlayerVal){
           first_Second.text = "X"
           PlayerVal =   !PlayerVal
       }else{
           first_Second.text = "O"
           PlayerVal =   !PlayerVal
       }
    }
   first_Third.setOnClickListener {
       if(PlayerVal){
           first_Third.text = "X"
           PlayerVal =   !PlayerVal
       }else{
           first_Third.text = "O"
           PlayerVal =   !PlayerVal
       }
    }
   second_First.setOnClickListener {
       if(PlayerVal){
           second_First.text = "X"
           PlayerVal =   !PlayerVal
       }else{
           second_First.text = "O"
           PlayerVal =   !PlayerVal
       }
    }
   second_Second.setOnClickListener {
       if(PlayerVal){
           second_Second.text = "X"
           PlayerVal =   !PlayerVal
       }else{
           second_Second.text = "O"
           PlayerVal =   !PlayerVal
       }
    }
   second_Third.setOnClickListener {
       if(PlayerVal){
           second_Third.text = "X"
           PlayerVal =   !PlayerVal
       }else{
           second_Third.text = "O"
           PlayerVal =   !PlayerVal
       }
    }
   third_First.setOnClickListener {
       if(PlayerVal){
           third_First.text = "X"
           PlayerVal =   !PlayerVal
       }else{
           third_First.text = "O"
           PlayerVal =   !PlayerVal
       }
    }
   third_Second.setOnClickListener {
       if(PlayerVal){
           third_Second.text = "X"
           PlayerVal =   !PlayerVal
       }else{
           third_Second.text = "O"
           PlayerVal =   !PlayerVal
       }
    }
   third_Third.setOnClickListener {
       if(PlayerVal){
           third_Third.text = "X"
           PlayerVal =   !PlayerVal
       }else{
           third_Third.text = "O"
           PlayerVal =   !PlayerVal
       }
    }
        reset.setOnClickListener {
           for(id in arr){
              id.text=""
           }
        }

    }
}