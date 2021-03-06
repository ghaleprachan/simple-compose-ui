package app.prachang.composeui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.*
import androidx.compose.animation.core.VisibilityThreshold
import androidx.compose.animation.core.spring
import androidx.compose.animation.core.tween
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ThumbUp
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import app.prachang.composeui.ui.theme.ComposeUITheme
import coil.compose.rememberImagePainter

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeUITheme {
                MyComposeUI()
            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
private fun MyComposeUIPreview() {
    MyComposeUI()
}

@OptIn(ExperimentalFoundationApi::class, ExperimentalMaterialApi::class)
@Composable
fun MyComposeUI() {
    var hotelsList by remember { mutableStateOf(hotels) }
    Scaffold(
        backgroundColor = Color(0xff1A1917),
        topBar = {
            TopAppBar(
                backgroundColor = Color(0xff1A1917),
                title = {
                    Text(text = "Hotels", color = Color.White)
                },
            )
        },
    ) {
        LazyColumn(
            contentPadding = PaddingValues(16.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp),
        ) {
            stickyHeader {
                Surface(color = Color(0xff1A1917)) {
                    OutlinedButton(
                        modifier = Modifier.fillMaxWidth(),
                        onClick = {
                            hotelsList = hotelsList.shuffled()
                        },
                        colors = ButtonDefaults.outlinedButtonColors(
                            backgroundColor = Color.Transparent
                        ),
                        border = BorderStroke(
                            width = 1.dp,
                            color = MaterialTheme.colors.primary,
                        ),
                    ) {
                        Text(text = "Shuffle")
                    }
                }
            }
            itemsIndexed(
                items = hotelsList,
                key = { _, item ->
                    item.hotelName
                },
            ) { _, hotel ->
                HotelItemUI(
                    modifier = Modifier.animateItemPlacement(
                        animationSpec = tween(500)
                    ),
                    hotel = hotel,
                )
            }
        }
    }
}

@Preview
@Composable
private fun HotelItemUIPreview() {
    HotelItemUI(hotel = hotels[0])
}

@Composable
private fun HotelItemUI(
    modifier: Modifier = Modifier,
    hotel: Hotel,
) {
    val painter = rememberImagePainter(
        data = hotel.hotelImage
    )
    Card(
        modifier = modifier.wrapContentWidth(),
        backgroundColor = Color(0xff23232D),
        elevation = 8.dp,
    ) {
        Column(modifier = Modifier.padding(bottom = 16.dp)) {
            Image(
                painter = painter,
                contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(180.dp),
                contentScale = ContentScale.Crop
            )
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(12.dp),
            ) {
                Text(
                    text = "SOLID",
                    modifier = Modifier
                        .background(Color(0xff075D75))
                        .padding(horizontal = 8.dp, vertical = 4.dp),
                    style = TextStyle(
                        color = Color.White, fontWeight = FontWeight.SemiBold
                    )
                )
                Text(
                    text = "GEO RATE",
                    modifier = Modifier
                        .background(Color(0xff227800))
                        .padding(horizontal = 8.dp, vertical = 4.dp),
                    style = TextStyle(
                        color = Color.White, fontWeight = FontWeight.SemiBold
                    )
                )
            }

            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 12.dp)
            ) {
                Text(
                    text = hotel.hotelName,
                    style = MaterialTheme.typography.h3,
                )
                Text(
                    text = "$${hotel.price}",
                    style = MaterialTheme.typography.h3.copy(color = Color(0xff9BE083)),
                )
            }
            Spacer(modifier = Modifier.height(12.dp))
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(horizontal = 16.dp)
            ) {
                Icon(
                    Icons.Default.ThumbUp,
                    contentDescription = null,
                    tint = Color(0xffABAEA9),
                    modifier = Modifier.size(22.dp)
                )
                Text(
                    text = "${hotel.ratings} | ${hotel.hotelAddress}",
                    color = Color(0xffABAEA9),
                    fontSize = 13.sp,
                    modifier = Modifier.padding(start = 8.dp)
                )
            }
        }
    }
}