package com.example.tictactoe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {
    private var Count: Int = 1
    lateinit var  arr : ArrayList<Button>
//    val btnArray = arrayOf(first_First , first_Second , first_Third , second_First , second_Second
//    , second_Third , third_First ,third_Second , third_Third )


//    val array = listOf<String>("first_First" , "first_Second" , "first_Third" , "second_First" , "second_Second"
//     , "second_Third" , "third_First" ,"third_Second" , "third_Third")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        arr = ArrayList()
arr.add(first_First)
        arr.add(first_Second)
        arr.add(first_Third)
        arr.add(second_First)
        arr.add(second_Second)
        arr.add(second_Third)
        arr.add(third_First)
        arr.add(third_Second)
        arr.add(third_Third)



        var PlayerVal = true

    first_First.setOnClickListener {
        if(PlayerVal){
            first_First.text = "X"
            Count++
          PlayerVal =   !PlayerVal
            show.text = "Player O Turn"

        }else{
            first_First.text = "O"
            PlayerVal =   !PlayerVal
            Count++
            show.text = "Player X Turn"

        }

        first_First.isClickable = false
        if(Count>=3){
            checkWinner()
        }
    }
   first_Second.setOnClickListener {
       if(PlayerVal){
           first_Second.text = "X"
           show.text = "Player O Turn"


           PlayerVal =   !PlayerVal
           Count++

       }else{
           first_Second.text = "O"
           PlayerVal =   !PlayerVal
           Count++
           show.text = "Player X Turn"



       }
       first_Second.isClickable = false
       if(Count>=3){
           checkWinner()
       }

   }
   first_Third.setOnClickListener {
       if(PlayerVal){
           first_Third.text = "X"
           PlayerVal =   !PlayerVal
           Count++
           show.text = "Player O Turn"


       }else{
           first_Third.text = "O"
           PlayerVal =   !PlayerVal
           Count++
           show.text = "Player X Turn"



       }
       first_Third.isClickable = false
       if(Count>=3){
           checkWinner()
       }

   }
   second_First.setOnClickListener {
       if(PlayerVal){
           second_First.text = "X"
           Count++
           show.text = "Player O Turn"


           PlayerVal =   !PlayerVal
       }else{
           second_First.text = "O"
           PlayerVal =   !PlayerVal
           Count++
           show.text = "Player X Turn"


       }
       second_First.isClickable = false
       if(Count>=3){
           checkWinner()
       }

   }
   second_Second.setOnClickListener {
       if(PlayerVal){
           second_Second.text = "X"
           Count++
           show.text = "Player O Turn"


           PlayerVal =   !PlayerVal
       }else{
           second_Second.text = "O"
           PlayerVal =   !PlayerVal
           Count++
           show.text = "Player X Turn"

       }
       second_Second.isClickable = false
       if(Count>=3){
           checkWinner()
       }

   }
   second_Third.setOnClickListener {
       if(PlayerVal){
           second_Third.text = "X"
           PlayerVal =   !PlayerVal
           Count++
           show.text = "Player O Turn"


       }else{
           second_Third.text = "O"
           PlayerVal =   !PlayerVal
           Count++
           show.text = "Player X Turn"


       }
       second_Third.isClickable = false
       if(Count>=3){
           checkWinner()
       }

   }
   third_First.setOnClickListener {
       if(PlayerVal){
           third_First.text = "X"
           Count++
           show.text = "Player O Turn"


           PlayerVal =   !PlayerVal
       }else{
           third_First.text = "O"
           PlayerVal =   !PlayerVal
           Count++
           show.text = "Player X Turn"


       }
       third_First.isClickable = false
       if(Count>=3){
           checkWinner()
       }

   }
   third_Second.setOnClickListener {
       if(PlayerVal){
           third_Second.text = "X"
           PlayerVal =   !PlayerVal
           Count++
                     show.text = "Player O Turn"

       }else{
           third_Second.text = "O"
           PlayerVal =   !PlayerVal
           Count++
                 show.text = "Player X Turn"

       }
//       if(Count == 9){
//
//           DrawOrWinner()
//       }
       third_Second.isClickable = false
       if(Count>=3){
           checkWinner()
       }

   }
   third_Third.setOnClickListener {
       if(PlayerVal){
           third_Third.text = "X"
           Count++
           show.text = "Player O Turn"

           PlayerVal =   !PlayerVal
       }else{
           third_Third.text = "O"
           PlayerVal =   !PlayerVal
           Count++
           show.text = "Player X Turn"


       }
       third_Third.isClickable = false

       if(Count>=3){
           checkWinner()
       }

   }
        reset.setOnClickListener {


            resetMatch()

        }

        var matrix: Array<IntArray> = Array(3) { IntArray(3) }

//        for(i in matrix){
//            for(j in i){
//
//            }
//        }

        //row wise winner check



        //column wise winner check



        //first diagonal



        //second diagonal

    }

