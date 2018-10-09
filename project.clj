(defproject chroma-bot "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :min-lein-version "2.0.0"
  :dependencies [[org.clojure/clojure "1.9.0"]
                 [org.clojure/core.async "0.4.474"]  
                 [com.taoensso/timbre "4.10.0"]
                 [com.grammarly/omniconf "0.3.2"]
                 [compojure "1.6.1"]
                 [hiccup "1.0.5"]
                 [ring "1.7.0"]
                 [ring-server "0.5.0"]
                 [ring/ring-defaults "0.3.2"]]
  :plugins [[lein-ring "0.12.4"]]
  :ring {:handler chroma-bot.handler/app}
  :profiles
  {:dev {:dependencies [[javax.servlet/servlet-api "2.5"]
                        [ring/ring-mock "0.3.2"]]}})
