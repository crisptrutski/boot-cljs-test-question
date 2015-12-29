(set-env!
 :source-paths   #{"src"}
 ;; :resource-paths #{"html"}
 :dependencies '[[org.clojure/clojure         "1.7.0"]
                 [org.clojure/clojurescript   "1.7.170"]
                 [adzerk/boot-cljs            "1.7.170-3" :scope "test"]
                 [adzerk/boot-cljs-repl       "0.3.0"     :scope "test"]
                 [com.cemerick/piggieback     "0.2.1"     :scope "test"]
                 [weasel                      "0.7.0"     :scope "test"]
                 [org.clojure/tools.nrepl     "0.2.12"    :scope "test"]
                 [crisptrutski/boot-cljs-test "0.2.1-SNAPSHOT"]])

(require
 '[adzerk.boot-cljs            :refer :all]
 '[adzerk.boot-cljs-repl       :refer [cljs-repl start-repl]]
 '[crisptrutski.boot-cljs-test :refer [test-cljs]])

(deftask auto-test []
  (set-env! :source-paths #{"src" "test"})
  (comp (watch)
        (test-cljs :js-env :node)))

(deftask build []
  ; (set-env! :source-paths #{"src"})
  (cljs :source-map true
        :optimizations :none
        :compiler-options {:target :nodejs}))

(deftask dev []
  (comp (watch)
        (cljs-repl)
        (build)))
