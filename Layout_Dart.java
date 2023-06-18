import 'package:flutter/material.dart';

void main() => runApp(MyApp());

class MyApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    final height = MediaQuery.of(context).size.height;
    final width = MediaQuery.of(context).size.width;

    return MaterialApp(
      title: 'Flutter layout demo',
      home: Scaffold(
        appBar: AppBar(
          title: const Text('Flutter layout demo'),
        ),
        body: Column(children: <Widget>[
          Container(
              decoration: BoxDecoration(
                color: Colors.red,
                borderRadius: BorderRadius.circular(10),
                border: Border.all(),
                boxShadow: [
                  BoxShadow(
                    color: Colors.grey.withOpacity(0.5),
                    spreadRadius: 5,
                    blurRadius: 7,
                    offset: const Offset(0, 3),
                  ),
                ],
              ),
              //color: Colors.red, // cannot use color while using box decoration
              margin: EdgeInsets.symmetric(
                  horizontal: width * 0.1, vertical: height * 0.05),
              child: Row(
                  //crossAxisAlignment: CrossAxisAlignment.stretch,
                  mainAxisAlignment: MainAxisAlignment.center,
                  mainAxisSize: MainAxisSize.min,
                  children: <Widget>[
                    Container(
                      padding: const EdgeInsets.only(right: 16.0),
                      child: const Icon(Icons.star, size: 50),
                    ), // Add margin between the first and second icon

                    Container(
                      margin: const EdgeInsets.only(right: 16.0),
                      child: const Icon(Icons.star, size: 50),
                    ),
                    const Icon(Icons.star, size: 50),
                  ])),
          Container(
              color: Colors.green,
              child: const Row(children: <Widget>[
                Icon(Icons.star, size: 50),
                Icon(Icons.star, size: 50),
                Icon(Icons.star, size: 50),
              ])),
          Container(
              color: Colors.amber,
              // IntrinsicWidth - sizes all child to the child with max width/height
              child: IntrinsicWidth(
                  child: Column(
                      // the stretch might be needed
                      crossAxisAlignment: CrossAxisAlignment.stretch,
                      children: <Widget>[
                    ElevatedButton(
                      onPressed: () {},
                      child: const Text('Short'),
                    ),
                    ElevatedButton(
                      onPressed: () {},
                      child: const Text("Very Good Fox"),
                    ),
                    ElevatedButton(
                      onPressed: () {},
                      child: const Text("Lamborghini Centenario LP 770-4"),
                    ),
                  ])))
        ]),
      ),
    );
  }
}
