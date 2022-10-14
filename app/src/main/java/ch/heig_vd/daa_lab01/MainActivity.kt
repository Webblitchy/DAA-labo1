package ch.heig_vd.daa_lab01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonEdit = findViewById<Button>(R.id.button_edit)

        buttonEdit.setOnClickListener {
            val i = Intent(this, FetchNameActivity::class.java)
            startActivity(i)
        }
    }
}