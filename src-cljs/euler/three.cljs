(ns euler.three)

(defn multiple? [n div]
  (= 0 (mod n div)))

(defn largest-prime-factor
  ([num] (largest-prime-factor num 2))
  ([num prime]
    (cond
      (= 1 num) prime
      (multiple? num prime) (recur (/ num prime) prime)
      :else (recur num (inc prime)))))

(defn run []
  (largest-prime-factor 600851475143))