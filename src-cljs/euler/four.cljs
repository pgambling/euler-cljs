(ns euler.four
  (:require [clojure.string :as str]))

(defn palindrome? [n]
  (let [num-str (str n)
        len (count num-str)
        mid-point (/ len 2)]
    (if (odd? len)
      false
      (= (subs num-str 0 mid-point)
         (str/reverse (subs num-str mid-point))))))

(defn max-palindrome []
  (apply max (filter palindrome? (for [x (range 100 1000) y (range 100 1000)] (* x y)))))

(defn run []
  (max-palindrome))