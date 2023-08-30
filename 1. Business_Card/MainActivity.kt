package com.example.bussinesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.bussinesscard.ui.theme.BussinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BussinessCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color(195, 237, 192)
                ) {
                    BCard("Prashant Mishra","Android Developer","(+91)XXXXXXXXXX","@diaryof.prashant","prashantmishraXXXXXX@gmail.com")
                }
            }
        }
    }
}

@Composable
fun BCard(name : String,title : String,contactno : String, socialmedia : String, email : String){
    val image = painterResource(id = R.drawable.android_logo)
    Column(//modifier=Modifier.background(Color.LightGray),
        horizontalAlignment =Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center) {
        Image(
            painter = image,
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(120.dp)
                .clip(MaterialTheme.shapes.medium)
                .background(Color(12, 53, 106))
        )
        Spacer(modifier = Modifier.height(16.dp))
        Text(
            text = name,
            )
        Text(
            text = title,
            color = Color(24, 61, 61)
        )
        Spacer(modifier = Modifier.height(150.dp))
        Row(verticalAlignment = Alignment.Bottom,
            horizontalArrangement=Arrangement.Center,
            modifier=Modifier){
            Column(horizontalAlignment = Alignment.CenterHorizontally){
                Icon(imageVector = Icons.Default.Call,
                    contentDescription = null)
                Icon(imageVector = Icons.Default.Share,
                    contentDescription = null)
                Icon(imageVector = Icons.Default.Email,
                    contentDescription =null)
            }
            Spacer(modifier = Modifier.width(10.dp))
            Column() {
                Text(
                    text=contactno,
                    modifier=Modifier.padding(1.dp),
                    textAlign = TextAlign.Center
                )
                Text(
                    text=socialmedia,
                    modifier=Modifier.padding(1.dp),
                    textAlign = TextAlign.Center
                )
                Text(
                    text=email,
                    modifier=Modifier.padding(1.dp),
                    textAlign = TextAlign.Center
                )
            }
        }
    }



}

@Preview(showBackground = true)
@Composable
fun BussinessCardPreview() {
    BussinessCardTheme {
        BCard("Bro","Code","123","Instagram","abc@gmail.com")

    }
}
