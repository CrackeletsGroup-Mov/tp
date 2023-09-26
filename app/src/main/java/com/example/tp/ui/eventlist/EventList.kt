package com.example.tp.ui.eventlist

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import com.skydoves.landscapist.ImageOptions
import com.skydoves.landscapist.glide.GlideImage
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.ui.graphics.Color

@Composable
fun EventList(events: MutableState<List<Event>>){

    //PASAMOS SU ESTADO A UNNIVEL SUPERIOR, EN LA CLASE HEROSEARH

    val context= LocalContext.current

    //la lista de heroes se mostrara como un sola columna
    LazyColumn{
         //items(events.value)
        items(events.value){ event-> //en donde se accede a cada item(un hero) para tomar su valor
            EventRow(event) //luego de cada hero que toma, sucede esto
        }
    }
}

@Composable
//cada valor de un hero se almacena en una fila
fun EventRow(event: Event){

    //creamos un componente card
    Card (modifier= Modifier
        .fillMaxWidth() //darle tod el largo de la pantalla
        .padding(4.dp)
    )

    {
        Row(verticalAlignment = Alignment.CenterVertically)
        {//en la fila de ese card

            HeroImage(event.image.url) //mostramos la imagen del hero, la estructura se detalla en la otra clase

            //seguidamente estan dos datos uno bajo del otro, entonces es una columna
            Column(modifier= Modifier.fillMaxHeight().weight(5f))
            {
                Text(text = event.name)
                Text(text = event.description)
                Text(text = event.address)
            }

            //agrgamos el iconode corazon en una tervra columna en la misma fila
            Button(
                modifier = Modifier
                    .weight(1f)
                    .border(width = 2.dp, color = Color(0xFF000000), shape = RoundedCornerShape(size = 20.dp))
                    .width(132.dp)
                    .height(32.dp)
                    .background(color = Color(0x599CABC2), shape = RoundedCornerShape(size = 20.dp)),
                onClick = {}
            ) { }
        }
    }
}

@Composable
fun HeroImage(url:String){

    GlideImage(
        imageModel = {url},
        imageOptions = ImageOptions(contentScale = ContentScale.Fit),
        modifier = Modifier.size(92.dp)
    )
}