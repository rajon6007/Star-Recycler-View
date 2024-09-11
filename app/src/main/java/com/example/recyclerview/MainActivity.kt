package com.example.recyclerview

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerview.Adapter.StarAdapter
import com.example.recyclerview.databinding.ActivityMainBinding
import com.example.recyclerview.model.Star

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.rview.layoutManager = LinearLayoutManager(this)


        val star = ArrayList<Star>()
        star.add(Star("Vijay", "Greatest of all time", R.drawable.vijay))
        star.add(Star("Allu Arjun", "The Stylist star", R.drawable.allu))
        star.add(Star("Ram Charan", "The Mega Star", R.drawable.ram))
        star.add(Star("Prabhas Actor", "The Rebel Star", R.drawable.prabash))
        star.add(Star("Mahesh Babu", "The Super Star", R.drawable.mahesh))
        star.add(Star("NTR Jr.", "Action Hero", R.drawable.ntr))
        star.add(Star("Vijay", "Greatest of all time", R.drawable.vijay))
        star.add(Star("Ram Charan", "The Mega Star", R.drawable.ram))
        star.add(Star("Allu Arjun", "The Stylist star", R.drawable.allu))
        star.add(Star("Prabhas Actor", "The Rebel Star", R.drawable.prabash))

        val starAdapter = StarAdapter(star)
        binding.rview.adapter = starAdapter

    }
}
