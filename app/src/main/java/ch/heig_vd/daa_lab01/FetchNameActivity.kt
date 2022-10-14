package ch.heig_vd.daa_lab01

import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class FetchNameActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_save)
    }

    companion object {
        val ASK_FOR_NAME_RESULT_KEY = "NAME_KEY"
    }
}