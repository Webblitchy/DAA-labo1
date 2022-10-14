package ch.heig_vd.daa_lab01

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class FetchNameActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_save)

        val buttonSave = findViewById<Button>(R.id.button_save)
        val surnameInput = findViewById<EditText>(R.id.surname_input)

        buttonSave.setOnClickListener {
            val surname = surnameInput.text.toString();
            // TODO: passer le surname en argument
            val i = Intent(this, MainActivity::class.java)
            startActivity(i)
        }
    }

    companion object {
        val ASK_FOR_NAME_RESULT_KEY = "NAME_KEY"
    }
}