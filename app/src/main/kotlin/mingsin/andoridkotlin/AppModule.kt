package mingsin.andoridkotlin

import android.content.Context
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by trevorwang on 10/12/2016.
 */
@Module
class AppModule(val app: App) {
    @Provides
    @Singleton
    fun application(): App {
        return app
    }

    @Provides
    @Singleton
    fun context(): Context {
        return app.applicationContext
    }
}