package mingsin.andoridkotlin.viewmodel

import android.databinding.ViewDataBinding

/**
 * Created by trevorwang on 10/12/2016.
 */

abstract class ViewModel<B> where B : ViewDataBinding {
    abstract var binding: B
}
