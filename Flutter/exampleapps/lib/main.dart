import 'package:flutter/material.dart';
import 'material/colors.dart';
import 'material/component.dart';

void main() => runApp(MyApp());

class MyApp extends StatelessWidget {
  //========================

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

  //========================
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
                  color: Colors.black12,
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
                                      style: TextStyle(
                                          color: picoVoid, fontSize: 20.0),
                                    ),
                                    Text(
                                      "Woww, Hello Mr.Morning Star!!!",
                                      style: TextStyle(fontSize: 20.0),
                                    )
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
