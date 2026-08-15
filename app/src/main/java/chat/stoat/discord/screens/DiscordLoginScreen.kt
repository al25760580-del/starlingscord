package chat.stoat.discord.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import chat.stoat.discord.DiscordAPI
import chat.stoat.discord.DiscordHttp
import chat.stoat.discord.routes.DiscordLoginError
import chat.stoat.discord.routes.DiscordLoginMfaRequired
import chat.stoat.discord.routes.DiscordLoginResult
import chat.stoat.discord.routes.DiscordLoginSuccess
import chat.stoat.discord.routes.discordLogin
import chat.stoat.discord.routes.discordVerifyMfa
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DiscordLoginScreen(navController: NavController) {
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var mfaCode by remember { mutableStateOf("") }
    var mfaTicket by remember { mutableStateOf<String?>(null) }
    var error by remember { mutableStateOf<String?>(null) }
    var loading by remember { mutableStateOf(false) }
    val scope = rememberCoroutineScope()

    Column(
        modifier = Modifier.fillMaxSize().padding(24.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text("Sign in to Discord", style = MaterialTheme.typography.headlineSmall)
        Spacer(Modifier.height(16.dp))
        OutlinedTextField(
            value = email,
            onValueChange = { email = it },
            label = { Text("Email or phone") },
            singleLine = true,
            modifier = Modifier.fillMaxWidth(),
        )
        Spacer(Modifier.height(8.dp))
        OutlinedTextField(
            value = password,
            onValueChange = { password = it },
            label = { Text("Password") },
            singleLine = true,
            visualTransformation = PasswordVisualTransformation(),
            modifier = Modifier.fillMaxWidth(),
        )
        if (mfaTicket != null) {
            Spacer(Modifier.height(8.dp))
            OutlinedTextField(
                value = mfaCode,
                onValueChange = { mfaCode = it },
                label = { Text("MFA code (TOTP / backup)") },
                singleLine = true,
                modifier = Modifier.fillMaxWidth(),
            )
        }
        Spacer(Modifier.height(16.dp))
        if (loading) {
            CircularProgressIndicator()
        } else {
            Button(
                onClick = {
                    scope.launch {
                        loading = true
                        error = null
                        try {
                            val result: DiscordLoginResult = if (mfaTicket == null) {
                                DiscordHttp.discordLogin(email, password)
                            } else {
                                DiscordHttp.discordVerifyMfa(mfaTicket!!, mfaCode, "totp")
                            }
                            when (result) {
                                is DiscordLoginSuccess -> {
                                    DiscordAPI.loginAs(result.token)
                                    // Use Stoat's existing chat UI (servers, channels,
                                    // messages, profile, settings) instead of a
                                    // parallel Discord screen.
                                    navController.navigate("chat") {
                                        popUpTo("discord/login") { inclusive = true }
                                    }
                                }

                                is DiscordLoginMfaRequired -> {
                                    mfaTicket = result.ticket
                                }

                                is DiscordLoginError -> {
                                    error = result.message
                                }
                            }
                        } catch (e: Exception) {
                            error = e.message ?: "Unknown error"
                        } finally {
                            loading = false
                        }
                    }
                },
                modifier = Modifier.fillMaxWidth(),
            ) {
                Text(if (mfaTicket == null) "Log in" else "Verify")
            }
        }
        if (error != null) {
            Spacer(Modifier.height(8.dp))
            Text(error!!, color = MaterialTheme.colorScheme.error)
        }
        Spacer(Modifier.height(8.dp))
        TextButton(onClick = { navController.popBackStack() }) {
            Text("Back")
        }
    }
}
