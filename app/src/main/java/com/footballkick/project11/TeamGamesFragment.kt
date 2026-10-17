package com.footballkick.project11

import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.FragmentActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.footballkick.project11.databinding.FragmentTeamGamesBinding

class TeamGamesFragment : FragmentActivity() {
    private lateinit var binding: FragmentTeamGamesBinding
    private val parentList = ArrayList<ParentItem>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.fragment_team_games)
        binding.recyclerView.setHasFixedSize(true)
        binding.recyclerView.layoutManager = LinearLayoutManager(this)

        when (Data.teamNumber) {
            0 -> {
                Data.group_game1 = arrayOf(
                    R.drawable.chelsea,
                    R.drawable.sevilla,
                    "Chelsea",
                    "Sevilla",
                    "0-0",
                    "Tuesday, 20 October 2020"
                )
                Data.group_game2 = arrayOf(
                    R.drawable.krasnodar,
                    R.drawable.chelsea,
                    "FC Krasnodar",
                    "Chelsea",
                    "0-4",
                    "Wednesday, 28 October 2020"
                )
                Data.group_game3 = arrayOf(
                    R.drawable.chelsea,
                    R.drawable.rennes,
                    "Chelsea",
                    "Rennes",
                    "3-0",
                    "Wednesday, 4 November 2020"
                )
                Data.group_game4 = arrayOf(
                    R.drawable.rennes,
                    R.drawable.chelsea,
                    "Rennes",
                    "Chelsea",
                    "1-2",
                    "Tuesday, 24 November 2020"
                )
                Data.group_game5 = arrayOf(
                    R.drawable.sevilla,
                    R.drawable.chelsea,
                    "Sevilla",
                    "Chelsea",
                    "0-4",
                    "Wednesday, 2 December 2020"
                )
                Data.group_game6 = arrayOf(
                    R.drawable.chelsea,
                    R.drawable.krasnodar,
                    "Chelsea",
                    "FC Krasnodar",
                    "1-1",
                    "Tuesday, 8 December 2020"
                )
                Data.knockout_game1 = arrayOf(
                    R.drawable.chelsea,
                    R.drawable.atletico,
                    "Chelsea",
                    "Atletico Madrid",
                    "1-0",
                    "Tuesday, 23 February 2021"
                )
                Data.knockout_game2 = arrayOf(
                    R.drawable.atletico,
                    R.drawable.chelsea,
                    "Atletico Madrid",
                    "Chelsea",
                    "0-1",
                    "Wednesday, 17 March 2021"
                )
                Data.knockout_game3 = arrayOf(
                    R.drawable.porto,
                    R.drawable.chelsea,
                    "FC Porto",
                    "Chelsea",
                    "0-2",
                    "Wednesday, 7 April 2021"
                )
                Data.knockout_game4 = arrayOf(
                    R.drawable.chelsea,
                    R.drawable.porto,
                    "Chelsea",
                    "FC Porto",
                    "0-1",
                    "Tuesday, 13 April 2021"
                )
                Data.knockout_game5 = arrayOf(
                    R.drawable.chelsea,
                    R.drawable.real_madrid,
                    "Chelsea",
                    "Real Madrid",
                    "2-0",
                    "Wednesday, 5 May 2021"
                )
                Data.knockout_game6 = arrayOf(
                    R.drawable.real_madrid,
                    R.drawable.chelsea,
                    "Real Madrid",
                    "Chelsea",
                    "1-1",
                    "Wednesday, 26 May 2021"
                )
                Data.final_game = arrayOf(
                    R.drawable.chelsea,
                    R.drawable.man_city,
                    "Chelsea",
                    "Manchester City",
                    "1-0",
                    "Saturday, 29 May 2021"
                )
            }

            1 -> {
                Data.group_game1 = arrayOf(
                    R.drawable.man_city,
                    R.drawable.porto,
                    "Manchester City",
                    "FC Porto",
                    "3-1",
                    "Wednesday, 21 October 2020"
                )
                Data.group_game2 = arrayOf(
                    R.drawable.olympique,
                    R.drawable.man_city,
                    "Olympique Marseille",
                    "Manchester City",
                    "0-3",
                    "Tuesday, 27 October 2020"
                )
                Data.group_game3 = arrayOf(
                    R.drawable.man_city,
                    R.drawable.olympique,
                    "Manchester City",
                    "Olympique Marseille",
                    "3-0",
                    "Tuesday, 3 November 2020"
                )
                Data.group_game4 = arrayOf(
                    R.drawable.olympiakos,
                    R.drawable.man_city,
                    "Olympiakos",
                    "Manchester City",
                    "0-1",
                    "Wednesday, 25 November 2020"
                )
                Data.group_game5 = arrayOf(
                    R.drawable.man_city,
                    R.drawable.olympiakos,
                    "Manchester City",
                    "Olympiakos",
                    "1-0",
                    "Tuesday, 1 December 2020"
                )
                Data.group_game6 = arrayOf(
                    R.drawable.porto,
                    R.drawable.man_city,
                    "FC Porto",
                    "Manchester City",
                    "0-0",
                    "Wednesday, 9 December 2020"
                )
                Data.knockout_game1 = arrayOf(
                    R.drawable.borussia_monch,
                    R.drawable.man_city,
                    "Borussia Monch.",
                    "Manchester City",
                    "0-2",
                    "Wednesday, 24 February 2021"
                )
                Data.knockout_game2 = arrayOf(
                    R.drawable.man_city,
                    R.drawable.borussia_monch,
                    "Manchester City",
                    "Borussia Monch.",
                    "2-0",
                    "Tuesday, 16 March 2021"
                )
                Data.knockout_game3 = arrayOf(
                    R.drawable.man_city,
                    R.drawable.borussia,
                    "Manchester City",
                    "Borussia Dortmund",
                    "2-1",
                    "Tuesday, 6 April 2021"
                )
                Data.knockout_game4 = arrayOf(
                    R.drawable.borussia,
                    R.drawable.man_city,
                    "Borussia Dortmund",
                    "Manchester City",
                    "1-2",
                    "Wednesday, 14 April 2021"
                )
                Data.knockout_game5 = arrayOf(
                    R.drawable.psg,
                    R.drawable.man_city,
                    "Paris Saint-Germain",
                    "Manchester City",
                    "1-2",
                    "Wednesday, 28 April 2021"
                )
                Data.knockout_game6 = arrayOf(
                    R.drawable.man_city,
                    R.drawable.psg,
                    "Manchester City",
                    "Paris Saint-Germain",
                    "2-0",
                    "Tuesday, 4 May 2021"
                )
                Data.final_game = arrayOf(
                    R.drawable.chelsea,
                    R.drawable.man_city,
                    "Chelsea",
                    "Manchester City",
                    "1-0",
                    "Saturday, 29 May 2021"
                )
            }

            2 -> {
                Data.group_game1 = arrayOf(
                    R.drawable.shakhtar,
                    R.drawable.real_madrid,
                    "Shakhtar Donetsk",
                    "Real Madrid",
                    "2-3",
                    "Wednesday, 21 October 2020"
                )
                Data.group_game2 = arrayOf(
                    R.drawable.real_madrid,
                    R.drawable.borussia_monch,
                    "Real Madrid",
                    "Borussia Monch.",
                    "2-2",
                    "Tuesday, 27 October 2020"
                )
                Data.group_game3 = arrayOf(
                    R.drawable.inter,
                    R.drawable.real_madrid,
                    "Inter Milan",
                    "Real Madrid",
                    "0-2",
                    "Wednesday, 3 November 2020"
                )
                Data.group_game4 = arrayOf(
                    R.drawable.real_madrid,
                    R.drawable.inter,
                    "Real Madrid",
                    "Inter Milan",
                    "3-2",
                    "Tuesday, 25 November 2020"
                )
                Data.group_game5 = arrayOf(
                    R.drawable.real_madrid,
                    R.drawable.shakhtar,
                    "Real Madrid",
                    "Shakhtar Donetsk",
                    "2-0",
                    "Tuesday, 1 December 2020"
                )
                Data.group_game6 = arrayOf(
                    R.drawable.borussia_monch,
                    R.drawable.real_madrid,
                    "Borussia Monch.",
                    "Real Madrid",
                    "2-0",
                    "Wednesday, 9 December 2020"
                )
                Data.knockout_game1 = arrayOf(
                    R.drawable.real_madrid,
                    R.drawable.atalanta,
                    "Real Madrid",
                    "Atalanta",
                    "3-1",
                    "Wednesday, 24 February 2021"
                )
                Data.knockout_game2 = arrayOf(
                    R.drawable.atalanta,
                    R.drawable.real_madrid,
                    "Atalanta",
                    "Real Madrid",
                    "0-1",
                    "Tuesday, 16 March 2021"
                )
                Data.knockout_game3 = arrayOf(
                    R.drawable.liverpool,
                    R.drawable.real_madrid,
                    "Liverpool",
                    "Real Madrid",
                    "0-0",
                    "Tuesday, 6 April 2021"
                )
                Data.knockout_game4 = arrayOf(
                    R.drawable.real_madrid,
                    R.drawable.liverpool,
                    "Real Madrid",
                    "Liverpool",
                    "0-0",
                    "Wednesday, 14 April 2021"
                )
                Data.knockout_game5 = arrayOf(
                    R.drawable.real_madrid,
                    R.drawable.chelsea,
                    "Real Madrid",
                    "Chelsea",
                    "1-1",
                    "Tuesday, 27 April 2021"
                )
                Data.knockout_game6 = arrayOf(
                    R.drawable.chelsea,
                    R.drawable.real_madrid,
                    "Chelsea",
                    "Real Madrid",
                    "2-0",
                    "Wednesday, 5 May 2021"
                )
                Data.final_game = emptyArray()
            }

            3 -> {
                Data.group_game1 = arrayOf(
                    R.drawable.psg,
                    R.drawable.manchester,
                    "Paris Saint-Germain",
                    "Manchester United",
                    "1-2",
                    "Tuesday, 20 October 2020"
                )
                Data.group_game2 = arrayOf(
                    R.drawable.basaksehir,
                    R.drawable.psg,
                    "Istanbul Basaksehir",
                    "Paris Saint-Germain",
                    "0-2",
                    "Wednesday, 28 October 2020"
                )
                Data.group_game3 = arrayOf(
                    R.drawable.leipzig,
                    R.drawable.psg,
                    "RB Leipzig",
                    "Paris Saint-Germain",
                    "2-1",
                    "Tuesday, 4 November 2020"
                )
                Data.group_game4 = arrayOf(
                    R.drawable.psg,
                    R.drawable.leipzig,
                    "Paris Saint-Germain",
                    "RB Leipzig",
                    "1-0",
                    "Tuesday, 24 November 2020"
                )
                Data.group_game5 = arrayOf(
                    R.drawable.manchester,
                    R.drawable.psg,
                    "Manchester United",
                    "Paris Saint-Germain",
                    "1-3",
                    "Wednesday, 2 December 2020"
                )
                Data.group_game6 = arrayOf(
                    R.drawable.psg,
                    R.drawable.basaksehir,
                    "Paris Saint-Germain",
                    "Istanbul Basaksehir",
                    "5-1",
                    "Tuesday, 8 December 2020"
                )
                Data.knockout_game1 = arrayOf(
                    R.drawable.psg,
                    R.drawable.barcelona,
                    "Paris Saint-Germain",
                    "Barcelona",
                    "4-1",
                    "Tuesday, 16 February 2021"
                )
                Data.knockout_game2 = arrayOf(
                    R.drawable.barcelona,
                    R.drawable.psg,
                    "Barcelona",
                    "Paris Saint-Germain",
                    "1-1",
                    "Wednesday, 10 March 2021"
                )
                Data.knockout_game3 = arrayOf(
                    R.drawable.bayern,
                    R.drawable.psg,
                    "Bayern Munich",
                    "Paris Saint-Germain",
                    "2-3",
                    "Wednesday, 7 April 2021"
                )
                Data.knockout_game4 = arrayOf(
                    R.drawable.psg,
                    R.drawable.bayern,
                    "Paris Saint-Germain",
                    "Bayern Munich",
                    "0-1",
                    "Tuesday, 13 April 2021"
                )
                Data.knockout_game5 = arrayOf(
                    R.drawable.psg,
                    R.drawable.man_city,
                    "Paris Saint-Germain",
                    "Manchester City",
                    "1-2",
                    "Wednesday, 28 April 2021"
                )
                Data.knockout_game6 = arrayOf(
                    R.drawable.man_city,
                    R.drawable.psg,
                    "Manchester City",
                    "Paris Saint-Germain",
                    "2-0",
                    "Tuesday, 4 May 2021"
                )
                Data.final_game = emptyArray()
            }

            4 -> {
                Data.group_game1 = arrayOf(
                    R.drawable.porto,
                    R.drawable.man_city,
                    "FC Porto",
                    "Manchester City",
                    "1-3",
                    "Wednesday, 21 October 2020"
                )
                Data.group_game2 = arrayOf(
                    R.drawable.olympique,
                    R.drawable.porto,
                    "Olympique Marseille",
                    "FC Porto",
                    "0-3",
                    "Tuesday, 27 October 2020"
                )
                Data.group_game3 = arrayOf(
                    R.drawable.porto,
                    R.drawable.olympique,
                    "FC Porto",
                    "Olympique Marseille",
                    "3-0",
                    "Tuesday, 3 November 2020"
                )
                Data.group_game4 = arrayOf(
                    R.drawable.porto,
                    R.drawable.man_city,
                    "FC Porto",
                    "Manchester City",
                    "0-0",
                    "Tuesday, 1 December 2020"
                )
                Data.group_game5 = arrayOf(
                    R.drawable.porto,
                    R.drawable.olympiakos,
                    "FC Porto",
                    "Olympiacos",
                    "2-0",
                    "Tuesday, 9 December 2020"
                )
                Data.knockout_game1 = arrayOf(
                    R.drawable.porto,
                    R.drawable.juventus,
                    "FC Porto",
                    "Juventus",
                    "2-1",
                    "Wednesday, 17 February 2021"
                )
                Data.knockout_game2 = arrayOf(
                    R.drawable.juventus,
                    R.drawable.porto,
                    "Juventus",
                    "FC Porto",
                    "3-2",
                    "Tuesday, 9 March 2021"
                )
                Data.knockout_game3 = arrayOf(
                    R.drawable.chelsea,
                    R.drawable.porto,
                    "Chelsea",
                    "FC Porto",
                    "0-1",
                    "Wednesday, 7 April 2021"
                )
                Data.knockout_game4 = arrayOf(
                    R.drawable.porto,
                    R.drawable.chelsea,
                    "FC Porto",
                    "Chelsea",
                    "0-2",
                    "Tuesday, 13 April 2021"
                )
                Data.knockout_game5 = emptyArray()
                Data.knockout_game6 = emptyArray()
                Data.final_game = emptyArray()
            }

            5 -> {
                Data.group_game1 = arrayOf(
                    R.drawable.liverpool,
                    R.drawable.ajax,
                    "Liverpool",
                    "Ajax",
                    "1-0",
                    "Wednesday, 21 October 2020"
                )
                Data.group_game2 = arrayOf(
                    R.drawable.atalanta,
                    R.drawable.liverpool,
                    "Atalanta",
                    "Liverpool",
                    "0-5",
                    "Tuesday, 3 November 2020"
                )
                Data.group_game3 = arrayOf(
                    R.drawable.liverpool,
                    R.drawable.midtjylland,
                    "Liverpool",
                    "Midtjylland",
                    "2-0",
                    "Tuesday, 27 October 2020"
                )
                Data.group_game4 = arrayOf(
                    R.drawable.midtjylland,
                    R.drawable.liverpool,
                    "Midtjylland",
                    "Liverpool",
                    "1-1",
                    "Wednesday, 9 December 2020"
                )
                Data.group_game5 = arrayOf(
                    R.drawable.ajax,
                    R.drawable.liverpool,
                    "Ajax",
                    "Liverpool",
                    "0-1",
                    "Tuesday, 1 December 2020"
                )
                Data.group_game6 = arrayOf(
                    R.drawable.liverpool,
                    R.drawable.atalanta,
                    "Liverpool",
                    "Atalanta",
                    "0-2",
                    "Wednesday, 25 November 2020"
                )
                Data.knockout_game1 = arrayOf(
                    R.drawable.leipzig,
                    R.drawable.liverpool,
                    "RB Leipzig",
                    "Liverpool",
                    "0-2",
                    "Tuesday, 16 February 2021"
                )
                Data.knockout_game2 = arrayOf(
                    R.drawable.liverpool,
                    R.drawable.leipzig,
                    "Liverpool",
                    "RB Leipzig",
                    "2-0",
                    "Wednesday, 10 March 2021"
                )
                Data.knockout_game3 = arrayOf(
                    R.drawable.liverpool,
                    R.drawable.real_madrid,
                    "Liverpool",
                    "Real Madrid",
                    "0-0",
                    "Tuesday, 6 April 2021"
                )
                Data.knockout_game4 = arrayOf(
                    R.drawable.real_madrid,
                    R.drawable.liverpool,
                    "Real Madrid",
                    "Liverpool",
                    "0-0",
                    "Wednesday, 14 April 2021"
                )
                Data.knockout_game5 = arrayOf(
                    R.drawable.liverpool,
                    R.drawable.real_madrid,
                    "Liverpool",
                    "Real Madrid",
                    "0-0",
                    "Wednesday, 14 April 2021"
                )
                Data.knockout_game6 = arrayOf(
                    R.drawable.real_madrid,
                    R.drawable.liverpool,
                    "Real Madrid",
                    "Liverpool",
                    "0-0",
                    "Wednesday, 14 April 2021"
                )
                Data.final_game = emptyArray()
            }

            6 -> {
                Data.group_game1 = arrayOf(
                    R.drawable.lazio,
                    R.drawable.borussia,
                    "Lazio",
                    "Borussia Dortmund",
                    "3-1",
                    "Tuesday, 20 October 2020"
                )
                Data.group_game2 = arrayOf(
                    R.drawable.borussia,
                    R.drawable.zenit,
                    "Borussia Dortmund",
                    "Zenit",
                    "2-0",
                    "Wednesday, 28 October 2020"
                )
                Data.group_game3 = arrayOf(
                    R.drawable.brugge,
                    R.drawable.borussia,
                    "Club Brugge",
                    "Borussia Dortmund",
                    "0-3",
                    "Wednesday, 4 November 2020"
                )
                Data.group_game4 = arrayOf(
                    R.drawable.borussia,
                    R.drawable.brugge,
                    "Borussia Dortmund",
                    "Club Brugge",
                    "3-0",
                    "Tuesday, 24 November 2020"
                )
                Data.group_game5 = arrayOf(
                    R.drawable.borussia,
                    R.drawable.lazio,
                    "Borussia Dortmund",
                    "Lazio",
                    "1-1",
                    "Wednesday, 2 December 2020"
                )
                Data.group_game6 = arrayOf(
                    R.drawable.zenit,
                    R.drawable.borussia,
                    "Zenit",
                    "Borussia Dortmund",
                    "1-2",
                    "Tuesday, 8 December 2020"
                )
                Data.knockout_game1 = arrayOf(
                    R.drawable.borussia,
                    R.drawable.sevilla,
                    "Borussia Dortmund",
                    "Sevilla",
                    "3-2",
                    "Wednesday, 17 February 2021"
                )
                Data.knockout_game2 = arrayOf(
                    R.drawable.sevilla,
                    R.drawable.borussia,
                    "Sevilla",
                    "Borussia Dortmund",
                    "2-2",
                    "Tuesday, 9 March 2021"
                )
                Data.knockout_game3 = arrayOf(
                    R.drawable.man_city,
                    R.drawable.borussia,
                    "Manchester City",
                    "Borussia Dortmund",
                    "2-1",
                    "Tuesday, 6 April 2021"
                )
                Data.knockout_game4 = arrayOf(
                    R.drawable.borussia,
                    R.drawable.man_city,
                    "Borussia Dortmund",
                    "Manchester City",
                    "1-2",
                    "Wednesday, 14 April 2021"
                )
                Data.knockout_game5 = emptyArray()
                Data.knockout_game6 = emptyArray()
                Data.final_game = emptyArray()
            }

            7 -> {
                Data.group_game1 = arrayOf(
                    R.drawable.atletico,
                    R.drawable.bayern,
                    "Atletico Madrid",
                    "Bayern Munich",
                    "1-1",
                    "Wednesday, 21 October 2020"
                )
                Data.group_game2 = arrayOf(
                    R.drawable.bayern,
                    R.drawable.salzburg,
                    "Bayern Munich",
                    "Salzburg",
                    "2-6",
                    "Tuesday, 3 November 2020"
                )
                Data.group_game3 = arrayOf(
                    R.drawable.bayern,
                    R.drawable.lokomotiv,
                    "Bayern Munich",
                    "Lokomotiv Moscow",
                    "2-0",
                    "Wednesday, 25 November 2020"
                )
                Data.group_game4 = arrayOf(
                    R.drawable.lokomotiv,
                    R.drawable.bayern,
                    "Lokomotiv Moscow",
                    "Bayern Munich",
                    "1-2",
                    "Tuesday, 1 December 2020"
                )
                Data.group_game5 = arrayOf(
                    R.drawable.bayern,
                    R.drawable.atletico,
                    "Bayern Munich",
                    "Atletico Madrid",
                    "1-0",
                    "Wednesday, 9 December 2020"
                )
                Data.group_game6 = arrayOf(
                    R.drawable.salzburg,
                    R.drawable.bayern,
                    "Salzburg",
                    "Bayern Munich",
                    "0-3",
                    "Wednesday, 16 December 2020"
                )
                Data.knockout_game1 = arrayOf(
                    R.drawable.lazio,
                    R.drawable.bayern,
                    "Lazio",
                    "Bayern Munich",
                    "1-4",
                    "Tuesday, 23 February 2021"
                )
                Data.knockout_game2 = arrayOf(
                    R.drawable.bayern,
                    R.drawable.lazio,
                    "Bayern Munich",
                    "Lazio",
                    "2-1",
                    "Wednesday, 17 March 2021"
                )
                Data.knockout_game3 = arrayOf(
                    R.drawable.bayern,
                    R.drawable.psg,
                    "Bayern Munich",
                    "Paris Saint-Germain",
                    "2-3",
                    "Wednesday, 7 April 2021"
                )
                Data.knockout_game4 = arrayOf(
                    R.drawable.psg,
                    R.drawable.bayern,
                    "Paris Saint-Germain",
                    "Bayern Munich",
                    "0-1",
                    "Tuesday, 13 April 2021"
                )
                Data.knockout_game5 = emptyArray()
                Data.knockout_game6 = emptyArray()
                Data.final_game = emptyArray()
            }
        }


        val childItems1 = ArrayList<ChildItem>()
        val childItemsData1 = listOf(
            Data.group_game1,
            Data.group_game2,
            Data.group_game3,
            Data.group_game4,
            Data.group_game5,
            Data.group_game6
        )

        for (data in childItemsData1) {
            childItems1.add(
                ChildItem(
                    data[0] as Int,
                    data[1] as Int,
                    data[2] as String,
                    data[3] as String,
                    data[4] as String,
                    data[5] as String
                )
            )
        }

        parentList.add(
            ParentItem(
                "Group Stage", childItems1
            )
        )

        val childItems2 = ArrayList<ChildItem>()

        val childItemsData2 = listOf(
            Data.knockout_game1, Data.knockout_game2
        )

        for (data in childItemsData2) {
            childItems2.add(
                ChildItem(
                    data[0] as Int,
                    data[1] as Int,
                    data[2] as String,
                    data[3] as String,
                    data[4] as String,
                    data[5] as String
                )
            )
        }

        parentList.add(
            ParentItem(
                "Round of 16", childItems2
            )
        )
        val childItems3 = ArrayList<ChildItem>()
        val childItemsData3 = listOf(
            Data.knockout_game3, Data.knockout_game4
        )

        for (data in childItemsData3) {
            childItems3.add(
                ChildItem(
                    data[0] as Int,
                    data[1] as Int,
                    data[2] as String,
                    data[3] as String,
                    data[4] as String,
                    data[5] as String
                )
            )
        }

        parentList.add(
            ParentItem(
                "Quarter-finals", childItems3
            )
        )
        if (Data.knockout_game5.isNotEmpty()) {
            val childItems4 = ArrayList<ChildItem>()
            val childItemsData4 = listOf(
                Data.knockout_game5, Data.knockout_game6
            )


            for (data in childItemsData4) {
                childItems4.add(
                    ChildItem(
                        data[0] as Int,
                        data[1] as Int,
                        data[2] as String,
                        data[3] as String,
                        data[4] as String,
                        data[5] as String
                    )
                )
            }

            parentList.add(
                ParentItem(
                    "Semi-finals", childItems4
                )
            )
        }

        if (Data.final_game.isNotEmpty()) {
            val childItems5 = ArrayList<ChildItem>()

            childItems5.add(
                ChildItem(
                    Data.final_game[0] as Int,
                    Data.final_game[1] as Int,
                    Data.final_game[2] as String,
                    Data.final_game[3] as String,
                    Data.final_game[4] as String,
                    Data.final_game[5] as String
                )
            )

            parentList.add(
                ParentItem(
                    "Final", childItems5
                )
            )
        }

        val parentAdapter = ParentAdapter(parentList)
        binding.recyclerView.adapter = parentAdapter

    }

}