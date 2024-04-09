package pe.edu.upc.myapplication.factories

import pe.edu.upc.myapplication.model.remote.JokeService

class JokeServiceFactory {
    companion object {
         private var jokeService: JokeService? = null

        fun getJokeService(): JokeService {
            if (jokeService == null) {
                jokeService = RetrofitFactory.getRetrofit().create(JokeService::class.java)
            }
            return jokeService as JokeService
        }

    }
}