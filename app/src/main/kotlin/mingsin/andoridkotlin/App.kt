package mingsin.andoridkotlin

import android.app.Application
import mingsin.andoridkotlin.di.AppComponent
import mingsin.andoridkotlin.di.AppModule
import mingsin.andoridkotlin.di.DaggerAppComponent

/**
 * Created by trevorwang on 10/12/2016.
 */
class App : Application() {

    lateinit var component: AppComponent

    override fun onCreate() {
        super.onCreate()
        component = initComp()
    }

    fun initComp(): AppComponent {
        return DaggerAppComponent.builder().appModule(AppModule(this)).build()
    }
}