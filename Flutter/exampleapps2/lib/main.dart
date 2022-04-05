import 'package:flutter/material.dart';

void main() => runApp(homePage());

class homePage extends StatelessWidget {
  var _icon1 = Column(
    children: [
      Icon(
        Icons.call,
        color: Colors.green[900],
        size: 30,
      ),
      SizedBox(
        height: 10,
      ),
      Text(
        "CALL",
        style: TextStyle(color: Colors.green[900], fontWeight: FontWeight.bold),
      )
    ],
  );

  var _icon2 = Column(
    children: [
      Icon(
        Icons.near_me,
        color: Colors.green[900],
        size: 30,
      ),
      SizedBox(
        height: 10,
      ),
      Text(
        "ROUTE",
        style: TextStyle(color: Colors.green[900], fontWeight: FontWeight.bold),
      )
    ],
  );

  var _icon3 = Column(
    children: [
      Icon(
        Icons.share,
        color: Colors.green[900],
        size: 30,
      ),
      SizedBox(
        height: 10,
      ),
      Text(
        "SHARE",
        style: TextStyle(color: Colors.green[900], fontWeight: FontWeight.bold),
      )
    ],
  );

  @override
  Widget build(BuildContext context) {
    // TODO: implement build
    return MaterialApp(
      title: "Home Page",
      home: Scaffold(
        backgroundColor: Colors.amber[300],
        // appBar: AppBar(title: Text("Home Pages")),
        body: SafeArea(
          child: ListView(
            // crossAxisAlignment: CrossAxisAlignment.start,
            children: [
              Image.asset(
                'assets/image/banner.png',
              ),
              SizedBox(
                height: 30,
              ),
              Padding(
                  padding: EdgeInsets.symmetric(horizontal: 30.0),
                  child: Row(
                    mainAxisAlignment: MainAxisAlignment.spaceBetween,
                    children: [
                      Column(
                        crossAxisAlignment: CrossAxisAlignment.start,
                        children: [
                          Text(
                            "Programming Flutter",
                            style: TextStyle(
                              fontWeight: FontWeight.bold,
                            ),
                          ),
                          SizedBox(
                            height: 8.0,
                          ),
                          Text(
                            "Surabaya, Broo",
                            style: TextStyle(fontWeight: FontWeight.normal),
                          )
                        ],
                      ),
                      Row(
                        // crossAxisAlignment: CrossAxisAlignment.end,
                        children: [
                          Icon(
                            Icons.favorite,
                            color: Color(0XffFFB800),
                          ),
                          Text("5.7 K")
                        ],
                      ),
                    ],
                  )),
              SizedBox(height: 30.0),
              Padding(
                padding: EdgeInsets.symmetric(horizontal: 30.0),
                child: Row(
                  mainAxisAlignment: MainAxisAlignment.spaceEvenly,
                  // crossAxisAlignment: CrossAxisAlignment.be,
                  children: [_icon1, _icon2, _icon3],
                ),
              ),
              SizedBox(height: 30),
              Padding(
                padding: EdgeInsets.symmetric(horizontal: 30.0),
                child: Column(
                  children: [
                    Text(
                      "Lorem ipsum dolor sit amet consectetur adipisicing elit. Quas praesentium magni tenetur quam explicabo eligendi, et omnis amet non saepe totam obcaecati facilis fugit, odio recusandae corrupti asperiores culpa at. Ullam recusandae, voluptatem doloribus odio temporibus beatae assumenda est molestiae ipsa quas autem voluptate veniam neque non inventore cum similique doloremque quia illum eos perferendis blanditiis deserunt incidunt! Illo fugiat soluta explicabo, \n\naccusamus quis provident velit nihil nulla quisquam labore natus placeat similique libero atque, eligendi excepturi voluptatem ipsam blanditiis, voluptate quia autem? Atque ratione amet adipisci sequi! Similique assumenda omnis rem dolorum temporibus ex natus reiciendis facere vitae, error nisi magni. Maiores pariatur, dolore fugit tempora laudantium, tempore, voluptate dignissimos esse iste assumenda recusandae omnis molestias consectetur facilis nobis aliquam quibusdam optio architecto. \n\nMagnam iusto voluptate sequi harum illum laudantium, dolores laboriosam qui expedita explicabo minima, ab, quisquam distinctio quod! Dolor illo amet voluptate molestiae eos! Enim laudantium sunt modi veniam sequi nam nostrum laborum quod quis, odit id incidunt officia debitis? Voluptates aut nobis dolorem similique quis eveniet? Doloremque veritatis eveniet necessitatibus veniam modi nam maiores suscipit voluptatem quas perferendis, aliquam totam reprehenderit delectus, beatae sunt assumenda quae nulla? Dignissimos exercitationem voluptatibus sapiente, fugiat commodi sit incidunt corporis impedit, nemo optio vel necessitatibus. Eaque molestias, nesciunt ratione ad blanditiis unde minus distinctio modi dolorem dignissimos libero dolor excepturi nam corporis hic neque, culpa enim. \n\nMollitia repellendus ipsum distinctio in voluptas exercitationem doloribus, necessitatibus nisi laborum, eligendi similique! Quis rerum sapiente quod earum provident temporibus et dolorum, commodi suscipit consequatur, voluptate repellat mollitia vitae voluptatibus maxime? Maiores, vel cupiditate praesentium soluta mollitia voluptate id voluptatum, delectus omnis, reprehenderit qui accusamus eius ut nihil consequuntur sed recusandae eligendi in? Aut repudiandae nemo, illo architecto dignissimos, animi quas, omnis saepe aliquam fuga modi velit ipsum a exercitationem aliquid earum explicabo quidem.",
                      style: TextStyle(
                        fontSize: 15,
                      ),
                      textAlign: TextAlign.justify,
                    )
                  ],
                ),
              )
            ],
          ),
        ),
      ),
    );
  }
}
