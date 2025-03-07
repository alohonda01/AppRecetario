package com.example.apprecetario.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.apprecetario.navigation.Routes
import com.example.apprecetario.R

@Preview(showBackground = true)
@Composable
fun PreviewScreenMain() {
    ScreenMain(navController = rememberNavController())
}

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ScreenMain(navController: NavController) {
    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title =
                {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.Start,
                    ){
                        Image(
                            painter = painterResource(id = R.drawable.libro_de_recetas),
                            contentDescription = "Logo",
                            modifier = Modifier.size(40.dp)
                        )
                        Text(
                            text = "Recetas Express",
                            color = Color.White,
                            fontSize = 30.sp,
                            modifier = Modifier.padding(start = 40.dp)
                        )
                    }
                },
                colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
                    containerColor = Color.Red
                )
            )
        },
        content = { paddingValues ->
            LazyColumn(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(paddingValues)
                    .padding(20.dp),
                verticalArrangement = Arrangement.Top
            ) {
                item {
                    //POLLO KFC
                    Text(
                        text = "POLLO KFC",
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.padding(bottom = 8.dp).fillMaxWidth(),
                        textAlign = TextAlign.Center
                    )
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                        ,
                        horizontalArrangement = Arrangement.Center,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.pollokfc),
                                contentDescription = "pollo KFC",
                                modifier = Modifier.size(200.dp, 200.dp)
                            )
                        }

                        Column(
                            modifier = Modifier.padding(start = 10.dp)
                        ){
                            Text(
                                text = "Crujiente por fuera y jugoso por dentro, sazonado con una mezcla secreta de 11 hierbas y especias. Es un clásico mundial de la comida rápida, disponible en varias opciones.",
                                fontSize = 16.sp,
                                textAlign = TextAlign.Justify,
                            )

                        }
                    }
                    Row(
                        modifier = Modifier
                            .fillParentMaxWidth()
                            .padding(bottom = 20.dp),
                        horizontalArrangement = Arrangement.Start
                    ){
                        Button(
                            onClick = {navController.navigate(Routes.screenPolloKFC)},
                            modifier = Modifier.padding(top = 30.dp).size(200.dp,40.dp),
                            colors = ButtonDefaults.buttonColors(Color.Red)
                        ) {
                            Text(text = "Ver receta")
                        }
                    }

                    Divider(color = Color.Gray, thickness = 1.dp)

                    //NUGGETS
                    Text(
                        text = "NUGGETS",
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.padding(top = 30.dp, bottom = 8.dp).fillMaxWidth(),
                        textAlign = TextAlign.Center
                    )
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                        ,
                        horizontalArrangement = Arrangement.Center,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.nuggets),
                                contentDescription = "pollo KFC",
                                modifier = Modifier.size(200.dp, 200.dp)
                            )
                        }

                        Column(
                            modifier = Modifier.padding(start = 10.dp)
                        ){
                            Text(
                                text = "Dorados y crujientes por fuera, tiernos y jugosos por dentro, con un sabor irresistible gracias a su perfecta combinación de especias. Un clásico de la comida rápida, ideales para cualquier antojo.",
                                fontSize = 15.sp,
                                textAlign = TextAlign.Justify,
                                )
                        }
                    }
                    Row(
                        modifier = Modifier
                            .fillParentMaxWidth()
                            .padding(bottom = 20.dp),
                        horizontalArrangement = Arrangement.Start
                    ){
                        Button(
                            onClick = {navController.navigate(Routes.screenNuggets)},
                            modifier = Modifier.padding(top = 30.dp).size(200.dp,40.dp),
                            colors = ButtonDefaults.buttonColors(Color.Red)
                        ) {
                            Text(text = "Ver receta")
                        }
                    }

                    Divider(color = Color.Gray, thickness = 1.dp)

                    //Palomitas
                    Text(
                        text = "PALOMITAS",
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier
                            .padding(top = 30.dp, bottom = 8.dp)
                            .fillMaxWidth(),
                        textAlign = TextAlign.Center
                    )
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                        ,
                        horizontalArrangement = Arrangement.Center,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.palomitas),
                                contentDescription = "imagen palomitas",
                                modifier = Modifier.size(200.dp, 200.dp)
                            )
                        }

                        Column(
                            modifier = Modifier.padding(start = 10.dp)
                        ){
                            Text(
                                text = "Ligeras y crujientes, con el equilibrio perfecto entre mantequilla y sal. Explosivas de sabor en cada bocado, son el acompañamiento ideal para cualquier película o antojo.",
                                fontSize = 14.sp,
                                textAlign = TextAlign.Justify
                            )
                        }
                    }
                    Row(
                        modifier = Modifier
                            .fillParentMaxWidth()
                            .padding(bottom = 20.dp),
                        horizontalArrangement = Arrangement.Start
                    ){
                        Button(
                            onClick = {navController.navigate(Routes.screenPalomitas)},
                            modifier = Modifier.size(200.dp,40.dp),
                            colors = ButtonDefaults.buttonColors(Color.Red)
                        ) {
                            Text(text = "Ver receta")
                        }
                    }

                    Divider(color = Color.Gray, thickness = 1.dp)

                    //ALBONDIGAS
                    Text(
                        text = "ALBONDIGAS",
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier
                            .padding(top = 50.dp, bottom = 8.dp)
                            .fillMaxWidth(),
                        textAlign = TextAlign.Center
                    )
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                        ,
                        horizontalArrangement = Arrangement.Center,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.albondigas),
                                contentDescription = "imagen albondigas",
                                modifier = Modifier.size(200.dp, 200.dp)
                            )
                        }

                        Column(
                            modifier = Modifier.padding(start = 10.dp)
                        ){
                            Text(
                                text = "Suaves y jugosas por dentro, con una capa dorada y crujiente por fuera. Sazonadas a la perfección, son el plato reconfortante que todos amamos, llenas de sabor en cada bocado.",
                                fontSize = 14.sp,
                                textAlign = TextAlign.Justify
                            )
                        }
                    }
                    Row(
                        modifier = Modifier.fillParentMaxWidth(),
                        horizontalArrangement = Arrangement.Start
                    ){
                        Button(
                            onClick = {navController.navigate(Routes.screenAlbondigas)},
                            modifier = Modifier.size(200.dp,40.dp),
                            colors = ButtonDefaults.buttonColors(Color.Red)
                        ) {
                            Text(text = "Ver receta")
                        }
                    }

                //item
                }
            }
        }
    )
}