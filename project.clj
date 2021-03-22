(defproject clojure-lsp/clojure-lsp-extensions "1.0.0"
  :description "clojure-lsp java extensions"
  :url "http://github.com/clojure-lsp/clojure-lsp-extensions"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :java-source-paths ["src-java"]
  :dependencies [[org.clojure/clojure "1.10.3"]
                 [org.eclipse.lsp4j/org.eclipse.lsp4j  "0.11.0" :exclusions [org.eclipse.xtend/org.eclipse.xtend.lib]]]
  :profiles {:uberjar {:aot :all}})
