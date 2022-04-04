import 'package:flutter/material.dart';

void main() => runApp(homePage());

class homePage extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    // TODO: implement build
    return MaterialApp(
      title: "Home Page",
      home: Scaffold(
        appBar: AppBar(title: Text("Home Pages")),
        body: SafeArea(
            child: Container(
          color: Colors.grey,
          child: Column(),
        )),
      ),
    );
  }
}
