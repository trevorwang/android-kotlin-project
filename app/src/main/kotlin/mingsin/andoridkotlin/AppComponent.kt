package mingsin.andoridkotlin

import android.content.Context
import dagger.Component
import javax.inject.Singleton

/**
 * Created by trevorwang on 10/12/2016.
 */
@Singleton
@Component(modules = arrayOf(AppModule::class))
interface AppComponent {
    fun app(): App
    fun context(): Context
}