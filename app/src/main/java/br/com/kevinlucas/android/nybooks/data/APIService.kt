package br.com.kevinlucas.android.nybooks.data

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object APIService {

    private fun initRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl("https://api.nytimes.com/svc/books/v3/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    val service: NYTServices = initRetrofit().create(NYTServices::class.java)
}