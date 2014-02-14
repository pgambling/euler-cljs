(ns euler.three)

(defn gcd [a b]
  (if (zero? b)
    a
    (gcd b (mod a b))))

(defn largest-prime-factor [n]
  (loop [i (Math/floor (Math/sqrt n))]
    (if (and (= 0 (mod n i) (= 1 (gcd n i))))
      i
      (recur (dec i)))))

(defn run []
  (largest-prime-factor 600851475143))
