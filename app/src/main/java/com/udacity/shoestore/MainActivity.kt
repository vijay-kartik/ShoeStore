package com.udacity.shoestore

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import androidx.activity.viewModels
import androidx.appcompat.widget.Toolbar
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI
import timber.log.Timber

class MainActivity : AppCompatActivity() {
    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Timber.plant(Timber.DebugTree())
        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        setSupportActionBar(toolbar)
        val navController = findNavController(R.id.nav_host_fragment)
        var appBarConfig = AppBarConfiguration(setOf(
            R.id.loginFragment,
            R.id.shoeListFragment
        ))
        NavigationUI.setupWithNavController(toolbar, navController, appBarConfig)
    }
}
