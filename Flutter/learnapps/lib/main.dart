import 'package:flutter/material.dart';
import 'package:google_fonts/google_fonts.dart';
import 'pages/example.dart';

void main() {
  runApp(learn());
}

class learn extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      home: example(),
      theme: ThemeData(textTheme: GoogleFonts.poppinsTextTheme()),
    );
  }
}
