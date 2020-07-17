package com.cov.covid

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.cov.covid.ui.forum.AskQuestionActivity
import com.cov.covid.ui.story.StoryUpdateActivity
import com.google.android.material.navigation.NavigationView

class HomeActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)

        val drawerLayout: DrawerLayout = findViewById(R.id.drawer_layout)
        val navView: NavigationView = findViewById(R.id.nav_view)
        val navController = findNavController(R.id.nav_host_fragment)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        appBarConfiguration = AppBarConfiguration(setOf(
                R.id.nav_stories, R.id.nav_forum, R.id.nav_donors, R.id.nav_need, R.id.nav_profile, R.id.nav_logout), drawerLayout)
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)
        setfabClickEvents();

    }

    private fun setfabClickEvents() {
        val fabAllTopics =
            findViewById<View>(R.id.fabAllTopics) as com.github.clans.fab.FloatingActionButton
        val fabAskQuery =
            findViewById<View>(R.id.fabAskQuery) as com.github.clans.fab.FloatingActionButton
        fabAllTopics.setOnClickListener {
            val intentTopicsActivity =
                Intent(this@HomeActivity, StoryUpdateActivity::class.java)
            startActivity(intentTopicsActivity)
        }
        fabAskQuery.setOnClickListener {
            val intentCreateTopic =
                Intent(this@HomeActivity, AskQuestionActivity::class.java)
            startActivity(intentCreateTopic)
        }
    }


    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.main, menu)
        return true
    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.nav_host_fragment)
        return navController.navigateUp(appBarConfiguration) || super.onSupportNavigateUp()
    }
}