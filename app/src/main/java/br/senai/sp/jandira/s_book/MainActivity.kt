package br.senai.sp.jandira.s_book

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import br.senai.sp.jandira.s_book.Components.CreateContScreen.Screen.CreateContScreen
import br.senai.sp.jandira.s_book.Components.LoginScreen.Screen.LoginScreen
import br.senai.sp.jandira.s_book.Components.UniversalScreen.DefaultButtonScreen
import br.senai.sp.jandira.s_book.Components.UniversalScreen.GoogleScreen
import br.senai.sp.jandira.s_book.ui.theme.SBOOKTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SBOOKTheme {
                // A surface container using the 'background' color from the theme
//                LoginScreen()
                CreateContScreen()
            }
        }
    }
}



@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )

    GoogleScreen()

    DefaultButtonScreen(text = "Entrar") {
        
    }
}


