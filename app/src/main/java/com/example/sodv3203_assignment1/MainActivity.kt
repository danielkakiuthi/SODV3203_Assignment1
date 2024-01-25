package com.example.sodv3203_assignment1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Share
import androidx.compose.material.icons.filled.Email
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.sodv3203_assignment1.ui.theme.SODV3203_Assignment1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SODV3203_Assignment1Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Components_Layout(
                        fullName = "Daniel Kakiuthi",
                        jobTitle = "BVC Software Development Student",
                        phoneNumber = "+1 587 969 8302",
                        shareTag = "@daniel.kakiuthi",
                        email = "daniel.kakiuthi@gmail.com"
                    )
                }
            }
        }
    }
}

@Composable
fun Components_Layout(
    fullName: String,
    jobTitle: String,
    phoneNumber: String,
    shareTag: String,
    email: String,
    modifier: Modifier = Modifier
) {
    Column (verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
        Column (verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier.weight(5f)) {
            Image(
                painter = painterResource(id = R.drawable.android_logo),
                contentDescription = "Android Logo",
                contentScale = ContentScale.Fit,
                modifier = Modifier
                    .width(150.dp)
                    .background(Color(red = 7, green = 48, blue = 66))
            )
            Text(
                text = fullName,
                fontSize = 50.sp,
                fontWeight = FontWeight.Light,
                modifier = modifier
            )
            Text(
                text = jobTitle,
                fontWeight = FontWeight.Bold,
                color = Color(red = 0, green = 128, blue = 0),
                modifier = modifier
            )
        }

        Column (modifier = Modifier.weight(1f)) {
            Row (modifier = Modifier.padding(vertical = 5.dp)) {
                Icon(
                    imageVector = Icons.Filled.Call,
                    contentDescription = "phoneNumber",
                    tint = Color(red = 0, green = 128, blue = 0)
                )
                Text(
                    text = phoneNumber,
                    modifier = Modifier
                        .padding(horizontal = 20.dp)
                )
            }
            Row (modifier = Modifier.padding(vertical = 5.dp)) {
                Icon(
                    Icons.Filled.Share,
                    contentDescription = "shareTag",
                    tint = Color(red = 0, green = 128, blue = 0)
                )
                Text(
                    text = shareTag,
                    modifier = Modifier
                        .padding(horizontal = 20.dp)
                )
            }
            Row (modifier = Modifier.padding(vertical = 5.dp)) {
                Icon(
                    Icons.Filled.Email,
                    contentDescription = "email",
                    tint = Color(red = 0, green = 128, blue = 0)
                )
                Text(
                    text = email,
                    modifier = Modifier
                        .padding(horizontal = 20.dp)
                )
            }
        }
    }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    SODV3203_Assignment1Theme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            Components_Layout(
                fullName = "Daniel Kakiuthi",
                jobTitle = "BVC Software Development Student",
                phoneNumber = "+1 587 969 8302",
                shareTag = "@daniel.kakiuthi",
                email = "daniel.kakiuthi@gmail.com"
            )
        }
    }
}