import 'package:flutter/material.dart';
import 'pages/Chatting.dart';

void main() => runApp(chatting());

class chatting extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    // TODO: implement build
    return MaterialApp(
      debugShowCheckedModeBanner: false,
      theme: ThemeData(fontFamily: 'Poppins'),
      title: "Chatting",
      home: Chatting(),
    );
  }
}
