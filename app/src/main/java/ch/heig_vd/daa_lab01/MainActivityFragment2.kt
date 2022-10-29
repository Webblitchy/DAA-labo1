package ch.heig_vd.daa_lab01
// Auteurs : Maxim Golay, Eliott Chytil & Lucien Perregaux

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import ch.heig_vd.daa_lab01.fragments.StepFragment

class MainActivityFragment2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragment2)

        findViewById<Button>(R.id.button_back).setOnClickListener {
            if (supportFragmentManager.backStackEntryCount > 0) {
                // On revient au Fragment précédent
                supportFragmentManager.popBackStack()
            } else {
                // On termine l'activité
                finish()
            }
        }

        findViewById<Button>(R.id.button_close).setOnClickListener {
            finish()
        }

        findViewById<Button>(R.id.button_next).setOnClickListener {
            supportFragmentManager.beginTransaction()
                .replace(
                    R.id.fragmentContainer,
                    StepFragment.newInstance(supportFragmentManager.backStackEntryCount + 1)
                )
                .addToBackStack(null)
                .commit()
        }
    }
}