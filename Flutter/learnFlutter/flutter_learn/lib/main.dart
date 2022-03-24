import 'package:flutter/material.dart';
import 'package:english_words/english_words.dart';

void main() => runApp(MyApps());

final randomword = WordPair.random();

class MyApps extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: "Testing Flutter :)",
      home: Scaffold(
        appBar: AppBar(
          title: Text('Hello Anisa apa kabar ?'),
        ),
        body: Center(
          child: Text(randomword.asString),
        ),
        floatingActionButton: FloatingActionButton(
            onPressed: () {},
             child: Icon(Icons.play_arrow)),
      ),
    );
  }
}
