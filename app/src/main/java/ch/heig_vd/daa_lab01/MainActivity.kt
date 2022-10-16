package ch.heig_vd.daa_lab01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private val getName = registerForActivityResult(FetchNameContract()) {
        val textField = findViewById<TextView>(R.id.welcome_text)

        textField.text = (
            if (it.isNullOrBlank()) "Bievenue, veuillez entrer votre nom"
            else "Bienvenue ${it} !"
        )
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonEdit = findViewById<Button>(R.id.button_edit)

        buttonEdit.setOnClickListener {
            getName.launch(null)
        }
    }
}
