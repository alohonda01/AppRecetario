package com.example.apprecetario.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
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
fun ScreenPalomitas(){
    PreviewScreenP()
}

@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun PreviewScreenP(){
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
                    Text(text = "PALOMITAS\n",
                        fontWeight = FontWeight.Bold,
                        fontSize = 20.sp
                    )
                    Image(
                        painter = painterResource(id = R.drawable.palomitas2),
                        contentDescription = "pollo KFC",
                        modifier = Modifier.fillMaxWidth()
                    )

                    //Descripcion
                    DescripcionPalomitas()
                    Divider(color = Color.Gray, thickness = 1.dp)
                    //Ingredientes
                    IngredientesPalomitas()
                    Divider(color = Color.Gray, thickness = 1.dp)
                    //Preparacion
                    PreparacionPalomitas()
                }
            }
        }
    )
}

@Composable
fun DescripcionPalomitas(){
    Text(
        text = "Descripcion",
        fontSize = 16.sp,
        fontWeight = FontWeight.Bold,
        modifier = Modifier.padding(top = 20.dp, bottom = 10.dp)
    )

    Text(
        text = """
        Las palomitas de maíz son un snack ligero y crujiente, hechas a partir de granos de maíz especiales que, al calentarse, explotan debido a la humedad interna, formando pequeñas nubes de maíz esponjoso. Se preparan principalmente al aire, en una olla o en una máquina de palomitas, y se pueden sazonar con mantequilla, sal, queso, caramelo o especias al gusto.

        Son un acompañante clásico para el cine o reuniones informales, y su versatilidad permite que se puedan disfrutar tanto en versiones dulces como saladas. Además, son un bocadillo bajo en calorías si se preparan sin aditivos, lo que las hace populares entre quienes buscan opciones más saludables. ¡Fáciles de preparar y siempre deliciosas!
        
        """.trimIndent(),
        fontSize = 14.sp,
        textAlign = TextAlign.Justify
    )
}

@Composable
fun IngredientesPalomitas(){
    Text(
        text = "Ingredientes",
        fontSize = 16.sp,
        fontWeight = FontWeight.Bold,
        modifier = Modifier.padding(top = 20.dp)
    )

    Text(
        text = """
        • Maíz en grano para palomitas
                                  
        • Aceite de girasol o de oliva
                                    
        • Sal al gusto
        
        """.trimIndent(),
        modifier = Modifier.padding(top = 10.dp).fillMaxWidth()
    )
}

@Composable
fun PreparacionPalomitas(){
    Text(
        text = "¡A cocinar!",
        fontWeight = FontWeight.Bold,
        fontSize = 15.sp,
        modifier =  Modifier.padding(top = 20.dp, bottom = 10.dp)
    )

    Text(text = """
        1. Cubrir el fondo de una buena sartén amplia con el aceite y llevar al fuego hasta que esté bien caliente.
        
        2. Echar los granos de maíz, dejándolos en una sola capa, y tapar.
        
        3. Dejar un pequeño hueco para que salga el vapor.
        
        4. Cuando empiecen a sonar las primeras palomitas, bajar la temperatura a un nivel medio.
        
        5. Esperar hasta que dejen de oírse explosiones.
        
        6. Apagar el fuego y destapar.
        
    """.trimIndent(),
        textAlign = TextAlign.Justify
    )
}