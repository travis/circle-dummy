(ns circle-dummy.core-test
  (:require [clojure.test :refer :all]
            [circle-dummy.core :refer :all]))

(deftest a-test
  (testing "FIXME, I fail."
    (prn (System/getenv "MULTILINE_VAR_TEST"))
    (is (= 1 1))))
