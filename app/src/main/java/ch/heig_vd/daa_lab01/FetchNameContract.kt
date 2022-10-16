package ch.heig_vd.daa_lab01

import android.app.Activity
import android.content.Context
import android.content.Intent
import androidx.activity.result.contract.ActivityResultContract

class FetchNameContract : ActivityResultContract<Void?, String?>() {
    override fun createIntent(context: Context, input: Void?): Intent =
        Intent(context, FetchNameActivity::class.java)

    override fun parseResult(resultCode: Int, intent: Intent?): String? {
        // Check for status of returned contract
        if (resultCode != Activity.RESULT_OK) return null

        // If OK, return value stored at the agreed upon key
        return intent?.getStringExtra(FetchNameActivity.ASK_FOR_NAME_RESULT_KEY)
    }
}
