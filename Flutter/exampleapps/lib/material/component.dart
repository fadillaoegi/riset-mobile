import 'package:flutter/material.dart';
import 'colors.dart';

TextStyle styleFont1 = TextStyle(fontSize: 20, color: putih);
TextStyle styleFont2 = TextStyle(fontSize: 20, color: black);

//Button
var button1 = Container(
    width: 200,
    height: 45,
    margin: EdgeInsets.symmetric(vertical: 50.0),
    child: TextButton(
        style: TextButton.styleFrom(
          backgroundColor: Colors.pinkAccent,
          shape:
              RoundedRectangleBorder(borderRadius: BorderRadius.circular(20)),
        ),
        onPressed: () {},
        child: Text("Button Testing", style: styleFont1)));

var button2 = Container(
  width: 200,
  height: 45,
  child: TextButton(
    style: TextButton.styleFrom(
      backgroundColor: Color(0xffF18265),
      shape: RoundedRectangleBorder(
        borderRadius: BorderRadius.circular(20),
      ),
    ),
    onPressed: () {},
    child: Text(
      "Let's take a picture",
      style: styleFont1,
    ),
  ),
);
