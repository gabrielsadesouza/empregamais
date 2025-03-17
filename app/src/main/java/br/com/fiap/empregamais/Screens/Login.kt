package br.com.fiap.empregamais.Screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.fiap.empregamais.R

@Preview
@Composable
fun LoginScreen() {
    Box(modifier = Modifier.fillMaxSize()) {
        Image(
            painter = painterResource(id = R.drawable.back01),
            contentDescription = ("Background azul"),
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
        )
        Image(
            painter = painterResource(id = R.drawable.logoslogan),
            contentDescription = ("logoSlogan"),
            modifier = Modifier
                .align(Alignment.Center)
                .size(250.dp)
                .padding(10.dp)
                .offset(y = (-120).dp)
        )

        Column() {
                Text(
                    text = "Login",
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.White,
                    textAlign = TextAlign.Center

                )}

        Image(
            painter = painterResource(id = R.drawable.redes_sociais),
            contentDescription = ("logo"),
            modifier = Modifier
                .align(Alignment.Center)
                .size(180.dp)
                .offset(y = 150.dp)


        )
    }
}