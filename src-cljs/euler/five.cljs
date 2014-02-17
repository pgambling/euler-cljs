(ns euler.five)

(defn multiple? [n div]
  (= 0 (mod n div)))

(defn prime-factors
  ([num] (prime-factors num 2 #{}))
  ([num i factors]
    (cond
      (= 1 num) factors
      (multiple? num i) (recur (/ num i) i (conj factors i))
      :else (recur num (inc i) factors))))

(defn smallest-multiple [nums]
  (->> nums
    (reduce (fn [factors-map num]
      (let [primes (prime-factors num)]
        (if (= 1 (count primes))
          (assoc factors-map (first primes) num)
          factors-map))) {})
    vals
    (apply *)))

(defn run []
  (smallest-multiple (range 2 21)))
