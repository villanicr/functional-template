(ns exercise3)

(defn fibonacci [n]
  (loop [ x [0 1]] 
    (if (< (count x) n) 
      (recur (conj x (+ (last x) (nth x (- (count x) 2)))))
      x)))


