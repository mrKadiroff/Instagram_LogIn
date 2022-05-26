package com.example.instagram_login.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.BiasAlignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester.Companion.createRefs
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension
import androidx.navigation.NavHostController
import com.example.instagram_login.R
import com.example.instagram_login.Routes
import com.example.instagram_login.component.CustomTopAppBar
import com.example.instagram_login.ui.theme.Purple700
import kotlinx.coroutines.NonDisposableHandle.parent

@Composable
fun ForgotPassword(navController: NavHostController) {
    Surface(color = Color.White) {
        ConstraintLayout(
            modifier = Modifier.fillMaxSize(),
        ) {
            val (
                loginButton, coverImage, titleText, genreText, ratingText,
                castText, castContainer, castImage1, castImage2, castImage3, castImage4,
                descText, bottomSurface, bookButton, cinemaNameContainer,
            ) = createRefs()



            val imageIn: Painter = painterResource(id = R.drawable.instagram)
            Image(
                painter = imageIn,
                contentDescription = "image",
                modifier = Modifier.constrainAs(cinemaNameContainer) {
                    top.linkTo(parent.top)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                }.size(180.dp))





            val image: Painter = painterResource(id = R.drawable.oval)
            Image(
                painter = image,
                contentDescription = "image",
                modifier = Modifier.constrainAs(coverImage) {
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                    bottom.linkTo(titleText.top)
                }.size(90.dp,90.dp))






            Text(
                text = "mr_kadiroff",
                style = TextStyle( fontSize = 14.sp,
                    fontFamily = FontFamily.Default,
                    color = Color.Black),
                fontWeight = FontWeight.Normal,
                modifier = Modifier.constrainAs(titleText) {
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                    bottom.linkTo(loginButton.top)
                }.padding(0.dp,12.dp)


            )


            Button(


                onClick = { navController.navigate(Routes.SignUp.route)},
                colors = ButtonDefaults.buttonColors(backgroundColor = Color.Blue,contentColor = Color.White),
                shape = RoundedCornerShape(10.dp),
                modifier = Modifier
                    .constrainAs(loginButton) {
                        start.linkTo(parent.start)
                        end.linkTo(parent.end)
                        top.linkTo(parent.top)
                        bottom.linkTo(parent.bottom)
                    }
                    .fillMaxWidth()
                    .height(44.dp)
                    .padding(34.dp,0.dp,34.dp,0.dp)

            ) {
                Text(text = "Login")

            }

            Text(
                text = "Switch accounts",
                style = TextStyle( fontSize = 16.sp,
                    fontFamily = FontFamily.Default,
                    color = Color.Blue),
                fontWeight = FontWeight.Normal,
                modifier = Modifier.constrainAs(castText) {
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                    top.linkTo(loginButton.bottom)
                }.padding(0.dp,30.dp)


            )






                ClickableText(
                    text = AnnotatedString("Don’t have an account?"),
                    modifier = Modifier.constrainAs(ratingText){
                        start.linkTo(cinemaNameContainer.start)
                        bottom.linkTo(parent.bottom)

                    }.padding(0.dp,0.dp,0.dp,12.dp)
                        ,
                    onClick = { navController.navigate(Routes.SignUp.route)},
                    style = TextStyle(
                        fontSize = 13.sp

                    )
                )



            ClickableText(
                text = AnnotatedString("Sign up"),
                modifier = Modifier.constrainAs(castImage2){
                    start.linkTo(ratingText.end)
                    bottom.linkTo(parent.bottom)

                }.padding(7.dp,0.dp,0.dp,12.dp)
                ,
                onClick = { navController.navigate(Routes.SignUp.route)},
                style = TextStyle(
                    fontSize = 13.sp,
                    color = Color.Black

                )
            )



//
//            Text(
//                text = "Action | 1h 48m",
//                fontSize = 16.sp,
//                color = Color.Gray,
//                modifier = Modifier.constrainAs(genreText) {
//                    top.linkTo(titleText.bottom)
//                    start.linkTo(coverImage.end, 16.dp)
//                }
//            )
//
//            Text(
//                text = "IMDb 8.0/10",
//                fontWeight = FontWeight.Medium,
//                style = MaterialTheme.typography.body1,
//                modifier = Modifier.constrainAs(ratingText) {
//                    top.linkTo(genreText.bottom, 16.dp)
//                    start.linkTo(coverImage.end, 16.dp)
//                }
//            )
//
//            Text(
//                text = "CAST",
//                fontSize = 14.sp,
//                color = Color.Gray,
//                fontWeight = FontWeight.SemiBold,
//                modifier = Modifier.constrainAs(castText) {
//                    bottom.linkTo(castContainer.top)
//                    start.linkTo(coverImage.end, 16.dp)
//                }
//            )



        }
    }

}



