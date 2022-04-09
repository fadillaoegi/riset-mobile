import 'package:flutter/material.dart';
import 'style.dart';
import '../pages/Chatting.dart';

class ChatTile extends StatelessWidget {
  final image;
  final name;
  final message;
  final time;

  ChatTile({this.image, this.name, this.message, this.time});

  @override
  Widget build(BuildContext context) {
    return Row(
      children: [
        Image.asset(
          image,
          height: 60,
          width: 60,
        ),
        sizeBoxW1,
        Column(
          crossAxisAlignment: CrossAxisAlignment.start,
          children: [
            Text(
              name,
              style: title,
            ),
            Text(
              message,
              style: subTitle,
            )
          ],
        ),
        Spacer(),
        Text(
          time,
          style: subTitle,
        )
      ],
    );
  }
}
