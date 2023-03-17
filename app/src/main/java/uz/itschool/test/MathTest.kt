package uz.itschool.test

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Layout
import android.widget.Button
import android.widget.LinearLayout
import android.widget.RadioGroup
import android.widget.Toast

class MathTest : AppCompatActivity() {
    private lateinit var tugatish : Button

    private lateinit var test1 : RadioGroup
    private lateinit var test2 : RadioGroup
    private lateinit var test3 : RadioGroup
    private lateinit var test4 : RadioGroup
    private lateinit var test5 : RadioGroup
    var Yakun = mutableListOf<RadioGroup>()




    @SuppressLint("MissingInflatedId", "WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_math_test)
        test1 = findViewById(R.id.test1)
        test2 = findViewById(R.id.test2)
        test3= findViewById(R.id.test3)
        test4 = findViewById(R.id.test4)
        test5 = findViewById(R.id.test5)
        tugatish = findViewById(R.id.tugat)
        Yakun.add(test1)
        Yakun.add(test2)
        Yakun.add(test3)
        Yakun.add(test4)
        Yakun.add(test5)
        tugatish.setOnClickListener {

            var ball = 0
            if (test1.checkedRadioButtonId == R.id.savol1){
                ball+=1
            }
            if (test2.checkedRadioButtonId == R.id.savol6){
                ball+=1
            }
            if (test3.checkedRadioButtonId == R.id.savol12){
                ball+=1
            }
            if (test4.checkedRadioButtonId == R.id.savol20){
                ball+=1
            }
            if (test5.checkedRadioButtonId == R.id.savol21){
                ball+=1
            }
            Toast.makeText(applicationContext, ball.toString(), Toast.LENGTH_SHORT).show()

        }
    }
}