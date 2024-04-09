package pe.edu.upc.myapplication.model.remote

import pe.edu.upc.myapplication.model.data.Joke
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers

interface JokeService {
    @Headers("Accept:application/json")
    @GET("?")
    fun getRandomJoke(): Call<Joke>
}