package mingsin.andoridkotlin.di

import dagger.Module
import dagger.Provides
import mingsin.andoridkotlin.view.BaseActivity

/**
 * Created by trevorwang on 10/12/2016.
 */
@Module
class ActivityModule(val activity: BaseActivity) {
    @Provides
    fun activity(): BaseActivity {
        return activity
    }
}