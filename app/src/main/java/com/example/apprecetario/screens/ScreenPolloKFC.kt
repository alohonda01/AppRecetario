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
fun ScreenPolloKFC(){
    PreviewScreenKFC()
}

@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun PreviewScreenKFC(){
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
                        painter = painterResource(id = R.drawable.kfc3),
                        contentDescription = "pollo KFC",
                        modifier = Modifier.fillMaxWidth()
                    )

                    //Descripcion
                    DescripcionKFC()
                    Divider(color = Color.Gray, thickness = 1.dp)
                    //Ingredientes
                    IngredientesKFC()
                    Divider(color = Color.Gray, thickness = 1.dp)
                    //Preparacion
                    PreparacionKFC()
                }
            }
        }
    )
}

@Composable
fun DescripcionKFC(){
    Text(
        text = "Descripcion",
        fontSize = 16.sp,
        fontWeight = FontWeight.Bold,
        modifier = Modifier.padding(top = 20.dp, bottom = 10.dp)
    )

    Text(
        text = """
        El pollo de KFC es conocido por su receta secreta de "11 hierbas y especias", que le da su sabor característico. Se trata de piezas de pollo (como muslos, alitas o pechugas) rebozadas en una mezcla crujiente y sabrosa, luego fritas hasta quedar doradas y jugosas por dentro. El rebozado es el toque distintivo que hace que este pollo sea tan popular, proporcionando un contraste perfecto con la carne tierna.

        El pollo de KFC se ofrece en varias combinaciones, ya sea solo, en combos con papas fritas, ensaladas, o panecillos, y también puede acompañarse con salsas como la de miel mostaza o barbacoa. Es famoso por su textura crujiente, sabor intenso y por ser un plato perfecto para compartir en reuniones o disfrutar de una comida rápida y satisfactoria.
        
        """.trimIndent(),
        fontSize = 14.sp,
        textAlign = TextAlign.Justify
    )
}

@Composable
fun IngredientesKFC(){
    Text(
        text = "Ingredientes",
        fontSize = 16.sp,
        fontWeight = FontWeight.Bold,
        modifier = Modifier.padding(top = 20.dp)
    )

    Text(
        text = """
        • 1 de pechuga de pollo
                                  
        • 1/2 litro de aceite de oliva                         
        
        """.trimIndent(),
        modifier = Modifier.padding(top = 10.dp).fillMaxWidth()
    )

    Text(
        text = "Para el marinado",
        fontSize = 14.sp,
        fontWeight = FontWeight.Bold,
        modifier = Modifier.padding(top = 10.dp)
    )

    Text(
        text = """
        • 200 gramos de harina
                                    
        • 100 gramos de maicena (harina de maíz refinada)
                                    
        • 1 cucharadita de pimentón dulce
                                    
        • 1 cucharadita de curry
                                    
        • 1 cucharadita de ajo en polvo
                                    
        • 1/2 cucharadita de cayena
                                    
        • 2 de tomillo
        
        • 2 de eneldo
        
        • 1 pizca de estragón
        
        • Agua
        """.trimIndent(),
        modifier = Modifier.padding(top = 10.dp).fillMaxWidth()
    )

    Text(
        text = "Para el rebozado crujiente",
        fontSize = 14.sp,
        fontWeight = FontWeight.Bold,
        modifier = Modifier.padding(top = 10.dp, bottom = 10.dp)
    )

    Text(
        text = """
        • 200 gramos de harina
        
        • 1 cucharadita de pimentón dulce
         
        • 1/2 cucharadita de curry
        
        • 1/2 cucharadita de cayena
        
        • 1/2 cucharadita de ajo en polvo
        
        • 2 de tomillo
        
        • 2 de eneldo
        
        """.trimIndent(),
        modifier = Modifier.padding(top = 10.dp).fillMaxWidth()
    )

}

@Composable
fun PreparacionKFC(){

    Text(
        text = "¡A cocinar!",
        fontWeight = FontWeight.Bold,
        fontSize = 15.sp,
        modifier =  Modifier.padding(top = 20.dp, bottom = 10.dp)
    )

    Text(text = """
        1. Para el marinado, pon en un bol la harina, maicena, tomillo, estragón, pimentón dulce, ajo en polvo, pimienta cayena molida, eneldo y curry. Remueve con una varilla.
        
        2. Añade agua a la vez que remueves hasta que quede una masa sin grumos.
        
        3. Trocea el pollo. Añade el marinado y deja reposar 3 horas.
        
        4. Para el rebozado añade: harina, ajo en polvo, curry, eneldo, tomillo, cayena molida y pimentón dulce. Mezcla.
        
        5. Pon a calentar un cazo con abundante aceite. Reboza cada pieza de pollo y frie.
        
        6. Saca las piezas de pollo frito KFC y colócalas en papel absorbente. Sirve.
        
    """.trimIndent(),
        textAlign = TextAlign.Justify
    )
}