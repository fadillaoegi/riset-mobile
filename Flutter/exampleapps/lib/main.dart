import 'package:flutter/material.dart';
import 'package:english_words/english_words.dart';

void main() => runApp(MyApp());

class MyApp extends StatelessWidget {

  var colorPink = Colors.pinkAccent;
  var colorGreenStabilo = Colors.lightGreenAccent;


  //Button
  var button1 = Container(
        width: 200,
        height: 45,
        margin: EdgeInsets.symmetric(vertical: 50.0),
        child: TextButton(
            style: TextButton.styleFrom(
              backgroundColor: Colors.pinkAccent,
              shape: RoundedRectangleBorder(
                borderRadius: BorderRadius.circular(20)
              ),
            ),
            onPressed: () {},
            child: Text(
              "Button Testing",
              style: TextStyle(
                color: Colors.white70,

              ),
            )
        )
    );
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

  //========================

  //Card
  var _card1 = Card(
      //Margin
        margin: EdgeInsets.symmetric(horizontal: 20.0),
        color: Colors.pink,
        child: Row(
          children: [
            Icon(Icons.star_border_outlined)
          ],
        )
    );

  var _card2 = Card(
        margin: EdgeInsets.symmetric(horizontal: 20.0, vertical: 20.0),
        color: Colors.lightGreenAccent,
        child: Row(
          children: [
            Icon(Icons.star_border_purple500),

          ],
        )
    );

  //========================

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: "Testing Flutter :)",
      home: Scaffold(
          appBar: AppBar(
              title: Text("Tetsing Success !!!"),
            backgroundColor: Colors.pinkAccent,
          ),
          body:
          Container(
            // margin: EdgeInsets.symmetric(vertical: 50.0),
              padding: EdgeInsets.symmetric(vertical: 50.0),
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
                                Text("Anak Muda Indonesia"),
                                Text("Wow, Hello Mr.Morning Star!!!")
                              ],
                            )
                          ],
                        ),

                        //Row Card
                        Row(
                          mainAxisAlignment: MainAxisAlignment.center,
                          children: [
                            _card1,
                            _card2,
                            // _image
                            Container(
                              child: Image.asset("assets/image/we.png"),
                            )

                          ],
                        )
                      ],
                    ),
                  ),
                  button1,
                  button2,

                  Container(

                  )
                ],
              ))),
    );
  }
}


class RandomWord extends StatefulWidget {
  @override
  _RandomWordState createState() => _RandomWordState();
}

class _RandomWordState extends State<RandomWord> {
  String randomword = WordPair.random().asString;

  void _changeWord() {
    setState(() {
      randomword = WordPair.random().asString;
    });
  }

  @override
  Widget build(BuildContext context) {
    // TODO: implement build
    return Scaffold(
        appBar: AppBar(
          title: Text('Hello, Mr.Morning Star !!'),
        ),
        body: Center(
          child: Text(randomword),
        ),
        floatingActionButton: FloatingActionButton(
          onPressed: _changeWord,
          child: Icon(Icons.play_arrow),
        ));
  }
}
