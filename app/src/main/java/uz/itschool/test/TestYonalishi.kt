package uz.itschool.test

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class TestYonalishi : AppCompatActivity() {
    private lateinit var button1 :Button
    private lateinit var button2 :Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test_yonalishi)
        button1 = findViewById(R.id.button)
        button2 = findViewById(R.id.button1)
        button1.setOnClickListener {
            startActivity(Intent(applicationContext, MathTest::class.java))
        }
        button2.setOnClickListener {
            startActivity(Intent(applicationContext, PhysicsTest::class.java))
        }

    }
}