//    private fun DrawOrWinner() {
//        if( first_First.text == first_Second.text && first_First.text == first_Third.text){
//            show.text = "Winner is  " + first_First.text
//            Toast.makeText(this , "First if" , Toast.LENGTH_SHORT).show()
//
//        }else if(second_First.text == second_Second.text && second_First.text == second_Third.text){
//            show.text = "Winner is   " + second_First.text
//            Toast.makeText(this , "Second if" , Toast.LENGTH_SHORT).show()
//
//        }else if(third_First.text == third_Second.text && third_First.text == third_Third.text){
//            show.text = "Winner is  " + third_First.text
//            Toast.makeText(this , "Third if" , Toast.LENGTH_SHORT).show()
//        }else{
////          Drawmatch()
//        }
//    }

    private fun resetMatch() {
        for(id in arr){
            id.text =""
            Disablebtn()
        }

        Count = 0
        show.text = "Game Restart"
    }
//  private  fun resetMatchNow(){
//      for(i in btnArray.indices){
//          Log.i("hey =>" , btnArray[i].toString())
//      }
//  }
//    private fun Drawmatch() {
//        show.text = "Match Draw"
//        resetMatch()
//
//    }
    private  fun Disablebtn(){
    for(id in arr){
        id.isClickable = true
    }
    }
    private  fun DisableFalse(){
        for(id in arr){
            id.isClickable = false
        }
    }

    private fun checkWinner() {
        if(Count>=3 && first_First.text == first_Second.text && first_First.text == first_Third.text && first_First.text!=""){

            show.text = "Winner is   " + first_First.text
            DisableFalse()


        }else if(Count>=3 && second_First.text!="" && second_First.text == second_Second.text && second_First.text == second_Third.text){

            show.text = "Winner is   " + second_First.text
            DisableFalse()

        }else if(Count>=3 && third_First.text!="" && third_First.text == third_Second.text && third_First.text == third_Third.text){

            show.text = "Winner is   " + third_First.text
            DisableFalse()


        }else if(Count>=3 && first_First.text!="" && first_First.text == second_First.text && first_First.text == third_First.text){
            show.text = "Winner is   " + first_First.text
            DisableFalse()


        }else if(Count>=3 && first_Second.text!="" && first_Second.text == second_Second.text && first_Second.text == third_Second.text){
           show.text =  "Winner is   " + first_Second.text
            DisableFalse()


        }else if(Count>=3 && first_Third.text!="" && first_Third.text == second_Third.text && first_Third.text == third_Third.text){
            show.text =  "Winner is   " + first_Third.text
            DisableFalse()


        }else if(Count>=3 && first_First.text!="" && first_First.text == second_Second.text && first_First.text == third_Third.text){
            show.text =  "Winner is   " + first_First.text
            DisableFalse()


        }else if(Count>=3 && first_Third.text!="" && first_Third.text == second_Second.text && first_Third.text == third_First.text){
            show.text =  "Winner is   " + first_Third.text
            DisableFalse()


        }else if(Count==9){
            show.text = "Draw Match 💀💀"
        }
    }
}