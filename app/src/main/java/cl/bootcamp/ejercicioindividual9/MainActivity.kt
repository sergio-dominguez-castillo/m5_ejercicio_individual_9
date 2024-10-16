package cl.bootcamp.ejercicioindividual9

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import cl.bootcamp.ejercicioindividual9.View.HomeView
import cl.bootcamp.ejercicioindividual9.ui.theme.EjercicioIndividual9Theme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            EjercicioIndividual9Theme {
                HomeView()
            }
        }
    }
}

