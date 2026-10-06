package net.iessochoa.sergiocontreras.t03_ej3.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import net.iessochoa.sergiocontreras.t03_ej3.R

@Composable
fun GreetingImage(message: String, from: String, modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.androidparty)
    Box(modifier) {                       // patrón: el modifier va al primer hijo
        Image(
            painter = image,
            contentDescription = null,
            contentScale = ContentScale.Crop,
            alpha = 0.5f
        )
        GreetingText(                     // reutilizamos lo del Ejercicio 2
            message = message,
            from = from,
            modifier = Modifier
                .fillMaxSize()
                .padding(8.dp)
        )
    }
}


@Preview (showBackground = true)
@Composable
fun GreetingImagePreview() {
    GreetingImage(
        message = "Happy Birthday",
        from = "from Alice"
    )
}