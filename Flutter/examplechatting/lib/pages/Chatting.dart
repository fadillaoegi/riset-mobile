import 'package:flutter/material.dart';

class Chatting extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    // TODO: implement build
    return Scaffold(
      body: SafeArea(
          child: ListView(
        children: [
          Text(
            "Hello Mr.Morning Start !!!",
            style: TextStyle(fontSize: 40),
          ),
          Row(children: [
            new Icon(
              Icons.abc_outlined,
              size: 100,
            ),
            Image.asset('assets/image/profilePic.png')
          ])
        ],
      )),
    );
  }
}
