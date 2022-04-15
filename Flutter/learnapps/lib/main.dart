import 'package:flutter/material.dart';
import 'dart:developer';
import 'package:google_fonts/google_fonts.dart';

void main() {
  runApp(learn());
}

class learn extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text("data", style: GoogleFonts.poppins()),
      ),
      body: Center(
        child: SingleChildScrollView(
          child: Column(
            children: [],
          ),
        ),
      ),
    );
  }
}
