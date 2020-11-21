(ns exercise2)
 ;"Filters the input list returning only the elements greater than 5."

(defn only-greater-than-five [x] (filter (fn [num] (< 5 num) ) x)
 
)