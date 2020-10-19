package com.onoh.mymovieapps.utils

import com.onoh.mymovieapps.data.popular.PopularedMoviesEntity
import com.onoh.mymovieapps.data.popular.ThisWeekEntity

object DataPopularedDummy {

    fun generateDummyThisWeek():List<ThisWeekEntity>{
        val newReleases = ArrayList<ThisWeekEntity>()

        newReleases.add(
            ThisWeekEntity(
            "Mulan",
                "8,8",
            "https://storage.googleapis.com/dystribute-media/ROJicXScYCIj0M1cngtI.jpg")
        )

        newReleases.add(
            ThisWeekEntity(
                "Alita",
                "7,8",
                "https://financerewind.com/wp-content/uploads/2020/08/Alita-Battle-Angel-2-Expected-Release-Date-Cast-Plot-Lines.jpg")
        )

        newReleases.add(
            ThisWeekEntity(
                "Enola Holmes",
                "7,6",
                "https://image.tmdb.org/t/p/w533_and_h300_bestv2/kMe4TKMDNXTKptQPAdOF0oZHq3V.jpg")
        )

        return newReleases
    }

    fun generateDummyPopularMovies():List<PopularedMoviesEntity>{
        val popularMovies = ArrayList<PopularedMoviesEntity>()

        popularMovies.add(PopularedMoviesEntity(
            "Birds of Prey",
            "Harley Quinn joins forces with a singer, an assassin and a police detective to help a young girl who had a hit placed on her after she stole a rare diamond from a crime lord.",
            "https://image.tmdb.org/t/p/w600_and_h900_bestv2/h4VB6m0RwcicVEZvzftYZyKXs6K.jpg")
        )

        popularMovies.add(PopularedMoviesEntity(
            "We Bare Bears:The Movie",
            "When Grizz, Panda, and Ice Bear's love of food trucks and viral videos went out of hand, it catches the attention of Agent Trout from the National Wildlife Control, who pledges to restore the “natural order” by separating them forever. Chased away from their home, the Bears embark on an epic road trip as they seek refuge in Canada, with their journey being filled with new friends, perilous obstacles, and huge parties. The risky journey also forces the Bears to face how they first met and became brothers, in order to keep their family bond from splitting apart.",
            "https://image.tmdb.org/t/p/w600_and_h900_bestv2/kPzcvxBwt7kEISB9O4jJEuBn72t.jpg")
        )

        popularMovies.add(PopularedMoviesEntity(
            "Bad Boys for Life",
            "Marcus and Mike are forced to confront new threats, career changes, and midlife crises as they join the newly created elite team AMMO of the Miami police department to take down the ruthless Armando Armas, the vicious leader of a Miami drug cartel.",
            "https://image.tmdb.org/t/p/w600_and_h900_bestv2/y95lQLnuNKdPAzw9F9Ab8kJ80c3.jpg")
        )

        popularMovies.add(PopularedMoviesEntity(
            "Joker",
            "During the 1980s, a failed stand-up comedian is driven insane and turns to a life of crime and chaos in Gotham City while becoming an infamous psychopathic crime figure.",
            "https://image.tmdb.org/t/p/w600_and_h900_bestv2/udDclJoHjfjb8Ekgsd4FDteOkCU.jpg")
        )

        return popularMovies
    }

}