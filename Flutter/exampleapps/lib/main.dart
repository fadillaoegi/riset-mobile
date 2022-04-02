import 'package:flutter/material.dart';
import 'package:english_words/english_words.dart';

void main() => runApp(MyApp());

class MyApp extends StatelessWidget {

  var colorPink = Colors.pinkAccent;
  var colorGreenStabilo = Colors.lightGreenAccent;
  var bTest = "ButtomTest";

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: "Testing Flutter :)",
      home: Scaffold(
          appBar: AppBar(
              title: Text("heyy, Mr.Morning Star !!wkowkok"),
            backgroundColor: Colors.pinkAccent,
          ),
          body: Container(
            // margin: EdgeInsets.symmetric(vertical: 50.0),
              padding: EdgeInsets.symmetric(vertical: 50.0),
              // color: Colors.pink,
              color: Colors.black12,
              child: Column(
                children: [
                  Container(
                    child: Column(
                      children: [
                        Row(
                          mainAxisAlignment: MainAxisAlignment.center,

                          children: [
                            Text("Anak Muda Indonesia"),
                            Text("Wow, Hello Mr.Morning Star!!!")
                          ],
                        ),
                        Row(
                          mainAxisAlignment: MainAxisAlignment.center,
                          children: [
                            Card(
                              //Margin
                                margin: EdgeInsets.symmetric(horizontal: 20.0),
                                color: Colors.pink,
                                child: Row(
                                  children: [
                                    Icon(Icons.star_border_outlined)
                                  ],
                                )
                            ),
                            Card(
                                margin: EdgeInsets.symmetric(horizontal: 20.0, vertical: 20.0),
                                color: colorGreenStabilo,
                                child: Row(
                                  children: [
                                    Icon(Icons.star_border_purple500),

                                  ],
                                )
                            )
                          ],
                        )
                      ],
                    ),
                  ),
                  Container(
                    margin: EdgeInsets.symmetric(vertical: 50.0),
                    // color: colorPink,
                    child: TextButton(
                      style: TextButton.styleFrom(
                        backgroundColor: colorPink,
                      ),
                         onPressed: () {},
                      child: Text(
                        bTest,
                        style: TextStyle(
                          color: Colors.white70,

                        ),
                      )
                    )
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
