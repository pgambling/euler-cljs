(ns euler.one)

(defn run []
  (apply + (filter #(or (= 0 (mod % 3)) (= 0 (mod % 5))) (range 1000))))
