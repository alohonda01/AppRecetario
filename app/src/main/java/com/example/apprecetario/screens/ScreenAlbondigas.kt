package com.example.apprecetario.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
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
import com.example.apprecetario.R

@Composable
fun ScreenAlbondigas(){
    PreviewScreenA()
}

@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun PreviewScreenA(){
    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = {
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
                verticalArrangement = Arrangement.Top,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                item {
                    //POLLO KFC
                    Text(text = "ALBONDIGAS\n",
                        fontWeight = FontWeight.Bold,
                        fontSize = 20.sp
                    )
                    Image(
                        painter = painterResource(id = R.drawable.albondigas2),
                        contentDescription = "pollo KFC",
                        modifier = Modifier.fillMaxWidth()
                    )

                    //Descripcion
                    DescripcionAlbondigas()
                    Divider(color = Color.Gray, thickness = 1.dp)
                    //Ingredientes
                    IngredientesAlbondigas()
                    Divider(color = Color.Gray, thickness = 1.dp)
                    //Preparacion
                    Preparacion()

                }
            }
        }
    )
}

@Composable
fun DescripcionAlbondigas(){
    Text(
        text = "Descripcion",
        fontSize = 16.sp,
        fontWeight = FontWeight.Bold,
        modifier = Modifier.padding(top = 20.dp, bottom = 10.dp)
    )

    Text(
        text = """
        Las albóndigas son un platillo tradicional compuesto por bolas de carne molida (res, cerdo, pollo o una mezcla de estas) sazonadas con especias, ajo, cebolla y hierbas aromáticas. Se pueden cocinar de diversas maneras, pero lo más común es guisarlas en una salsa de tomate condimentada con especias como comino, orégano o laurel.
 
        Este platillo es muy versátil y varía según la región. En México, suelen servirse con arroz y tortillas, mientras que en España pueden incluir almendras y azafrán. También existen versiones con salsas verdes, de chipotle o incluso en caldo. Se pueden acompañar con pasta, puré de papa o pan. Son un platillo reconfortante y lleno de sabor.
         
        """.trimIndent(),
        fontSize = 14.sp,
        textAlign = TextAlign.Justify
    )
}

@Composable
fun IngredientesAlbondigas(){
    Text(
        text = "Ingredientes",
        fontSize = 16.sp,
        fontWeight = FontWeight.Bold,
        modifier = Modifier.padding(top = 20.dp)
    )

    Text(
        text = """
        • 2 Tazas de Puré de tomate
                                  
        • 1 Chile chipotle
                                    
        • 3 Tazas de Agua
                                    
        • 2 Cubos de Concentrado de Tomate con Pollo CONSOMATE®
                                    
        • 1 Cucharada de Aceite de maíz
                                    
        • 800 Gramos Carne de res molida
                                    
        • 100 Gramos de Tocino picado y frito
                                    
        • 1 Huevo
                                    
        • 2 Cucharadas de Jugo MAGGI®
                                    
        • 1 Cucharada de Salsa Tipo Inglesa CROSSE & BLACKWELL®
                                    
        • 2 Cucharadas de Cebolla finamente picada
                                  
        """.trimIndent(),
        modifier = Modifier.padding(top = 10.dp).fillMaxWidth()
    )
}

@Composable
fun Preparacion(){

    Text(
        text = "¡A cocinar!",
        fontWeight = FontWeight.Bold,
        fontSize = 15.sp,
        modifier =  Modifier.padding(top = 20.dp, bottom = 10.dp)
    )

    Text(text = """
        1. Para la salsa, licúa el puré de tomate, el chile, el agua y el Concentrado de Tomate con Pollo CONSOMATE®. Calienta el aceite en una olla y cocina la salsa a fuego medio por 10 minutos.
        
        2. Para las albóndigas, mezcla la carne con el tocino, la cebolla, el huevo, el Jugo MAGGI® y la Salsa Tipo Inglesa CROSSE & BLACKWELL®. Forma las albóndigas, colócalas en la salsa, tapa y cocina por 20 minutos a fuego medio o hasta que estén cocidas.
        
        3. Sirve las albóndigas en un plato y ofrece.
        
    """.trimIndent(),
        textAlign = TextAlign.Justify
    )
}