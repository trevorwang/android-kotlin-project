package mingsin.andoridkotlin

import android.app.Application

/**
 * Created by trevorwang on 10/12/2016.
 */
class App : Application() {

    override fun onCreate() {
        super.onCreate()
    }

    fun component(): AppComponent {
        return DaggerAppComponent.builder().appModule(AppModule(this)).build()
    }
}