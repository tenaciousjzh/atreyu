# Why Atreyu?
For those old enough to remember the [Neverending Story], this project name will make sense. Atreyu went on a mission with Falcor (the Luck Dragon).

# Atreyu
Atreyu is a project for Clojurians wanting to get in on the game with Falcor but hate the idea of writing middleware in Node.js. Don't get me wrong, Node is cool stuff but once you've tasted the Clojure sauce, it's tough to go back. While David Nolen builds out the killer Om next framework built on ideas like Falcor and Relay; Atreyu could be seen as a complimentary library to Falcor.

Atreyu intends to support the following features:
  - A Drop-In replacement for [falcor-express] that runs server-side on [http-kit].
  - Routers capable of processing JSON-Graph queries sent from the client and returning JSON-Graph models back.
  - Ability to connect to other services or a backend database (currently Neo4J) to retrieve JSON-Graph fragments.

### Version
0.0.1

### Tech

Atreyu uses open source tech liberally:
* [Compojure] - Enhances compojure to support routes!
* [http-kit] - awesome web-based text editor
* [Clojure] -


### Installation

#### Lein

```sh
$ npm i -g gulp
```

```sh
$ git clone [git-repo-url] dillinger
$ cd dillinger
$ npm i -d
$ mkdir -p downloads/files/{md,html,pdf}
$ gulp build --prod
$ NODE_ENV=production node app
```

### Plugins

Dillinger is currently extended with the following plugins

* Dropbox
* Github
* Google Drive
* OneDrive

Readmes, how to use them in your own application can be found here:

* [plugins/dropbox/README.md] [PlDb]
* [plugins/github/README.md] [PlGh]
* [plugins/googledrive/README.md] [PlGd]
* [plugins/onedrive/README.md] [PlOd]

### Development

Want to contribute? Great!

Dillinger uses Gulp + Webpack for fast developing.
Make a change in your file and instantanously see your updates!

Open your favorite Terminal and run these commands.

First Tab:
```sh
$ node app
```

Second Tab:
```sh
$ gulp watch
```

(optional) Third:
```sh
$ karma start
```

### Todos

 - Write Tests
 - Rethink Github Save
 - Add Code Comments
 - Add Night Mode

License
----

Apache License 2.0


**Free Software, Yeah!**

[//]: # (These are reference links used in the body of this note and get stripped out when the markdown processor does it's job. There is no need to format nicely because it shouldn't be seen. Thanks SO - http://stackoverflow.com/questions/4823468/store-comments-in-markdown-syntax)

   [Neverending Story]: <http://www.imdb.com/title/tt0088323/>
   [falcor-express]: <https://github.com/Netflix/falcor-express>
   [http-kit]: <https://github.com/http-kit/http-kit>

   [dill]: <https://github.com/joemccann/dillinger>
   [git-repo-url]: <https://github.com/joemccann/dillinger.git>
   [john gruber]: <http://daringfireball.net>
   [@thomasfuchs]: <http://twitter.com/thomasfuchs>
   [df1]: <http://daringfireball.net/projects/markdown/>
   [marked]: <https://github.com/chjj/marked>
   [Ace Editor]: <http://ace.ajax.org>
   [node.js]: <http://nodejs.org>
   [Twitter Bootstrap]: <http://twitter.github.com/bootstrap/>
   [keymaster.js]: <https://github.com/madrobby/keymaster>
   [jQuery]: <http://jquery.com>
   [@tjholowaychuk]: <http://twitter.com/tjholowaychuk>
   [express]: <http://expressjs.com>
   [AngularJS]: <http://angularjs.org>
   [Gulp]: <http://gulpjs.com>

   [PlDb]: <https://github.com/joemccann/dillinger/tree/master/plugins/dropbox/README.md>
   [PlGh]:  <https://github.com/joemccann/dillinger/tree/master/plugins/github/README.md>
   [PlGd]: <https://github.com/joemccann/dillinger/tree/master/plugins/googledrive/README.md>
   [PlOd]: <https://github.com/joemccann/dillinger/tree/master/plugins/onedrive/README.md>
