(ns exercise4)
;  "Calculates the sum of all the values in the sequence of numbers given as input. Use the reduce function."

(defn summary [x]  (reduce (fn [num n] (+ num n) ) x) )



