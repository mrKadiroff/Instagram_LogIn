package com.example.instagram_login.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.ClickableText
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.navigation.NavHostController
import com.example.instagram_login.R
import com.example.instagram_login.Routes
import com.example.instagram_login.component.CustomTopAppBar

@Composable
fun SignUp(navController: NavHostController) {
    Surface(color = Color.White) {
        ConstraintLayout(
            modifier = Modifier.fillMaxSize(),
        ) {
            val (
                backBtn, coverImage, titleText, genreText, ratingText,loginFacevook,
                castText, castContainer, castImage1, castImage2, castImage3, castImage4,
                descText, bottomSurface, loginButton, cinemaNameContainer,
            ) = createRefs()


            val imageIn: Painter = painterResource(id = R.drawable.instagram)
            Image(
                painter = imageIn,
                contentDescription = "image",
                modifier = Modifier.constrainAs(cinemaNameContainer) {
                    top.linkTo(parent.top)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                }.size(170.dp))









            Column(
                modifier = Modifier.constrainAs(bottomSurface){
                                                              top.linkTo(cinemaNameContainer.bottom)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                    bottom.linkTo(castImage2.top)
                }.padding(0.dp,0.dp,0.dp,20.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                val username = remember { mutableStateOf(TextFieldValue()) }
                val password = remember { mutableStateOf(TextFieldValue()) }



                Spacer(modifier = Modifier.height(20.dp))
                TextField(
                    label = { Text(text = "Username") },
                    value = username.value,
                    onValueChange = { username.value = it })

                Spacer(modifier = Modifier.height(20.dp))
                TextField(
                    label = { Text(text = "Password") },
                    value = password.value,
                    visualTransformation = PasswordVisualTransformation(),
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                    onValueChange = { password.value = it })



            }



            val imageInglish: Painter = painterResource(id = R.drawable.instagram)
            Image(
                painter = imageInglish,
                contentDescription = "image",
                modifier = Modifier.constrainAs(castImage2) {
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                    top.linkTo(parent.top)
                    bottom.linkTo(parent.bottom)
                }.width(24.dp)
                    .height(1.dp))


                        Button(


                onClick = { navController.navigate(Routes.SignUp.route)},
                colors = ButtonDefaults.buttonColors(backgroundColor = Color.Blue,contentColor = Color.White),
                shape = RoundedCornerShape(10.dp),
                modifier = Modifier
                    .constrainAs(loginButton) {
                        start.linkTo(parent.start)
                        end.linkTo(parent.end)
                        top.linkTo(castImage2.bottom)
                        bottom.linkTo(castImage3.top)

                    }
                    .fillMaxWidth()
                    .height(44.dp)
                    .padding(34.dp,0.dp,34.dp,0.dp)

            ) {
                Text(text = "Login")

            }







            val imageFace: Painter = painterResource(id = R.drawable.facebook)
            Image(
                painter = imageFace,
                contentDescription = "image",
                modifier = Modifier.constrainAs(castImage3) {
                    top.linkTo(castImage2.bottom)
                    start.linkTo(ratingText.start)
                    bottom.linkTo(parent.bottom)
                }.size(20.dp)

            )



            Text(
                text = "Log in with Facebook",
                style = TextStyle( fontSize = 16.sp,
                    fontFamily = FontFamily.Default,
                ),
                fontWeight = FontWeight.Normal,
                modifier = Modifier.constrainAs(loginFacevook) {
                    start.linkTo(castImage3.end)
                    bottom.linkTo(castImage3.bottom)
                }.padding(10.dp,0.dp,0.dp,0.dp)


            )




                        Text(
                text = "OR",
                style = TextStyle( fontSize = 16.sp,
                    fontFamily = FontFamily.Default,
                    ),
                fontWeight = FontWeight.Normal,
                modifier = Modifier.constrainAs(descText) {
                    end.linkTo(parent.end)
                    start.linkTo(parent.start)
                    bottom.linkTo(ratingText.top)
                }.padding(0.dp,0.dp,0.dp,30.dp)


            )




            ClickableText(
                text = AnnotatedString("Don’t have an account?"),
                modifier = Modifier.constrainAs(ratingText){
                    start.linkTo(cinemaNameContainer.start)
                    bottom.linkTo(parent.bottom)

                }.padding(0.dp,0.dp,0.dp,32.dp)
                ,
                onClick = { navController.navigate(Routes.SignUp.route)},
                style = TextStyle(
                    fontSize = 14.sp

                )
            )



            ClickableText(
                text = AnnotatedString("Sign up"),
                modifier = Modifier.constrainAs(castImage4){
                    start.linkTo(ratingText.end)
                    bottom.linkTo(parent.bottom)

                }.padding(7.dp,0.dp,0.dp,32.dp)
                ,
                onClick = { navController.navigate(Routes.SignUp.route)},
                style = TextStyle(
                    fontSize = 14.sp,
                    color = Color.Blue

                )
            )






















        }
    }
}

