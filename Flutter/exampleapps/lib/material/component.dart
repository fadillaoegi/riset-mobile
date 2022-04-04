import 'package:flutter/material.dart';
import 'colors.dart';

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
        child: Text(
          "Button Testing",
          style: TextStyle(
            color: Colors.white70,
          ),
        )));

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
      style: TextStyle(
        color: Color(0xffffffff),
      ),
    ),
  ),
);
