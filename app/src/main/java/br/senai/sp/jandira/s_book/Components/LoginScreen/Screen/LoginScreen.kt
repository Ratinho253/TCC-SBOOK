package br.senai.sp.jandira.s_book.Components.LoginScreen.Screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.senai.sp.jandira.s_book.Components.LoginScreen.Components.Form
import br.senai.sp.jandira.s_book.Components.LoginScreen.Components.Header
import br.senai.sp.jandira.s_book.Components.UniversalScreen.DefaultButtonScreen
import br.senai.sp.jandira.s_book.Components.UniversalScreen.GoogleScreen
import br.senai.sp.jandira.s_book.Components.UniversalScreen.TextBoxScreen
import br.senai.sp.jandira.s_book.Components.UniversalScreen.TextContinueScreen
import br.senai.sp.jandira.s_book.Components.UniversalScreen.TextNotContScreen

@Preview(showSystemUi = true)
@Composable
fun LoginScreen(){

    Surface (
        modifier = Modifier
            .fillMaxSize()
    ) {
        Column (
            modifier = Modifier
                .fillMaxSize(),
            verticalArrangement = Arrangement.SpaceAround,
            horizontalAlignment = Alignment.CenterHorizontally,



        ) {

            Header()

//            Spacer(modifier = Modifier.height(63.dp))
            Form()

            DefaultButtonScreen(text = "Entrar") {}

//            Spacer(modifier = Modifier.height(53.dp))
            TextContinueScreen()

//            Spacer(modifier = Modifier.height(12.dp))
            GoogleScreen()

//            Spacer(modifier = Modifier.height(1.dp))
            TextNotContScreen()
        }


    }

}