import 'package:flutter/material.dart';
import '../style/style.dart';
import 'package:google_fonts/google_fonts.dart';

class example extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      backgroundColor: Color(0xff474141),
      appBar: AppBar(
        title: Text("Testing Layouting !", style: font1),
      ),
      body: SafeArea(
        // child: Center(
        child: SingleChildScrollView(
          child: Column(
              // mainAxisAlignment: MainAxisAlignment.start,
              // crossAxisAlignment: CrossAxisAlignment.center,
              // mainAxisAlignment: MainAxisAlignment.center,
              children: [
                sizeBox1,
                Text(
                  "Profile Menu",
                  style: TextStyle(color: Colors.white, fontSize: 24),
                ),
                SizedBox(
                  height: 20,
                ),
                Row(
                  mainAxisAlignment: MainAxisAlignment.center,
                  children: [
                    Image.asset(
                      "assets/images/item1.png",
                      height: 140,
                      width: 140,
                    ),
                  ],
                ),
                SizedBox(
                  height: 10.0,
                ),
                Text(
                  "Anak Muda Indonesia",
                  style: TextStyle(color: Colors.white, fontSize: 20),
                ),
                Text(
                  "Profile Menu",
                  style: TextStyle(color: Colors.grey, fontSize: 18),
                ),
                sizeBox2,
                Row(
                  mainAxisAlignment: MainAxisAlignment.spaceAround,
                  children: [
                    Image.asset(
                      "assets/images/item2.png",
                      height: 70,
                      width: 70,
                    ),
                    Image.asset(
                      "assets/images/item2.png",
                      height: 70,
                      width: 70,
                    ),
                    Image.asset(
                      "assets/images/item2.png",
                      height: 70,
                      width: 70,
                    ),
                  ],
                ),
                sizeBox2,
                Row(
                    mainAxisAlignment: MainAxisAlignment.spaceAround,
                    children: [
                      Image.asset(
                        "assets/images/item2.png",
                        height: 70,
                        width: 70,
                      ),
                      Image.asset(
                        "assets/images/item2.png",
                        height: 70,
                        width: 70,
                      ),
                      Image.asset(
                        "assets/images/item2.png",
                        height: 70,
                        width: 70,
                      ),
                    ]),
                sizeBox2,
                Container(
                  height: 55,
                  width: 224,
                  child: RaisedButton(
                    onPressed: () {},
                    shape: RoundedRectangleBorder(
                        borderRadius: BorderRadius.circular(20)),
                    child: Text(
                      "Update Profile",
                      style: TextStyle(fontWeight: FontWeight.w300),
                    ),
                  ),
                )
              ]),
        ),
      ),
    );
  }
}
