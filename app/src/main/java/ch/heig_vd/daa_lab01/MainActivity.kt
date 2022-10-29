package ch.heig_vd.daa_lab01
// Auteurs : Maxim Golay, Eliott Chytil & Lucien Perregaux

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var name = ""

    private val getName = registerForActivityResult(FetchNameContract()) {
        name = (
                if (it.isNullOrBlank()) "Bienvenue, veuillez entrer votre nom"
                else "Bienvenue ${it} !"
                )

        val textField = findViewById<TextView>(R.id.welcome_text)
        textField.text = name
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonEdit = findViewById<Button>(R.id.button_edit)

        buttonEdit.setOnClickListener {
            getName.launch(null)
        }
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        val n = savedInstanceState.getString("name")
        if (!n.isNullOrBlank())
            name = n

        val textField = findViewById<TextView>(R.id.welcome_text)
        textField.text = name.ifBlank { "Bienvenue, veuillez entrer votre nom" }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putString("name", name)
    }
}
