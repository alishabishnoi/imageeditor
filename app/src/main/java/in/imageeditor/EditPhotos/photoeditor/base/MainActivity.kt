package `in`.imageeditor.EditPhotos.photoeditor.base

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import `in`.imageeditor.EditPhotos.photoeditor.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view: View = binding.root
        setContentView(view)
    }
}