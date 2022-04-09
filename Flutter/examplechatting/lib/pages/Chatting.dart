import 'package:examplechatting/widgets/style.dart';
import 'package:examplechatting/widgets/widgets.dart';
import 'package:flutter/material.dart';

class Chatting extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    // TODO: implement build
    return Scaffold(
      backgroundColor: sweetPink,
      body: SafeArea(
          child: Center(
        child: Column(
          children: [
            sizeBox1,
            Image.asset(
              'assets/image/pofilePic.png',
              height: 200,
              width: 200,
            ),
            sizeBox3,
            Text(
              "Monkey D. Luffy",
              style: title,
            ),
            sizeBox4,
            Text(
              "Mobile Developer",
              style: subTitle,
            ),
            sizeBox1,
            Container(
              width: double.infinity,
              padding: EdgeInsets.all(30),
              decoration: BoxDecoration(
                color: lynxWhite,
                borderRadius: BorderRadius.vertical(top: Radius.circular(80)),
              ),
              child: Column(
                crossAxisAlignment: CrossAxisAlignment.start,
                children: [
                  sizeBox2,
                  Text(
                    "Friends",
                    style: title,
                  ),
                  sizeBox3,
                  ChatTile(
                      image: 'assets/image/pic1.png',
                      name: 'Nikki-Chan',
                      message: 'Heyy, Luffy-kun ....',
                      time: 'Now'),
                ],
              ),
            )
          ],
        ),
      )),
    );
  }
}
