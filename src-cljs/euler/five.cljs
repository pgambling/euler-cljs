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
    (map prime-factors)
    (map vector nums)
    (into [{}])
    (reduce
      (fn [factor-map kv]
        (let [num (first kv)
              factors (second kv)]
          (if (= 1 (count factors))
            (assoc factor-map (first factors) num)
            factor-map))))
    vals
    (apply *)))

(defn run []
  (smallest-multiple (range 2 21)))
