package net.iessochoa.sergiocontreras.t03_ej3

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import net.iessochoa.sergiocontreras.t03_ej3.ui.GreetingImage
import net.iessochoa.sergiocontreras.t03_ej3.ui.theme.T03ej3Theme


@Composable
fun BirthdayApp(modifier: Modifier = Modifier) {
    T03ej3Theme {
        Scaffold(modifier = modifier.fillMaxSize()) { innerPadding ->
            GreetingImage(
                message = stringResource(R.string.happy_birthday_text),
                from = stringResource(R.string.signature_text),
                modifier = Modifier
                    .padding(innerPadding)
                    .fillMaxSize()
            )
        }
    }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun BirthdayAppPreview() {
    BirthdayApp()
}