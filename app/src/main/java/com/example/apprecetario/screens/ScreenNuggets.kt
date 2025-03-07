package com.example.apprecetario.screens

import androidx.compose.foundation.Image
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
fun ScreenNuggets(){
    PreviewScreenN()
}

@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun PreviewScreenN(){
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
                    Text(text = "NUGGETS\n",
                        fontWeight = FontWeight.Bold,
                        fontSize = 20.sp
                    )
                    Image(
                        painter = painterResource(id = R.drawable.nuggets2),
                        contentDescription = "pollo KFC",
                        modifier = Modifier.fillMaxWidth()
                    )

                    //Descripcion
                    DescripcionNuggets()
                    Divider(color = Color.Gray, thickness = 1.dp)
                    //Ingredientes
                    IngredientesNuggets()
                    Divider(color = Color.Gray, thickness = 1.dp)
                    //Preparacion
                    PreparacionNuggets()
                }
            }
        }
    )
}

@Composable
fun DescripcionNuggets(){
    Text(
        text = "Descripcion",
        fontSize = 16.sp,
        fontWeight = FontWeight.Bold,
        modifier = Modifier.padding(top = 20.dp, bottom = 10.dp)
    )

    Text(
        text = """
        Los nuggets de pollo son pequeñas porciones de carne de pollo empanadas y fritas, generalmente de forma compacta o en forma de pequeños trozos. Se preparan con carne de pollo molida o troceada, que se sazona con sal, pimienta y otras especias antes de ser cubierta con una capa crujiente de pan rallado, harina y huevo.

        Se fríen hasta quedar dorados y crujientes por fuera, mientras que por dentro permanecen jugosos y tiernos. Los nuggets suelen servirse con salsas para mojar, como ketchup, mostaza, salsa barbacoa o miel mostaza. Son muy populares en la comida rápida, tanto para adultos como para niños, por su sabor práctico y fácil de comer.
        
        """.trimIndent(),
        fontSize = 14.sp,
        textAlign = TextAlign.Justify
    )
}

@Composable
fun IngredientesNuggets(){
    Text(
        text = "Ingredientes",
        fontSize = 16.sp,
        fontWeight = FontWeight.Bold,
        modifier = Modifier.padding(top = 20.dp)
    )

    Text(
        text = """
        • 600 Gramos de pechuga de pollo molida
                                  
        • 1/2 Cucharadita de sal
                                    
        • 1/2 Cucharadita de pimienta negra molida
                                    
        • 1/2 Taza de harina
                                    
        • 1/2 Taza de fécula de maíz
                                    
        • 1/2 Cucharadita de sal
                                    
        • 1/2 Cucharadita de pimienta negra molida
                                    
        • 3/4 De taza de agua mineral fría
                                    
        • Aceite vegetal para freír
        
        """.trimIndent(),
        modifier = Modifier.padding(top = 10.dp).fillMaxWidth()
    )
}

@Composable
fun PreparacionNuggets(){

    Text(
        text = "¡A cocinar!",
        fontWeight = FontWeight.Bold,
        fontSize = 15.sp,
        modifier =  Modifier.padding(top = 20.dp, bottom = 10.dp)
    )

    Text(text = """
        1. Mezcla el pollo con la sal y la pimienta. Con las manos ligeramente engrasadas forma los nuggets, colócalos en una charola y congélalos durante 1 hora.
        
        2. Mezcla la harina con la fécula de maíz, la sal y la pimienta. Enharina cada uno de los nuggets, quita el exceso y reserva.
        
        3. Al tazón con la harina agrega el agua mineral y bate hasta incorporar. Pasa los nuggets enharinados por la mezcla de agua mineral. Calienta el aceite y fríelos hasta que doren ligeramente por ambos lados y estén cocidos. Acompaña con un dip de Media Crema NESTLÉ®.
    """.trimIndent(),
        textAlign = TextAlign.Justify
    )
}