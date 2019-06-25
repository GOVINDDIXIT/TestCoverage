package app.dixit.govind.testcoverage

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button.setOnClickListener {
            textView.text = "Hello World!"
        }
    }

    fun isValidMail(email: String): Boolean {
        return email.indexOf("@") > -1
    }
}

