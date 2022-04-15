import 'package:flutter/material.dart';
import '../style/theme.dart';
import 'package:google_fonts/google_fonts.dart';

class example extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text("data", style: GoogleFonts.poppins()),
      ),
      body: SafeArea(
        // child: Center(
        child: SingleChildScrollView(
          child: Column(
              // mainAxisAlignment: MainAxisAlignment.start,
              // crossAxisAlignment: CrossAxisAlignment.center,
              // mainAxisAlignment: MainAxisAlignment.center,
              children: [
                SizedBox(
                  height: 60,
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
                  height: 80,
                ),
                Row(
                  mainAxisAlignment: MainAxisAlignment.spaceAround,
                  children: [
                    Image.asset(
                      "assets/images/item2.png",
                      height: 100,
                      width: 100,
                    ),
                    Image.asset(
                      "assets/images/item2.png",
                      height: 100,
                      width: 100,
                    ),
                    Image.asset(
                      "assets/images/item2.png",
                      height: 100,
                      width: 100,
                    ),
                  ],
                ),
                SizedBox(
                  height: 40,
                ),
                Row(
                    mainAxisAlignment: MainAxisAlignment.spaceAround,
                    children: [
                      Image.asset(
                        "assets/images/item2.png",
                        height: 100,
                        width: 100,
                      ),
                      Image.asset(
                        "assets/images/item2.png",
                        height: 100,
                        width: 100,
                      ),
                      Image.asset(
                        "assets/images/item2.png",
                        height: 100,
                        width: 100,
                      ),
                    ])
              ]),
        ),
      ),
    );
  }
}
