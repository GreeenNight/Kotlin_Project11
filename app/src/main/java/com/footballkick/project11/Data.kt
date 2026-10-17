package com.footballkick.project11

class Data {
    companion object {
        var teamNumber: Int = 0
        var gameNumber: Int = 0

        var team1: String = "Paris Saint-Germain"
        var team2: String = "Bayern Munich"
        var image1:Int=R.drawable.chelsea
        var image2:Int=R.drawable.chelsea
        var finalScore: String = "0-1"
        var date:String ="Tuesday, 20 October 2020"

        var venue: String = "Estádio da Luz, Lisbon, Portugal"
        var team1Stats: Array<String> = arrayOf("46%","10","3","7","0","1","322","83%","12","12","0",
            "4(Ander Herrera, Layvin Kurzawa, Leandro Paredes, Presnel Kimpembe)","0","101.9km","1st half - 45%, 2nd half - 47%")
        var team2Stats: Array<String> = arrayOf("46%","10","3","7","0","1","322","83%","12","12","0",
            "4(Ander Herrera, Layvin Kurzawa, Leandro Paredes, Presnel Kimpembe)","0","101.9km","1st half - 45%, 2nd half - 47%")
        var goals: String = "59th minute: Kingsley Coman (Bayern Munich) scored the only goal of the match"

        var group_game1: Array<Any> = arrayOf(R.drawable.chelsea, R.drawable.sevilla, "Chelsea", "Sevilla", "0-0", "Tuesday, 20 October 2020")
        var group_game2: Array<Any> = arrayOf(R.drawable.krasnodar, R.drawable.chelsea, "FC Krasnodar", "Chelsea", "0-4", "Wednesday, 28 October 2020")
        var group_game3: Array<Any> = arrayOf(R.drawable.chelsea, R.drawable.rennes, "Chelsea", "Rennes", "3-0", "Wednesday, 4 November 2020")
        var group_game4: Array<Any> = arrayOf(R.drawable.rennes, R.drawable.chelsea, "Rennes", "Chelsea", "1-2", "Tuesday, 24 November 2020")
        var group_game5: Array<Any> = arrayOf(R.drawable.sevilla, R.drawable.chelsea, "Sevilla", "Chelsea", "0-4", "Wednesday, 2 December 2020")
        var group_game6: Array<Any> = arrayOf(R.drawable.chelsea, R.drawable.krasnodar, "Chelsea", "FC Krasnodar", "1-1", "Tuesday, 8 December 2020")


        var knockout_game1: Array<Any> = arrayOf(R.drawable.chelsea, R.drawable.atletico, "Chelsea", "Atletico Madrid", "1-0", "Tuesday, 23 February 2021")
        var knockout_game2: Array<Any> = arrayOf(R.drawable.atletico, R.drawable.chelsea, "Atletico Madrid", "Chelsea", "0-1", "Wednesday, 17 March 2021")
        var knockout_game3: Array<Any> = arrayOf(R.drawable.porto, R.drawable.chelsea, "FC Porto", "Chelsea", "0-2", "Wednesday, 7 April 2021")
        var knockout_game4: Array<Any> = arrayOf(R.drawable.chelsea, R.drawable.porto, "Chelsea", "FC Porto", "0-1", "Tuesday, 13 April 2021")
        var knockout_game5: Array<Any> = arrayOf(R.drawable.chelsea, R.drawable.real_madrid, "Chelsea", "Real Madrid", "2-0", "Wednesday, 5 May 2021")
        var knockout_game6: Array<Any> = arrayOf(R.drawable.real_madrid, R.drawable.chelsea, "Real Madrid", "Chelsea", "1-1", "Wednesday, 26 May 2021")
        var final_game: Array<Any> = arrayOf(R.drawable.chelsea, R.drawable.man_city, "Chelsea", "Manchester City", "1-0", "Saturday, 29 May 2021")

    }
}