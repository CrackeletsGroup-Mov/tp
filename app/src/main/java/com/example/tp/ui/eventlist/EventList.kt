package com.example.tp.ui.eventlist

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import com.skydoves.landscapist.ImageOptions
import com.skydoves.landscapist.glide.GlideImage
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp

@Composable
fun EventList(){

    LazyColumn{

        items(1){ event->
            EventRow()
        }
    }
}

@Composable
fun EventRow(){

    //creamos un componente card
    Card (modifier= Modifier
        .fillMaxWidth() //darle tod el largo de la pantalla
        .padding(4.dp)
        .padding(top = 16.dp)
    )

    {
        Row(verticalAlignment = Alignment.CenterVertically)
        {//en la fila de ese card

            GlideImage(
                imageModel = {"https://www.tolucacultural.com/assets/Hermanas-CDMX-40253.jpg"},
                imageOptions = ImageOptions(contentScale = ContentScale.Fit),
                modifier = Modifier
                    .size(100.dp)
                    .padding(start = 5.dp)
            )

            //seguidamente estan dos datos uno bajo del otro, entonces es una columna
            Column(modifier= Modifier
                .fillMaxHeight()
                .weight(5f)
                .padding(start = 16.dp)
            )

                {
                Text(
                    text = "Hermanas de Pascal Rambert",
                    style = TextStyle(
                        fontSize = 13.sp,
                        fontWeight = FontWeight(400),
                        color = Color(0xFF000000),
                        textAlign = TextAlign.Center,
                        )
                )
                Text(
                    text = "Hour: 8:00 pm",
                    style = TextStyle(
                        fontSize = 13.sp,
                        fontWeight = FontWeight(400),
                        color = Color(0xFF000000)
                    )
                )
                Text(
                    text = "Date: 25/09/2023",
                    style = TextStyle(
                        fontSize = 13.sp,
                        fontWeight = FontWeight(400),
                        color = Color(0xFF000000)
                    )
                )
            }

            Button(
                modifier = Modifier
                    .width(90.dp)
                    .height(32.dp),
                onClick = {}
            ) {
                Text(
                    text = "Details",
                    style = TextStyle(
                        fontSize = 15.sp,
                        fontWeight = FontWeight(400),
                        color = Color(0xFFFFFFFF),
                        textAlign = TextAlign.Center,
                    )
                )
            }
        }
    }
}

@Composable
fun EventImage(url:String){

    GlideImage(
        imageModel = {url},
        imageOptions = ImageOptions(contentScale = ContentScale.Fit),
        modifier = Modifier.size(92.dp)
    )
}