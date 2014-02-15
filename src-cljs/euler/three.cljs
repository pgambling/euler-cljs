(ns euler.three)

(defn gcd [a b]
  (if (zero? b)
    a
    (recur b (mod a b))))

(defn prime-numbers [a n]
  (let [n1 (inc n)
        a1 (+ a (gcd n1 a))]
    (cons (- a1 a) (lazy-seq (prime-numbers a1 n1)))))


(defn multiple? [n div]
  (= 0 (mod n div)))

(defn largest-prime-factor [n]
  (take-while #(> % (/ n %)) (filter #(and (not= % 1) (multiple? n %)) (prime-numbers 7 1))))

(defn run []
  (largest-prime-factor 600851475143))