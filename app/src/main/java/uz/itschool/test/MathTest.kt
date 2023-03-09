package uz.itschool.test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioGroup
import android.widget.Toast

class MathTest : AppCompatActivity() {
    private lateinit var tugatish : Button

    private lateinit var test1 : RadioGroup
    private lateinit var test2 : RadioGroup
    private lateinit var test3 : RadioGroup
    private lateinit var test4 : RadioGroup
    private lateinit var test5 : RadioGroup



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_math_test)
        test1 = findViewById(R.id.test1)
        test2 = findViewById(R.id.test2)
        test3= findViewById(R.id.test3)
        test4 = findViewById(R.id.test4)
        test5 = findViewById(R.id.test5)
        tugatish = findViewById(R.id.tugat)
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