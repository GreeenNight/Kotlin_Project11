package com.footballkick.project11

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.footballkick.project11.databinding.ActivityTeamsBinding

class TeamsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityTeamsBinding
    private lateinit var teamList: ArrayList<Team>
    private lateinit var teamAdapter: TeamAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_teams)
        binding.recyclerView.setHasFixedSize(true)
        binding.recyclerView.layoutManager = LinearLayoutManager(this)


        teamList = ArrayList()

        teamList.add(Team(R.drawable.chelsea, "Chelsea"))
        teamList.add(Team(R.drawable.man_city, "Manchester City"))
        teamList.add(Team(R.drawable.real_madrid, "Real Madrid"))
        teamList.add(Team(R.drawable.psg, "PSG"))
        teamList.add(Team(R.drawable.porto, "Porto"))
        teamList.add(Team(R.drawable.liverpool, "Liverpool"))
        teamList.add(Team(R.drawable.borussia, "Borussia Dortmund"))
        teamList.add(Team(R.drawable.bayern, "FC Bayern"))


        teamAdapter = TeamAdapter(teamList)
        binding.recyclerView.adapter = teamAdapter

        teamAdapter.onItemClick = {
            val intent = Intent(this, TeamGamesFragment::class.java)
            startActivity(intent)
            }

        }

    }

