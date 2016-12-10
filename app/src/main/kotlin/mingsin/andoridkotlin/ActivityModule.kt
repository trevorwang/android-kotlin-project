package mingsin.andoridkotlin

import android.app.Activity
import dagger.Module
import dagger.Provides

/**
 * Created by trevorwang on 10/12/2016.
 */
@Module
class ActivityModule(val activity: Activity) {
    @Provides
    fun activity(): Activity {
        return activity
    }
}