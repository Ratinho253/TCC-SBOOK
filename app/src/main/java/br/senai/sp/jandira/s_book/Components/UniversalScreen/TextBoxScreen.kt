package br.senai.sp.jandira.s_book.Components.UniversalScreen

import androidx.compose.foundation.layout.R
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TextBoxScreen(label : String, valor: String, aoMudar: (String) -> Unit ){

    OutlinedTextField(
        value = valor,
        onValueChange = {
            aoMudar(it)
        },
        label={
            Text(text = label)
        },
//        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
//        leadingIcon = {
//            Icon(
//                painter = painterResource(
//                    id = R.drawable.baseline_lock_24
//                ),
//                contentDescription = "",
//                tint = colorResource(id = R.color.pink_login)
//            )
//        }
    )

}


//
//@Preview(showBackground = true, showSystemUi = true)
//@Composable
//fun  TextBoxScreenPreview() {
//    TextBoxScreen(label = "oi", valor = "12", aoMudar = )
//}