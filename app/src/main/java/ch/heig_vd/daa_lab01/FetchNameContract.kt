package ch.heig_vd.daa_lab01

import android.content.Context
import android.content.Intent
import androidx.activity.result.contract.ActivityResultContract

class FetchNameContract : ActivityResultContract<Void?, String>() {
    override fun createIntent(context: Context, input: Void?): Intent =
        Intent(context, )


    override fun parseResult(resultCode: Int, intent: Intent?): String {
        TODO("Not yet implemented")
    }

}