import '../widgets/style.dart';
import '../widgets/widgets.dart';
import 'package:flutter/material.dart';

class Chatting extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    // TODO: implement build
    return Scaffold(
      floatingActionButton: FloatingActionButton(
        onPressed: () {},
        child: Icon(
          Icons.add,
          size: 30.0,
        ),
        backgroundColor: sweetPink,
      ),
      backgroundColor: sweetPink,
      floatingActionButtonLocation: FloatingActionButtonLocation.centerFloat,
      body: SafeArea(
          child: Center(
              child: SingleChildScrollView(
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
              child: SingleChildScrollView(
                child: Column(
                  crossAxisAlignment: CrossAxisAlignment.start,
                  children: [
                    sizeBox2,
                    Text(
                      "Friends",
                      style: title,
                    ),
                    sizeBox3,
                    Container(
                      height: 200,
                      child: ListView(
                        children: [
                          ChatTile(
                              image: 'assets/image/pic1.png',
                              name: 'Nikki-Chan',
                              message: 'Heyy, Luffy-kun ....',
                              time: 'Now',
                              unread: false),
                          sizeBox3,
                          ChatTile(
                              image: 'assets/image/pic2.png',
                              name: 'Nikki-Chan',
                              message: 'Heyy, Luffy-kun ....',
                              time: '11.00',
                              unread: false),
                          sizeBox3,
                          ChatTile(
                            image: 'assets/image/pic3.png',
                            name: 'Nikki-Chan',
                            message: 'Heyy, Luffy-kun ....',
                            time: '12.30',
                            unread: true,
                          ),
                          sizeBox3,
                          ChatTile(
                            image: 'assets/image/pic1.png',
                            name: 'Nikki-Chan',
                            message: 'Heyy, Luffy-kun ....',
                            time: '10.45',
                            unread: true,
                          ),
                        ],
                      ),
                    ),
                    sizeBox2,
                    Text(
                      "Groups",
                      style: title,
                    ),
                    ChatTile(
                        image: 'assets/image/pic1.png',
                        name: 'Nikki-Chan',
                        message: 'Heyy, Luffy-kun ....',
                        time: 'Now'),
                    sizeBox3,
                    ChatTile(
                        image: 'assets/image/pic2.png',
                        name: 'Nikki-Chan',
                        message: 'Heyy, Luffy-kun ....',
                        time: 'Now'),
                    sizeBox3,
                    ChatTile(
                        image: 'assets/image/pic3.png',
                        name: 'Nikki-Chan',
                        message: 'Heyy, Luffy-kun ....',
                        time: 'Now'),
                    sizeBox3,
                    ChatTile(
                        image: 'assets/image/pic1.png',
                        name: 'Nikki-Chan',
                        message: 'Heyy, Luffy-kun ....',
                        time: 'Now'),
                  ],
                ),
              ),
            )
          ],
        ),
      ))),
    );
  }
}
