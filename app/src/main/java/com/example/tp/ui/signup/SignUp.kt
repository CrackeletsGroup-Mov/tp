package com.example.tp.ui.signup

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import com.example.tp.R
import com.skydoves.landscapist.ImageOptions
import com.skydoves.landscapist.glide.GlideImage

@OptIn(ExperimentalMaterial3Api::class)

@Composable
fun SignUp() {

    Column (verticalArrangement = Arrangement.Center, //para centrarlo
        modifier = Modifier.fillMaxSize(), //para indicar que utiliza tod el espacio de largo
        horizontalAlignment = Alignment.CenterHorizontally //para indicar que utiliza tod el espacio de ancho
    ) {

        //este es un estado, ya que es un estado cambiante
        val username= remember{ mutableStateOf("") }
        val password= remember{ mutableStateOf("") }
        val name= remember{ mutableStateOf("") }
        val email= remember{ mutableStateOf("") }
        val dni= remember{ mutableStateOf("") }

        GlideImage(
            imageModel = { R.drawable.logo },
            imageOptions = ImageOptions(contentScale = ContentScale.Fit),
            modifier = Modifier.size(300.dp)
        )

        //OutlinedTextField: cajita de texto que se puede editar
        OutlinedTextField(
            value = username.value,

            //nueva cadena de valor al que cambiara el value
            onValueChange = {newValue->
                username.value=newValue  // sera el nuevo valor que se escriba en la cajita de texto
            },

            placeholder = { Text(text = "Username") },

            modifier= Modifier.fillMaxWidth() //para que ocupe tod el ancho disponible
        )

        OutlinedTextField(
            value = password.value,

            //nueva cadena de valor al que cambiara el value
            onValueChange = {newValue->
                password.value=newValue  // sera el nuevo valor que se escriba en la cajita de texto
            },
            visualTransformation = PasswordVisualTransformation(),
            placeholder = { Text(text = "Password") },

            modifier= Modifier.fillMaxWidth() //para que ocupe tod el ancho disponible

        )

        OutlinedTextField(
            value = name.value,

            //nueva cadena de valor al que cambiara el value
            onValueChange = {newValue->
                name.value=newValue  // sera el nuevo valor que se escriba en la cajita de texto
            },
            placeholder = { Text(text = "Name") },

            modifier= Modifier.fillMaxWidth() //para que ocupe tod el ancho disponible
        )

        OutlinedTextField(
            value = email.value,

            //nueva cadena de valor al que cambiara el value
            onValueChange = {newValue->
                email.value=newValue  // sera el nuevo valor que se escriba en la cajita de texto
            },
            placeholder = { Text(text = "Email") },

            modifier= Modifier.fillMaxWidth() //para que ocupe tod el ancho disponible
        )

        OutlinedTextField(
            value = dni.value,

            //nueva cadena de valor al que cambiara el value
            onValueChange = {newValue->
                dni.value=newValue  // sera el nuevo valor que se escriba en la cajita de texto
            },
            placeholder = { Text(text = "DNI") },

            modifier= Modifier.fillMaxWidth() //para que ocupe tod el ancho disponible
        )


        Button(onClick = {}) {
            Text(text = "SignUp")
        }

        TextButton(onClick = { }) {
            Text(text = "Sign in")
        }

    }
}




