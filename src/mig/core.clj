(ns mig.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))

(defn leading
  "Get chords that lead from the chord provided"
  [chord]
  (case chord
    :I [:I :ii :iii :IV :V :vi :viio]
    :ii [:IV :V :viio]
    :iii [:ii :IV :vi]
    :IV [:I :iii :V :viio]
    :V [:I]
    :vi [:ii :IV :V :I]
    :viio [:I :iii])
  )