package ch.heig_vd.daa_lab01

import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import ch.heig_vd.daa_lab01.fragments.StepFragment

class MainActivityFragment2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragment2)

        findViewById<Button>(R.id.button_back).setOnClickListener {
            // On revient au Fragment précédent
            if (supportFragmentManager.backStackEntryCount > 0)  {
                supportFragmentManager.popBackStack()
            } else {
                // On termine l'activité
                findViewById<Button>(R.id.button_close).callOnClick()
            }
        }

        findViewById<Button>(R.id.button_close).setOnClickListener {
            finish()
        }

        findViewById<Button>(R.id.button_next).setOnClickListener {
            supportFragmentManager.beginTransaction()
                .replace(
                    R.id.fragmentContainer,
                    StepFragment.newInstance(supportFragmentManager.backStackEntryCount)
                )
                .addToBackStack(null)
                .commit()

        }
    }
}