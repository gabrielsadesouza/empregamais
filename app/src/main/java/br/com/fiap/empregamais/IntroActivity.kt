package br.com.fiap.empregamais

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.lifecycleScope
import br.com.fiap.empregamais.ui.theme.EmpregaMaisTheme
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class Intro : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            EmpregaMaisTheme {
                SplashScreen()
            }
        }
        lifecycleScope.launch {
            delay(6000)
            val intent = Intent(this@Intro, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}

@Preview()
@Composable()

fun SplashScreen() {
    Box(modifier = Modifier.fillMaxSize()) {
        Image(
            painter = painterResource(id = R.drawable.back01),
            contentDescription = ("Background azul com ondas"),
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
        )

        Image(
            painter = painterResource(id = R.drawable.logo_emprega),
            contentDescription = ("logo"),
            modifier = Modifier
                .align(Alignment.Center)
                .size(280.dp)
        )
    }
}