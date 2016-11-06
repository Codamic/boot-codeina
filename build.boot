(set-env!
 :resource-paths #{"src" "resources"}
 :dependencies '[[boot/core "2.0.0-rc14" :scope "provided"]
                 [org.clojure/clojure         "1.9.0-alpha14" :scope "provided"]
                 [org.clojure/clojurescript   "1.9.229"]
                 [org.clojure/tools.namespace "0.2.10"]
                 [org.pegdown/pegdown         "1.4.2"]
                 [leinjacker                  "0.4.2"]
                 [hiccup                      "1.0.5"]
                 [funcool/codeina             "0.5.0"         :scope "test"]
                 [funcool/bootutils           "0.1.0"         :scope "test"]])

(require '[funcool.boot-codeina :refer :all]
         '[funcool.bootutils :refer :all])

(def +version+
  "0.2.0-SNAPSHOT")

(def +description+
  "A tool for generating API documentation from Clojure for both Clojure
  and ClojureScript.")

(task-options!
 pom  {:project     'codamic/boot-codeina
       :version     +version+
       :description +description+
       :url         "https://github.com/Codamic/boot-codeina"
       :license     {"Eclipse Public License" "http://www.eclipse.org/legal/epl-v10.html"}
       :scm         {:url "https://github.com/Codamic/boot-codeina"}}

 jar  {:manifest    {"Description" +description+
                     "Url"         "http://github.com/Codamic/boot-codeina"}}

 apidoc {:version +version+
         :title "Boot-Codeina"
         :sources #{"src"}
         :src-uri "https://github.com/Codamic/boot-codeina/tree/master/"
         :src-uri-prefix "#L"
         :description +description+}
 push   {:repo "clojars"} )
