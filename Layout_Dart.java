import 'package:flutter/material.dart';

void main() => runApp(MyApp());

class MyApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'Flutter layout demo',
      home: Scaffold(
        appBar: AppBar(
          title: const Text('Flutter layout demo'),
        ),
        body: Row(children: <Widget>[
          Row(
            //mainAxisAlignment: MainAxisAlignment.center,
            //crossAxisAlignment : CrossAxisAlignment.baseline,
            //textBaseline: TextBaseline.alphabetic,
            crossAxisAlignment: CrossAxisAlignment.end,

            children: <Widget>[
              Icon(Icons.star, size: 50),
              Icon(Icons.star, size: 50),
              Icon(Icons.star, size: 50),

              /*Text(
              'Baseline',
                style:Theme.of(context).textTheme.displayMedium,
              ),
              Text(
              'Baseline',
                style:Theme.of(context).textTheme.titleSmall,
              )*/
            ],
          ),
        ]),
      ),
    );
  }
}
