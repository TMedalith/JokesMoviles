package pe.edu.upc.myapplication.repositories

import android.util.Log
import pe.edu.upc.myapplication.factories.JokeServiceFactory
import pe.edu.upc.myapplication.model.data.Joke
import pe.edu.upc.myapplication.model.remote.JokeService
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class JokeRepository(private val jokeService: JokeService = JokeServiceFactory.getJokeService()) {
    fun getRandomJoke(callback: (Joke)->Unit){
        val getRandomJoke = jokeService.getRandomJoke()
        getRandomJoke.enqueue(object : Callback<Joke>{
            override fun onResponse(call: Call<Joke>, response: Response<Joke>) {
                if(response.isSuccessful){
                    callback(response.body()?:Joke("No Joke"))
                }
            }

            override fun onFailure(call: Call<Joke>, response: Throwable) {
                response.message?.let {
                    Log.d("JokeRepository", it)
                }
            }

        })
    }
}