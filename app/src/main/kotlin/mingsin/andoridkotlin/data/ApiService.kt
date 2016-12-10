package mingsin.andoridkotlin.data

import mingsin.andoridkotlin.model.Ip
import retrofit2.http.GET
import rx.Observable

/**
 * Created by trevorwang on 08/12/2016.
 */
interface ApiService {

    @GET("ip")
    fun getIp(): Observable<Ip>
}