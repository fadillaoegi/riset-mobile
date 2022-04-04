import 'dart:ffi';

import 'package:exampleapps/material/fontStyle.dart';
import 'package:flutter/material.dart';
import 'material/colors.dart';
import 'material/component.dart';
import 'material/fontStyle.dart';

void main() => runApp(MyApp());

class MyApp extends StatelessWidget {
  //======================== Variable
//Card
  var _card1 = Card(
      //Margin
      margin: EdgeInsets.symmetric(horizontal: 20.0),
      color: Colors.pink,
      child: Row(
        children: [Icon(Icons.star_border_outlined)],
      ));

  var _card2 = Card(
      margin: EdgeInsets.symmetric(horizontal: 20.0, vertical: 20.0),
      color: Colors.lightGreenAccent,
      child: Row(
        children: [
          Icon(Icons.star_border_purple500),
        ],
      ));

//========================

  var _image = Container(
      child: Image.asset(
    "assets/image/we.png",
    height: 200,
    width: 200,
  ));

  //======================== Void

  void _click() {}

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: "Testing Flutter :)",
      home: Scaffold(
          appBar: AppBar(
              title: Text("Tetsing Success !!!"),
              backgroundColor: Colors.pinkAccent),
          body: SafeArea(
              child: Container(
                  // margin: EdgeInsets.symmetric(vertical: 50.0),
                  // padding: EdgeInsets.symmetric(vertical: 50.0),
                  padding: EdgeInsets.only(
                      top: 50.0, bottom: 50.0, right: 0.0, left: 0.0),
                  // color: Colors.pink,
                  color: picoVoid,
                  child: Column(
                    children: [
                      Container(
                        child: Column(
                          children: [
                            //Row Text
                            Row(
                              mainAxisAlignment: (MainAxisAlignment.center),
                              children: [
                                Column(
                                  children: [
                                    Text(
                                      "Anak Muda Indonesia",
                                      style: styleFont1,
                                    ),
                                    Text("Woww, Hello Mr.Morning Star!!!",
                                        style: styleFont1),
                                  ],
                                )
                              ],
                            ),

                            //Row Card
                            Row(
                              mainAxisAlignment: MainAxisAlignment.center,
                              children: [_card1, _card2],
                            )
                          ],
                        ),
                      ),
                      button1,
                      button2,
                      _image,
                      // _navy
                    ],
                  )))),
    );
  }
}
