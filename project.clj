
(defproject fancy-alert "0.0.1"
  :description "A simple alert replacement"
  :source-path "src"
  :url "https://github.com/peterjewicz/fancy-alert"
  :license {:name "Eclipse Public License"
  :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.9.0"]
    [org.clojure/clojurescript "1.10.238"]
    [org.clojure/core.async  "0.4.474"]]
  :plugins [[lein-cljsbuild "1.1.7"]]
  :cljsbuild
  {
  :builds [{
    :id "dev"
    :source-paths ["src"]
    :compiler {:main fancy-alert.core
      :install-deps true
      :output-to "public/fancy-alert.js"
      :output-dir ".cljsbuild"
      :optimizations :none
      :source-map true
  }}
]})
