package br.com.fiap.empregamais.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.com.fiap.empregamais.R

@Preview
@Composable
fun LoginScreen() {
    var login: String by remember { mutableStateOf("") }
    var senha: String by remember { mutableStateOf("") }
    var emailErro by remember { mutableStateOf(false) }
    var tamanhoSenha = 8

    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.back01),
            contentDescription = "Background azul",
            contentScale = ContentScale.Crop,
            modifier = Modifier

        )

        Image(
            painter = painterResource(id = R.drawable.logoslogan),
            contentDescription = "Logo Slogan",
            modifier = Modifier
                .size(220.dp)
                .padding(10.dp)
                .offset(y = (-140).dp)
        )

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 60.dp)
                .offset(y = 70.dp)
        ) {
            // Campo de Login
            TextField(
                value = login,
                onValueChange = {
                    login = it
                    emailErro = login.isEmpty()
                },
                label = { Text("Login") },
                isError = emailErro,
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Email
                ),
                leadingIcon = {
                    Icon(
                        Icons.Default.Person,
                        contentDescription = "Ícone de usuário",
                        tint = Color.White
                    )
                },
                colors = TextFieldDefaults.colors(
                    focusedIndicatorColor = Color(0xFFFFA201),
                    unfocusedIndicatorColor = Color.White,
                    cursorColor = Color.White,
                    errorIndicatorColor = Color.Red,
                    focusedContainerColor = Color.Transparent,
                    unfocusedContainerColor = Color.Transparent
                ),
                modifier = Modifier
                    .height(50.dp)
                    .width(250.dp)
            )

            if (emailErro) {
                Text(
                    text = "E-mail obrigatório!",
                    modifier = Modifier.fillMaxWidth(),
                    color = Color.Red,
                    textAlign = TextAlign.End
                )
            }

            Spacer(modifier = Modifier.height(12.dp))

            TextField(
                value = senha,
                onValueChange = {
                    if (it.length <= tamanhoSenha) senha = it
                },
                label = { Text("Senha") },
                leadingIcon = {
                    Icon(Icons.Default.Lock,
                        contentDescription = "Ícone de senha",
                        tint = Color.White)
                },
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Password
                ),
                visualTransformation = PasswordVisualTransformation(),
                colors = OutlinedTextFieldDefaults.colors(
                    focusedBorderColor = Color(0xFFFFA201),
                    unfocusedBorderColor = Color.White,
                    focusedContainerColor = Color.Transparent,
                    unfocusedContainerColor = Color.Transparent
                ),
                modifier = Modifier
                    .height(50.dp)
                    .width(250.dp)
            )

            Spacer(modifier = Modifier.height(10.dp))

            // Botão de Entrar
            Button(
                onClick = { /* Ação ao clicar no botão */ },
                modifier = Modifier
                    .height(35.dp)
                    .width(120.dp)
                    .offset(y = 15.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFFFFA201), // Amarelo ouro
                    contentColor = Color.White // Texto branco
                )
            ) {
                Text(text = "Entrar")
            }

            Image(
                painter = painterResource(id = R.drawable.redes_sociais),
                contentDescription = "Redes sociais",
                modifier = Modifier
                    .size(150.dp)
                    .offset(y = 1.dp)
            )
        }
    }
    }