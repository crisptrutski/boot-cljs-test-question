(ns silliness.core
  (:require [cljs.nodejs :as nodejs]))

(nodejs/enable-util-print!)

(defn silly []
  (do
    (println "silly println called.")
    (.log js/console "silly called.")
    3))

(defn -main []
  (println "main println called.")
  (.log js/console "hello world!"))

(set! *main-cli-fn* -main)
