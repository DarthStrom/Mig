(ns mig.core-test
  (:require [clojure.test :refer :all]
            [mig.core :refer :all]))

(deftest chord-leading
  (is (= (leading :I)
         [:I :ii :iii :IV :V :vi :viio]))
  (is (= (leading :ii)
         [:IV :V :viio]))
  (is (= (leading :iii)
         [:ii :IV :vi]))
  (is (= (leading :IV)
         [:I :iii :V :viio]))
  (is (= (leading :vi)
         [:ii :IV :V :I]))
  (is (= (leading :viio)
         [:I :iii])))