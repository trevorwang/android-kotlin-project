package mingsin.andoridkotlin

import dagger.Component

/**
 * Created by trevorwang on 10/12/2016.
 */
@ForActivity
@Component(modules = arrayOf(ActivityModule::class))
interface ActivityComponent {

    fun inject(activity: MainActivity)
}