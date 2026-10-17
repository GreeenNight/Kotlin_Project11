package com.footballkick.project11

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.FragmentActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.footballkick.project11.databinding.FragmentGameInfoBinding

class GameInfoFragment : FragmentActivity() {
    private lateinit var binding: FragmentGameInfoBinding
    private val textList = ArrayList<Text>()


    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.fragment_game_info)

                when (Data.gameNumber) {
                    0,3,6 -> {
                        Data.venue = "Stamford Bridge, London, England"
                        Data.team1Stats = arrayOf(
                            "58%",
                            "9",
                            "2",
                            "7",
                            "0",
                            "0",
                            "544",
                            "88%",
                            "15",
                            "10",
                            "3",
                            "3 (Kai Havertz, Thiago Silva, César Azpilicueta)",
                            "0",
                            "109.3km",
                            "1st half - 60%, 2nd half - 57%"
                        )
                        Data.team2Stats = arrayOf(
                            "42%",
                            "9",
                            "2",
                            "4",
                            "3",
                            "0",
                            "390",
                            "84%",
                            "10",
                            "15",
                            "1",
                            "3 (Joan Jordán, Luuk de Jong, Jesús Navas)",
                            "0",
                            "108.1km",
                            "1st half - 40%, 2nd half - 43%"
                        )
                        Data.goals =
                            "It was a tightly contested match between Chelsea and Sevilla, but neither team managed to find the " +
                                    "back of the net. Both teams had a similar number of shots on target, and Chelsea had a slight edge in possession. " +
                                    "The match ended in a goalless draw"
                    }
                    1,4,7->{
                        Data.venue = "Stamford Bridge, London, England"
                        Data.team1Stats = arrayOf(
                            "54%", "7", "1", "8", "1", "2", "521", "85%", "13", "12", "4",
                            "2 (Kai Havertz, Thiago Silva, César Azpilicueta)", "0", "111.2km", "1st half - 61%, 2nd half - 56%"
                        )
                        Data.team2Stats = arrayOf(
                            "41%", "7", "2", "4", "2", "1", "370", "85%", "11", "12", "2",
                            "3 (Joan Jordán, Luuk de Jong, Jesús Navas)", "0", "108.1km", "1st half - 40%, 2nd half - 43%"
                        )
                        Data.goals = "No goals were scored in the match between Chelsea and FC Krasnodar on 28 October 2020."
                    }
                    2,5,8->{
                        Data.venue = "Stamford Bridge, London, England"
                        Data.team1Stats = arrayOf(
                            "58%", "15", "5", "10", "0", "1", "657", "89%", "14", "11", "3",
                            "2 (Callum Hudson-Odoi, Timo Werner)", "0", "111.4km", "1st half - 57%, 2nd half - 61%"
                        )
                        Data.team2Stats = arrayOf(
                            "42%", "4", "1", "3", "0", "0", "290", "77%", "12", "15", "4",
                            "1 (Dalbert)", "0", "106.6km", "1st half - 43%, 2nd half - 39%"
                        )
                        Data.goals = "10th minute: Callum Hudson-Odoi (Chelsea) scored the first goal of the match.\n" +
                                "41st minute: Timo Werner (Chelsea) doubled the lead.\n" +
                                "85th minute: Olivier Giroud (Chelsea) added a third goal.\n" +
                                "Chelsea secured a comfortable 3-0 victory over Rennes in the match. They dominated in terms of possession, " +
                                "shots, and overall performance. Callum Hudson-Odoi, Timo Werner, and Olivier Giroud were the goal scorers for Chelsea."
                    }
                    9,10->{Data.goals=Data.finalScore

                    }
                 }


        binding.image1.setImageResource(Data.image1)
        binding.image2.setImageResource(Data.image2)
        binding.score.text = Data.finalScore
        binding.team1Tv.text = Data.team1
        binding.team2Tv.text = Data.team2

        binding.recyclerView.setHasFixedSize(true)
        binding.recyclerView.layoutManager = LinearLayoutManager(this)

        textList.add(Text("-Date : ${Data.date}"))
        textList.add(Text("-Venue : ${Data.venue}\n"))
        textList.add(Text("-Statistics for ${Data.team1}:\n"))
        textList.add(Text("-Possession: ${Data.team1Stats[0]}"))
        textList.add(Text("-Total Shots: ${Data.team1Stats[1]}"))
        textList.add(Text("-Shots on Target: ${Data.team1Stats[2]}"))
        textList.add(Text("-Shots off Target: ${Data.team1Stats[3]}"))
        textList.add(Text("-Blocked Shots: ${Data.team1Stats[4]}"))
        textList.add(Text("-Woodwork Hit: ${Data.team1Stats[5]}"))
        textList.add(Text("-Passes: ${Data.team1Stats[6]}"))
        textList.add(Text("-Pass Accuracy: ${Data.team1Stats[7]}"))
        textList.add(Text("-Fouls Suffered: ${Data.team1Stats[8]}"))
        textList.add(Text("-Fouls Committed: ${Data.team1Stats[9]}"))
        textList.add(Text("-Offsides: ${Data.team1Stats[10]}"))
        textList.add(Text("-Yellow Cards: ${Data.team1Stats[11]}"))
        textList.add(Text("-Red Cards: ${Data.team1Stats[12]}"))
        textList.add(Text("-Total Distance Covered: ${Data.team1Stats[13]}"))
        textList.add(Text("-Ball Possession in Each Half: ${Data.team1Stats[14]}\n"))

        textList.add(Text("-Statistics for ${Data.team2}:\n"))

        textList.add(Text("-Possession: ${Data.team2Stats[0]}"))
        textList.add(Text("-Total Shots: ${Data.team2Stats[1]}"))
        textList.add(Text("-Shots on Target: ${Data.team2Stats[2]}"))
        textList.add(Text("-Shots off Target: ${Data.team2Stats[3]}"))
        textList.add(Text("-Blocked Shots: ${Data.team2Stats[4]}"))
        textList.add(Text("-Woodwork Hit: ${Data.team2Stats[5]}"))
        textList.add(Text("-Passes: ${Data.team2Stats[6]}"))
        textList.add(Text("-Pass Accuracy: ${Data.team2Stats[7]}"))
        textList.add(Text("-Fouls Suffered: ${Data.team2Stats[8]}"))
        textList.add(Text("-Fouls Committed: ${Data.team2Stats[9]}"))
        textList.add(Text("-Offsides: ${Data.team2Stats[10]}"))
        textList.add(Text("-Yellow Cards: ${Data.team2Stats[11]}"))
        textList.add(Text("-Red Cards: ${Data.team2Stats[12]}"))
        textList.add(Text("-Total Distance Covered: ${Data.team2Stats[13]}"))
        textList.add(Text("-Ball Possession in Each Half: ${Data.team2Stats[14]}"))

        textList.add(Text("Goals : ${Data.goals}"))

        val textAdapter = TextAdapter(textList)
        binding.recyclerView.adapter = textAdapter

    }

}