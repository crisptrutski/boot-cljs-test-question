(ns silliness.core-test)
(:require [cljs.test :refer-macros [async deftest testing is]]
          [silliness.core :refer [silly]])

(deftest silly-test
  (is (= (silly)
         1)))
