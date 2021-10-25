package com.example.androidseekho

import android.content.Context
import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_dice_roller.*

class DiceRoller : AppCompatActivity() {

    val ctx: Context = this@DiceRoller
    val dice = Dice(6)
    var diceRoll : Int = 0
    val luckyNumber = 4

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dice_roller)

        rollDice()

        button.setOnClickListener { view ->
            rollDice()
        }

    }


    private fun rollDice() {


        diceRoll = dice.roll();
        //with if statement
     /*   if(diceRoll == luckyNumber){
            Toast.makeText(ctx, "You Win!", Toast.LENGTH_LONG).show()

        }
        else{
            Toast.makeText(ctx, "You rolled $diceRoll, Try again", Toast.LENGTH_LONG).show()
        }*/

        // with when statement
       val imageDrawable = when(diceRoll){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
           else -> R.drawable.dice_6
       }
        diceImage.setImageResource(imageDrawable)


        //Toast.makeText(ctx, "Dice Rolled", Toast.LENGTH_SHORT).show()

    }
}

