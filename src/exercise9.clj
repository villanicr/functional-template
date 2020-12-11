(ns exercise9)


(defn word-count [s] 
  (->> s
    (clojure.string/lower-case)
    (re-seq #"\w+")
    frequencies))


