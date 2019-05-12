package net.gregorycheng.ultimatedecider

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.NullPointerException
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val decisionList = arrayListOf("")
        decisionList.clear()


        //set to the button's call and function
        btnDecide.setOnClickListener {
            //checking to see if the list is empty.  If it is then state so.
            if (decisionList.isNotEmpty()) {

                //create a random number based on the quantity of the list
                val random = Random()
                val randomDecision = random.nextInt(decisionList.count())
                //display the random choice based on the number in the list
                txtDecision.text = decisionList[randomDecision]
            } else {
                txtDecision.text = "You have not entered any options"

            }

        }
        //set to the button's call and function
        btnAddChoice.setOnClickListener {
            //created a variable newChoice, from the user input
            val newChoice = eTChoice.text.toString()
            //adds the user input choice into the list
            decisionList.add(newChoice)
            //clears the text in the edittext for a new user input
            eTChoice.text.clear()
            //adds the newly inputted choice into a TextView
            txtOptionsList.text = decisionList.toString()

            println(decisionList)
        }
        //Reset button, for clearing the list and starting fresh with new inputs from the user
        btnReset.setOnClickListener {

            decisionList.clear()
            txtOptionsList.text = decisionList.toString()
            txtDecision.text =" "
        }


    }
}
