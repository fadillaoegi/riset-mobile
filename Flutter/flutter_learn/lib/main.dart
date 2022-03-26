import 'package:flutter/material.dart';
import 'package:english_words/english_words.dart';

void main() => runApp(MyApp());

class MyApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: "Testing Flutter :)",
      home: RandomWord(),
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
