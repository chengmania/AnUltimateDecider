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



        btnDecide.setOnClickListener {

            if (decisionList.isNotEmpty()) {


                val random = Random()
                val randomDecision = random.nextInt(decisionList.count())

                txtDecision.text = decisionList[randomDecision]
            } else {
                txtDecision.text = "You have not entered any options"
            }

        }

        btnAddChoice.setOnClickListener {
            val newChoice = eTChoice.text.toString()
            decisionList.add(newChoice)
            eTChoice.text.clear()

            txtOptionsList.text = decisionList.toString()

            println(decisionList)
        }

        btnReset.setOnClickListener {
            decisionList.clear()
            txtOptionsList.text = decisionList.toString()
            txtDecision.text =" "
        }


    }
}
