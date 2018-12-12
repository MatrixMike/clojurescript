#!/bin/bash

clj -m cljs.main -w src -c my_app.core -r -Sdeps '{:deps {org.clojure/clojure {:mvn/version "1.10.0-RC5"}}}'



